package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;

@Tag("vista-selecciondeseccionesgenerico")
@JsModule("./src/vista-selecciondeseccionesgenerico.ts")
public class VistaSelecciondeseccionesgenerico extends LitTemplate {

	@Id("BotonEditarSecciones")
	private Button botonEditarSecciones;
	public HorizontalLayout getEditarTexto() {
		return editarTexto;
	}
	public void setEditarTexto(HorizontalLayout editarTexto) {
		this.editarTexto = editarTexto;
	}
	@Id("BarraDeBusqueda")
	private HorizontalLayout barraDeBusqueda;
	@Id("EditarTexto")
	private HorizontalLayout editarTexto;
	@Id("MsgError")
	private HorizontalLayout msgError;
	@Id("layoutSeleccionSeccionesGenerico")
	private Element layoutSeleccionSeccionesGenerico;
	@Id("layoutGenericoSeccionesBanner")
	private HorizontalLayout layoutGenericoSeccionesBanner;
	@Id("layoutSeccionesContenidasPeriodico")
	private HorizontalLayout layoutSeccionesContenidasPeriodico;

	public HorizontalLayout getLayoutSeccionesContenidasPeriodico() {
		return layoutSeccionesContenidasPeriodico;
	}
	public void setLayoutSeccionesContenidasPeriodico(HorizontalLayout layoutSeccionesContenidasPeriodico) {
		this.layoutSeccionesContenidasPeriodico = layoutSeccionesContenidasPeriodico;
	}
	public HorizontalLayout getLayoutGenericoSeccionesBanner() {
		return layoutGenericoSeccionesBanner;
	}
	public void setLayoutGenericoSeccionesBanner(HorizontalLayout layoutGenericoSeccionesBanner) {
		this.layoutGenericoSeccionesBanner = layoutGenericoSeccionesBanner;
	}
	public Element getLayoutSeleccionSeccionesGenerico() {
		return layoutSeleccionSeccionesGenerico;
	}
	public void setLayoutSeleccionSeccionesGenerico(Element layoutSeleccionSeccionesGenerico) {
		this.layoutSeleccionSeccionesGenerico = layoutSeleccionSeccionesGenerico;
	}
	public Button getBotonEditarSecciones() {
		return botonEditarSecciones;
	}
	public void setBotonEditarSecciones(Button botonEditarSecciones) {
		this.botonEditarSecciones = botonEditarSecciones;
	}
	public HorizontalLayout getBarraDeBusqueda() {
		return barraDeBusqueda;
	}
	public void setBarraDeBusqueda(HorizontalLayout barraDeBusqueda) {
		this.barraDeBusqueda = barraDeBusqueda;
	}
	public HorizontalLayout getMsgError() {
		return msgError;
	}
	public void setMsgError(HorizontalLayout msgError) {
		this.msgError = msgError;
	}
	public VistaSelecciondeseccionesgenerico() {
        // You can initialise any data required for the connected UI components here.
    }

}