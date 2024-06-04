package interfaz;
import vistas.*;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iUsuario;
import ocl_proyecto.Tematica;

public class Listar_tematicas extends VistaListartematicas {
//	private JLabel _tematicas;
//	public Noticia _unnamed_Noticia_;
	public Vector<Listar_tematicas_item> _item = new Vector<Listar_tematicas_item>();
	public Usuario usuario;
	public Tematica[] tem;
	
	ocl_proyecto.Noticia notice;
	
	iUsuario iUsu = new BD_Principal();
	
	public Listar_tematicas(Usuario usuario) {
		super();
		this.usuario = usuario;
		
		Listar_tematicas_item _item = new Listar_tematicas_item(this,null);
		this.getTematicasitem().as(VerticalLayout.class).add(_item);
		
		tem = cargar_tematicas();
		for (int i=0; i<tem.length; i++) {
			Listar_tematicas_item LTI = new Listar_tematicas_item(this, tem[i]);
			this.getTematicasitem().as(VerticalLayout.class).add(LTI);
		}
	}
	
	public Tematica[] cargar_tematicas() {
		return iUsu.cargar_tematicas(notice.getId_noticia());
	}
}