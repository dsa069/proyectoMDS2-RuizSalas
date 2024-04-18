package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Banner_Editor extends Banner_registrado {
	//private JButton _ir_a_revisar_noticias;
	//private JButton _ir_a_lista_periodistas;
	public Banner_suscrito _puede_contener;
	
	public Editor _editor;
	public Banner_Editor(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		this.getBotonMisNoticiasGenerico().setVisible(false);
		
		this.getBotonIniciarSesionGenerico().addClickListener(event->ConductorPerfil());
		this.getBotonVerPeriodistasGenerico().addClickListener(event->ConductorListaPeriodistas());
		this.getBotonRevisarNoticiaGenerico().addClickListener(event->ConductorRevisarNoticias());
	}
	
	public Revisar_noticias Revision;
	public void ConductorRevisarNoticias() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		Revision = new Revisar_noticias(null);
		this.getBannergenericolayout().as(VerticalLayout.class).add(Revision);
		}
	
	public Lista_periodistas ListaPeriodistica;
	public void ConductorListaPeriodistas() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		ListaPeriodistica = new Lista_periodistas(null);
		this.getBannergenericolayout().as(VerticalLayout.class).add(ListaPeriodistica);
		}
}