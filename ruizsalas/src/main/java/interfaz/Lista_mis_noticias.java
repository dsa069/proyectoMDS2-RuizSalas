package interfaz;

import java.util.Vector;

public class Lista_mis_noticias extends Listar_noticias_generico {
//	public Historial_noticias _unnamed_Historial_noticias_;
	public Vector<Lista_mis_noticias_item> _item = new Vector<Lista_mis_noticias_item>();
	public Usuario usuario;
	public Lista_mis_noticias(Usuario usuario) {
		super(usuario);
		this.usuario = usuario;
		//this.getOcultar().setVisible(false);
	}
}