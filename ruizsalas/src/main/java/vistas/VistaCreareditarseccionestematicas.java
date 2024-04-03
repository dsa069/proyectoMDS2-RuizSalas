package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-creareditarseccionestematicas")
@JsModule("./src/vista-creareditarseccionestematicas.ts")
public class VistaCreareditarseccionestematicas extends LitTemplate {

    @Id("listaSeccionesEstaticas")
	private Element listaSeccionesEstaticas;

	public VistaCreareditarseccionestematicas() {
        // You can initialise any data required for the connected UI components here.
    }

}