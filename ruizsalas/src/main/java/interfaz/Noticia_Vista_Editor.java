package interfaz;

//import UCL Proyecto.Eliminar_noticia;

public class Noticia_Vista_Editor extends Noticia_completa {
	public Editor _unnamed_Editor_;
	public Lista_Secciones_noticia _contiene;
	//public Eliminar_noticia _contiene_la_opcion_de;
	public Contenido_noticia_editor NoticiaVE;
	
	ocl_proyecto.Noticia noticia;
	ocl_proyecto.Editor editorBD;
	
	public Noticia_Vista_Editor(Editor _editor, ocl_proyecto.Usuario suscrito, ocl_proyecto.Noticia notice) {
		super(_editor, suscrito, notice);
		this._unnamed_Editor_ = _editor;
		this.editorBD = (ocl_proyecto.Editor) suscrito;
		this.noticia = notice;
		this.getNoticiaEditorLayout().setVisible(true);
		this.getNoticiaLayout().setVisible(false);
		
	}
	
	@Override
	public void Ver_Noticia() {
		this.NoticiaVE = new Contenido_noticia_editor(this._unnamed_Editor_, this.noticia, this.editorBD);
		this.getNoticiaEditorLayout().add(this.NoticiaVE);
	}
}