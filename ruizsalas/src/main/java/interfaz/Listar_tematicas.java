package interfaz;
import vistas.*;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listar_tematicas extends VistaListartematicas {
//	private JLabel _tematicas;
//	public Noticia _unnamed_Noticia_;
	public Vector<Listar_tematicas_item> _item = new Vector<Listar_tematicas_item>();
	public Usuario usuario;
	public Listar_tematicas(Usuario usuario) {
		super();
		this.usuario = usuario;
		
		Listar_tematicas_item _item = new Listar_tematicas_item(this,null);
		this.getTematicasitem().as(VerticalLayout.class).add(_item);
	}
}