package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Contenido_noticia_editor extends Contenido_noticia_completo{
	public Editor editor;
	Banner_Editor banner_Editor;
	public Contenido_noticia_editor(Editor editor) {
		super(editor);
		this.editor = editor;
		this.getSeleccionarSecciones().setVisible(true);
		this.getSeleccionarTematicas().setVisible(true);
		this.getEliminarNoticia().setVisible(true);
		this.getTematicas().setVisible(false);
		
		this.getEliminarNoticia().addClickListener(event->BorrarNoticia());
	}
	public void BorrarNoticia() {
		//OperacionBorrarnoticia
		this.editor.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		banner_Editor = new Banner_Editor(this.editor);
		this.editor.getBannerGenericoEstatico().as(VerticalLayout.class).add(banner_Editor);
	}
}