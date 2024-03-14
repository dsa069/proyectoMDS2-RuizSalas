package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listarsecciones_item")
@JsModule("./src/vista-listarsecciones_item.ts")
public class VistaListarsecciones_item extends LitTemplate {

    public Button getBorrarSeccion() {
		return borrarSeccion;
	}

	public void setBorrarSeccion(Button borrarSeccion) {
		this.borrarSeccion = borrarSeccion;
	}

	@Id("BorrarSeccion")
	private Button borrarSeccion;

	public VistaListarsecciones_item() {
        // You can initialise any data required for the connected UI components here.
    }

}