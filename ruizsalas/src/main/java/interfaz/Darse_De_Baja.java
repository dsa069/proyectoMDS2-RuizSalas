package interfaz;

import interfaz.Cancelar_cobro_suscripcion;
import basededatos.BD_Principal;
import basededatos.iUsuario_Registardo;
import vistas.VistaDarsedebaja;

public class Darse_De_Baja extends VistaDarsedebaja{
	public Usuario_Registardo usuarioRegistrado;
	public Cancelar_cobro_suscripcion _procede_a;
	public iUsuario_Registardo iusureg = new BD_Principal();
	ocl_proyecto.Usuario_suscrito_ suscrito;

	public Darse_De_Baja(Usuario_Registardo usuarioRegistrado, ocl_proyecto.Usuario_suscrito_ suscrito) {
		super();
		this.usuarioRegistrado = usuarioRegistrado;
		this.suscrito = suscrito;

		this.getBotonDarseDeBaja().addClickListener(event->this.cancelar_cobro_suscripcion());
	}

	public void cancelar_cobro_suscripcion() {
		_procede_a.cancelar_cobro_suscripcion(this);
		iusureg.cancelar_cobro_suscripcion(this.suscrito.getIdUsuario());
		this.usuarioRegistrado.mainView.removeAll();
		this.usuarioRegistrado.mainView.add(this.usuarioRegistrado.mainView.UNR);
	}
}