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
	public Enviar_Correo_Confirmacion _procede_a;
	public Gestionar_Transaccion a_procede_a;

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
		}else if ( this._contiene.getCampoFoto().getValue().isEmpty()) {
			Notification.show("Foto Vacío");
		}else if ( this._contiene.getTarjetaDeCrédito().getValue().isEmpty()) {
			Notification.show("Tarjeta de credito Vacía");
		}else {
			try {
				Integer.valueOf(this._contiene.getTarjetaDeCrédito().getValue());
				this.usuario = iUNR.gestionar_Transaccion(this._contiene.getCampoEmail().getValue(), this._contiene.getCampoContrasena().getValue(), this._contiene.getCampoApodo().getValue(), this._contiene.getCampoFoto().getValue(), this._contiene.getCampoDNI().getValue(),Integer.valueOf(this._contiene.getTarjetaDeCrédito().getValue()));
				this.usuarioNoRegistrado.mainView.removeAll();
				usuarioRegistrado = new Usuario_Registardo(this.usuarioNoRegistrado.mainView, this.usuario);
				this.usuarioNoRegistrado.mainView.add(usuarioRegistrado);
				a_procede_a.gestionar_Transaccion(this);
				this.enviar_Correo_Confirmacion();	
			} catch (Exception e) {
				Notification.show("Tarjeta de credito con caracteres invalidos");
			}
		}
	}
}