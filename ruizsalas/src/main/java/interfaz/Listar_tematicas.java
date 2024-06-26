package interfaz;

import vistas.*;
import java.util.Vector;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import basededatos.BD_Principal;
import basededatos.iUsuario;
import ocl_proyecto.Tematica;

public class Listar_tematicas extends VistaListartematicas {
	public Usuario usuario;
	public Tematica[] tem;
	ocl_proyecto.Noticia notice;
	iUsuario iUsu = new BD_Principal();
	
	public Listar_tematicas(Usuario usuario, ocl_proyecto.Noticia noticia) {
		super();
		this.usuario = usuario;
		this.notice = noticia;
		tem = iUsu.cargar_tematicas(notice.getId_valoracion());
		for (int i=0; i<tem.length; i++) {
			Listar_tematicas_item LTI = new Listar_tematicas_item(this, tem[i]);
			this.getTematicasitem().as(VerticalLayout.class).add(LTI);
		}
	}
}