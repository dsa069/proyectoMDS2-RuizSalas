package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;

@Tag("vista-seleccindeseccionesgenerico")
@JsModule("./src/vista-seleccindeseccionesgenerico.ts")
public class VistaSeleccindeseccionesgenerico extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("BotonEditarSecciones")
	private Button botonEditarSecciones;
	@Id("BarraDeBusqueda")
	private TextField barraDeBusqueda;
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}
	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
	public Button getBotonEditarSecciones() {
		return botonEditarSecciones;
	}
	public void setBotonEditarSecciones(Button botonEditarSecciones) {
		this.botonEditarSecciones = botonEditarSecciones;
	}
	public TextField getBarraDeBusqueda() {
		return barraDeBusqueda;
	}
	public void setBarraDeBusqueda(TextField barraDeBusqueda) {
		this.barraDeBusqueda = barraDeBusqueda;
	}
	public VistaSeleccindeseccionesgenerico() {
        // You can initialise any data required for the connected UI components here.
    }

}