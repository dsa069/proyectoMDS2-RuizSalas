package interfaz;
import vistas.*;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
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
	
	public Listar_tematicas(Usuario usuario, ocl_proyecto.Noticia noticia) {
		super();
		this.usuario = usuario;
		this.notice = noticia;
		tem = cargar_tematicas();
		for (int i=0; i<tem.length; i++) {
			Notification.show("AAAAAAAAAAAAAAAAAAA" +tem[i].getNombre());
			Listar_tematicas_item LTI = new Listar_tematicas_item(this, tem[i]);
			this.getTematicasitem().as(VerticalLayout.class).add(LTI);
		}
	}
	
	public Tematica[] cargar_tematicas() {
		return iUsu.cargar_tematicas(notice.getId_noticia());
	}
}