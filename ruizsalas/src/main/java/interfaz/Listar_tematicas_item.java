package interfaz;
import vistas.*;
import ocl_proyecto.*;

public class Listar_tematicas_item extends VistaListartematicas_item {
//	private JLabel _nombre_tematica;
	ocl_proyecto.Tematica tematica;
	public Listar_tematicas _listar_tematicas;
	public Listar_tematicas_item(Listar_tematicas _listar_tematicas,  ocl_proyecto.Tematica tematica) {
		super();
		this._listar_tematicas = _listar_tematicas;
		this.getLayoutNombredelaTematica().setText(tematica.getNombre());
	}
}