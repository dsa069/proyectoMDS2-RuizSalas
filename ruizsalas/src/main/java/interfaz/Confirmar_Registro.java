package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iUsuario_No_Registrado;
import vistas.VistaConfirmarregistro;

public class Confirmar_Registro extends VistaConfirmarregistro{

	public Introducir_datos_registro _contiene;
	public Enviar_Correo_Confirmacion _procede_a;
	
	ocl_proyecto.Usuario_suscrito_ usuario;
	
	iUsuario_No_Registrado iUNR = new BD_Principal();
	
	public Usuario_No_Registrado usuarioNoRegistrado;
	public Confirmar_Registro(Usuario_No_Registrado usuarioNoRegistrado) {
		super();
		this.usuarioNoRegistrado = usuarioNoRegistrado;
		
		this.getBotonConfirmarRegistro().addClickListener(event->confirmar_Registro());
		this.getBotonConfirmarRegistro().addClickListener(event->gestionar_Transaccion());
	}
	
	public void confirmar_Registro() {
		//bisnis

		
//QUITAR REGISSTRO Y PONER BANER (UR O UNR NOSE TODAVIA)	
		
		
		this.usuarioNoRegistrado.mainView.removeAll();
		this.usuarioNoRegistrado.mainView.add(this.usuarioNoRegistrado.mainView.UR);
	//	throw new UnsupportedOperationException();
		this.enviar_Correo_Confirmacion();
		this.gestionar_Transaccion();
	}
	
	public void enviar_Correo_Confirmacion() {
		throw new UnsupportedOperationException();
	}

	public void gestionar_Transaccion() {
		iUNR.gestionar_Transaccion(usuario.getApodo(), usuario.getDni(), usuario.getCorreo(), usuario.getTarjeta_de_credito());
		throw new UnsupportedOperationException();
	}
}
