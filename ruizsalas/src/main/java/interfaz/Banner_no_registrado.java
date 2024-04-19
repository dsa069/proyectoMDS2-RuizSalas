package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Banner_no_registrado extends Banner_generico {
	//	private JLabel _zona_Anuncios;
	//	private JButton _boton_Subscribirse;
	public Seleccion_de_secciones_generico _puede_contener;
	public Usuario_No_Registrado _usuarioNoRegistrado;
	public Registro registro;
	public Banner_no_registrado noRegistro;
	
	public Zona_Anuncios Anuncio;
	public Zona_Anuncios Anuncio2;

	public Banner_no_registrado(Usuario_No_Registrado _usuarioNoRegistrado) {
		super(_usuarioNoRegistrado);
		this._usuarioNoRegistrado = _usuarioNoRegistrado;
		this.getBotonRevisarNoticiaGenerico().setVisible(false);
		this.getBotonIniciarSesionGenerico().setVisible(false);
		this.getBotonMisNoticiasGenerico().setVisible(false);
		this.getBotonVerPeriodistasGenerico().setVisible(false);

		this.Zona_Anuncio();
		
		this.getBotonSuscribirseGenerico().addClickListener(event->ConductorRegistro());
	}
	
	public void Zona_Anuncio() {
		this.Anuncio = new Zona_Anuncios(this._usuarioNoRegistrado);
		this.Anuncio2 = new Zona_Anuncios(this._usuarioNoRegistrado);
		this.getZonaAnunciosLayout1().as(VerticalLayout.class).add(this.Anuncio);
		this.getZonaAnunciosLayout2().as(VerticalLayout.class).add(this.Anuncio2);
	}
	
	public void ConductorPortadaBannerUNR() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		noRegistro = new Banner_no_registrado(this._usuarioNoRegistrado);
		this.getBannergenericolayout().as(VerticalLayout.class).add(noRegistro);
	}
	
	public void ConductorRegistro() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		registro = new Registro(this._usuarioNoRegistrado);
		this.getBannergenericolayout().as(VerticalLayout.class).add(registro);
	}

}