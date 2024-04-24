package interfaz;
import vistas.*;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Lista_Secciones_noticia extends VistaListaseccionesnoticia {
//	private JLabel _seccion;
	public Noticia_Vista_Editor _unnamed_Noticia_Vista_Editor_;
	public Vector<Lista_Secciones_noticia_item> _item = new Vector<Lista_Secciones_noticia_item>();
	public Editor editor;
	public Lista_Secciones_noticia(Editor editor) {
		super();
		this.editor = editor;
		
		Lista_Secciones_noticia_item _item = new Lista_Secciones_noticia_item(this,null);
		this.getSeccionesSelecionablesItem().as(VerticalLayout.class).add(_item);
	}
}