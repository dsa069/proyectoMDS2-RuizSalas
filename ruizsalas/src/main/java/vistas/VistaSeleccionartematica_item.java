package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.template.Id;

@Tag("vista-seleccionartematica_item")
@JsModule("./src/vista-seleccionartematica_item.ts")
public class VistaSeleccionartematica_item extends LitTemplate {

    @Id("tematicaAAñadir")
	private Checkbox tematicaAAñadir;

	public VistaSeleccionartematica_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Checkbox getTematicaAAñadir() {
		return tematicaAAñadir;
	}

	public void setTematicaAAñadir(Checkbox tematicaAAñadir) {
		this.tematicaAAñadir = tematicaAAñadir;
	}

}