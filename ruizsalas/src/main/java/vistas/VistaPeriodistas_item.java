package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Image;

@Tag("vista-periodistas_item")
@JsModule("./src/vista-periodistas_item.ts")
public class VistaPeriodistas_item extends LitTemplate {

    @Id("BotonEliminarPeriodista")
	private Button botonEliminarPeriodista;
	@Id("ApodoPeriodistas")
	private Element apodoPeriodistas;
	@Id("FotoPeriodistas")
	private Image fotoPeriodistas;
	public VistaPeriodistas_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getBotonEliminarPeriodista() {
		return botonEliminarPeriodista;
	}

	public void setBotonEliminarPeriodista(Button botonEliminarPeriodista) {
		this.botonEliminarPeriodista = botonEliminarPeriodista;
	}

	public Image getFotoPeriodistas() {
		return fotoPeriodistas;
	}

	public void setFotoPeriodistas(Image fotoPeriodistas) {
		this.fotoPeriodistas = fotoPeriodistas;
	}

	public Element getApodoPeriodistas() {
		return apodoPeriodistas;
	}

	public void setApodoPeriodistas(Element apodoPeriodistas) {
		this.apodoPeriodistas = apodoPeriodistas;
	}

}