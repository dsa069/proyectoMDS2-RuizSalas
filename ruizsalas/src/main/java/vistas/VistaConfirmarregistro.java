package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-confirmarregistro")
@JsModule("./src/vista-confirmarregistro.ts")
public class VistaConfirmarregistro extends LitTemplate {

	@Id("BotonConfirmarRegistro")
	private Button botonConfirmarRegistro;

	public VistaConfirmarregistro() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getBotonConfirmarRegistro() {
		return botonConfirmarRegistro;
	}

	public void setBotonConfirmarRegistro(Button botonConfirmarRegistro) {
		this.botonConfirmarRegistro = botonConfirmarRegistro;
	}

}