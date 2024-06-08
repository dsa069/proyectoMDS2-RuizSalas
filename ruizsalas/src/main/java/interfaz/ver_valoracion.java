package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iUsuario;
import ocl_proyecto.Valoracion;
import vistas.VistaVervaloracion;

public class ver_valoracion extends VistaVervaloracion {
	
	public Usuario usuario;
	
	ocl_proyecto.Valoracion valorar;
	
	iUsuario iUsu = new BD_Principal();
	
	public ver_valoracion(Usuario usuario, ocl_proyecto.Valoracion valoracion) {
		super();
		this.usuario = usuario;
		this.valorar = valoracion;
		this.getLayoutVisualizarValoracion().setText("" + String.valueOf(this.cargar_valoracion())); //Como vemos el resumen global de valoraciones
		
	}
	
	public int cargar_valoracion() {
		return iUsu.cargar_valoracion(valorar.getId_valoracion());
	}
	
}