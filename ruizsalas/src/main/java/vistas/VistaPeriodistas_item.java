package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-periodistas_item")
@JsModule("./src/vista-periodistas_item.ts")
public class VistaPeriodistas_item extends LitTemplate {

    @Id("BotonEliminarPeriodista")
	private Button botonEliminarPeriodista;

	public VistaPeriodistas_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getBotonEliminarPeriodista() {
		return botonEliminarPeriodista;
	}

	public void setBotonEliminarPeriodista(Button botonEliminarPeriodista) {
		this.botonEliminarPeriodista = botonEliminarPeriodista;
	}

}