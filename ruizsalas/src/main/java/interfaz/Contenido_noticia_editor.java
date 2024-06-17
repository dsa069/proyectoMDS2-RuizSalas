package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;

public class Contenido_noticia_editor extends Contenido_noticia_completo{
	public Editor editor;
	public Banner_Editor banner_Editor;
	public Seleccionar_Tematica seleccionarTematica;
	public Lista_Secciones_noticia listaSeccionesNoticia;

	ocl_proyecto.Editor editorBD;
	ocl_proyecto.Noticia notice;

	iEditor iEdito = new BD_Principal();

	public Contenido_noticia_editor(Editor editor, ocl_proyecto.Editor editorBD, ocl_proyecto.Noticia noticia) {
		super(editor,editorBD, noticia);
		this.editor = editor;
		this.notice = noticia;
		this.editorBD = editorBD;
		this.getSeleccionarSecciones().setVisible(true);
		this.getSeleccionarTematicas().setVisible(true);
		this.getEliminarNoticia().setVisible(true);
		this.getTematicas().setVisible(false);

		//ESTATICO LISTA SECCIONES NOTICIA
		this.listaSeccionesNoticia = new Lista_Secciones_noticia(this.editor);
		this.getSeleccionarSecciones().as(VerticalLayout.class).add(this.listaSeccionesNoticia);

		//ESTATICO SELECIONAR TEMATICA
		this.seleccionarTematica = new Seleccionar_Tematica(this.editor, this.notice);
		this.getSeleccionarTematicas().as(VerticalLayout.class).add(this.seleccionarTematica);

		//ESTATICO COMENATRIOS EDITOR
		this._contiene = new Lista_comentarios_Vista_Editor(this.editor, this.editorBD, this.notice, this);
		this.getComentariosEstaticos().as(VerticalLayout.class).add(this._contiene);

		this.getEliminarNoticia().addClickListener(event->eliminar_noticia());
	}

	@Override
	public void Lista_De_ComentariosComp() {
	}

	public void eliminar_noticia() {
		iEdito.eliminar_noticia(this.notice.getId_valoracion());
		this.editor.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		banner_Editor = new Banner_Editor(this.editor, this.editorBD);
		this.editor.getBannerGenericoEstatico().as(VerticalLayout.class).add(banner_Editor);
	}

	@Override
	public void Listar_Tematicas() {
	}

}