package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;

@Tag("vista-verdatosperfil")
@JsModule("./src/vista-verdatosperfil.ts")
public class VistaVerdatosperfil extends LitTemplate {

    @Id("imagenUsuarioVerDatos")
	private Image imagenUsuarioVerDatos;
	@Id("layoutNombreUsuario1")
	private Element layoutNombreUsuario1;
	@Id("layoutDNIUsuario1")
	private Element layoutDNIUsuario1;
	@Id("layoutCorreoUsuario1")
	private Element layoutCorreoUsuario1;
	@Id("layoutNickNameUsuario1")
	private Element layoutNickNameUsuario1;
	@Id("layoutTarjetaCreditoUsuario1")
	private Element layoutTarjetaCreditoUsuario1;
	public VistaVerdatosperfil() {
        // You can initialise any data required for the connected UI components here.
    }

	public Image getImagenUsuarioVerDatos() {
		return imagenUsuarioVerDatos;
	}

	public void setImagenUsuarioVerDatos(Image imagenUsuarioVerDatos) {
		this.imagenUsuarioVerDatos = imagenUsuarioVerDatos;
	}

	public Element getLayoutNombreUsuario1() {
		return layoutNombreUsuario1;
	}

	public void setLayoutNombreUsuario1(Element layoutNombreUsuario1) {
		this.layoutNombreUsuario1 = layoutNombreUsuario1;
	}

	public Element getLayoutDNIUsuario1() {
		return layoutDNIUsuario1;
	}

	public void setLayoutDNIUsuario1(Element layoutDNIUsuario1) {
		this.layoutDNIUsuario1 = layoutDNIUsuario1;
	}

	public Element getLayoutCorreoUsuario1() {
		return layoutCorreoUsuario1;
	}

	public void setLayoutCorreoUsuario1(Element layoutCorreoUsuario1) {
		this.layoutCorreoUsuario1 = layoutCorreoUsuario1;
	}

	public Element getLayoutNickNameUsuario1() {
		return layoutNickNameUsuario1;
	}

	public void setLayoutNickNameUsuario1(Element layoutNickNameUsuario1) {
		this.layoutNickNameUsuario1 = layoutNickNameUsuario1;
	}

	public Element getLayoutTarjetaCreditoUsuario1() {
		return layoutTarjetaCreditoUsuario1;
	}

	public void setLayoutTarjetaCreditoUsuario1(Element layoutTarjetaCreditoUsuario1) {
		this.layoutTarjetaCreditoUsuario1 = layoutTarjetaCreditoUsuario1;
	}


}