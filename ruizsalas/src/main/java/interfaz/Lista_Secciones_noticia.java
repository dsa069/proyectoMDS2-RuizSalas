package interfaz;
import vistas.*;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;
import ocl_proyecto.Seccion;

public class Lista_Secciones_noticia extends VistaListaseccionesnoticia {
	public Noticia_Vista_Editor _unnamed_Noticia_Vista_Editor_;
	public Vector<Lista_Secciones_noticia_item> _item = new Vector<Lista_Secciones_noticia_item>();
	public Editor editor;
	public Seccion[] sesion;
	Contenido_noticia_editor CNE;
	ocl_proyecto.Noticia noticia;
	public iEditor iedit = new BD_Principal();
	
	public Lista_Secciones_noticia(Editor editor, ocl_proyecto.Noticia noticia, Contenido_noticia_editor CNE) {
		super();
		this.editor = editor;		
		this.noticia = noticia;
		this.CNE = CNE;
		sesion = iedit.cargar_secciones_seleccion(this.noticia.getId_valoracion());
		for (int i=0; i<sesion.length; i++) {
			Lista_Secciones_noticia_item _item = new Lista_Secciones_noticia_item(this, sesion[i], this.noticia, this.CNE);
			this.getSeccionesSelecionablesItem().as(VerticalLayout.class).add(_item);
		}
	}
}