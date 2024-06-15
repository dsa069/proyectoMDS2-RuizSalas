package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import ocl_proyecto.Comentario;

public class Lista_comentarios_Vista_Editor extends Lista_Comentarios_UR {
	public Vector<Lista_comentarios_Vista_Editor_item> _item = new Vector<Lista_comentarios_Vista_Editor_item>();

	public Editor _editor;
	
	ocl_proyecto.Editor editor;
	ocl_proyecto.Comentario comentario;
	ocl_proyecto.Noticia noti;
	
	public Lista_comentarios_Vista_Editor(Editor _editor, ocl_proyecto.Editor editor, ocl_proyecto.Noticia noticia) {
		super(_editor, editor, noticia);
		this._editor = _editor;
		this.noti = noticia;
		//this.getOcultar().setVisible(false);
		
		this.Comentarios_item_Estaticos_Editor();
		}
	
	public void Comentarios_item_Estaticos_Editor(){
		comenta = this.cargar_listar_comenatrios();
		for (int i=0; i<comenta.length; i++) {
			Lista_comentarios_Vista_Editor_item LCVEI = new Lista_comentarios_Vista_Editor_item(this, (ocl_proyecto.Editor) user, comenta[i]);
			this.getContenedorComentariosItem().as(VerticalLayout.class).add(LCVEI);
		}
	}
}