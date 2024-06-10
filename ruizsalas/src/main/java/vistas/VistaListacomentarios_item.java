package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Image;

@Tag("vista-listacomentarios_item")
@JsModule("./src/vista-listacomentarios_item.ts")
public class VistaListacomentarios_item extends LitTemplate {

    @Id("ValorarComentarioPositivamente")
	private Button valorarComentarioPositivamente;
	@Id("ValorarComentarioNegativamente")
	private Button valorarComentarioNegativamente;
	public Button getValorarComentarioPositivamente() {
		return valorarComentarioPositivamente;
	}

	public void setValorarComentarioPositivamente(Button valorarComentarioPositivamente) {
		this.valorarComentarioPositivamente = valorarComentarioPositivamente;
	}

	public Button getValorarComentarioNegativamente() {
		return valorarComentarioNegativamente;
	}

	public void setValorarComentarioNegativamente(Button valorarComentarioNegativamente) {
		this.valorarComentarioNegativamente = valorarComentarioNegativamente;
	}

	public Button getBorrarComentario() {
		return borrarComentario;
	}

	public void setBorrarComentario(Button borrarComentario) {
		this.borrarComentario = borrarComentario;
	}

	@Id("BorrarComentario")
	private Button borrarComentario;
	@Id("layoutZonaComentarioEscrito")
	private Element layoutZonaComentarioEscrito;
	@Id("layoutApodoComentarista")
	private Element layoutApodoComentarista;
	@Id("imagenUsuarioComento")
	private Image imagenUsuarioComento;
	@Id("layoutVerValoracionComentario")
	private Element layoutVerValoracionComentario;
	@Id("layoutImagenUsuarioComento")
	private Element layoutImagenUsuarioComento;
	public VistaListacomentarios_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutZonaComentarioEscrito() {
		return layoutZonaComentarioEscrito;
	}

	public void setLayoutZonaComentarioEscrito(Element layoutZonaComentarioEscrito) {
		this.layoutZonaComentarioEscrito = layoutZonaComentarioEscrito;
	}

	public Element getLayoutApodoComentarista() {
		return layoutApodoComentarista;
	}

	public void setLayoutApodoComentarista(Element layoutApodoComentarista) {
		this.layoutApodoComentarista = layoutApodoComentarista;
	}

	public Image getImagenUsuarioComento() {
		return imagenUsuarioComento;
	}

	public void setImagenUsuarioComento(Image imagenUsuarioComento) {
		this.imagenUsuarioComento = imagenUsuarioComento;
	}

	public Element getLayoutVerValoracionComentario() {
		return layoutVerValoracionComentario;
	}

	public void setLayoutVerValoracionComentario(Element layoutVerValoracionComentario) {
		this.layoutVerValoracionComentario = layoutVerValoracionComentario;
	}

	public Element getLayoutImagenUsuarioComento() {
		return layoutImagenUsuarioComento;
	}

	public void setLayoutImagenUsuarioComento(Element layoutImagenUsuarioComento) {
		this.layoutImagenUsuarioComento = layoutImagenUsuarioComento;
	}

}