package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;

public class Dar_de_alta_periodista extends Banner_Editor {
	//private JButton _registrar_periodista;
	public Editor _unnamed_Editor_;
	public Zona_registrar_periodista _contiene;
	public Lista_periodistas LP;
	
	ocl_proyecto.Editor editor;
	ocl_proyecto.Periodista periodista = new ocl_proyecto.Periodista();
	
	iEditor iEdito = new BD_Principal();

	public Dar_de_alta_periodista(Editor _editor, ocl_proyecto.Editor editor) {
		super(_editor, editor);
		this._unnamed_Editor_ = _editor;
		this.editor = editor;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getAltaPeriodistaLayout().setVisible(true);

		this.Dar_Alta_Periodistas();
		
		this.getBotonCancelarAnadirPeriodista().addClickListener(event->ConductorListaPeriodistas());
		this.getBotonConfirmarAnadirPeriodista().addClickListener(event->registrar_periodista());
	}

	public void Dar_Alta_Periodistas() {
		this._contiene = new Zona_registrar_periodista(this._unnamed_Editor_, this.editor);
		this.getDatosPeriodistaAnadirEstatico().as(VerticalLayout.class).add(this._contiene);
	}
	
	public void ConductorListaPeriodistas() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		LP = new Lista_periodistas(this._unnamed_Editor_, this.editor);
		this.getBannergenericolayout().as(VerticalLayout.class).add(LP);
	}

	public void registrar_periodista() {
		//GUardar cambios y añador
//		iEdito.registrar_periodista(this._contiene.getCampoApodo().setLabel(this.periodista.getApodo()), null, null, null, null);
		iEdito.registrar_periodista(periodista.getApodo(), periodista.getDni(), periodista.getCorreo(), periodista.getContrasena(), periodista.getFoto_de_perfil());
		this.ConductorListaPeriodistas();
		throw new UnsupportedOperationException();
	}
}