package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Image;

@Tag("vista-bannergenerico")
@JsModule("./src/vista-bannergenerico.ts")
public class VistaBannergenerico extends LitTemplate {
	
	@Id("bannergenericolayout")
	private Element bannergenericolayout;
	
	@Id("ZonaAnunciosLayout1")
	private Element zonaAnunciosLayout1;
	@Id("ZonaAnunciosLayout2")
	private Element zonaAnunciosLayout2;
	
	@Id("botonSuscribirseGenerico")
	private Button botonSuscribirseGenerico;
	@Id("botonIniciarSesionGenerico")
	private Button botonIniciarSesionGenerico;
	@Id("botonMisNoticiasGenerico")
	private Button botonMisNoticiasGenerico;
	@Id("botonVerPeriodistasGenerico")
	private Button botonVerPeriodistasGenerico;
	@Id("botonRevisarNoticiaGenerico")
	private Button botonRevisarNoticiaGenerico;

	@Id("noRegistradoLayout")
	private Element noRegistradoLayout;
	@Id("registroLayout")
	private Element registroLayout;
	@Id("iniciarSesionLayout")
	private Element iniciarSesionLayout;
	@Id("noticiaUsuarioNoRegistradoLayout")
	private Element noticiaUsuarioNoRegistradoLayout;
	
	@Id("periodistaLayout")
	private Element periodistaLayout;
	@Id("crearEditarNoticiaLayout")
	private Element crearEditarNoticiaLayout;
	@Id("historialNoticiasLayout")
	private Element historialNoticiasLayout;
	
	@Id("editorLayout")
	private Element editorLayout;
	@Id("revisarNoticiasLayout")
	private Element revisarNoticiasLayout;
	@Id("ListarPeriodistaLayout")
	private Element listarPeriodistaLayout;
	@Id("altaPeriodistaLayout")
	private Element altaPeriodistaLayout;
	
	@Id("LayoutGenericoVistaGenerica")
	private Element layoutGenericoVistaGenerica;

	@Id("datosRegistroEstatico")
	private Element datosRegistroEstatico;
	@Id("botonConfirmarRegistroEstaticoLayout")
	private Element botonConfirmarRegistroEstaticoLayout;
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
	@Id("BotonIniciarSesion")
	private Button botonIniciarSesion;
	@Id("BotonCancelarRegistro")
	private Button botonCancelarRegistro;
	@Id("BotonConfirmarSesion")
	private Button botonConfirmarSesion;
	@Id("BotonCancelarSesion")
	private Button botonCancelarSesion;

	@Id("botonpaginainicio")
	private Button botonpaginainicio;

	@Id("BotonCrearNoticia")
	private Button botonCrearNoticia;

	@Id("BotonEliminarNoticiaPropia")
	private Button botonEliminarNoticiaPropia;

	@Id("BotonCancelarAnadirPeriodista")
	private Button botonCancelarAnadirPeriodista;

	@Id("BotonConfirmarAnadirPeriodista")
	private Button botonConfirmarAnadirPeriodista;

	@Id("BotonAnadirPeriodista")
	private Button botonAnadirPeriodista;

	@Id("BotonConfirmarModificacionNoticia")
	private Button botonConfirmarModificacionNoticia;

	@Id("datosPeriodistaAnadirEstatico")
	private Element datosPeriodistaAnadirEstatico;

	@Id("LayoutFotoPerfilBanner")
	private Element layoutFotoPerfilBanner;

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

