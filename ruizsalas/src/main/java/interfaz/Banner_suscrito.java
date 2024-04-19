package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBannersuscrito;

public class Banner_suscrito extends VistaBannersuscrito{
	public Seleccion_de_secciones_generico _unnamed_Seleccion_de_secciones_generico_;
	public Banner_Editor _unnamed_Banner_Editor_;
	public Banner_registrado _unnamed_Banner_registrado_;
	public Banner_Periodista _unnamed_Banner_Periodista_;
	public Noticia_completa Noticia;
	public Noticia_Vista_Editor NoticiaVE;
	public Ver_datos_perfil Datos;
	public Editar_datos Dato;
	public Registrado registrado;

	public Banner_suscrito(Registrado registrado) {
		super();
		this.registrado = registrado;
	}

	public void Ver_Noticia() {
		this.Noticia = new Noticia_completa(null);
		this.getNoticiaLayout().add(this.Noticia);
	}

	public void Ver_Noticia_Editor() {
		this.NoticiaVE = new Noticia_Vista_Editor(null);
		this.getNoticiaEditorLayout().add(this.NoticiaVE);
	}

	public void Ver_Datos() {
		this.Datos = new Ver_datos_perfil(null);
		this.getVerDatosEstaticos().add(this.Datos);
	}

	public void Editar_Dato() {
		this.Dato = new Editar_datos(null);
		this.getEditarDatosEstaticos().add(this.Dato);
	}
}