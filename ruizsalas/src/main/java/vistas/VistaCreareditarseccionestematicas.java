package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-creareditarseccionestematicas")
@JsModule("./src/vista-creareditarseccionestematicas.ts")
public class VistaCreareditarseccionestematicas extends LitTemplate {

    @Id("listaSeccionesEstaticas")
	private Element listaSeccionesEstaticas;
	@Id("botonCrearNuevaTematica")
	private Button botonCrearNuevaTematica;

	public Button getBotonCrearNuevaTematica() {
		return botonCrearNuevaTematica;
	}

	public void setBotonCrearNuevaTematica(Button botonCrearNuevaTematica) {
		this.botonCrearNuevaTematica = botonCrearNuevaTematica;
	}

	public Element getListaSeccionesEstaticas() {
		return listaSeccionesEstaticas;
	}

	public void setListaSeccionesEstaticas(Element listaSeccionesEstaticas) {
		this.listaSeccionesEstaticas = listaSeccionesEstaticas;
	}

	public VistaCreareditarseccionestematicas() {
        // You can initialise any data required for the connected UI components here.
    }

}