	public Element getListarPeriodistaLayout() {
		return listarPeriodistaLayout;
	}
	public void setListarPeriodistaLayout(Element listarPeriodistaLayout) {
		this.listarPeriodistaLayout = listarPeriodistaLayout;
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
	public Element getBotonConfirmarRegistroEstaticoLayout() {
		return botonConfirmarRegistroEstaticoLayout;
	}
	public void setBotonConfirmarRegistroEstaticoLayout(Element botonConfirmarRegistroEstaticoLayout) {
		this.botonConfirmarRegistroEstaticoLayout = botonConfirmarRegistroEstaticoLayout;
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
	public Element getDatosPeriodistaAnadirEstatico() {
		return datosPeriodistaAnadirEstatico;
	}
	public void setDatosPeriodistaAnadirEstatico(Element datosPeriodistaAnadirEstatico) {
		this.datosPeriodistaAnadirEstatico = datosPeriodistaAnadirEstatico;
	}
	public Button getBotonIniciarSesion() {
		return botonIniciarSesion;
	}
	public void setBotonIniciarSesion(Button botonIniciarSesion) {
		this.botonIniciarSesion = botonIniciarSesion;
	}
	public Button getBotonCancelarRegistro() {
		return botonCancelarRegistro;
	}
	public void setBotonCancelarRegistro(Button botonCancelarRegistro) {
		this.botonCancelarRegistro = botonCancelarRegistro;
	}
	public Button getBotonCancelarSesion() {
		return botonCancelarSesion;
	}
	public void setBotonCancelarSesion(Button botonCancelarSesion) {
		this.botonCancelarSesion = botonCancelarSesion;
	}
	public Button getBotonConfirmarSesion() {
		return botonConfirmarSesion;
	}
	public void setBotonConfirmarSesion(Button botonConfirmarSesion) {
		this.botonConfirmarSesion = botonConfirmarSesion;
	}
	public Element getBannergenericolayout() {
		return bannergenericolayout;
	}
	public void setBannergenericolayout(Element bannergenericolayout) {
		this.bannergenericolayout = bannergenericolayout;
	}
	public Element getLayoutGenericoVistaGenerica() {
		return layoutGenericoVistaGenerica;
	}
	public void setLayoutGenericoVistaGenerica(Element layoutGenericoVistaGenerica) {
		this.layoutGenericoVistaGenerica = layoutGenericoVistaGenerica;
	}
	public Element getNoRegistradoLayout() {
		return noRegistradoLayout;
	}
	public void setNoRegistradoLayout(Element noRegistradoLayout) {
		this.noRegistradoLayout = noRegistradoLayout;
	}
	public Element getPeriodistaLayout() {
		return periodistaLayout;
	}
	public void setPeriodistaLayout(Element periodistaLayout) {
		this.periodistaLayout = periodistaLayout;
	}
	public Element getEditorLayout() {
		return editorLayout;
	}
	public void setEditorLayout(Element editorLayout) {
		this.editorLayout = editorLayout;
	}
	public Button getBotonpaginainicio() {
		return botonpaginainicio;
	}
	public void setBotonpaginainicio(Button botonpaginainicio) {
		this.botonpaginainicio = botonpaginainicio;
	}
	public Button getBotonCrearNoticia() {
		return botonCrearNoticia;
	}
	public void setBotonCrearNoticia(Button botonCrearNoticia) {
		this.botonCrearNoticia = botonCrearNoticia;
	}
	public Button getBotonConfirmarModificacionNoticia() {
		return botonConfirmarModificacionNoticia;
	}
	public void setBotonConfirmarModificacionNoticia(Button botonConfirmarModificacionNoticia) {
		this.botonConfirmarModificacionNoticia = botonConfirmarModificacionNoticia;
	}
	public Button getBotonEliminarNoticiaPropia() {
		return botonEliminarNoticiaPropia;
	}
	public void setBotonEliminarNoticiaPropia(Button botonEliminarNoticiaPropia) {
		this.botonEliminarNoticiaPropia = botonEliminarNoticiaPropia;
	}
	public Button getBotonCancelarAnadirPeriodista() {
		return botonCancelarAnadirPeriodista;
	}
	public void setBotonCancelarAnadirPeriodista(Button botonCancelarAnadirPeriodista) {
		this.botonCancelarAnadirPeriodista = botonCancelarAnadirPeriodista;
	}
	public Button getBotonConfirmarAnadirPeriodista() {
		return botonConfirmarAnadirPeriodista;
	}
	public void setBotonConfirmarAnadirPeriodista(Button botonConfirmarAnadirPeriodista) {
		this.botonConfirmarAnadirPeriodista = botonConfirmarAnadirPeriodista;
	}
	public Button getBotonAnadirPeriodista() {
		return botonAnadirPeriodista;
	}
	public void setBotonAnadirPeriodista(Button botonAnadirPeriodista) {
		this.botonAnadirPeriodista = botonAnadirPeriodista;
	}
	public Element getLayoutFotoPerfilBanner() {
		return layoutFotoPerfilBanner;
	}
	public void setLayoutFotoPerfilBanner(Element layoutFotoPerfilBanner) {
		this.layoutFotoPerfilBanner = layoutFotoPerfilBanner;
	}

}