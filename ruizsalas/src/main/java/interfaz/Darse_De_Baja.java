package interfaz;

import basededatos.BD_Principal;
import basededatos.iUsuario_Registardo;
import vistas.VistaDarsedebaja;

public class Darse_De_Baja extends VistaDarsedebaja{
	public Usuario_Registardo usuarioRegistrado;
	public iUsuario_Registardo iusureg = new BD_Principal();
	ocl_proyecto.Usuario_suscrito_ suscrito;

	public Darse_De_Baja(Usuario_Registardo usuarioRegistrado, ocl_proyecto.Usuario_suscrito_ suscrito) {
		super();
		this.usuarioRegistrado = usuarioRegistrado;
		this.suscrito = suscrito;

		this.getBotonDarseDeBaja().addClickListener(event->this.cancelar_cobro_suscripcion());
	}
	
	public void cancelar_cobro_suscripcion() {   
		iusureg.cancelar_cobro_suscripcion(this.suscrito.getIdUsuario());
		this.usuarioRegistrado.mainView.removeAll();
		this.usuarioRegistrado.mainView.add(this.usuarioRegistrado.mainView.UNR);
	}

}