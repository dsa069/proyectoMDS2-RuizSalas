package interfaz;

import java.util.Vector;
import vistas.*;

public class Seleccion_de_secciones extends Seleccion_de_secciones_generico {
	//private JTextField _barra_de_busqueda;
	//public Listar_noticias _puede_contener;
	public Vector<Seleccion_de_secciones_item> _item = new Vector<Seleccion_de_secciones_item>();
	
	public Usuario _usuario;
	public Seleccion_de_secciones(Usuario _usuario) {
		super(_usuario);
		this._usuario = _usuario;
		this.getBarraDeBusqueda().setVisible(true);
		this.getEditarTexto().setVisible(false);
	}
}