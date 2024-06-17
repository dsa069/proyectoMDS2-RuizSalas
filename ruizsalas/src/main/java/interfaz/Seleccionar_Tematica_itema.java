package interfaz;

import basededatos.BD_Principal;
import basededatos.iEditor;
import vistas.*;

public class Seleccionar_Tematica_itema extends VistaSeleccionartematica_item {
	public Seleccionar_Tematica _seleccionar_Tematica;
	iEditor ieditor = new BD_Principal();
	ocl_proyecto.Tematica tematica;
	ocl_proyecto.Noticia noticia;
	public Seleccionar_Tematica_itema(Seleccionar_Tematica _seleccionar_Tematica, ocl_proyecto.Tematica tematica, ocl_proyecto.Noticia noticia) {
		super();
		this._seleccionar_Tematica = _seleccionar_Tematica;
		this.tematica = tematica;
		this.noticia = noticia;
		this.getSeleccionTamaticaNoticia().setText("" + tematica.getNombre());
		this.getBotonCheckboxRelleno().addClickListener(event->marcar_tematica());
		this.getBotonCheckboxVacio().addClickListener(event->marcar_tematica());
	}

	public void marcar_tematica() {
		ieditor.marcar_tematica(this.tematica.getIdTematica(), this.noticia.getId_valoracion());
	}
}