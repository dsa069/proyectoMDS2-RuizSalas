package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listartematicas")
@JsModule("./src/vista-listartematicas.ts")
public class VistaListartematicas extends LitTemplate {

    @Id("Tematicasitem")
	private Element tematicasitem;

	public VistaListartematicas() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getTematicasitem() {
		return tematicasitem;
	}

	public void setTematicasitem(Element tematicasitem) {
		this.tematicasitem = tematicasitem;
	}

}