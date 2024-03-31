package interfaz;

public class Noticia_completa extends Banner_suscrito {
	//private JButton _me_gusta;
	//private JButton _no_me_gusta;
	//private JLabel _contenido_noticia_completo;
	//public Registrado _unnamed_Registrado_;
	public Lista_Comentarios_UR _contiene;
	
	public Registrado _registrado;
	public Noticia_completa(Registrado _registrado) {
		super(_registrado);
		this._registrado = _registrado;
	}

	public void valorar_noticia() {
		throw new UnsupportedOperationException();
	}
}