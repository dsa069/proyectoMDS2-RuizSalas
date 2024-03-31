package interfaz;

public class Dar_de_alta_periodista extends Banner_Editor {
	//private JButton _registrar_periodista;
	public Editor _unnamed_Editor_;
	public Zona_registrar_periodista _contiene;

	public void registrar_periodista() {
		throw new UnsupportedOperationException();
	}
	
	public Editor _editor;
	public Dar_de_alta_periodista(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		this.getAltaPeriodistaLayout().setVisible(true);
	}
}