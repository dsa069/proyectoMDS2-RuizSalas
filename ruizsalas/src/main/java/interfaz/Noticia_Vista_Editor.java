package interfaz;


public class Noticia_Vista_Editor extends Noticia_completa {
	public Editor _unnamed_Editor_;
	public Contenido_noticia_editor NoticiaVE;
	public Listar_noticias_generico_item LNG;
	
	ocl_proyecto.Editor editorBD;
	
	public Noticia_Vista_Editor(Editor _editor, ocl_proyecto.Usuario suscrito, ocl_proyecto.Noticia notice, Listar_noticias_generico_item LNG) {
		super(_editor, suscrito, notice);
		this._unnamed_Editor_ = _editor;
		this.editorBD = (ocl_proyecto.Editor) suscrito;
		this.LNG=LNG;
		
		this.getNoticiaEditorLayout().setVisible(true);
		this.getNoticiaLayout().setVisible(false);	
		//ver noticia vista editor
		this.NoticiaVE = new Contenido_noticia_editor(this._unnamed_Editor_, this.editorBD, this.noticia, this);
		this.getNoticiaEditorLayout().add(this.NoticiaVE);
	}
	
	@Override
	public void Ver_Noticia() {
	}
}