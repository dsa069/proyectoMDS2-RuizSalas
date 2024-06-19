package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

@Tag("vista-listarnoticiasgenerico")
@JsModule("./src/vista-listarnoticiasgenerico.ts")
public class VistaListarnoticiasgenerico extends LitTemplate {

    @Id("Portada")
	private HorizontalLayout portada;
	public HorizontalLayout getPortada() {
		return portada;
	}

	public void setPortada(HorizontalLayout portada) {
		this.portada = portada;
	}

	public Element getColumnas() {
		return columnas;
	}

	public void setColumnas(Element columnas) {
		this.columnas = columnas;
	}

	public Element getListaSimpleNoticias() {
		return listaSimpleNoticias;
	}

	public void setListaSimpleNoticias(Element listaSimpleNoticias) {
		this.listaSimpleNoticias = listaSimpleNoticias;
	}

	@Id("ListaSimpleNoticias")
	private Element listaSimpleNoticias;
	@Id("Columnas")
	private Element columnas;

	public VistaListarnoticiasgenerico() {
        // You can initialise any data required for the connected UI components here.
    }

}