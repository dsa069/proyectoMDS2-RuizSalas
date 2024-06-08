package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listartematicas_item")
@JsModule("./src/vista-listartematicas_item.ts")
public class VistaListartematicas_item extends LitTemplate {

    @Id("layoutNombredelaTematica")
	private Element layoutNombredelaTematica;

	public VistaListartematicas_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutNombredelaTematica() {
		return layoutNombredelaTematica;
	}

	public void setLayoutNombredelaTematica(Element layoutNombredelaTematica) {
		this.layoutNombredelaTematica = layoutNombredelaTematica;
	}

}