package interfaz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.orm.PersistentException;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;

import basededatos.BD_Principal;
import basededatos.iRegistrado;
import ocl_proyecto.EditorDAO;
import ocl_proyecto.UsuarioDAO;
import ocl_proyecto.Usuario_suscrito_;
import ocl_proyecto.Usuario_suscrito_DAO;

public class Editar_Perfil extends Banner_suscrito {
	public Registrado _unnamed_Registrado_;
	public Editar_datos _unnamed_Editar_datos_;
	public Perfil_Usuario per;
	public Perfil_Usuario perfil;
	public Perfil_Uusario_Vista_UR perfil_ur;
	public Usuario_Registardo auxUR;
	public Editor auxE;
	public Periodista auxP;
	
	public String newFileName;
	private static final String UPLOAD_DIR = "src/main/resources/META-INF/resources/images/";

	ocl_proyecto.Usuario registrado;
	ocl_proyecto.Usuario_suscrito_ suscrito;

	iRegistrado iRegistrao = new BD_Principal();

	public Editar_Perfil(Registrado _registrado, ocl_proyecto.Usuario registrado, Perfil_Usuario per ) {
		super(_registrado, registrado);
		this._unnamed_Registrado_ = _registrado;
		this.registrado = registrado;
		this.per = per;

		this.getNoticiaEditorLayout().setVisible(false);
		this.getNoticiaLayout().setVisible(false);
		this.getNoticiaLayoutGenerico().setVisible(false);
		this.getPerfilUsuarioLayout().setVisible(false);
		this.getDarseDeBajaLayout().setVisible(false);
		
		//ESTATICO EDITAR DATOS
		this. _unnamed_Editar_datos_ = new Editar_datos(this._unnamed_Registrado_, this.registrado);
		this.getEditarDatosEstaticos().add(this. _unnamed_Editar_datos_);
		
		//UPLOAD
		FileBuffer buffer = new FileBuffer();
		Upload upload = new Upload(buffer);
		upload.setAcceptedFileTypes("image/jpeg", "image/jpg", "image/png", "image/gif");

		Button uploadButton = new Button("Cargar Imagen");
		upload.setUploadButton(uploadButton);
		upload.getStyle().set("align-self", "center");
		upload.getStyle().set("background-color", "#ffffff");
		upload.getStyle().set("border-color", "#000000");
		upload.getStyle().set("border-radius", "6.9px");
		uploadButton.getStyle().set("color", "#000000");

		this._unnamed_Editar_datos_.getFotoTextamen().setVisible(isVisible());
		this._unnamed_Editar_datos_.getFotoTextamen().as(VerticalLayout.class).add(upload);

		upload.addSucceededListener(event -> {
			File uploadedFile = buffer.getFileData().getFile();
			try {
				this.newFileName = event.getFileName();
				Path destinationPath = Paths.get(UPLOAD_DIR + newFileName);
				Files.move(uploadedFile.toPath(), destinationPath);
				
				Notification.show("Se ha subido la imagen correctamente.");
			} catch (IOException e) {
				Notification.show("Error saving the image: " + e.getMessage(), 5000, Notification.Position.MIDDLE);
			}
		});

		upload.addFailedListener(event -> {
			Notification.show("Image upload failed: " + event.getReason().getMessage(), 5000,
					Notification.Position.MIDDLE);
		});
		upload.addFileRejectedListener(event -> {
			Notification.show("File rejected: " + event.getErrorMessage(), 5000, Notification.Position.MIDDLE);
		});

		this.getBotonGuardarEditarPerfil().addClickListener(event->guardar_cambios());

		//CANCELAR
		this.getBotonCancelarEditarPerfil().addClickListener(event-> {
			try {
				if(Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(this.registrado.getIdUsuario()) != null) {					
					this.per.banregis.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
					perfil_ur = new Perfil_Uusario_Vista_UR((Usuario_Registardo) this._unnamed_Registrado_, (Usuario_suscrito_)this.registrado, this.per.banregis);
					this.per.banregis.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.perfil_ur);
				}else {
					this.per.banregis.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
					perfil = new Perfil_Usuario(this._unnamed_Registrado_, this.registrado,this.per.banregis);
					this.per.banregis.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.perfil);
				}
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});
	}

	public void guardar_cambios() {
		String apodo = null; 
		String dni = null; 
		String email = null; 
		String contrasena = null; 
		String foto = null;
		String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
		long tarjeta = 0;
		boolean error = false;

		if (this._unnamed_Editar_datos_.getCampoEmail().getValue().isEmpty()) 
			Notification.show("Email Vacío");
		else if ( this._unnamed_Editar_datos_.getCampoContrasena().isEmpty()) 
			Notification.show("Contrasena Vacía");
		else if ( this._unnamed_Editar_datos_.getCampoApodo().getValue().isEmpty()) 
			Notification.show("Apodo Vacío");
		else if ( this._unnamed_Editar_datos_.getCampoDNI().getValue().isEmpty())
			Notification.show("DNI Vacío");
		else if ( this._unnamed_Editar_datos_.getCampoDNI().getValue().length() != 9)
			Notification.show("El DNI debe tener 9 caracteres");
		else if (this.newFileName == null) 
			Notification.show("Foto Vacía");
		else if( !this._unnamed_Editar_datos_.getCampoContrasena().getValue().matches(passwordPattern))
			Notification.show("La contrasña debe tener al menos ocho caracteres, un número, una mayúscula, y una minúscula");
		else{

			String numerosDNI = this._unnamed_Editar_datos_.getCampoDNI().getValue().substring(0, 8);
			for (int i = 0; i < numerosDNI.length(); i++) {
				if (!Character.isDigit(numerosDNI.charAt(i))) {
					Notification.show("El DNI solo debe tener una letra al final");
					error = true;
				}
			}

			char letraDNI = this._unnamed_Editar_datos_.getCampoDNI().getValue().charAt(8);
			if (!Character.isLetter(letraDNI)) {
				Notification.show("El DNI debe tener una letra al final");
				error = true;
			}

			email = this._unnamed_Editar_datos_.getCampoEmail().getValue();
			contrasena = this._unnamed_Editar_datos_.getCampoContrasena().getValue();
			apodo = this._unnamed_Editar_datos_.getCampoApodo().getValue();
			dni = this._unnamed_Editar_datos_.getCampoDNI().getValue();
			foto = this.newFileName;

			try {
				suscrito = Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(registrado.getIdUsuario());
				if(suscrito != null) {
					if (this._unnamed_Editar_datos_.getTarjetaDeCrédito().getValue().isEmpty()) {
						Notification.show("Tarjeta de credito Vacía");
						error = true;
					}else if ( this._unnamed_Editar_datos_.getTarjetaDeCrédito().getValue().replace(" ", "").length() != 16) {
						Notification.show("La tarjeta de credito debe tener 16 caracteres");
						error = true;
					}else {

						try {
							tarjeta = Long.valueOf(this._unnamed_Editar_datos_.getTarjetaDeCrédito().getValue().replace(" ", ""));
						} catch (NumberFormatException e) {
							Notification.show("Tarjeta de credito con caracteres invalidos");
							error = true;
							e.printStackTrace();
						}
					}
				}
			} catch (PersistentException e1) {
				e1.printStackTrace();
			}
			if(!error) {

				iRegistrao.guardar_cambios(this.registrado.getIdUsuario(),apodo, dni, email, contrasena, foto, tarjeta);
				try {
					registrado = UsuarioDAO.getUsuarioByORMID(this.registrado.getIdUsuario());
				} catch (PersistentException e) {
					e.printStackTrace();
				}
				try {
					if(Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(this.registrado.getIdUsuario()) != null) {
						this._unnamed_Registrado_.mainView.removeAll();
						auxUR = new Usuario_Registardo(this._unnamed_Registrado_.mainView, (Usuario_suscrito_) this.registrado);
						this._unnamed_Registrado_.mainView.add(auxUR);

						this.auxUR.BR.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
						perfil_ur = new Perfil_Uusario_Vista_UR(auxUR, (Usuario_suscrito_)this.registrado, this.auxUR.BR );
						this.auxUR.BR.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.perfil_ur);

					}else if(EditorDAO.getEditorByORMID(this.registrado.getIdUsuario()) != null){
						this._unnamed_Registrado_.mainView.removeAll();
						auxE = new Editor(this._unnamed_Registrado_.mainView, (ocl_proyecto.Editor) this.registrado);
						this._unnamed_Registrado_.mainView.add(auxE);

						this.auxE.BE.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
						perfil = new Perfil_Usuario(auxE, this.registrado, this.auxE.BE);
						this.auxE.BE.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.perfil);

					}else {
						this._unnamed_Registrado_.mainView.removeAll();
						auxP = new Periodista(this._unnamed_Registrado_.mainView, (ocl_proyecto.Periodista) this.registrado);
						this._unnamed_Registrado_.mainView.add(auxP);

						this.auxP.BP.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
						perfil = new Perfil_Usuario(auxP, this.registrado, this.auxP.BP);
						this.auxP.BP.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.perfil);
					}
				} catch (PersistentException e) {
					e.printStackTrace();
				}
			}
		}
	}
}