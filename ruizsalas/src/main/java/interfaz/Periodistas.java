package interfaz;
import vistas.*;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;
import ocl_proyecto.Periodista;

public class Periodistas extends VistaPeriodistas {
	public Lista_periodistas _unnamed_Lista_periodistas_;
	public Vector<Periodistas_item> _item = new Vector<Periodistas_item>();
	public Editor editor;
	public Periodista[] per;
	
	iEditor iEdito = new BD_Principal();
	
	public Periodistas(Editor editor) {
		super();
		this.editor = editor;
		
		per = cargar_periodistas();
		for (int i=0; i<per.length; i++) {
			Periodistas_item PI = new Periodistas_item(this, per[i]);
			this.getPeriodistasItemLayout().add(PI);
		}
	}
	
	public Periodista[] cargar_periodistas() {
		return iEdito.cargar_periodistas();
	}
}