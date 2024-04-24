package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Banner_Periodista extends Banner_registrado {
	//private JButton _boton_Mis_noticias;
	public Banner_suscrito _puede_contener;
	public Historial_noticias Xvideos;
	public Periodista _periodista;
	public Banner_Periodista BananaPeriodista;
	ocl_proyecto.Periodista periodista;
	
	public Banner_Periodista(Periodista _periodista, ocl_proyecto.Periodista periodista) {
		super(_periodista, periodista);
		this._periodista = _periodista;
		this.periodista = periodista;
		this.getBotonRevisarNoticiaGenerico().setVisible(false);
		this.getBotonVerPeriodistasGenerico().setVisible(false);

		this.getBotonIniciarSesionGenerico().addClickListener(event->ConductorPerfil());
		this.getBotonMisNoticiasGenerico().addClickListener(event->ConductorMisNoticias());
		this.getBotonpaginainicio().addClickListener(event->ConductorPortadaBannerP());
	}
	public void ConductorPortadaBannerP() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		BananaPeriodista = new Banner_Periodista(this._periodista, this.periodista);
		this.getBannergenericolayout().as(VerticalLayout.class).add(BananaPeriodista);
	}
	
	public void ConductorMisNoticias() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		Xvideos = new Historial_noticias(this._periodista, this.periodista);
		this.getBannergenericolayout().as(VerticalLayout.class).add(Xvideos);
	}
}