package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-darsedebaja")
@JsModule("./src/vista-darsedebaja.ts")
public class VistaDarsedebaja extends LitTemplate {

    @Id("botonDarseDeBaja")
	private Button botonDarseDeBaja;

	public Button getBotonDarseDeBaja() {
		return botonDarseDeBaja;
	}

	public void setBotonDarseDeBaja(Button botonDarseDeBaja) {
		this.botonDarseDeBaja = botonDarseDeBaja;
	}

	public VistaDarsedebaja() {
        // You can initialise any data required for the connected UI components here.
    }

}