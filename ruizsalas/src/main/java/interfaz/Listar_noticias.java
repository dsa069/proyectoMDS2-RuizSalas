package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import ocl_proyecto.Noticia;
import ocl_proyecto.Seccion;
import vistas.*;

public class Listar_noticias extends Listar_noticias_generico {
	public Listar_Secciones_item _unnamed_Listar_Secciones_item_;
	public Vector<Listar_noticias_item> _item = new Vector<Listar_noticias_item>();
	public Seleccion_de_secciones_Vista_Editor _puede_contener;
	public Seleccion_de_secciones _unnamed_Seleccion_de_secciones_;
	
	ocl_proyecto.Usuario usuarioocl;
	
    public Usuario _usuario;
	
	public Listar_noticias(Usuario _usuario,  ocl_proyecto.Usuario usuarioocl, Listar_Secciones_item _unnamed_Listar_Secciones_item_) {
		super(_usuario);
		this._usuario = _usuario;
		this.usuarioocl = usuarioocl;
		this._unnamed_Listar_Secciones_item_ = _unnamed_Listar_Secciones_item_;
		this.getPortada().setVisible(false);
		this.getListaSimpleNoticias().setVisible(false);
	}
	
	public void Noticia_item(int seccion) {
		notice = this.cargar_noticias_secciones(seccion);
		for (int i=0; i<notice.length; i++) {
			Listar_noticias_item _item = new Listar_noticias_item(this, this.notice[i]);
			this.getColumnasNoticias().add(_item);	
		}
	}
	
	public Noticia[] cargar_noticias_secciones(int IdSeccion) {
		return iUsuario.cargar_noticias_secciones(IdSeccion);
	}
}