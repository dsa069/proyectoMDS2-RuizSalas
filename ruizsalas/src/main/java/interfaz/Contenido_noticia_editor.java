package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Contenido_noticia_editor extends Contenido_noticia_completo{
	public Editor editor;
	public Banner_Editor banner_Editor;
	public Seleccionar_Tematica seleccionarTematica;
	public Lista_Secciones_noticia listaSeccionesNoticia;
	
	public Contenido_noticia_editor(Editor editor) {
		super(editor);
		this.editor = editor;
		this.getSeleccionarSecciones().setVisible(true);
		this.getSeleccionarTematicas().setVisible(true);
		this.getEliminarNoticia().setVisible(true);
		this.getTematicas().setVisible(false);
		
		this.Listar_Secciones_Noticia();
		this.Seleccion_Tematica();
		
		this.getEliminarNoticia().addClickListener(event->BorrarNoticia());
	}
	
	@Override
	public void Lista_De_Comentarios() {
		this._contiene = new Lista_comentarios_Vista_Editor(this.editor);
		this.getComentariosEstaticos().as(VerticalLayout.class).add(this._contiene);
	}
	
	public void Seleccion_Tematica() {
		this.seleccionarTematica = new Seleccionar_Tematica(this.editor);
		this.getSeleccionarTematicas().as(VerticalLayout.class).add(this.seleccionarTematica);
	}

	public void Listar_Secciones_Noticia() {
		this.listaSeccionesNoticia = new Lista_Secciones_noticia(this.editor);
		this.getSeleccionarSecciones().as(VerticalLayout.class).add(this.listaSeccionesNoticia);
	}
	
	public void BorrarNoticia() {
		//OperacionBorrarnoticia
		this.editor.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		banner_Editor = new Banner_Editor(this.editor);
		this.editor.getBannerGenericoEstatico().as(VerticalLayout.class).add(banner_Editor);
	}

}