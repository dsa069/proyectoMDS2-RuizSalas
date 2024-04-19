package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Banner_no_registrado extends Banner_generico {
	//	private JLabel _zona_Anuncios;
	//	private JButton _boton_Subscribirse;
	public Seleccion_de_secciones_generico _puede_contener;
	public Usuario_No_Registrado _usuarioNoRegistrado;
	public Registro registro;
	public Noticia_Vista_UNR asasa;
	public Banner_no_registrado noRegistro;

	public Banner_no_registrado(Usuario_No_Registrado _usuarioNoRegistrado) {
		super(_usuarioNoRegistrado);
		this._usuarioNoRegistrado = _usuarioNoRegistrado;
		this.getBotonRevisarNoticiaGenerico().setVisible(false);
		this.getBotonIniciarSesionGenerico().setVisible(false);
		this.getBotonMisNoticiasGenerico().setVisible(false);
		this.getBotonVerPeriodistasGenerico().setVisible(false);

		this.getBotonSuscribirseGenerico().addClickListener(event->ConductorRegistro());
	}

	public void hola() {//comprobacian
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		asasa = new Noticia_Vista_UNR(this._usuarioNoRegistrado);
		this.getBannergenericolayout().as(VerticalLayout.class).add(asasa);
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