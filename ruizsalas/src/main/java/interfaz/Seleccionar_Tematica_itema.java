package interfaz;

import basededatos.BD_Principal;
import basededatos.iEditor;
import vistas.*;

public class Seleccionar_Tematica_itema extends VistaSeleccionartematica_item {
//	private JCheckBox _marcar_tematica;
//	private JLabel _nombre_tematica;
	public Seleccionar_Tematica _seleccionar_Tematica;
	iEditor ieditor = new BD_Principal();
	ocl_proyecto.Tematica tematica;
	ocl_proyecto.Noticia noticia;
	public Seleccionar_Tematica_itema(Seleccionar_Tematica _seleccionar_Tematica, ocl_proyecto.Tematica tematica) {
		super();
		this._seleccionar_Tematica = _seleccionar_Tematica;
		this.getSeleccionarTematica().addClickListener(event->marcar_tematica());
//		this.getSeleccionarTematica().setLabel("" + tematica.getNombre()); //ns si esto es correcto pq es un cheackbox
	}

	public void marcar_tematica() {
		ieditor.marcar_tematica(tematica.getIdTematica(), noticia.getId_noticia());
	}
}