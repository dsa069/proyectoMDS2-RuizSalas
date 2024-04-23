package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextArea;

@Tag("vista-listacomentarios")
@JsModule("./src/vista-listacomentarios.ts")
public class VistaListacomentarios extends LitTemplate {

    @Id("EscribirComentario")
	private Element escribirComentario;
	@Id("CampoEscribirComentario")
	private TextArea campoEscribirComentario;
	@Id("ContenedorComentariosItem")
	private Element contenedorComentariosItem;

	public VistaListacomentarios() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getEscribirComentario() {
		return escribirComentario;
	}

	public void setEscribirComentario(Element escribirComentario) {
		this.escribirComentario = escribirComentario;
	}

	public TextArea getCampoEscribirComentario() {
		return campoEscribirComentario;
	}

	public void setCampoEscribirComentario(TextArea campoEscribirComentario) {
		this.campoEscribirComentario = campoEscribirComentario;
	}

	public Element getContenedorComentariosItem() {
		return contenedorComentariosItem;
	}

	public void setContenedorComentariosItem(Element contenedorComentariosItem) {
		this.contenedorComentariosItem = contenedorComentariosItem;
	}

}