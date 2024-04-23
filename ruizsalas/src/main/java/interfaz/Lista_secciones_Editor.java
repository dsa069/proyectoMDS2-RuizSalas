package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Lista_secciones_Editor extends Listar_Secciones {
	//public Crear_Editar_Secciones_Tematicas _unnamed_Crear_Editar_Secciones_Tematicas_;
	public Vector<Lista_secciones_Editor_item> _item = new Vector<Lista_secciones_Editor_item>();

    public Editor _editor;
	public Lista_secciones_Editor(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		
		Lista_secciones_Editor_item _item = new Lista_secciones_Editor_item(this);
		this.getListarSeccionesContenedorItems().as(VerticalLayout.class).add(_item);
	}

}