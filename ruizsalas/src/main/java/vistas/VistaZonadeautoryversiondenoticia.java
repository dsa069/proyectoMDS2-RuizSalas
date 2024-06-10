package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

@Tag("vista-zonadeautoryversiondenoticia")
@JsModule("./src/vista-zonadeautoryversiondenoticia.ts")
public class VistaZonadeautoryversiondenoticia extends LitTemplate {

    @Id("FotoPeriodistaNoticia")
	private Image fotoPeriodistaNoticia;
	@Id("NombreAutorNoticia")
	private Element nombreAutorNoticia;
	@Id("VersionNoticia")
	private Element versionNoticia;
	@Id("layoutFotoPeriodistaNoticia")
	private Element layoutFotoPeriodistaNoticia;
	public VistaZonadeautoryversiondenoticia() {
        // You can initialise any data required for the connected UI components here.
    }
	public Image getFotoPeriodistaNoticia() {
		return fotoPeriodistaNoticia;
	}
	public void setFotoPeriodistaNoticia(Image fotoPeriodistaNoticia) {
		this.fotoPeriodistaNoticia = fotoPeriodistaNoticia;
	}
	public Element getNombreAutorNoticia() {
		return nombreAutorNoticia;
	}
	public void setNombreAutorNoticia(Element nombreAutorNoticia) {
		this.nombreAutorNoticia = nombreAutorNoticia;
	}
	public Element getVersionNoticia() {
		return versionNoticia;
	}
	public void setVersionNoticia(Element versionNoticia) {
		this.versionNoticia = versionNoticia;
	}
	public Element getLayoutFotoPeriodistaNoticia() {
		return layoutFotoPeriodistaNoticia;
	}
	public void setLayoutFotoPeriodistaNoticia(Element layoutFotoPeriodistaNoticia) {
		this.layoutFotoPeriodistaNoticia = layoutFotoPeriodistaNoticia;
	}

}