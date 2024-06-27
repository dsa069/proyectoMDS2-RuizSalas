package interfaz;

import interfaz.Enviar_Correo_Confirmacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;
import com.vaadin.flow.server.StreamResource;

import basededatos.BD_Principal;
import basededatos.iUsuario_No_Registrado;
import ocl_proyecto.Usuario_suscrito_;
import vistas.VistaConfirmarregistro;

public class Confirmar_Registro extends VistaConfirmarregistro{

	public Introducir_datos_registro _contiene;
	public Enviar_Correo_Confirmacion _procede_a = new Enviar_Correo_Confirmacion();
	public Gestionar_Transaccion a_procede_a = new Gestionar_Transaccion();
	
	public String newFileName;
	private static final String UPLOAD_DIR = "src/main/resources/META-INF/resources/images/";

	ocl_proyecto.Usuario_suscrito_ usuario;

	public iUsuario_No_Registrado iUNR = new BD_Principal();

	public Usuario_Registardo usuarioRegistrado;
	public Usuario_No_Registrado usuarioNoRegistrado;
	public Confirmar_Registro(Usuario_No_Registrado usuarioNoRegistrado, Introducir_datos_registro _contiene) {
		super();
		this.usuarioNoRegistrado = usuarioNoRegistrado;
		this._contiene =_contiene;

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
		//uploadButton.getStyle().set("font-family", "georgia");

		this._contiene.getFotoTextamen().setVisible(isVisible());
		this._contiene.getFotoTextamen().as(VerticalLayout.class).add(upload);

		upload.addSucceededListener(event -> {
			File uploadedFile = buffer.getFileData().getFile();
			try {
//				Path destinationPath = Paths.get(UPLOAD_DIR + event.getFileName());
//				Files.move(uploadedFile.toPath(), destinationPath);
//				Notification.show("Se ha subido la imagen correctamente.");
//				String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
				this.newFileName = event.getFileName();
				Path destinationPath = Paths.get(UPLOAD_DIR + newFileName);
				Files.move(uploadedFile.toPath(), destinationPath);
				
//				this.imagen = createImageFromFile(IMAGE_PATH + event.getFileName());
				//this.imagen.getStyle().set("align-self", "center");
//				this.getHueciImagen().as(VerticalLayout.class).removeAll();
//				this.getHueciImagen().as(VerticalLayout.class).add(this.imagen);
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
		
		
		this.getBotonConfirmarRegistro().addClickListener(event->gestionar_Transaccion());
	}
	
	public void enviar_Correo_Confirmacion() {
		iUNR.enviar_Correo_Confirmacion();
		_procede_a.enviar_Correo_Confirmacion(this);
	}

	public void gestionar_Transaccion() {
		String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
		
		if (this._contiene.getCampoEmail().getValue().isEmpty()) {
			Notification.show("Email Vacío");
		}else if ( this._contiene.getCampoContrasena().isEmpty()) {
			Notification.show("Contraseña Vacía");
		}else if ( this._contiene.getCampoApodo().getValue().isEmpty()) {
			Notification.show("Apodo Vacío");
		}else if (this.newFileName == null) {
			Notification.show("Ruta de foto Vacía");
		}else if ( this._contiene.getCampoDNI().getValue().isEmpty()) {
			Notification.show("DNI Vacío");
		}else if ( this._contiene.getCampoDNI().getValue().length() != 9)
			Notification.show("El DNI debe tener 9 caracteres");
		else if ( this._contiene.getTarjetaDeCrédito().getValue().isEmpty()) {
			Notification.show("Tarjeta de credito Vacía");
		}else if ( this._contiene.getTarjetaDeCrédito().getValue().replace(" ", "").length() != 16)
			Notification.show("La tarjeta de credito debe tener 16 caracteres");
		else if( !this._contiene.getCampoContrasena().getValue().matches(passwordPattern)){
			Notification.show("La contrasña debe tener al menos ocho caracteres, un número, una mayúscula, y una minúscula");
		}
		else if (!Character.isLetter(this._contiene.getCampoDNI().getValue().charAt(8))) 
			Notification.show("El DNI debe tener una letra al final");
		
		else if(!Character.isDigit(this._contiene.getCampoDNI().getValue().charAt(0))||!Character.isDigit(this._contiene.getCampoDNI().getValue().charAt(1))||
				!Character.isDigit(this._contiene.getCampoDNI().getValue().charAt(2))||!Character.isDigit(this._contiene.getCampoDNI().getValue().charAt(3))||
				!Character.isDigit(this._contiene.getCampoDNI().getValue().charAt(4))||!Character.isDigit(this._contiene.getCampoDNI().getValue().charAt(5))||
				!Character.isDigit(this._contiene.getCampoDNI().getValue().charAt(6))||!Character.isDigit(this._contiene.getCampoDNI().getValue().charAt(7)))
					Notification.show("El DNI solo debe tener una letra al final");
		else{
			try {
				Long.valueOf(this._contiene.getTarjetaDeCrédito().getValue().replace(" ", ""));
				this.usuario = iUNR.gestionar_Transaccion(this._contiene.getCampoEmail().getValue(), this._contiene.getCampoContrasena().getValue(), this._contiene.getCampoApodo().getValue(), this.newFileName, this._contiene.getCampoDNI().getValue(),Long.valueOf(this._contiene.getTarjetaDeCrédito().getValue().replace(" ", "")));
				this.usuarioNoRegistrado.mainView.removeAll();
				usuarioRegistrado = new Usuario_Registardo(this.usuarioNoRegistrado.mainView, this.usuario);
				this.usuarioNoRegistrado.mainView.add(usuarioRegistrado);
				a_procede_a.gestionar_Transaccion(this);
				this.enviar_Correo_Confirmacion();	
			} catch (Exception e) {
				Notification.show("Tarjeta de credito con caracteres invalidos");
				e.printStackTrace();
			}
		}
	}
}