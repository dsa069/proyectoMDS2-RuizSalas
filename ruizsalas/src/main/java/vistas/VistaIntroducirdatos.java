package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Image;

@Tag("vista-introducirdatos")
@JsModule("./src/vista-introducirdatos.ts")
public class VistaIntroducirdatos extends LitTemplate {

	@Id("zonaRegistrarPeriodista")
	private Element zonaRegistrarPeriodista;
	@Id("datosRegistro")
	private Element datosRegistro;
	@Id("editarPerfil")
	private Element editarPerfil;
	@Id("FotoTextamen")
	private Element fotoTextamen;
	@Id("imagenPerfilIntroducirDatos")
	private Image imagenPerfilIntroducirDatos;
	@Id("layoutImagenPerfilIntroducirDatos")
	private Element layoutImagenPerfilIntroducirDatos;
	
	public VistaIntroducirdatos() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getZonaRegistrarPeriodista() {
		return zonaRegistrarPeriodista;
	}

	public void setZonaRegistrarPeriodista(Element zonaRegistrarPeriodista) {
		this.zonaRegistrarPeriodista = zonaRegistrarPeriodista;
	}

	public Element getDatosRegistro() {
		return datosRegistro;
	}

	public void setDatosRegistro(Element datosRegistro) {
		this.datosRegistro = datosRegistro;
	}

	public Element getEditarPerfil() {
		return editarPerfil;
	}

	public void setEditarPerfil(Element editarPerfil) {
		this.editarPerfil = editarPerfil;
	}

	public Element getFotoTextamen() {
		return fotoTextamen;
	}

	public void setFotoTextamen(Element fotoTextamen) {
		this.fotoTextamen = fotoTextamen;
	}

	public Image getImagenPerfilIntroducirDatos() {
		return imagenPerfilIntroducirDatos;
	}

	public void setImagenPerfilIntroducirDatos(Image imagenPerfilIntroducirDatos) {
		this.imagenPerfilIntroducirDatos = imagenPerfilIntroducirDatos;
	}

	public Element getLayoutImagenPerfilIntroducirDatos() {
		return layoutImagenPerfilIntroducirDatos;
	}

	public void setLayoutImagenPerfilIntroducirDatos(Element layoutImagenPerfilIntroducirDatos) {
		this.layoutImagenPerfilIntroducirDatos = layoutImagenPerfilIntroducirDatos;
	}

}