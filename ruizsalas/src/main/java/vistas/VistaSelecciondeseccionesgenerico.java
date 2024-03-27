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

	@Id("BotonEditarSecciones")
	private Button botonEditarSecciones;
	public HorizontalLayout getEditarTexto() {
		return editarTexto;
	}
	public void setEditarTexto(HorizontalLayout editarTexto) {
		this.editarTexto = editarTexto;
	}
	@Id("BarraDeBusqueda")
	private TextField barraDeBusqueda;
	@Id("EditarTexto")
	private HorizontalLayout editarTexto;

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