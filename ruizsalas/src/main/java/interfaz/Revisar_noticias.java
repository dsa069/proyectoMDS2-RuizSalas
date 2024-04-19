package interfaz;

public class Revisar_noticias extends Banner_Editor {
	//private JScrollPanel _scroll;
	public Editor _unnamed_Editor_;
	public Noticias_a_Revisar _contiene;
	public Editor _editor;
	
	public Revisar_noticias(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getRevisarNoticiasLayout().setVisible(true);
	}
}