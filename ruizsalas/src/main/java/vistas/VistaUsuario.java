package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

@Tag("vista-usuario")
@JsModule("./src/vista-usuario.ts")
public class VistaUsuario extends LitTemplate {
	
	public Element getBannerGenericoEstatico() {
		return bannerGenericoEstatico;
	}

	public void setBannerGenericoEstatico(Element bannerGenericoEstatico) {
		this.bannerGenericoEstatico = bannerGenericoEstatico;
	}

	@Id("bannerGenericoEstatico")
	private Element bannerGenericoEstatico;

	public VistaUsuario() {
        // You can initialise any data required for the connected UI components here.
    }

}