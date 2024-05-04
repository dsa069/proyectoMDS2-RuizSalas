package interfaz;

public class Lista_comentarios_Vista_Editor_item extends Lista_Comentarios_UR_item {
	//private JButton _borrar_comentario;
	public Lista_comentarios_Vista_Editor _lista_comentarios_Vista_Editor_;

	public Lista_comentarios_Vista_Editor_item(Lista_comentarios_Vista_Editor padre, ocl_proyecto.Editor editor, ocl_proyecto.Comentario comentario) {
		super(padre, editor, comentario);
		this._lista_comentarios_Vista_Editor_ = padre;
		this.getBorrarComentario().setVisible(true);
		
		this.getBorrarComentario().addClickListener(event->borrar_comentario());
	}
	
	public void borrar_comentario() {
		//Operacion base de datos de eliminar un comentario
		throw new UnsupportedOperationException();
	}
}