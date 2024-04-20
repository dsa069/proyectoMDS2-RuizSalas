package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-paginadeinicio")
@JsModule("./src/vista-paginadeinicio.ts")
public class VistaPaginadeinicio extends LitTemplate {

    @Id("listaPortadaEstatica")
	private Element listaPortadaEstatica;
	@Id("botonContinuarPaginaInicio")
	private Button botonContinuarPaginaInicio;

	public Button getBotonContinuarPaginaInicio() {
		return botonContinuarPaginaInicio;
	}

	public void setBotonContinuarPaginaInicio(Button botonContinuarPaginaInicio) {
		this.botonContinuarPaginaInicio = botonContinuarPaginaInicio;
	}

	public Element getListaPortadaEstatica() {
		return listaPortadaEstatica;
	}

	public void setListaPortadaEstatica(Element listaPortadaEstatica) {
		this.listaPortadaEstatica = listaPortadaEstatica;
	}

	public VistaPaginadeinicio() {
        // You can initialise any data required for the connected UI components here.
    }

}