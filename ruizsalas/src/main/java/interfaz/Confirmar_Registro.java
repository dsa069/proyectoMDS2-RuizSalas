package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaConfirmarregistro;

public class Confirmar_Registro extends VistaConfirmarregistro{

	public Introducir_datos_registro _contiene;
	public Enviar_Correo_Confirmacion _procede_a;
	
	public Usuario_No_Registrado usuarioNoRegistrado;
	public Confirmar_Registro(Usuario_No_Registrado usuarioNoRegistrado) {
		super();
		this.usuarioNoRegistrado = usuarioNoRegistrado;
		
		this.getBotonConfirmarRegistro().addClickListener(event->confirmar_Registro());
	}
	
	public void confirmar_Registro() {
		//bisnis

		
//QUITAR REGISSTRO Y PONER BANER (UR O UNR NOSE TODAVIA)		
//		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
//		noRegistro = new Banner_no_registrado(this._usuarioNoRegistrado);
//		this.getBannergenericolayout().as(VerticalLayout.class).add(noRegistro);
	//	throw new UnsupportedOperationException();
		this.enviar_Correo_Confirmacion();
		this.gestionar_Transaccion();
	}
	
	public void enviar_Correo_Confirmacion() {
		throw new UnsupportedOperationException();
	}

	public void gestionar_Transaccion() {
		throw new UnsupportedOperationException();
	}
}
