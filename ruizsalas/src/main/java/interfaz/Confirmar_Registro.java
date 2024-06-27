package interfaz;

import interfaz.Enviar_Correo_Confirmacion;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iUsuario_No_Registrado;
import ocl_proyecto.Usuario_suscrito_;
import vistas.VistaConfirmarregistro;

public class Confirmar_Registro extends VistaConfirmarregistro{

	public Introducir_datos_registro _contiene;
	public Enviar_Correo_Confirmacion _procede_a = new Enviar_Correo_Confirmacion();
	public Gestionar_Transaccion a_procede_a = new Gestionar_Transaccion();

	ocl_proyecto.Usuario_suscrito_ usuario;

	public iUsuario_No_Registrado iUNR = new BD_Principal();

	public Usuario_Registardo usuarioRegistrado;
	public Usuario_No_Registrado usuarioNoRegistrado;
	public Confirmar_Registro(Usuario_No_Registrado usuarioNoRegistrado, Introducir_datos_registro _contiene) {
		super();
		this.usuarioNoRegistrado = usuarioNoRegistrado;
		this._contiene =_contiene;

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
		}else if ( this._contiene.getCampoFoto().getValue().isEmpty()) {
			Notification.show("Ruta de foto Vacía");
		}else if ( this._contiene.getCampoDNI().getValue().isEmpty()) {
			Notification.show("DNI Vacío");
		}else if ( this._contiene.getCampoDNI().getValue().length() != 9)
			Notification.show("El DNI debe tener 9 caracteres");
		else if ( this._contiene.getCampoFoto().getValue().isEmpty()) {
			Notification.show("Foto Vacío");
		}else if ( this._contiene.getTarjetaDeCrédito().getValue().isEmpty()) {
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
				this.usuario = iUNR.gestionar_Transaccion(this._contiene.getCampoEmail().getValue(), this._contiene.getCampoContrasena().getValue(), this._contiene.getCampoApodo().getValue(), this._contiene.getCampoFoto().getValue(), this._contiene.getCampoDNI().getValue(),Long.valueOf(this._contiene.getTarjetaDeCrédito().getValue().replace(" ", "")));
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