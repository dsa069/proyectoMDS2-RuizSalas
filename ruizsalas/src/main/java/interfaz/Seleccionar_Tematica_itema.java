package interfaz;

import vistas.*;

public class Seleccionar_Tematica_itema extends VistaSeleccionartematica_item {
//	private JCheckBox _marcar_tematica;
//	private JLabel _nombre_tematica;
	public Seleccionar_Tematica _seleccionar_Tematica;
	ocl_proyecto.Tematica tematica;
	public Seleccionar_Tematica_itema(Seleccionar_Tematica _seleccionar_Tematica, ocl_proyecto.Tematica tematica) {
		super();
		this._seleccionar_Tematica = _seleccionar_Tematica;
		//this.getNombre().setNombre(tematica.getNombre());
	}

	public void marcar_tematica() {
		throw new UnsupportedOperationException();
	}
}