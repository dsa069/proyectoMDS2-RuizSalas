package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listarsecciones")
@JsModule("./src/vista-listarsecciones.ts")
public class VistaListarsecciones extends LitTemplate {

    @Id("ListarSeccionesContenedorItems")
	private Element listarSeccionesContenedorItems;

	public VistaListarsecciones() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getListarSeccionesContenedorItems() {
		return listarSeccionesContenedorItems;
	}

	public void setListarSeccionesContenedorItems(Element listarSeccionesContenedorItems) {
		this.listarSeccionesContenedorItems = listarSeccionesContenedorItems;
	}

}