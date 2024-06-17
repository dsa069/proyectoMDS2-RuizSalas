package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-creareditarseccionestematicas")
@JsModule("./src/vista-creareditarseccionestematicas.ts")
public class VistaCreareditarseccionestematicas extends LitTemplate {

    @Id("listaSeccionesEstaticas")
	private Element listaSeccionesEstaticas;
	@Id("botonCrearNuevaTematica")
	private Button botonCrearNuevaTematica;
	@Id("CrearTematicaCabecera")
	private HorizontalLayout crearTematicaCabecera;
	@Id("CrearTematicasPatras")
	private Button crearTematicasPatras;
	@Id("CrearTematicasPalante")
	private Button crearTematicasPalante;
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

	public HorizontalLayout getCrearTematicaCabecera() {
		return crearTematicaCabecera;
	}

	public void setCrearTematicaCabecera(HorizontalLayout crearTematicaCabecera) {
		this.crearTematicaCabecera = crearTematicaCabecera;
	}

	public Button getCrearTematicasPatras() {
		return crearTematicasPatras;
	}

	public void setCrearTematicasPatras(Button crearTematicasPatras) {
		this.crearTematicasPatras = crearTematicasPatras;
	}

	public Button getCrearTematicasPalante() {
		return crearTematicasPalante;
	}

	public void setCrearTematicasPalante(Button crearTematicasPalante) {
		this.crearTematicasPalante = crearTematicasPalante;
	}
	public VistaCreareditarseccionestematicas() {
        // You can initialise any data required for the connected UI components here.
    }

}