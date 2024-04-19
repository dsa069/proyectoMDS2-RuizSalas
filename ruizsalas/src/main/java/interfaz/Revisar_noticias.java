package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Revisar_noticias extends Banner_Editor {
	//private JScrollPanel _scroll;
	public Editor _unnamed_Editor_;
	public Noticias_a_Revisar _contiene;
	
	public Revisar_noticias(Editor _editor) {
		super(_editor);
		this._unnamed_Editor_ = _editor;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getRevisarNoticiasLayout().setVisible(true);
		
		this.Revision_Noticias();
	}
	public void Revision_Noticias() {
		this._contiene = new Noticias_a_Revisar(this._unnamed_Editor_);
		this.getRevisarNoticiasEstatico().as(VerticalLayout.class).add(this._contiene);
	}
}