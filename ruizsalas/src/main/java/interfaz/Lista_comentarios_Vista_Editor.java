package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import ocl_proyecto.Comentario;

public class Lista_comentarios_Vista_Editor extends Lista_Comentarios_UR {
	public Vector<Lista_comentarios_Vista_Editor_item> _item = new Vector<Lista_comentarios_Vista_Editor_item>();

	public Editor _editor;
	public Lista_comentarios_Vista_Editor LCVE;
	public Contenido_noticia_editor CNC;

	ocl_proyecto.Editor editor;
	ocl_proyecto.Noticia noti;

	public Lista_comentarios_Vista_Editor(Editor _editor, ocl_proyecto.Editor editor, ocl_proyecto.Noticia noticia,Contenido_noticia_editor CNC) {
		super(_editor, editor, noticia, CNC);
		this._editor = _editor;
		this.noti = noticia;
		this.CNC = CNC;
	}
	@Override
	public void Comentarios_item_Estaticos(){
		comenta = this.cargar_listar_comenatrios();
		for (int i=0; i<comenta.length; i++) {
			Us_coment = this.cargar_usuario_comenatrio(comenta[i].getId_valoracion());
			Lista_comentarios_Vista_Editor_item LCVEI = new Lista_comentarios_Vista_Editor_item(this, Us_coment, this.editor, comenta[i]);
			this.getContenedorComentariosItem().as(VerticalLayout.class).add(LCVEI);
		}
	}

	@Override
	public void escribir_comentario() {
		iRegitrao.escribir_comentario(this.getCampoEscribirComentario().getValue(), user.getIdUsuario(), notice.getId_valoracion());
		this.ramadam();
	}

	@Override
	public void ramadam() {
		this.CNC.getComentariosEstaticos().as(VerticalLayout.class).removeAll();
		LCVE = new Lista_comentarios_Vista_Editor((Editor) this.usuario,(ocl_proyecto.Editor) this.user, this.notice, this.CNC);
		this.CNC.getComentariosEstaticos().as(VerticalLayout.class).add(LCVE);
	}
}