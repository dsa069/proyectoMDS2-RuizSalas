package interfaz;
import vistas.*;

import java.util.Vector;

public class Listar_tematicas extends VistaListartemticas {
//	private JLabel _tematicas;
//	public Noticia _unnamed_Noticia_;
	public Vector<Listar_tematicas_item> _item = new Vector<Listar_tematicas_item>();
	public Usuario usuario;
	public Listar_tematicas(Usuario usuario) {
		super();
		this.usuario = usuario;
	}
}