package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-selecciondeseccionesgenerico_item")
@JsModule("./src/vista-selecciondeseccionesgenerico_item.ts")
public class VistaSelecciondeseccionesgenerico_item extends LitTemplate {

    @Id("BotonSeccionX")
	private Button botonSeccionX;

	public VistaSelecciondeseccionesgenerico_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getBotonSeccionX() {
		return botonSeccionX;
	}

	public void setBotonSeccionX(Button botonSeccionX) {
		this.botonSeccionX = botonSeccionX;
	}

}