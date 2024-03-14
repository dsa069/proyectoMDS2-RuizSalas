package interfaz;

import java.util.Vector;
import vistas.*;

public class Listar_Secciones extends VistaListarsecciones{
	//public Secciones_periodico _unnamed_Secciones_periodico_;
	public Vector<Listar_Secciones_item> _item = new Vector<Listar_Secciones_item>();
	
	public Usuario usuario;
	public Listar_Secciones(Usuario usuario) {
		super();
		this.usuario = usuario;
		}
}