package interfaz;

import vistas.VistaVervaloracion;

public class ver_valoracion extends VistaVervaloracion {
	
	public Usuario usuario;
	public ver_valoracion(Usuario usuario, ocl_proyecto.Valoracion valoracion) {
		super();
		this.usuario = usuario;
//		this.getLayoutVisualizarValoracion().setText("" + String.valueOf(valoracion.getNum_likes())); //Como vemos el resumen global de valoraciones
//		int total = valoracion.getNum_likes() + valoracion.getNum_dislikes();
//		int pocentajeLikes = (total == 0) ? 0 : (valoracion.getNum_likes() / (total)) * 100;
//		this.getLayoutVisualizarValoracion().setText(String.valueOf(pocentajeLikes));
	}
	
}