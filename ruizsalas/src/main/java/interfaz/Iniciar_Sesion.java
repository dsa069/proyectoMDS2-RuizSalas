package interfaz;

public class Iniciar_Sesion extends Banner_no_registrado{
	//private Button _confirmar_Datos;
	public Usuario_No_Registrado _unnamed_Usuario_No_Registrado_;
	public Introducir_Datos _contiene;

	public Iniciar_Sesion(Usuario_No_Registrado _usuarioNoRegistrado) {
		super(_usuarioNoRegistrado);
		this._usuarioNoRegistrado = _usuarioNoRegistrado;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getIniciarSesionLayout().setVisible(true);
		this.getZonaAnunciosLayout1().setVisible(false);
		this.getZonaAnunciosLayout2().setVisible(false);

		this.getBotonCancelarSesion().addClickListener(event->ConductorRegistro());
		this.getBotonConfirmarSesion().addClickListener(event->confirmar_Datos());
	}

	public void confirmar_Datos() {//NOFUNCIONADELTODO
		//ComparacionBd
		this._unnamed_Usuario_No_Registrado_.mainView.removeAll();
        this._unnamed_Usuario_No_Registrado_.mainView.add(this._unnamed_Usuario_No_Registrado_.mainView.UR);//Para no crear otro usuario y usar el del mainview que ya esta creado al registrarse
		//throw new UnsupportedOperationException();
	}
}