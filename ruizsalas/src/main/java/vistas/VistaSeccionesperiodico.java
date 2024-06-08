package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-seccionesperiodico")
@JsModule("./src/vista-seccionesperiodico.ts")
public class VistaSeccionesperiodico extends LitTemplate {

    @Id("listaNoticiasEstatica")
	private Element listaNoticiasEstatica;
	@Id("botonVolverPaginaAnterior")
	private Button botonVolverPaginaAnterior;
	@Id("botonAvazarPaginaPeriodico")
	private Button botonAvazarPaginaPeriodico;

	public Button getBotonVolverPaginaAnterior() {
		return botonVolverPaginaAnterior;
	}

	public void setBotonVolverPaginaAnterior(Button botonVolverPaginaAnterior) {
		this.botonVolverPaginaAnterior = botonVolverPaginaAnterior;
	}

	public Button getBotonAvazarPaginaPeriodico() {
		return botonAvazarPaginaPeriodico;
	}

	public void setBotonAvazarPaginaPeriodico(Button botonAvazarPaginaPeriodico) {
		this.botonAvazarPaginaPeriodico = botonAvazarPaginaPeriodico;
	}

	public Element getListaNoticiasEstatica() {
		return listaNoticiasEstatica;
	}

	public void setListaNoticiasEstatica(Element listaNoticiasEstatica) {
		this.listaNoticiasEstatica = listaNoticiasEstatica;
	}

	public VistaSeccionesperiodico() {
        // You can initialise any data required for the connected UI components here.
    }

}