package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Banner_Periodista extends Banner_registrado {
	public Historial_noticias historialNoticias;
	public Periodista _periodista;
	public Banner_Periodista BananaPeriodista;
	ocl_proyecto.Periodista periodista;

	public Banner_Periodista(Periodista _periodista, ocl_proyecto.Periodista periodista) {
		super(_periodista, periodista);
		this._periodista = _periodista;
		this.periodista = periodista;
		this.getBotonRevisarNoticiaGenerico().setVisible(false);
		this.getBotonVerPeriodistasGenerico().setVisible(false);
		this.getBotonMisNoticiasGenerico().setVisible(true);

		this.getBotonIniciarSesionGenerico().addClickListener(event->ConductorPerfil());
		this.getBotonMisNoticiasGenerico().addClickListener(event->ConductorMisNoticias());
		this.getBotonpaginainicio().addClickListener(event->ConductorPortadaBanner());
	}

	@Override
	public void ConductorPortadaBanner() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		BananaPeriodista = new Banner_Periodista(this._periodista, this.periodista);
		this.getBannergenericolayout().as(VerticalLayout.class).add(BananaPeriodista);
	}

	public void ConductorMisNoticias() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		historialNoticias = new Historial_noticias(this._periodista, this.periodista);
		this.getBannergenericolayout().as(VerticalLayout.class).add(historialNoticias);
	}
}