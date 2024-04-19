package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Lista_periodistas extends Banner_Editor {
	//	private JButton _alta_periodista;
	//	private JScrollPanel _scroll;
	public Editor _accede;
	public Periodistas _unnamed_Periodistas_;
	public Editor _editor;
	public Dar_de_alta_periodista Ananin;
	
	public Lista_periodistas(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getListarPeriodistaLayout().setVisible(true);

		this.getBotonAnadirPeriodista().addClickListener(event->ConductorDarAltaPeriodista());
	}
	
	public void ConductorDarAltaPeriodista() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		Ananin = new Dar_de_alta_periodista(null);
		this.getBannergenericolayout().as(VerticalLayout.class).add(Ananin);
	}
}