package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

@Tag("vista-seleccionartematica_item")
@JsModule("./src/vista-seleccionartematica_item.ts")
public class VistaSeleccionartematica_item extends LitTemplate {

    @Id("seleccionTamaticaNoticia")
	private Label seleccionTamaticaNoticia;
	@Id("botonCheckboxVacio")
	private Button botonCheckboxVacio;
	@Id("botonCheckboxRelleno")
	private Button botonCheckboxRelleno;

	public VistaSeleccionartematica_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Label getSeleccionTamaticaNoticia() {
		return seleccionTamaticaNoticia;
	}

	public void setSeleccionTamaticaNoticia(Label seleccionTamaticaNoticia) {
		this.seleccionTamaticaNoticia = seleccionTamaticaNoticia;
	}

	public Button getBotonCheckboxVacio() {
		return botonCheckboxVacio;
	}

	public void setBotonCheckboxVacio(Button botonCheckboxVacio) {
		this.botonCheckboxVacio = botonCheckboxVacio;
	}

	public Button getBotonCheckboxRelleno() {
		return botonCheckboxRelleno;
	}

	public void setBotonCheckboxRelleno(Button botonCheckboxRelleno) {
		this.botonCheckboxRelleno = botonCheckboxRelleno;
	}
}