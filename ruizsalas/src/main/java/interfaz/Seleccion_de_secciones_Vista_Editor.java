package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.*;

public class Seleccion_de_secciones_Vista_Editor extends Seleccion_de_secciones {
	//private JButton _editar_secciones;
	//public Listar_noticias _unnamed_Listar_noticias_;
	public Vector<Seleccion_de_secciones_Vista_Editor_item> _item = new Vector<Seleccion_de_secciones_Vista_Editor_item>();
	public Editor _editor;
	public Seleccion_de_secciones_generico SESG;
	
	public Seleccion_de_secciones_Vista_Editor(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		this.getBotonEditarSecciones().setVisible(true);
		
		this.getBotonEditarSecciones().addClickListener(event->ConductorEditarSecciones());
	}
	
	public void ConductorEditarSecciones() {
		Notification.show("le he dado al boton");
		this.getLayoutSeleccionSeccionesGenerico().as(VerticalLayout.class).removeAll();
		SESG = new Seleccion_de_secciones_generico(this._editor);
		this.getLayoutSeleccionSeccionesGenerico().as(VerticalLayout.class).add(this.SESG);
	}
}