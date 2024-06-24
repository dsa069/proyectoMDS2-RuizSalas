package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.richtexteditor.RichTextEditor;

@Tag("vista-zonainsertarcontenidonoticia")
@JsModule("./src/vista-zonainsertarcontenidonoticia.ts")
public class VistaZonainsertarcontenidonoticia extends LitTemplate {

    @Id("seleccionarTematicasEstatico")
	private Element seleccionarTematicasEstatico;
	@Id("modificarFecha")
	private TextField modificarFecha;
	@Id("modificarUbicacion")
	private TextField modificarUbicacion;
	@Id("modificarImagen")
	private TextField modificarImagen;
	@Id("modificarTitulo")
	private TextField modificarTitulo;
	@Id("modificarTextoCorto")
	private TextArea modificarTextoCorto;
	@Id("modificarTextoLargo")
	private RichTextEditor modificarTextoLargo;
	public VistaZonainsertarcontenidonoticia() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getSeleccionarTematicasEstatico() {
		return seleccionarTematicasEstatico;
	}

	public void setSeleccionarTematicasEstatico(Element seleccionarTematicasEstatico) {
		this.seleccionarTematicasEstatico = seleccionarTematicasEstatico;
	}

	public TextField getModificarFecha() {
		return modificarFecha;
	}

	public void setModificarFecha(TextField modificarFecha) {
		this.modificarFecha = modificarFecha;
	}

	public TextField getModificarUbicacion() {
		return modificarUbicacion;
	}

	public void setModificarUbicacion(TextField modificarUbicacion) {
		this.modificarUbicacion = modificarUbicacion;
	}

	public TextField getModificarImagen() {
		return modificarImagen;
	}

	public void setModificarImagen(TextField modificarImagen) {
		this.modificarImagen = modificarImagen;
	}

	public TextField getModificarTitulo() {
		return modificarTitulo;
	}

	public void setModificarTitulo(TextField modificarTitulo) {
		this.modificarTitulo = modificarTitulo;
	}

	public TextArea getModificarTextoCorto() {
		return modificarTextoCorto;
	}

	public void setModificarTextoCorto(TextArea modificarTextoCorto) {
		this.modificarTextoCorto = modificarTextoCorto;
	}

	public RichTextEditor getModificarTextoLargo() {
		return modificarTextoLargo;
	}

	public void setModificarTextoLargo(RichTextEditor modificarTextoLargo) {
		this.modificarTextoLargo = modificarTextoLargo;
	}

}