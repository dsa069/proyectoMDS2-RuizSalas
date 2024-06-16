package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iUsuario_No_Registrado;
import vistas.VistaConfirmarregistro;

public class Confirmar_Registro extends VistaConfirmarregistro{

	public Introducir_datos_registro _contiene;
	public Enviar_Correo_Confirmacion _procede_a;
	
	ocl_proyecto.Usuario usuario = new ocl_proyecto.Usuario_suscrito_();
	
	public iUsuario_No_Registrado iUNR = new BD_Principal();
	
	public Usuario_No_Registrado usuarioNoRegistrado;
	public Confirmar_Registro(Usuario_No_Registrado usuarioNoRegistrado) {
		super();
		this.usuarioNoRegistrado = usuarioNoRegistrado;
		
		this.getBotonConfirmarRegistro().addClickListener(event->confirmar_Registro());
	}
	
	public void confirmar_Registro() {
		//bisnis

		
//QUITAR REGISSTRO Y PONER BANER (UR O UNR NOSE TODAVIA)	
		
		
		this.usuarioNoRegistrado.mainView.removeAll();
		this._contiene = new Introducir_datos_registro(usuarioNoRegistrado, usuario);
		this.gestionar_Transaccion();
		this.usuarioNoRegistrado.mainView.add(this.usuarioNoRegistrado.mainView.UR);
		this.enviar_Correo_Confirmacion();
	}
	
	public void enviar_Correo_Confirmacion() {
//		throw new UnsupportedOperationException();
	}

	public ocl_proyecto.Usuario gestionar_Transaccion() {
		return usuario = iUNR.gestionar_Transaccion(this._contiene.getCampoEmail().getValue(), this._contiene.getCampoContrasena().getValue(), this._contiene.getCampoApodo().getValue(), this._contiene.getCampoFoto().getValue(), this._contiene.getCampoDNI().getValue(), 0);
	}
}
