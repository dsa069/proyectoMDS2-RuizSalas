package interfaz;

import java.util.Vector;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import vistas.*;

public class Listar_noticias extends Listar_noticias_generico {
	public Listar_Secciones_item _unnamed_Listar_Secciones_item_;
	public Vector<Listar_noticias_item> _item = new Vector<Listar_noticias_item>();
	public Seleccion_de_secciones_Vista_Editor _puede_contener;
	public Seleccion_de_secciones _unnamed_Seleccion_de_secciones_;
	
    public Usuario _usuario;
	public Listar_noticias(Usuario _usuario) {
		super(_usuario);
		this._usuario = _usuario;
		this.getPortada().setVisible(false);
		this.getListaSimpleNoticias().setVisible(false);
	}
	@Override
	public void Noticia_item() {
		Listar_noticias_item _item = new Listar_noticias_item(this);
		this.getColumnasNoticias().add(_item);
	}
}