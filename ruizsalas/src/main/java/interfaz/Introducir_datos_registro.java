package interfaz;
import vistas.*;

public class Introducir_datos_registro extends Zona_registrar_periodista {
	public  Usuario usuario;
	ocl_proyecto.Usuario usu;
	public Introducir_datos_registro(Usuario usuario, ocl_proyecto.Usuario user) {
		super(usuario, user);
		this.usuario = usuario;
		this.usu = user;
		this.getDatosRegistro().setVisible(true);
	}	
}