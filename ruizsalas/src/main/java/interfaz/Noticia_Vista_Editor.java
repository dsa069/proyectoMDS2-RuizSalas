package interfaz;

//import UCL Proyecto.Eliminar_noticia;

public class Noticia_Vista_Editor extends Noticia_completa {
	public Editor _unnamed_Editor_;
	public Lista_Secciones_noticia _contiene;
	//public Eliminar_noticia _contiene_la_opcion_de;
	public Contenido_noticia_editor NoticiaVE;
	
	ocl_proyecto.Noticia noticia;
	
	public Noticia_Vista_Editor(Editor _editor, ocl_proyecto.Usuario_suscrito_ suscrito) {
		super(_editor, suscrito);
		this._unnamed_Editor_ = _editor;
		this.getNoticiaEditorLayout().setVisible(true);
		this.getNoticiaLayout().setVisible(false);
		
	}
	
	@Override
	public void Ver_Noticia() {
		this.NoticiaVE = new Contenido_noticia_editor(this._unnamed_Editor_, this.noticia);
		this.getNoticiaEditorLayout().add(this.NoticiaVE);
	}
}