package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import ocl_proyecto.Noticia;
import ocl_proyecto.Seccion;
import vistas.*;

public class Listar_noticias extends Listar_noticias_generico {
	public Listar_Secciones_item _unnamed_Listar_Secciones_item_;
	ocl_proyecto.Usuario usuarioocl;
    public Usuario _usuario;
    public Busqueda busquets;
	
	public Listar_noticias(Usuario _usuario,  ocl_proyecto.Usuario usuarioocl, Listar_Secciones_item _unnamed_Listar_Secciones_item_) {
		super(_usuario);
		this._usuario = _usuario;
		this.usuarioocl = usuarioocl;
		this._unnamed_Listar_Secciones_item_ = _unnamed_Listar_Secciones_item_;
		this.getPortada().setVisible(false);
		this.getListaSimpleNoticias().setVisible(false);
	}
	
	public void Noticia_item(Noticia [] noticia, Busqueda busi, int seccion) {
		busquets = busi;
		if(busquets == null && seccion != 0) {
			notice = iUsuario.cargar_noticias_secciones(seccion);
			for (int i=0; i<notice.length; i++) {
				Listar_noticias_item _item = new Listar_noticias_item(this, this.notice[i], false, true);
				this.getColumnas().as(VerticalLayout.class).add(_item);	
			}
		}else {
			notice = noticia;
			for (int i=0; i<notice.length; i++) {
				Listar_noticias_item _item = new Listar_noticias_item(this, this.notice[i], true, true);
				this.getColumnas().as(VerticalLayout.class).add(_item);	
		}
		}
	}
}