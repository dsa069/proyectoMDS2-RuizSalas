package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-seleccionartematica")
@JsModule("./src/vista-seleccionartematica.ts")
public class VistaSeleccionartematica extends LitTemplate {

    @Id("TematicaSelecionableItem")
	private Element tematicaSelecionableItem;

	public VistaSeleccionartematica() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getTematicaSelecionableItem() {
		return tematicaSelecionableItem;
	}

	public void setTematicaSelecionableItem(Element tematicaSelecionableItem) {
		this.tematicaSelecionableItem = tematicaSelecionableItem;
	}

}