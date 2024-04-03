package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

@Tag("vista-bannergenerico")
@JsModule("./src/vista-bannergenerico.ts")
public class VistaBannergenerico extends LitTemplate {
	@Id("ZonaAnunciosLayout1")
	private Element zonaAnunciosLayout1;
	@Id("ZonaAnunciosLayout2")
	
	private Element zonaAnunciosLayout2;
	@Id("botonRevisarNoticiaGenerico")
	private Button botonRevisarNoticiaGenerico;
	@Id("botonVerPeriodistasGenerico")
	private Button botonVerPeriodistasGenerico;
	@Id("botonMisNoticiasGenerico")
	private Button botonMisNoticiasGenerico;
	@Id("botonIniciarSesionGenerico")
	private Button botonIniciarSesionGenerico;
	@Id("botonSuscribirseGenerico")
	private Button botonSuscribirseGenerico;
	
	@Id("registroLayout")
	private Element registroLayout;
	@Id("iniciarSesionLayout")
	private Element iniciarSesionLayout;
	@Id("noticiaUsuarioNoRegistradoLayout")
	private Element noticiaUsuarioNoRegistradoLayout;
	
	@Id("crearEditarNoticiaLayout")
	private Element crearEditarNoticiaLayout;
	@Id("historialNoticiasLayout")
	private Element historialNoticiasLayout;
	
	@Id("revisarNoticiasLayout")
	private Element revisarNoticiasLayout;
	@Id("periodistaLayout1")
	private Element periodistaLayout1;
	@Id("altaPeriodistaLayout")
	private Element altaPeriodistaLayout;
	@Id("datosRegistroEstatico")
	private Element datosRegistroEstatico;
	@Id("botonConfirmarRegistroEstatico")
	private HorizontalLayout botonConfirmarRegistroEstatico;
	@Id("datosIniciarSesionEstaticos")
	private Element datosIniciarSesionEstaticos;
	@Id("crearEditarNoticiaEstatico")
	private Element crearEditarNoticiaEstatico;
	@Id("historialNoticiasEstatico")
	private Element historialNoticiasEstatico;
	@Id("revisarNoticiasEstatico")
	private Element revisarNoticiasEstatico;
	@Id("listaPeriodistaEstatico")
	private Element listaPeriodistaEstatico;
	@Id("datosPeriodistaAñadirEstatico")
	private Element datosPeriodistaAñadirEstatico;

