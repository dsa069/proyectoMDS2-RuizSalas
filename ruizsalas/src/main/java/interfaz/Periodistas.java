package interfaz;

import vistas.*;
import java.util.Vector;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import basededatos.BD_Principal;
import basededatos.iEditor;
import ocl_proyecto.Periodista;

public class Periodistas extends VistaPeriodistas {
	public Editor editor;
	public Periodista[] per;
	iEditor iEdito = new BD_Principal();
	
	public Periodistas(Editor editor) {
		super();
		this.editor = editor;
		
		per = iEdito.cargar_periodistas();
		for (int i=0; i<per.length; i++) {
			Periodistas_item PI = new Periodistas_item(this, per[i]);
			this.getPeriodistasItemLayout().add(PI);
		}
	}
}