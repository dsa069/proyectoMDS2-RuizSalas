package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-vervaloracion")
@JsModule("./src/vista-vervaloracion.ts")
public class VistaVervaloracion extends LitTemplate {

    @Id("layoutVisualizarValoracion")
	private Element layoutVisualizarValoracion;

	public VistaVervaloracion() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutVisualizarValoracion() {
		return layoutVisualizarValoracion;
	}

	public void setLayoutVisualizarValoracion(Element layoutVisualizarValoracion) {
		this.layoutVisualizarValoracion = layoutVisualizarValoracion;
	}

}