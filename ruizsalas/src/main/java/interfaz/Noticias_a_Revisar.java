package interfaz;

import java.util.Vector;

public class Noticias_a_Revisar extends Listar_noticias_generico {
//	public Revisar_noticias _unnamed_Revisar_noticias_;
	public Vector<Noticias_a_Revisar_item> _item = new Vector<Noticias_a_Revisar_item>();
	public Usuario usuario;
	public Noticias_a_Revisar(Usuario usuario) {
		super(usuario);
		this.usuario = usuario;
		//this.getOcultar().setVisible(false);
	}
}