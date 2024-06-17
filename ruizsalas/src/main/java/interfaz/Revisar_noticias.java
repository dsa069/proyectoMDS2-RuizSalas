package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Revisar_noticias extends Banner_Editor {
	public Editor _unnamed_Editor_;
	public Noticias_a_Revisar _contiene;
	
	public Revisar_noticias(Editor _editor, ocl_proyecto.Editor editor) {
		super(_editor, editor);
		this._unnamed_Editor_ = _editor;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getRevisarNoticiasLayout().setVisible(true);
		//revisar noticias
		this._contiene = new Noticias_a_Revisar(this._unnamed_Editor_, this.editor, this);
		this.getRevisarNoticiasEstatico().as(VerticalLayout.class).add(this._contiene);
	}
}