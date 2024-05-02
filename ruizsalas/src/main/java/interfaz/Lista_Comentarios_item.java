package interfaz;
import vistas.*;

public class Lista_Comentarios_item extends VistaListacomentarios_item {
//	private JLabel _foto;
//	private JLabel _mi_apodo;
//	private JLabel _comentario;
//	private JLabel _valoracion;
	public Lista_Comentarios _lista_Comentarios;
	
	ocl_proyecto.Comentario comentario;
	ocl_proyecto.Usuario usuario;
	
	public Lista_Comentarios_item(Lista_Comentarios _lista_Comentarios, ocl_proyecto.Usuario usuario, ocl_proyecto.Comentario comentario) { //Esto se puede hacer?
		super();
		this._lista_Comentarios = _lista_Comentarios;
		this.getValorarComentarioNegativamente().setVisible(false);
		this.getValorarComentarioPositivamente().setVisible(false);
		this.getBorrarComentario().setVisible(false);
		
//		this.getLayoutZonaComentarioEscrito().setText(comentario.getTexto());
//		this.getLayoutApodoComentarista().setText(usuario.getApodo());
//		this.getImagenUsuarioComento().setSrc(usuario.getFoto_de_perfil());
		
//		this.getLayoutVerValoracionComentario().setText(comentario.getId_valoracion()); //Tenemos que pasarle también valoración o que hacemos?
	}
}