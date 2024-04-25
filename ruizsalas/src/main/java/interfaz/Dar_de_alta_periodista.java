package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Dar_de_alta_periodista extends Banner_Editor {
	//private JButton _registrar_periodista;
	public Editor _unnamed_Editor_;
	public Zona_registrar_periodista _contiene;
	public Lista_periodistas LP;
	
	ocl_proyecto.Editor editor;

	public void registrar_periodista() {
		throw new UnsupportedOperationException();
	}

	public Dar_de_alta_periodista(Editor _editor, ocl_proyecto.Editor editor) {
		super(_editor, editor);
		this._unnamed_Editor_ = _editor;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getAltaPeriodistaLayout().setVisible(true);

		this.Dar_Alta_Periodistas();
		
		this.getBotonCancelarAnadirPeriodista().addClickListener(event->ConfirmarAnadirPeriodistador());
		this.getBotonConfirmarAnadirPeriodista().addClickListener(event->ConductorListaPeriodistas());
	}

	public void Dar_Alta_Periodistas() {
		this._contiene = new Zona_registrar_periodista(this._unnamed_Editor_, this.editor);
		this.getDatosPeriodistaAñadirEstatico().as(VerticalLayout.class).add(this._contiene);
	}
	
	public void ConductorListaPeriodistas() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		LP = new Lista_periodistas(this._unnamed_Editor_, this.editor);
		this.getBannergenericolayout().as(VerticalLayout.class).add(LP);
	}
	
	public void ConfirmarAnadirPeriodistador() {
		//GUardar cambios y añador
		this.ConductorListaPeriodistas();
	}
}