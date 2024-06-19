package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Lista_periodistas extends Banner_Editor {
	public Editor _accede;
	public Periodistas _unnamed_Periodistas_;
	public Dar_de_alta_periodista Ananin;
	
	ocl_proyecto.Editor editor;
	
	public Lista_periodistas(Editor _editor, ocl_proyecto.Editor editor) {
		super(_editor, editor);
		this._accede = _editor;
		this.editor = editor;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getListarPeriodistaLayout().setVisible(true);

		//ESTATICO DE LA LISTA DE NOTICIAS
		this._unnamed_Periodistas_ = new Periodistas(this._accede, this);
		this.getListaPeriodistaEstatico().as(VerticalLayout.class).add(this._unnamed_Periodistas_);
		
		//DINAMICO REGISTAR PERIODISTA
		this.getBotonAnadirPeriodista().addClickListener(event->{
			this._accede.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			Ananin = new Dar_de_alta_periodista(this._accede, this.editor);
			this._accede.getBannerGenericoEstatico().as(VerticalLayout.class).add(Ananin);
		});
	}
}