package interfaz;

//import UCL Proyecto.Eliminar_noticia;

public class Noticia_Vista_Editor extends Noticia_completa {
	//public Editor _unnamed_Editor_;
	//public Lista_Secciones_noticia _contiene;
	//public Eliminar_noticia _contiene_la_opcion_de;
	public Editor _editor;
	
	public Noticia_Vista_Editor(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		this.getNoticiaEditorLayout().setVisible(true);
		this.getNoticiaLayout().setVisible(false);
	}
}