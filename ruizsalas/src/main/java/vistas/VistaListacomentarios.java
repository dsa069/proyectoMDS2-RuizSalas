package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listacomentarios")
@JsModule("./src/vista-listacomentarios.ts")
public class VistaListacomentarios extends LitTemplate {

    @Id("EscribirComentario")
	private Element escribirComentario;

	public VistaListacomentarios() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getEscribirComentario() {
		return escribirComentario;
	}

	public void setEscribirComentario(Element escribirComentario) {
		this.escribirComentario = escribirComentario;
	}

}