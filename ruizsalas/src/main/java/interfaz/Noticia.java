package interfaz;
import vistas.*;
public class Noticia extends VistaNoticia{
	//private JScrollPanel _scroll;
	//private JLabel _imagen_principal;
	//private JLabel _fecha;
	//private JLabel _autor;
	//private JLabel _ubicacion;
	//private JLabel _titulo;
	//private JLabel _valoracion;
	//public Lista_Comentarios _contiene;
	
	public Usuario usuario;
	public Noticia(Usuario usuario) {
		super();
	this.usuario = usuario;
		}
}