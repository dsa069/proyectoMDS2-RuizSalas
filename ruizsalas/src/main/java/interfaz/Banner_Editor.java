package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Banner_Editor extends Banner_registrado {
	//private JButton _ir_a_revisar_noticias;
	//private JButton _ir_a_lista_periodistas;
	public Banner_suscrito _puede_contener;
	public Editor _editor;
	public Revisar_noticias Revision;
	public Lista_periodistas ListaPeriodistica;
	public Banner_Editor BananaEditor;
	public Seleccion_de_secciones_Vista_Editor SSE;
	
	public Banner_Editor(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		this.getBotonMisNoticiasGenerico().setVisible(false);

		this.getBotonIniciarSesionGenerico().addClickListener(event->ConductorPerfil());
		this.getBotonVerPeriodistasGenerico().addClickListener(event->ConductorListaPeriodistas());
		this.getBotonRevisarNoticiaGenerico().addClickListener(event->ConductorRevisarNoticias());
		this.getBotonpaginainicio().addClickListener(event->ConductorPortadaBannerE());
	}
	
	@Override
	public void InicioPortada() {
		this.SSE = new Seleccion_de_secciones_Vista_Editor(this._editor);
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.SSE);
	}

	public void ConductorPortadaBannerE() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		BananaEditor = new Banner_Editor(this._editor);
		this.getBannergenericolayout().as(VerticalLayout.class).add(BananaEditor);
	}
	
	public void ConductorRevisarNoticias() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		Revision = new Revisar_noticias(null);
		this.getBannergenericolayout().as(VerticalLayout.class).add(Revision);
	}

	public void ConductorListaPeriodistas() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		ListaPeriodistica = new Lista_periodistas(null);
		this.getBannergenericolayout().as(VerticalLayout.class).add(ListaPeriodistica);
	}
}