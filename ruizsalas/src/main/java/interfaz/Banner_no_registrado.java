package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Banner_no_registrado extends Banner_generico {
	public Seleccion_de_secciones_generico _puede_contener;
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

		this.Zona_Anuncio();
		this.InicioPortada();
		
		this.getBotonSuscribirseGenerico().addClickListener(event->ConductorRegistro());
		this.getBotonpaginainicio().addClickListener(event->ConductorPortadaBanner());
	}
	
	public void InicioPortada() {
		this.SS = new Seleccion_de_secciones(this._usuarioNoRegistrado, this.usuario, null);
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.SS);
	}
	
	public void Zona_Anuncio() {
		this.Anuncio = new Zona_Anuncios(this._usuarioNoRegistrado);
		this.Anuncio2 = new Zona_Anuncios(this._usuarioNoRegistrado);
		this.getZonaAnunciosLayout1().as(VerticalLayout.class).add(this.Anuncio);
		this.getZonaAnunciosLayout2().as(VerticalLayout.class).add(this.Anuncio2);
	}
	
	@Override
	public void ConductorPortadaBanner() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		noRegistro = new Banner_no_registrado(this._usuarioNoRegistrado, this.usuario);
		this.getBannergenericolayout().as(VerticalLayout.class).add(noRegistro);	
	}
	
	public void ConductorRegistro() {
		Notification.show("boton pulsado");
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		registro = new Registro(this._usuarioNoRegistrado, this.usuario);
		this.getBannergenericolayout().as(VerticalLayout.class).add(registro);
	}

}