package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Dar_de_alta_periodista extends Banner_Editor {
	//private JButton _registrar_periodista;
	public Editor _unnamed_Editor_;
	public Zona_registrar_periodista _contiene;

	public void registrar_periodista() {
		throw new UnsupportedOperationException();
	}
	
	public Editor _editor;
	public Dar_de_alta_periodista(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getAltaPeriodistaLayout().setVisible(true);
		
		this.getBotonCancelarAnadirPeriodista().addClickListener(event->ConfirmarAnadirPeriodistador());
		this.getBotonConfirmarAnadirPeriodista().addClickListener(event->ConductorListaPeriodistas());
	}
	
	public void ConfirmarAnadirPeriodistador() {
		//GUardar cambios y añador
		this.ConductorListaPeriodistas();
	}
	
	public Lista_periodistas LP;
	public void ConductorListaPeriodistas() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		LP = new Lista_periodistas(null);
		this.getBannergenericolayout().as(VerticalLayout.class).add(LP);
	}
}