package interfaz;

public class Lista_Comentarios_UR_item extends Lista_Comentarios_item {
//	private JButton _me_gusta;
//	private JButton _no_me_gusta;
	public Lista_Comentarios_UR _lista_Comentarios_UR;
	
	public Lista_Comentarios_UR_item(Lista_Comentarios padre) {
		super(padre);
		this.getValorarComentarioNegativamente().setVisible(true);
		this.getValorarComentarioPositivamente().setVisible(true);
	}
	
	public void valorar_comentario() {
		throw new UnsupportedOperationException();
	}
}