package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Banner_registrado extends Banner_generico {
	//private JButton _visitar_Perfil;
	public Banner_suscrito _puede_contener;
	public Registrado _registrado;
	public Perfil_Uusario_Vista_UR PerfilUR;
	public Perfil_Usuario Perfil;
	public Banner_registrado BananaRegistardo;
	
	ocl_proyecto.Usuario usuario;

	public Banner_registrado(Registrado _registrado, ocl_proyecto.Usuario usuario) {
		super(_registrado, usuario);
		this._registrado = _registrado;
		this.usuario = usuario;
		this.getBotonSuscribirseGenerico().setVisible(false);
		this.getZonaAnunciosLayout1().setVisible(false);
		this.getZonaAnunciosLayout2().setVisible(false);

		this.getBotonIniciarSesionGenerico().addClickListener(event->ConductorPerfilUR());
		this.getBotonpaginainicio().addClickListener(event->ConductorPortadaBannerR());
	}
	
	
	public Noticia nepe;
	public void hola() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		nepe = new Noticia(this._registrado);
		this.getBannergenericolayout().as(VerticalLayout.class).add(nepe);
	}
	
	public void ConductorPortadaBannerR() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		BananaRegistardo = new Banner_registrado(this._registrado, this.usuario);
		this.getBannergenericolayout().as(VerticalLayout.class).add(BananaRegistardo);
	}

	public void ConductorPerfilUR() {
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
		PerfilUR = new Perfil_Uusario_Vista_UR(this._registrado.mainView.UR);//NOSE QUE SE PONE EN VEZ DE NULL SON LAS 1:20AM
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(PerfilUR);
	}

	public void ConductorPerfil() {
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
		Perfil = new Perfil_Usuario(this._registrado);
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(Perfil);
	}
}