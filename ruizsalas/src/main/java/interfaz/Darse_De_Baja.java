package interfaz;

import vistas.VistaDarsedebaja;

public class Darse_De_Baja extends VistaDarsedebaja{
	public Usuario_Registardo usuarioRegistrado;
	
	public Darse_De_Baja(Usuario_Registardo usuarioRegistrado) {
		super();
		this.usuarioRegistrado = usuarioRegistrado;

		this.getBotonDarseDeBaja().addClickListener(event->darse_De_Baja());
	}
	
	public void darse_De_Baja() {   
		this.usuarioRegistrado.mainView.removeAll();
		this.usuarioRegistrado.mainView.add(this.usuarioRegistrado.mainView.UNR);
		//throw new UnsupportedOperationException();
	}

}