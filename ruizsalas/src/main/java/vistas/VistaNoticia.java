package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;

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
	@Id("BotonSuscribirseNoticia")
	private Button botonSuscribirseNoticia;
	@Id("BotonLikeNoticia")
	private Button botonLikeNoticia;
	@Id("BotonNotLikeNoticia")
	private Button botonNotLikeNoticia;
	@Id("imagenPrincipalNoticia")
	private Image imagenPrincipalNoticia;
	@Id("layoutTitularVistaNoticia")
	private Element layoutTitularVistaNoticia;
	@Id("FechaNoticia")
	private Element fechaNoticia;
	@Id("AutorNoticia")
	private Element autorNoticia;
	@Id("LugarNoticia")
	private Element lugarNoticia;
	@Id("layoutImagenPrincipalNoticia")
	private Element layoutImagenPrincipalNoticia;
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

	public Button getBotonSuscribirseNoticia() {
		return botonSuscribirseNoticia;
	}

	public void setBotonSuscribirseNoticia(Button botonSuscribirseNoticia) {
		this.botonSuscribirseNoticia = botonSuscribirseNoticia;
	}

	public Button getBotonLikeNoticia() {
		return botonLikeNoticia;
	}

	public void setBotonLikeNoticia(Button botonLikeNoticia) {
		this.botonLikeNoticia = botonLikeNoticia;
	}

	public Button getBotonNotLikeNoticia() {
		return botonNotLikeNoticia;
	}

	public void setBotonNotLikeNoticia(Button botonNotLikeNoticia) {
		this.botonNotLikeNoticia = botonNotLikeNoticia;
	}

	public Image getImagenPrincipalNoticia() {
		return imagenPrincipalNoticia;
	}

	public void setImagenPrincipalNoticia(Image imagenPrincipalNoticia) {
		this.imagenPrincipalNoticia = imagenPrincipalNoticia;
	}

	public Element getLayoutTitularVistaNoticia() {
		return layoutTitularVistaNoticia;
	}

	public void setLayoutTitularVistaNoticia(Element layoutTitularVistaNoticia) {
		this.layoutTitularVistaNoticia = layoutTitularVistaNoticia;
	}

	public Element getFechaNoticia() {
		return fechaNoticia;
	}

	public void setFechaNoticia(Element fechaNoticia) {
		this.fechaNoticia = fechaNoticia;
	}

	public Element getAutorNoticia() {
		return autorNoticia;
	}

	public void setAutorNoticia(Element autorNoticia) {
		this.autorNoticia = autorNoticia;
	}

	public Element getLugarNoticia() {
		return lugarNoticia;
	}

	public void setLugarNoticia(Element lugarNoticia) {
		this.lugarNoticia = lugarNoticia;
	}

	public Element getLayoutImagenPrincipalNoticia() {
		return layoutImagenPrincipalNoticia;
	}

	public void setLayoutImagenPrincipalNoticia(Element layoutImagenPrincipalNoticia) {
		this.layoutImagenPrincipalNoticia = layoutImagenPrincipalNoticia;
	}

}
