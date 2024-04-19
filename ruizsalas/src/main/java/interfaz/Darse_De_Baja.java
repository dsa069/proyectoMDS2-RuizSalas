package interfaz;

import vistas.VistaDarsedebaja;

public class Darse_De_Baja extends VistaDarsedebaja{

	public Usuario_Registardo usuarioRegistrado;
	public Usuario_No_Registrado _noRegistrado;
	
	public Darse_De_Baja(Usuario_Registardo usuarioRegistrado) {
		super();
		this.usuarioRegistrado = usuarioRegistrado;

		this.getBotonDarseDeBaja().addClickListener(event->darse_De_Baja());
	}

	public void darse_De_Baja() {
		//Notification.show("le he dado al boton");
		this._noRegistrado.mainView.removeAll();
		//Usuario_No_Registrado UNR = new Usuario_No_Registrado (this._noRegistrado.mainView);
		this._noRegistrado.mainView.add(this._noRegistrado.mainView.UNR);//Para no crear otro usuario y usar el del mainview que ya esta creado al registrarse
		//throw new UnsupportedOperationException();
	}

}