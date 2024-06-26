package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import ocl_proyecto.Noticia;
import ocl_proyecto.SeccionDAO;
import vistas.*;

public class Lista_noticas_Editor extends Listar_noticias {
	public Vector<Lista_noticas_Editor_item> _item = new Vector<Lista_noticas_Editor_item>();
	public Editor _editor;
	public Lista_secciones_Editor_item LSE;

	public Lista_noticas_Editor(Editor _editor,  Lista_secciones_Editor_item LSE) {
		super(_editor, null, null);
		this._editor = _editor;
		this.LSE=LSE;

	}

	public void Noticia_item(int seccion) {
		try {
			if(SeccionDAO.getSeccionByORMID(seccion).getPortada() == true)
				notice = iUsuario.cargar_noticias_portada();
			else
				notice = iUsuario.cargar_noticias_secciones(seccion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		for (int i=0; i<notice.length; i++) {
			Lista_noticas_Editor_item _item = new Lista_noticas_Editor_item(this, this.notice[i], seccion);
			this.getColumnas().as(VerticalLayout.class).add(_item);	
		}
	}
}