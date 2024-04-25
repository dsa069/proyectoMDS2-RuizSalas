package interfaz;

import vistas.VistaVervaloracion;

public class ver_valoracion extends VistaVervaloracion {
	
	public Usuario usuario;
	public ver_valoracion(Usuario usuario, ocl_proyecto.Valoracion valoracion) {
		super();
		this.usuario = usuario;
//		this.getLayoutVisualizarValoracion().setText(valoracion.getNum_dislikes()); Como vemos el resumen global de valoraciones
	}
	
}