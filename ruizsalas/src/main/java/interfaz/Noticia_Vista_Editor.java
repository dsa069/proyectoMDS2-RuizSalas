package interfaz;


public class Noticia_Vista_Editor extends Noticia_completa {
	public Editor _unnamed_Editor_;
	public Lista_Secciones_noticia _contiene;
	public Contenido_noticia_editor NoticiaVE;
	
	ocl_proyecto.Editor editorBD;
	
	public Noticia_Vista_Editor(Editor _editor, ocl_proyecto.Usuario suscrito, ocl_proyecto.Noticia notice) {
		super(_editor, suscrito, notice);
		this._unnamed_Editor_ = _editor;
		this.editorBD = (ocl_proyecto.Editor) suscrito;
		//this.noticia = notice;
		this.getNoticiaEditorLayout().setVisible(true);
		this.getNoticiaLayout().setVisible(false);	
		
		this.Ver_Noticia_Editor();
	}
	
	@Override
	public void Ver_Noticia() {
	}
	
	public void Ver_Noticia_Editor() {
		this.NoticiaVE = new Contenido_noticia_editor(this._unnamed_Editor_, this.editorBD, this.noticia);
		this.getNoticiaEditorLayout().add(this.NoticiaVE);
	}
}