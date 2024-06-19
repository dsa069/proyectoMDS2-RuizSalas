package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Banner_Editor extends Banner_registrado {
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

		//Estatico Seleccion Secciones editor
		this.SSE = new Seleccion_de_secciones_Vista_Editor(this._editor, this.editor,this);
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.SSE);

		//CONDUCTOR PERIODISTAS
		this.getBotonVerPeriodistasGenerico().addClickListener(event-> {
			this._editor.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			ListaPeriodistica = new Lista_periodistas(this._editor, this.editor);
			this._editor.getBannerGenericoEstatico().as(VerticalLayout.class).add(ListaPeriodistica);
		});

		//CONDUCTOR REVISAR NOTICIAS
		this.getBotonRevisarNoticiaGenerico().addClickListener(event->{
			this._editor.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			Revision = new Revisar_noticias(this._editor, this.editor);
			this._editor.getBannerGenericoEstatico().as(VerticalLayout.class).add(Revision);
		});	
	}

	@Override
	public void InicioPortada() {

	}

	@Override
	public void ConductorPortadaBanner() {
		this._editor.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		BananaEditor = new Banner_Editor(this._editor, this.editor);
		this._editor.getBannerGenericoEstatico().as(VerticalLayout.class).add(BananaEditor);
	}

}