	public VistaBannergenerico() {
        // You can initialise any data required for the connected UI components here.
    }
	public Element getZonaAnunciosLayout1() {
		return zonaAnunciosLayout1;
	}
	public void setZonaAnunciosLayout1(Element zonaAnunciosLayout1) {
		this.zonaAnunciosLayout1 = zonaAnunciosLayout1;
	}
	public Element getZonaAnunciosLayout2() {
		return zonaAnunciosLayout2;
	}
	public void setZonaAnunciosLayout2(Element zonaAnunciosLayout2) {
		this.zonaAnunciosLayout2 = zonaAnunciosLayout2;
	}
	public Button getBotonRevisarNoticiaGenerico() {
		return botonRevisarNoticiaGenerico;
	}
	public void setBotonRevisarNoticiaGenerico(Button botonRevisarNoticiaGenerico) {
		this.botonRevisarNoticiaGenerico = botonRevisarNoticiaGenerico;
	}
	public Button getBotonVerPeriodistasGenerico() {
		return botonVerPeriodistasGenerico;
	}
	public void setBotonVerPeriodistasGenerico(Button botonVerPeriodistasGenerico) {
		this.botonVerPeriodistasGenerico = botonVerPeriodistasGenerico;
	}
	public Button getBotonMisNoticiasGenerico() {
		return botonMisNoticiasGenerico;
	}
	public void setBotonMisNoticiasGenerico(Button botonMisNoticiasGenerico) {
		this.botonMisNoticiasGenerico = botonMisNoticiasGenerico;
	}
	public Button getBotonIniciarSesionGenerico() {
		return botonIniciarSesionGenerico;
	}
	public void setBotonIniciarSesionGenerico(Button botonIniciarSesionGenerico) {
		this.botonIniciarSesionGenerico = botonIniciarSesionGenerico;
	}
	public Button getBotonSuscribirseGenerico() {
		return botonSuscribirseGenerico;
	}
	public void setBotonSuscribirseGenerico(Button botonSuscribirseGenerico) {
		this.botonSuscribirseGenerico = botonSuscribirseGenerico;
	}
	public Element getRegistroLayout() {
		return registroLayout;
	}
	public void setRegistroLayout(Element registroLayout) {
		this.registroLayout = registroLayout;
	}
	public Element getIniciarSesionLayout() {
		return iniciarSesionLayout;
	}
	public void setIniciarSesionLayout(Element iniciarSesionLayout) {
		this.iniciarSesionLayout = iniciarSesionLayout;
	}
	public Element getNoticiaUsuarioNoRegistradoLayout() {
		return noticiaUsuarioNoRegistradoLayout;
	}
	public void setNoticiaUsuarioNoRegistradoLayout(Element noticiaUsuarioNoRegistradoLayout) {
		this.noticiaUsuarioNoRegistradoLayout = noticiaUsuarioNoRegistradoLayout;
	}
	public Element getCrearEditarNoticiaLayout() {
		return crearEditarNoticiaLayout;
	}
	public void setCrearEditarNoticiaLayout(Element crearEditarNoticiaLayout) {
		this.crearEditarNoticiaLayout = crearEditarNoticiaLayout;
	}
	public Element getHistorialNoticiasLayout() {
		return historialNoticiasLayout;
	}
	public void setHistorialNoticiasLayout(Element historialNoticiasLayout) {
		this.historialNoticiasLayout = historialNoticiasLayout;
	}
	public Element getRevisarNoticiasLayout() {
		return revisarNoticiasLayout;
	}
	public void setRevisarNoticiasLayout(Element revisarNoticiasLayout) {
		this.revisarNoticiasLayout = revisarNoticiasLayout;
	}
	public Element getPeriodistaLayout1() {
		return periodistaLayout1;
	}
	public void setPeriodistaLayout1(Element periodistaLayout1) {
		this.periodistaLayout1 = periodistaLayout1;
	}
	public Element getAltaPeriodistaLayout() {
		return altaPeriodistaLayout;
	}
	public void setAltaPeriodistaLayout(Element altaPeriodistaLayout) {
		this.altaPeriodistaLayout = altaPeriodistaLayout;
	}
	public Element getDatosRegistroEstatico() {
		return datosRegistroEstatico;
	}
	public void setDatosRegistroEstatico(Element datosRegistroEstatico) {
		this.datosRegistroEstatico = datosRegistroEstatico;
	}
	public HorizontalLayout getBotonConfirmarRegistroEstatico() {
		return botonConfirmarRegistroEstatico;
	}
	public void setBotonConfirmarRegistroEstatico(HorizontalLayout botonConfirmarRegistroEstatico) {
		this.botonConfirmarRegistroEstatico = botonConfirmarRegistroEstatico;
	}
	public Element getDatosIniciarSesionEstaticos() {
		return datosIniciarSesionEstaticos;
	}
	public void setDatosIniciarSesionEstaticos(Element datosIniciarSesionEstaticos) {
		this.datosIniciarSesionEstaticos = datosIniciarSesionEstaticos;
	}
	public Element getCrearEditarNoticiaEstatico() {
		return crearEditarNoticiaEstatico;
	}
	public void setCrearEditarNoticiaEstatico(Element crearEditarNoticiaEstatico) {
		this.crearEditarNoticiaEstatico = crearEditarNoticiaEstatico;
	}
	public Element getHistorialNoticiasEstatico() {
		return historialNoticiasEstatico;
	}
	public void setHistorialNoticiasEstatico(Element historialNoticiasEstatico) {
		this.historialNoticiasEstatico = historialNoticiasEstatico;
	}
	public Element getRevisarNoticiasEstatico() {
		return revisarNoticiasEstatico;
	}
	public void setRevisarNoticiasEstatico(Element revisarNoticiasEstatico) {
		this.revisarNoticiasEstatico = revisarNoticiasEstatico;
	}
	public Element getListaPeriodistaEstatico() {
		return listaPeriodistaEstatico;
	}
	public void setListaPeriodistaEstatico(Element listaPeriodistaEstatico) {
		this.listaPeriodistaEstatico = listaPeriodistaEstatico;
	}
	public Element getDatosPeriodistaAñadirEstatico() {
		return datosPeriodistaAñadirEstatico;
	}
	public void setDatosPeriodistaAñadirEstatico(Element datosPeriodistaAñadirEstatico) {
		this.datosPeriodistaAñadirEstatico = datosPeriodistaAñadirEstatico;
	}

}