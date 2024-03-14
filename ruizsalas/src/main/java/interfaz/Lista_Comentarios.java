package interfaz;

import java.util.Vector;
import vistas.*;

public class Lista_Comentarios extends VistaListacomentarios {
	//public Noticia _unnamed_Noticia_;
	public Vector<Lista_Comentarios_item> _item = new Vector<Lista_Comentarios_item>();
	
	public Usuario usuario;
	public Lista_Comentarios(Usuario usuario) {
		super();
		this.usuario = usuario;
		this.getEscribirComentario().setVisible(false);
		}
}