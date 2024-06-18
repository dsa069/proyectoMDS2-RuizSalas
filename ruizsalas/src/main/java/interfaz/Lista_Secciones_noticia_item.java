package interfaz;
import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;
import ocl_proyecto.NoticiaDAO;
import ocl_proyecto.SeccionDAO;
import vistas.*;

public class Lista_Secciones_noticia_item extends VistaListaseccionesnoticia_item {
	public Lista_Secciones_noticia _lista_Secciones_noticia;
	ocl_proyecto.Seccion seccion;
	ocl_proyecto.Noticia noticia;
	Contenido_noticia_editor CNE;
	iEditor ieditor = new BD_Principal();
	public Lista_Secciones_noticia_item(Lista_Secciones_noticia _lista_Secciones_noticia, ocl_proyecto.Seccion seccion, ocl_proyecto.Noticia notice, Contenido_noticia_editor CNE) {
		super();
		this._lista_Secciones_noticia = _lista_Secciones_noticia;
		this.CNE = CNE;
		this.seccion = seccion;
		this.noticia = notice;
		
		try {
			if (!SeccionDAO.getSeccionByORMID(this.seccion.getIdSeccion()).contiene.contains(NoticiaDAO.getNoticiaByORMID(this.noticia.getId_valoracion()))) {
				this.getBotonSeccionNoticiaRelleno().setVisible(false);
				this.getBotonSeccionNoticiaVacio().setVisible(true);
			} else {
				this.getBotonSeccionNoticiaRelleno().setVisible(true);
				this.getBotonSeccionNoticiaVacio().setVisible(false);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.getNombreSeccionNoticia().setText("" + seccion.getNombre());
		this.getBotonSeccionNoticiaRelleno().addClickListener(event->marcar_seccion());
		this.getBotonSeccionNoticiaVacio().addClickListener(event->marcar_seccion());
	}

	public void marcar_seccion() {
		ieditor.marcar_seccion(this.seccion.getIdSeccion(), this.noticia.getId_valoracion());
		this.CNE.getSeleccionarSecciones().as(VerticalLayout.class).removeAll();
//		this._lista_Secciones_noticia.getSeccionesSelecionablesItem().as(VerticalLayout.class).removeAll();
		Lista_Secciones_noticia LSN = new Lista_Secciones_noticia(this._lista_Secciones_noticia.editor, this.noticia, this.CNE);
		this.CNE.getSeleccionarSecciones().as(VerticalLayout.class).add(LSN);
	}
}