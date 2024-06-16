package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iRegistrado;
import ocl_proyecto.Usuario;
import ocl_proyecto.UsuarioDAO;
import ocl_proyecto.Usuario_suscrito_;
import ocl_proyecto.Usuario_suscrito_DAO;

public class Editar_Perfil extends Banner_suscrito {
	//private JButton _guardar_cambios;
	public Registrado _unnamed_Registrado_;
	public Editar_datos _unnamed_Editar_datos_;
	public Perfil_Usuario perfil;
	public Perfil_Uusario_Vista_UR perfil_ur;

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

		this.Editar_Dato();

		this.getBotonGuardarEditarPerfil().addClickListener(event->guardar_cambios());
		this.getBotonCancelarEditarPerfil().addClickListener(event->ConductorPerfilSuscrito());
	}

	public void Editar_Dato() {
		this. _unnamed_Editar_datos_ = new Editar_datos(this._unnamed_Registrado_, this.registrado);
		this.getEditarDatosEstaticos().add(this. _unnamed_Editar_datos_);
	}

	public void guardar_cambios() {//CUANDO TENGAMOS LA BASE DE DATOS PONER DISTINCION ENTRE UR Y DEMAS
		//Operacion de guardar
		String apodo; 
		String dni; 
		String email; 
		String contrasena; 
		String foto;
		int tarjeta = 0;
		boolean error = false;
		Notification.show("AMBATUKAM "+ this._unnamed_Editar_datos_.getCampoApodo().getValue());
		if (this._unnamed_Editar_datos_.getCampoEmail().getValue().isEmpty()) 
			email = this.registrado.getCorreo();
		else 
			email = this._unnamed_Editar_datos_.getCampoEmail().getValue();
		
		if ( this._unnamed_Editar_datos_.getCampoContrasena().isEmpty()) 
			contrasena = this.registrado.getContrasena();
		else 
			contrasena = this._unnamed_Editar_datos_.getCampoContrasena().getValue();
		
		if ( this._unnamed_Editar_datos_.getCampoApodo().getValue().isEmpty()) 
			apodo = this.registrado.getApodo();
		else 
			apodo = this._unnamed_Editar_datos_.getCampoApodo().getValue();
				
		if ( this._unnamed_Editar_datos_.getCampoFoto().getValue().isEmpty()) 
			foto = this.registrado.getFoto_de_perfil();
		else 
			foto = this._unnamed_Editar_datos_.getCampoFoto().getValue();
		
		if ( this._unnamed_Editar_datos_.getCampoDNI().getValue().isEmpty())
			dni = this.registrado.getDni();
		else 
			dni = this._unnamed_Editar_datos_.getCampoDNI().getValue();
		
		try {
			
			suscrito = Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(registrado.getIdUsuario());
			if(suscrito != null) {
				if ( this._unnamed_Editar_datos_.getTarjetaDeCrédito().getValue().isEmpty())
					tarjeta = this.suscrito.getTarjeta_de_credito();
				else {
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
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(!error) {

				iRegistrao.guardar_cambios(this.registrado.getIdUsuario(),apodo, dni, email, contrasena, foto, tarjeta);
				try {
					registrado = UsuarioDAO.getUsuarioByORMID(this.registrado.getIdUsuario());
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.ConductorPerfilSuscrito();
		}
	}

	public void ConductorPerfilSuscrito() {
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
	}
}