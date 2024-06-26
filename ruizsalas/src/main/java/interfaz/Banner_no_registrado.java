package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Banner_no_registrado extends Banner_generico {
	public Usuario_No_Registrado _usuarioNoRegistrado;
	public Registro registro;
	public Banner_no_registrado noRegistro;
	public Zona_Anuncios Anuncio;
	public Zona_Anuncios Anuncio2;

	ocl_proyecto.Usuario usuario;

	public Banner_no_registrado(Usuario_No_Registrado _usuarioNoRegistrado, ocl_proyecto.Usuario usuario) {
		super(_usuarioNoRegistrado, usuario);
		this._usuarioNoRegistrado = _usuarioNoRegistrado;
		this.usuario = usuario;
		this.getBotonRevisarNoticiaGenerico().setVisible(false);
		this.getBotonIniciarSesionGenerico().setVisible(false);
		this.getBotonMisNoticiasGenerico().setVisible(false);
		this.getBotonVerPeriodistasGenerico().setVisible(false);

		//ESTATICO ANUNCIOS
		this.Anuncio = new Zona_Anuncios(this._usuarioNoRegistrado);
		this.Anuncio2 = new Zona_Anuncios(this._usuarioNoRegistrado);
		this.getZonaAnunciosLayout1().as(VerticalLayout.class).add(this.Anuncio);
		this.getZonaAnunciosLayout2().as(VerticalLayout.class).add(this.Anuncio2);

		//ESTATICO SELECCION DE SECCIONES
		this.SS = new Seleccion_de_secciones(this._usuarioNoRegistrado, this.usuario, null);
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.SS);

		//CONDUCTOR REGISTRO
		this.getBotonSuscribirseGenerico().addClickListener(event->{
			this._usuarioNoRegistrado.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			registro = new Registro(this._usuarioNoRegistrado, this.usuario);
			this._usuarioNoRegistrado.getBannerGenericoEstatico().as(VerticalLayout.class).add(registro);
		});

		//CONDCTOR PORTADA
		this.getBotonpaginainicio().addClickListener(event->{
			this._usuarioNoRegistrado.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			noRegistro = new Banner_no_registrado(this._usuarioNoRegistrado, this.usuario);
			this._usuarioNoRegistrado.getBannerGenericoEstatico().as(VerticalLayout.class).add(noRegistro);	
		});
	}
}