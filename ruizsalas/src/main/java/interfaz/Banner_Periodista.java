package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Banner_Periodista extends Banner_registrado {
	public Historial_noticias historialNoticias;
	public Periodista _periodista;
	ocl_proyecto.Periodista periodista;

	public Banner_Periodista(Periodista _periodista, ocl_proyecto.Periodista periodista) {
		super(_periodista, periodista);
		this._periodista = _periodista;
		this.periodista = periodista;
		this.getBotonRevisarNoticiaGenerico().setVisible(false);
		this.getBotonVerPeriodistasGenerico().setVisible(false);
		this.getBotonMisNoticiasGenerico().setVisible(true);

		this.getBotonMisNoticiasGenerico().addClickListener(event->{
			this._periodista.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			historialNoticias = new Historial_noticias(this._periodista, this.periodista);
			this._periodista.getBannerGenericoEstatico().as(VerticalLayout.class).add(historialNoticias);
		});
	}
}