package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iRegistrado;
import ocl_proyecto.EditorDAO;
import ocl_proyecto.Usuario;
import ocl_proyecto.UsuarioDAO;
import ocl_proyecto.Usuario_suscrito_;
import ocl_proyecto.Usuario_suscrito_DAO;

public class Editar_Perfil extends Banner_suscrito {
	public Registrado _unnamed_Registrado_;
	public Editar_datos _unnamed_Editar_datos_;
	public Perfil_Usuario perfil;
	public Perfil_Uusario_Vista_UR perfil_ur;
	public Usuario_Registardo auxUR;
	public Editor auxE;
	public Periodista auxP;

	ocl_proyecto.Usuario registrado;
	ocl_proyecto.Usuario_suscrito_ suscrito;

	iRegistrado iRegistrao = new BD_Principal();

	public Editar_Perfil(Registrado _registrado, ocl_proyecto.Usuario registrado) {
		super(_registrado, registrado);
		this._unnamed_Registrado_ = _registrado;
		this.registrado = registrado;
		
		this.getNoticiaEditorLayout().setVisible(false);
		this.getNoticiaLayout().setVisible(false);
		this.getNoticiaLayoutGenerico().setVisible(false);
		this.getPerfilUsuarioLayout().setVisible(false);
		this.getDarseDeBajaLayout().setVisible(false);

		//ESTATICO EDITAR DATOS
		this. _unnamed_Editar_datos_ = new Editar_datos(this._unnamed_Registrado_, this.registrado);
		this.getEditarDatosEstaticos().add(this. _unnamed_Editar_datos_);

		this.getBotonGuardarEditarPerfil().addClickListener(event->guardar_cambios());
		
		//CANCELAR
		this.getBotonCancelarEditarPerfil().addClickListener(event-> {
			try {
				if(Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(this.registrado.getIdUsuario()) != null) {					
					this.getLayoutBannerSuscrito().as(VerticalLayout.class).removeAll();
					perfil_ur = new Perfil_Uusario_Vista_UR((Usuario_Registardo) this._unnamed_Registrado_, (Usuario_suscrito_)this.registrado);
					this.getLayoutBannerSuscrito().as(VerticalLayout.class).add(this.perfil_ur);
				}else {
					this.getLayoutBannerSuscrito().as(VerticalLayout.class).removeAll();
					perfil = new Perfil_Usuario(this._unnamed_Registrado_, this.registrado);
					this.getLayoutBannerSuscrito().as(VerticalLayout.class).add(this.perfil);
				}
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
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
		int tarjeta = 0;
		boolean error = false;

		if (this._unnamed_Editar_datos_.getCampoEmail().getValue().isEmpty()) 
			Notification.show("Email Vacío");
		else if ( this._unnamed_Editar_datos_.getCampoContrasena().isEmpty()) 
			Notification.show("Contrasena Vacía");
		else if ( this._unnamed_Editar_datos_.getCampoApodo().getValue().isEmpty()) 
			Notification.show("Apodo Vacío");
		else if ( this._unnamed_Editar_datos_.getCampoDNI().getValue().isEmpty())
			Notification.show("DNI Vacío");
		else if ( this._unnamed_Editar_datos_.getCampoFoto().getValue().isEmpty()) 
			Notification.show("Foto Vacía");
		else {
			email = this._unnamed_Editar_datos_.getCampoEmail().getValue();
			contrasena = this._unnamed_Editar_datos_.getCampoContrasena().getValue();
			apodo = this._unnamed_Editar_datos_.getCampoApodo().getValue();
			dni = this._unnamed_Editar_datos_.getCampoDNI().getValue();
			foto = this._unnamed_Editar_datos_.getCampoFoto().getValue();
			
			try {
				suscrito = Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(registrado.getIdUsuario());
				if(suscrito != null) {
					if (this._unnamed_Editar_datos_.getTarjetaDeCrédito().getValue().isEmpty()) {
						Notification.show("Tarjeta de credito Vacía");
						error = true;
					}else {
						try {
							tarjeta = Integer.valueOf(this._unnamed_Editar_datos_.getTarjetaDeCrédito().getValue());
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
						perfil_ur = new Perfil_Uusario_Vista_UR(auxUR, (Usuario_suscrito_)this.registrado);
						this.auxUR.BR.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.perfil_ur);
						
					}else if(EditorDAO.getEditorByORMID(this.registrado.getIdUsuario()) != null){
						this._unnamed_Registrado_.mainView.removeAll();
						auxE = new Editor(this._unnamed_Registrado_.mainView, (ocl_proyecto.Editor) this.registrado);
						this._unnamed_Registrado_.mainView.add(auxE);
						
						this.auxE.BE.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
						perfil = new Perfil_Usuario(auxE, this.registrado);
						this.auxE.BE.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.perfil);
						
					}else {
						this._unnamed_Registrado_.mainView.removeAll();
						auxP = new Periodista(this._unnamed_Registrado_.mainView, (ocl_proyecto.Periodista) this.registrado);
						this._unnamed_Registrado_.mainView.add(auxP);
						
						this.auxP.BP.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
						perfil = new Perfil_Usuario(auxP, this.registrado);
						this.auxP.BP.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.perfil);
					}
				} catch (PersistentException e) {
					e.printStackTrace();
				}
			}
		}
	}
}