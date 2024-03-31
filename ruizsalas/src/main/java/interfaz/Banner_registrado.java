package interfaz;

public class Banner_registrado extends Banner_generico {
	//private JButton _visitar_Perfil;
	public Banner_suscrito _puede_contener;
	
	public Registrado _registrado;
	public Banner_registrado(Registrado _registrado) {
		super(_registrado);
		this._registrado = _registrado;
	}
}