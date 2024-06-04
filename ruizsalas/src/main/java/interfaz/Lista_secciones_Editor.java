package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;
import ocl_proyecto.Seccion;

public class Lista_secciones_Editor extends Listar_Secciones {
	//public Crear_Editar_Secciones_Tematicas _unnamed_Crear_Editar_Secciones_Tematicas_;
	public Vector<Lista_secciones_Editor_item> _item = new Vector<Lista_secciones_Editor_item>();

    public Editor _editor;
    public Seccion[] sec;
    
    ocl_proyecto.Seccion seccion;
    
    iEditor iEdito = new BD_Principal();
    
	public Lista_secciones_Editor(Editor _editor) {
		super(_editor);
		this._editor = _editor;
	}
	
	@Override
	public void Secciones_item_Estatico(){
		Lista_secciones_Editor_item _item = new Lista_secciones_Editor_item(this, this.seccion);
		this.getListarSeccionesContenedorItems().as(VerticalLayout.class).add(_item);
		
		sec = cargar_secciones_seleccion();
		for (int i=0; i<sec.length; i++) {
			Lista_secciones_Editor_item LSEI = new Lista_secciones_Editor_item(this, sec[i]);
			this.getListarSeccionesContenedorItems().as(VerticalLayout.class).add(LSEI);
		}
	}
	
	public Seccion[] cargar_secciones_seleccion() {
		return iEdito.cargar_secciones_seleccion();
	}
}