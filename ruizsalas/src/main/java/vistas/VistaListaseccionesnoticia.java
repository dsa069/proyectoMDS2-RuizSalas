package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listaseccionesnoticia")
@JsModule("./src/vista-listaseccionesnoticia.ts")
public class VistaListaseccionesnoticia extends LitTemplate {

    @Id("SeccionesSelecionablesItem")
	private Element seccionesSelecionablesItem;

	public VistaListaseccionesnoticia() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getSeccionesSelecionablesItem() {
		return seccionesSelecionablesItem;
	}

	public void setSeccionesSelecionablesItem(Element seccionesSelecionablesItem) {
		this.seccionesSelecionablesItem = seccionesSelecionablesItem;
	}

}