package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Banner_Periodista extends Banner_registrado {
	//private JButton _boton_Mis_noticias;
	public Banner_suscrito _puede_contener;
	
	public Periodista _periodista;
	public Banner_Periodista(Periodista _periodista) {
		super(_periodista);
		this._periodista = _periodista;
		this.getBotonRevisarNoticiaGenerico().setVisible(false);
		this.getBotonVerPeriodistasGenerico().setVisible(false);
		
		this.getBotonIniciarSesionGenerico().addClickListener(event->ConductorPerfil());
		this.getBotonMisNoticiasGenerico().addClickListener(event->ConductorMisNoticias());
	}
	public Historial_noticias Xvideos;
	public void ConductorMisNoticias() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		Xvideos = new Historial_noticias(null);
		this.getBannergenericolayout().as(VerticalLayout.class).add(Xvideos);
		}
}