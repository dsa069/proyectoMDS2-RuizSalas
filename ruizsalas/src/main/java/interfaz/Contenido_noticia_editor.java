package interfaz;

public class Contenido_noticia_editor extends Contenido_noticia_completo{
	public Editor editor;
	public Contenido_noticia_editor(Editor editor) {
		super(editor);
		this.editor = editor;
		this.getSeleccionarSecciones().setVisible(true);
		this.getSeleccionarTematicas().setVisible(true);
		this.getEliminarNoticia().setVisible(true);
		this.getTematicas().setVisible(false);
	}
}