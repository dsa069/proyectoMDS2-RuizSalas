package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;

public class Dar_de_alta_periodista extends Banner_Editor {
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

		//ESTATICO DATOS REGISTAR PERIODISTA
		this._contiene = new Zona_registrar_periodista(this._unnamed_Editor_, this.editor);
		this.getDatosPeriodistaAnadirEstatico().as(VerticalLayout.class).add(this._contiene);

		this.getBotonCancelarAnadirPeriodista().addClickListener(event-> {
			this._unnamed_Editor_.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			LP = new Lista_periodistas(this._unnamed_Editor_, this.editor);
			this._unnamed_Editor_.getBannerGenericoEstatico().as(VerticalLayout.class).add(LP);
		});
		this.getBotonConfirmarAnadirPeriodista().addClickListener(event-> {
			this.registrar_periodista();
			this._unnamed_Editor_.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			LP = new Lista_periodistas(this._unnamed_Editor_, this.editor);
			this._unnamed_Editor_.getBannerGenericoEstatico().as(VerticalLayout.class).add(LP);
		});
	}

	public void registrar_periodista() {
		iEdito.registrar_periodista(this._contiene.getCampoApodo().getValue(), this._contiene.getCampoDNI().getValue(), this._contiene.getCampoEmail().getValue(), this._contiene.getCampoContrasena().getValue(), this._contiene.getCampoFoto().getValue());
	}
}