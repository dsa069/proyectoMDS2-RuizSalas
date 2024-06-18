package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
//import com.vaadin.flow.component.radiobutton.RadioButton;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

@Tag("vista-listaseccionesnoticia_item")
@JsModule("./src/vista-listaseccionesnoticia_item.ts")
public class VistaListaseccionesnoticia_item extends LitTemplate {

//	@Id("SeleccionSeccion")
//	private Checkbox seleccionSeccion;
	@Id("botonSeccionNoticiaVacio")
	private Button botonSeccionNoticiaVacio;
	@Id("botonSeccionNoticiaRelleno")
	private Button botonSeccionNoticiaRelleno;
	@Id("nombreSeccionNoticia")
	private Label nombreSeccionNoticia;

	public VistaListaseccionesnoticia_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getBotonSeccionNoticiaVacio() {
		return botonSeccionNoticiaVacio;
	}

	public void setBotonSeccionNoticiaVacio(Button botonSeccionNoticiaVacio) {
		this.botonSeccionNoticiaVacio = botonSeccionNoticiaVacio;
	}

	public Button getBotonSeccionNoticiaRelleno() {
		return botonSeccionNoticiaRelleno;
	}

	public void setBotonSeccionNoticiaRelleno(Button botonSeccionNoticiaRelleno) {
		this.botonSeccionNoticiaRelleno = botonSeccionNoticiaRelleno;
	}

	public Label getNombreSeccionNoticia() {
		return nombreSeccionNoticia;
	}

	public void setNombreSeccionNoticia(Label nombreSeccionNoticia) {
		this.nombreSeccionNoticia = nombreSeccionNoticia;
	}
}