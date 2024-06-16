package interfaz;

import com.vaadin.flow.component.notification.Notification;
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
	ocl_proyecto.Editor editor;
	
	public Banner_Editor(Editor _editor, ocl_proyecto.Editor editor) {
		super(_editor, editor);
		this._editor = _editor;
		this.editor = editor;
		this.getBotonMisNoticiasGenerico().setVisible(false);
		this.getBotonVerPeriodistasGenerico().setVisible(true);
		this.getBotonRevisarNoticiaGenerico().setVisible(true);

		this.InicioPortada_Editor();
		this.getBotonIniciarSesionGenerico().addClickListener(event->ConductorPerfil());
		this.getBotonVerPeriodistasGenerico().addClickListener(event->ConductorListaPeriodistas());
		this.getBotonRevisarNoticiaGenerico().addClickListener(event->ConductorRevisarNoticias());	
		}
	

	public void InicioPortada_Editor() {
		Notification.show("null " + this.editor.getApodo());
		this.SSE = new Seleccion_de_secciones_Vista_Editor(this._editor, this.editor,this);
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.SSE);
	}
	
	@Override
	public void InicioPortada() {
		
	}

	@Override
	public void ConductorPortadaBanner() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		BananaEditor = new Banner_Editor(this._editor, this.editor);
		this.getBannergenericolayout().as(VerticalLayout.class).add(BananaEditor);
	}
	
	public void ConductorRevisarNoticias() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		Revision = new Revisar_noticias(this._editor, this.editor);
		this.getBannergenericolayout().as(VerticalLayout.class).add(Revision);
	}

	public void ConductorListaPeriodistas() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		ListaPeriodistica = new Lista_periodistas(this._editor, this.editor);
		this.getBannergenericolayout().as(VerticalLayout.class).add(ListaPeriodistica);
	}
}