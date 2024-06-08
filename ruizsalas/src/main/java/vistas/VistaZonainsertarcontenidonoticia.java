package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-zonainsertarcontenidonoticia")
@JsModule("./src/vista-zonainsertarcontenidonoticia.ts")
public class VistaZonainsertarcontenidonoticia extends LitTemplate {

    @Id("seleccionarTematicasEstatico")
	private Element seleccionarTematicasEstatico;

	public VistaZonainsertarcontenidonoticia() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getSeleccionarTematicasEstatico() {
		return seleccionarTematicasEstatico;
	}

	public void setSeleccionarTematicasEstatico(Element seleccionarTematicasEstatico) {
		this.seleccionarTematicasEstatico = seleccionarTematicasEstatico;
	}

}