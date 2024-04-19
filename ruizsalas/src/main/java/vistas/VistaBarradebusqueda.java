package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

@Tag("vista-barradebusqueda")
@JsModule("./src/vista-barradebusqueda.ts")
public class VistaBarradebusqueda extends LitTemplate {

    @Id("barraBuscarNoticia")
	private TextField barraBuscarNoticia;
	@Id("layoutGenericoDeBuscarNoticia")
	private Element layoutGenericoDeBuscarNoticia;


	public Element getLayoutGenericoDeBuscarNoticia() {
		return layoutGenericoDeBuscarNoticia;
	}


	public void setLayoutGenericoDeBuscarNoticia(Element layoutGenericoDeBuscarNoticia) {
		this.layoutGenericoDeBuscarNoticia = layoutGenericoDeBuscarNoticia;
	}


	public TextField getBarraBuscarNoticia() {
		return barraBuscarNoticia;
	}


	public void setBarraBuscarNoticia(TextField barraBuscarNoticia) {
		this.barraBuscarNoticia = barraBuscarNoticia;
	}


	public VistaBarradebusqueda() {
        // You can initialise any data required for the connected UI components here.
    }

}