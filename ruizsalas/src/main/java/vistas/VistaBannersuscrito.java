package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

@Tag("vista-bannersuscrito")
@JsModule("./src/vista-bannersuscrito.ts")
public class VistaBannersuscrito extends LitTemplate {

    @Id("noticiaLayout")
	private HorizontalLayout noticiaLayout;
	@Id("noticiaEditorLayout")
	private HorizontalLayout noticiaEditorLayout;
	@Id("textoPerfil")
	private HorizontalLayout textoPerfil;
	@Id("noticiaLayoutGenerico")
	private Element noticiaLayoutGenerico;
	@Id("perfilUsuarioLayout")
	private Element perfilUsuarioLayout;
	@Id("darseDeBajaLayout")
	private HorizontalLayout darseDeBajaLayout;
	@Id("editarPerfilLayout")
	private Element editarPerfilLayout;

	@Id("verDatosEstaticos")
	private HorizontalLayout verDatosEstaticos;
	@Id("editarDatosEstaticos")
	private HorizontalLayout editarDatosEstaticos;

	public VistaBannersuscrito() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getNoticiaLayout() {
		return noticiaLayout;
	}

	public void setNoticiaLayout(HorizontalLayout noticiaLayout) {
		this.noticiaLayout = noticiaLayout;
	}

	public HorizontalLayout getNoticiaEditorLayout() {
		return noticiaEditorLayout;
	}

	public void setNoticiaEditorLayout(HorizontalLayout noticiaEditorLayout) {
		this.noticiaEditorLayout = noticiaEditorLayout;
	}

	public HorizontalLayout getTextoPerfil() {
		return textoPerfil;
	}

	public void setTextoPerfil(HorizontalLayout textoPerfil) {
		this.textoPerfil = textoPerfil;
	}

	public Element getNoticiaLayoutGenerico() {
		return noticiaLayoutGenerico;
	}

	public void setNoticiaLayoutGenerico(Element noticiaLayoutGenerico) {
		this.noticiaLayoutGenerico = noticiaLayoutGenerico;
	}

	public Element getPerfilUsuarioLayout() {
		return perfilUsuarioLayout;
	}

	public void setPerfilUsuarioLayout(Element perfilUsuarioLayout) {
		this.perfilUsuarioLayout = perfilUsuarioLayout;
	}

	public HorizontalLayout getDarseDeBajaLayout() {
		return darseDeBajaLayout;
	}

	public void setDarseDeBajaLayout(HorizontalLayout darseDeBajaLayout) {
		this.darseDeBajaLayout = darseDeBajaLayout;
	}

	public Element getEditarPerfilLayout() {
		return editarPerfilLayout;
	}

	public void setEditarPerfilLayout(Element editarPerfilLayout) {
		this.editarPerfilLayout = editarPerfilLayout;
	}


	public HorizontalLayout getVerDatosEstaticos() {
		return verDatosEstaticos;
	}

	public void setVerDatosEstaticos(HorizontalLayout verDatosEstaticos) {
		this.verDatosEstaticos = verDatosEstaticos;
	}

	public HorizontalLayout getEditarDatosEstaticos() {
		return editarDatosEstaticos;
	}

	public void setEditarDatosEstaticos(HorizontalLayout editarDatosEstaticos) {
		this.editarDatosEstaticos = editarDatosEstaticos;
	}

}