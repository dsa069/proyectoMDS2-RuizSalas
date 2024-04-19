package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBannergenerico;

public class Banner_generico extends VistaBannergenerico{
	//	private JButton _pagina_inicio;
	//	private JLabel _nombre_del_periodico;

	public Usuario usuario;
	public Seleccion_de_secciones SS;
	public Zona_Anuncios Anuncio;
	public Zona_Anuncios Anuncio2;
	public Introducir_datos_registro Datos;
	public Confirmar_Registro Boton;
	public Introducir_Datos Datil;
	public Zona_insertar_contenido_noticia CENoticia;
	public Lista_mis_noticias LHistorial;
	public Noticias_a_Revisar LRevisar;
	public Periodistas LPeriodistas;
	public Zona_registrar_periodista Dato;

	public Banner_generico(Usuario usuario) {
		super();
		this.usuario = usuario;

		this.getRegistroLayout().setVisible(false);
		this.getIniciarSesionLayout().setVisible(false);
		this.getNoticiaUsuarioNoRegistradoLayout().setVisible(false);
		this.getCrearEditarNoticiaLayout().setVisible(false);
		this.getHistorialNoticiasLayout().setVisible(false);
		this.getRevisarNoticiasLayout().setVisible(false);
		this.getListarPeriodistaLayout().setVisible(false);
		this.getAltaPeriodistaLayout().setVisible(false);

		this.Zona_Anuncio();
		this.Datos_Registro();
		this.Confirmar();
		this.Datos_Iniciar_Sesion();
		this.C_E_Noticia();
		this.Mis_Noticias();
		this.Revision_Noticias();
		this.Dar_Baja_Periodistas();
		this.Dar_Alta_Periodistas();

		this.InicioPortada();
	}

	public void InicioPortada() {
		this.SS = new Seleccion_de_secciones(this.usuario);
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.SS);
	}

	public void Zona_Anuncio() {
		this.Anuncio = new Zona_Anuncios(null);
		this.Anuncio2 = new Zona_Anuncios(null);
		this.getZonaAnunciosLayout1().as(VerticalLayout.class).add(this.Anuncio);
		this.getZonaAnunciosLayout2().as(VerticalLayout.class).add(this.Anuncio2);
	}

	public void Datos_Registro() {
		this.Datos = new Introducir_datos_registro(null);
		this.getDatosRegistroEstatico().as(VerticalLayout.class).add(this.Datos);
	}

	public void Confirmar() {
		this.Boton = new Confirmar_Registro(null);
		this.getBotonConfirmarRegistroEstaticoLayout().as(VerticalLayout.class).add(this.Boton);
	}

	public void Datos_Iniciar_Sesion() {
		this.Datil = new Introducir_Datos(null);
		this.getDatosIniciarSesionEstaticos().as(VerticalLayout.class).add(this.Datil);
	}

	public void C_E_Noticia() {
		this.CENoticia = new Zona_insertar_contenido_noticia(null);
		this.getCrearEditarNoticiaEstatico().as(VerticalLayout.class).add(this.CENoticia);
	}

	public void Mis_Noticias() {
		this.LHistorial = new Lista_mis_noticias(null);
		this.getHistorialNoticiasEstatico().as(VerticalLayout.class).add(this.LHistorial);
	}

	public void Revision_Noticias() {
		this.LRevisar = new Noticias_a_Revisar(null);
		this.getRevisarNoticiasEstatico().as(VerticalLayout.class).add(this.LRevisar);
	}

	public void Dar_Baja_Periodistas() {
		this.LPeriodistas = new Periodistas(null);
		this.getListaPeriodistaEstatico().as(VerticalLayout.class).add(this.LPeriodistas);
	}

	public void Dar_Alta_Periodistas() {
		this.Dato = new Zona_registrar_periodista(null);
		this.getDatosPeriodistaAñadirEstatico().as(VerticalLayout.class).add(this.Dato);
	}
}