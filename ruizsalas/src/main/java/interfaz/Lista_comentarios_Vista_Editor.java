package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Lista_comentarios_Vista_Editor extends Lista_Comentarios_UR {
	public Vector<Lista_comentarios_Vista_Editor_item> _item = new Vector<Lista_comentarios_Vista_Editor_item>();

	public Editor _editor;
	
	ocl_proyecto.Editor editor;
	ocl_proyecto.Comentario comentario;
	
	public Lista_comentarios_Vista_Editor(Editor _editor, ocl_proyecto.Editor editor) {
		super(_editor, editor);
		this._editor = _editor;
		//this.getOcultar().setVisible(false);
		}
	
	@Override
	public void Comentarios_item_Estaticos(){
		Lista_comentarios_Vista_Editor_item _item = new Lista_comentarios_Vista_Editor_item(this, this.editor, this.comentario);
		this.getContenedorComentariosItem().as(VerticalLayout.class).add(_item);
	}
}