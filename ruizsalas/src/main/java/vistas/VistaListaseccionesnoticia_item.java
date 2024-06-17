package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
//import com.vaadin.flow.component.radiobutton.RadioButton;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.checkbox.Checkbox;

@Tag("vista-listaseccionesnoticia_item")
@JsModule("./src/vista-listaseccionesnoticia_item.ts")
public class VistaListaseccionesnoticia_item extends LitTemplate {

//    @Id("SeleccionSeccion")
//	private RadioButton<String> seleccionSeccion;

	@Id("SeleccionSeccion")
	private Checkbox seleccionSeccion;

	public VistaListaseccionesnoticia_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Checkbox getSeleccionSeccion() {
		return seleccionSeccion;
	}

	public void setSeleccionSeccion(Checkbox seleccionSeccion) {
		this.seleccionSeccion = seleccionSeccion;
	}

	
	
}