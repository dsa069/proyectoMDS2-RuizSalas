package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

@Tag("vista-listarnoticiasgenerico_item")
@JsModule("./src/vista-listarnoticiasgenerico_item.ts")
public class VistaListarnoticiasgenerico_item extends LitTemplate {

	@Id("EliminarNoticiaPropia")
	private Button eliminarNoticiaPropia;
	@Id("EditarNoticia")
	private Button editarNoticia;
	@Id("AgregarNoticia")
	private Button agregarNoticia;
	@Id("NoAgregarNoticia")
	private Button noAgregarNoticia;
	@Id("ZonaDeAutorYVersionDeNoticia")
	private HorizontalLayout zonaDeAutorYVersionDeNoticia;
	@Id("Titular1")
	private Button titular1;
	@Id("Titular2")
	private Button titular2;
	@Id("VerValoracion")
	private HorizontalLayout verValoracion;
	@Id("QuitarNoticiaDeSeccion")
	private Button quitarNoticiaDeSeccion;
	
	@Id("layoutGenericoListarNoticiasGenerico")
	private Element layoutGenericoListarNoticiasGenerico;
	@Id("botonImagenListarNoticias")
	private Button botonImagenListarNoticias;
	@Id("resumenNoticia")
	private Label resumenNoticia;
	@Id("LayoutImagenNoticiaCojonesPlaceholderRoggenrola")
	private Element layoutImagenNoticiaCojonesPlaceholderRoggenrola;
	public Button getBotonImagenListarNoticias() {
		return botonImagenListarNoticias;
	}

	public void setBotonImagenListarNoticias(Button botonImagenListarNoticias) {
		this.botonImagenListarNoticias = botonImagenListarNoticias;
	}

	public Element getLayoutGenericoListarNoticiasGenerico() {
		return layoutGenericoListarNoticiasGenerico;
	}

	public void setLayoutGenericoListarNoticiasGenerico(Element layoutGenericoListarNoticiasGenerico) {
		this.layoutGenericoListarNoticiasGenerico = layoutGenericoListarNoticiasGenerico;
	}

	public Button getEliminarNoticiaPropia() {
		return eliminarNoticiaPropia;
	}

	public void setEliminarNoticiaPropia(Button eliminarNoticiaPropia) {
		this.eliminarNoticiaPropia = eliminarNoticiaPropia;
	}

	public Button getEditarNoticia() {
		return editarNoticia;
	}

	public void setEditarNoticia(Button editarNoticia) {
		this.editarNoticia = editarNoticia;
	}

	public Button getAgregarNoticia() {
		return agregarNoticia;
	}

	public void setAgregarNoticia(Button agregarNoticia) {
		this.agregarNoticia = agregarNoticia;
	}

	public Button getNoAgregarNoticia() {
		return noAgregarNoticia;
	}

	public void setNoAgregarNoticia(Button noAgregarNoticia) {
		this.noAgregarNoticia = noAgregarNoticia;
	}

	public HorizontalLayout getZonaDeAutorYVersionDeNoticia() {
		return zonaDeAutorYVersionDeNoticia;
	}

	public void setZonaDeAutorYVersionDeNoticia(HorizontalLayout zonaDeAutorYVersionDeNoticia) {
		this.zonaDeAutorYVersionDeNoticia = zonaDeAutorYVersionDeNoticia;
	}

	public Button getTitular1() {
		return titular1;
	}

	public void setTitular1(Button titular1) {
		this.titular1 = titular1;
	}

	public Button getTitular2() {
		return titular2;
	}

	public void setTitular2(Button titular2) {
		this.titular2 = titular2;
	}

	public HorizontalLayout getVerValoracion() {
		return verValoracion;
	}

	public void setVerValoracion(HorizontalLayout verValoracion) {
		this.verValoracion = verValoracion;
	}

	public Button getQuitarNoticiaDeSeccion() {
		return quitarNoticiaDeSeccion;
	}

	public void setQuitarNoticiaDeSeccion(Button quitarNoticiaDeSeccion) {
		this.quitarNoticiaDeSeccion = quitarNoticiaDeSeccion;
	}

	public Label getResumenNoticia() {
		return resumenNoticia;
	}

	public void setResumenNoticia(Label resumenNoticia) {
		this.resumenNoticia = resumenNoticia;
	}

	public Element getLayoutImagenNoticiaCojonesPlaceholderRoggenrola() {
		return layoutImagenNoticiaCojonesPlaceholderRoggenrola;
	}

	public void setLayoutImagenNoticiaCojonesPlaceholderRoggenrola(
			Element layoutImagenNoticiaCojonesPlaceholderRoggenrola) {
		this.layoutImagenNoticiaCojonesPlaceholderRoggenrola = layoutImagenNoticiaCojonesPlaceholderRoggenrola;
	}

	public VistaListarnoticiasgenerico_item() {
        // You can initialise any data required for the connected UI components here.
    }

}