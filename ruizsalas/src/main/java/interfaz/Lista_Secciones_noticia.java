package interfaz;
import vistas.*;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;
import ocl_proyecto.Seccion;

public class Lista_Secciones_noticia extends VistaListaseccionesnoticia {
//	private JLabel _seccion;
	public Noticia_Vista_Editor _unnamed_Noticia_Vista_Editor_;
	public Vector<Lista_Secciones_noticia_item> _item = new Vector<Lista_Secciones_noticia_item>();
	public Editor editor;
	public Seccion[] sesion;
	
	public iEditor iedit = new BD_Principal();
	
	public Lista_Secciones_noticia(Editor editor) {
		super();
		this.editor = editor;
		
//		Lista_Secciones_noticia_item _item = new Lista_Secciones_noticia_item(this,null);
//		this.getSeccionesSelecionablesItem().as(VerticalLayout.class).add(_item);
		
		
		sesion = cargar_secciones_seleccion();
		for (int i=0; i<sesion.length; i++) {
			Lista_Secciones_noticia_item _item = new Lista_Secciones_noticia_item(this, sesion[i]);
			this.getSeccionesSelecionablesItem().as(VerticalLayout.class).add(_item);
		}
	}
		

	public Seccion[] cargar_secciones_seleccion() {
		return iedit.cargar_secciones_seleccion();
	}
}