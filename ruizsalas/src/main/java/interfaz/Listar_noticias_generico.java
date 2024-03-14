package interfaz;
import vistas.*;
import java.util.Vector;

public class Listar_noticias_generico extends VistaListarnoticiasgenerico {
	public Vector<Listar_noticias_generico_item> _item = new Vector<Listar_noticias_generico_item>();
	public Usuario usuario;
	public Listar_noticias_generico(Usuario usuario) {
		super();
		this.usuario = usuario;
	}
}