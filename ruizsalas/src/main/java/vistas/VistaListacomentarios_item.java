package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

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

	public VistaListacomentarios_item() {
        // You can initialise any data required for the connected UI components here.
    }

}