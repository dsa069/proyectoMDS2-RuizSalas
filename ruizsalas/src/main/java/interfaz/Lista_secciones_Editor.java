package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;
import ocl_proyecto.Seccion;

public class Lista_secciones_Editor extends Listar_Secciones {
	//public Crear_Editar_Secciones_Tematicas _unnamed_Crear_Editar_Secciones_Tematicas_;
	public Vector<Lista_secciones_Editor_item> _item = new Vector<Lista_secciones_Editor_item>();

    public Editor _editor;
    public Crear_Editar_Secciones_Tematicas CBT;
    
    ocl_proyecto.Seccion sec;
    
    iEditor iEdito = new BD_Principal();
    
	public Lista_secciones_Editor(Editor _editor, ocl_proyecto.Seccion seccion, Crear_Editar_Secciones_Tematicas CBT ) {
		super(_editor, seccion, null);
		this._editor = _editor;
		this.CBT=CBT;
	}
	
	@Override
	public void Secciones_item_Estatico(){
			Lista_secciones_Editor_item _item = new Lista_secciones_Editor_item(this,this._editor, seccion);
			this.getListarSeccionesContenedorItems().as(VerticalLayout.class).add(_item);
	}
	
	
	
//	public Seccion[] cargar_secciones_seleccion() {
//		return iEdito.cargar_secciones_seleccion();
//	}
}