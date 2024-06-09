package interfaz;
import vistas.*;
public class Editar_datos extends Introducir_datos_registro {
	public Editar_Perfil _contiene;
	public  Registrado registrado;
	
	public Editar_datos(Registrado registrado, ocl_proyecto.Usuario user) {
		super(registrado, user);
		this.registrado = registrado;
		this.getFotoTextamen().setVisible(false);
		this.getEditarPerfil().setVisible(true);
	}
}