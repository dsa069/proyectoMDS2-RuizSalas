package interfaz;

public class Lista_periodistas extends Banner_Editor {
//	private JButton _alta_periodista;
//	private JScrollPanel _scroll;
	public Editor _accede;
	public Periodistas _unnamed_Periodistas_;
	
	public Editor _editor;
	public Lista_periodistas(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getPeriodistaLayout1().setVisible(true);
	}
}