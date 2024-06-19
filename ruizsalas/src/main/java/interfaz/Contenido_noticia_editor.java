package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;

public class Contenido_noticia_editor extends Contenido_noticia_completo{
	public Editor editor;
	public Editor banner_Editor;
	public Seleccionar_Tematica seleccionarTematica;
	public Lista_Secciones_noticia listaSeccionesNoticia;
	public Noticia_Vista_Editor NVE;

	ocl_proyecto.Editor editorBD;
	ocl_proyecto.Noticia notice;

	iEditor iEdito = new BD_Principal();

	public Contenido_noticia_editor(Editor editor, ocl_proyecto.Editor editorBD, ocl_proyecto.Noticia noticia, Noticia_Vista_Editor NVE) {
		super(editor,editorBD, noticia, null);
		this.editor = editor;
		this.notice = noticia;
		this.editorBD = editorBD;
		this.NVE = NVE;
		this.getSeleccionarSecciones().setVisible(true);
		this.getSeleccionarTematicas().setVisible(true);
		this.getEliminarNoticia().setVisible(true);
		this.getTematicas().setVisible(false);

		//ESTATICO LISTA SECCIONES NOTICIA
		this.listaSeccionesNoticia = new Lista_Secciones_noticia(this.editor, this.notice, this);
		this.getSeleccionarSecciones().as(VerticalLayout.class).add(this.listaSeccionesNoticia);

		//ESTATICO SELECIONAR TEMATICA
		this.seleccionarTematica = new Seleccionar_Tematica(this.editor, this.notice, this);
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
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		this.editor.mainView.removeAll();
		banner_Editor = new Editor(this.editor.mainView,  (ocl_proyecto.Editor) editorBD);
		this.editor.mainView.add(banner_Editor);
	}

	@Override
	public void Listar_Tematicas() {
	}

}