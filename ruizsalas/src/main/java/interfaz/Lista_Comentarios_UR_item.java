package interfaz;

public class Lista_Comentarios_UR_item extends Lista_Comentarios_item {
//	private JButton _me_gusta;
//	private JButton _no_me_gusta;
	public Lista_Comentarios_UR _lista_Comentarios_UR;
	
	public Lista_Comentarios_UR_item(Lista_Comentarios_UR padre, ocl_proyecto.Usuario user, ocl_proyecto.Comentario comentario) {
		super(padre, user, comentario);
		this._lista_Comentarios_UR = padre;
		this.getValorarComentarioNegativamente().setVisible(true);
		this.getValorarComentarioPositivamente().setVisible(true);
		
		this.getValorarComentarioNegativamente().addClickListener(event->valorar_comentario());
		this.getValorarComentarioPositivamente().addClickListener(event->valorar_comentario());
	}
	
	public void valorar_comentario() {
		//Operaciones de dar like y dislike a comentario
		throw new UnsupportedOperationException();
	}
}