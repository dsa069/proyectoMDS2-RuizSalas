package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

@Tag("vista-noticia")
@JsModule("./src/vista-noticia.ts")
public class VistaNoticia extends LitTemplate {

    @Id("tematicas")
	private Element tematicas;
	@Id("seleccionarTematicas")
	private Element seleccionarTematicas;
	@Id("SeleccionarSecciones")
	private Element seleccionarSecciones;
	@Id("valorarNoticia")
	private HorizontalLayout valorarNoticia;
	@Id("eliminarNoticia")
	private Button eliminarNoticia;
	@Id("noticiaCortada")
	private Element noticiaCortada;
	@Id("noticiaCompleta")
	private Element noticiaCompleta;
	@Id("botonSuscribirse")
	private Element botonSuscribirse;
	@Id("comentariosEstaticos")
	private Element comentariosEstaticos;
	@Id("verValoracionEstatico")
	private HorizontalLayout verValoracionEstatico;
	public VistaNoticia() {
        // You can initialise any data required for the connected UI components here.
    }
	public Element getTematicas() {
		return tematicas;
	}
	public void setTematicas(Element tematicas) {
		this.tematicas = tematicas;
	}
	public Element getSeleccionarTematicas() {
		return seleccionarTematicas;
	}
	public void setSeleccionarTematicas(Element seleccionarTematicas) {
		this.seleccionarTematicas = seleccionarTematicas;
	}
	public Element getSeleccionarSecciones() {
		return seleccionarSecciones;
	}
	public void setSeleccionarSecciones(Element seleccionarSecciones) {
		this.seleccionarSecciones = seleccionarSecciones;
	}
	public HorizontalLayout getValorarNoticia() {
		return valorarNoticia;
	}
	public void setValorarNoticia(HorizontalLayout valorarNoticia) {
		this.valorarNoticia = valorarNoticia;
	}
	public Button getEliminarNoticia() {
		return eliminarNoticia;
	}
	public void setEliminarNoticia(Button eliminarNoticia) {
		this.eliminarNoticia = eliminarNoticia;
	}
	public Element getNoticiaCortada() {
		return noticiaCortada;
	}
	public void setNoticiaCortada(Element noticiaCortada) {
		this.noticiaCortada = noticiaCortada;
	}
	public Element getNoticiaCompleta() {
		return noticiaCompleta;
	}
	public void setNoticiaCompleta(Element noticiaCompleta) {
		this.noticiaCompleta = noticiaCompleta;
	}
	public Element getBotonSuscribirse() {
		return botonSuscribirse;
	}
	public void setBotonSuscribirse(Element botonSuscribirse) {
		this.botonSuscribirse = botonSuscribirse;
	}
	public Element getComentariosEstaticos() {
		return comentariosEstaticos;
	}
	public void setComentariosEstaticos(Element comentariosEstaticos) {
		this.comentariosEstaticos = comentariosEstaticos;
	}
	public HorizontalLayout getVerValoracionEstatico() {
		return verValoracionEstatico;
	}
	public void setVerValoracionEstatico(HorizontalLayout verValoracionEstatico) {
		this.verValoracionEstatico = verValoracionEstatico;
	}

}