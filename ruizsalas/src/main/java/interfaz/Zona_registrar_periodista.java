package interfaz;
import vistas.*;
public class Zona_registrar_periodista extends Introducir_Datos{

	public  Usuario usuario;

	public Zona_registrar_periodista(Usuario usuario, ocl_proyecto.Usuario user) {
		super(usuario, user);
		this.usuario = usuario;
		this.getZonaRegistrarPeriodista().setVisible(true);
		this.getFotoTextamen().setVisible(true);
	}
}