package basededatos;

import java.util.Vector;
import ocl_proyecto.Editor;
import ocl_proyecto.Usuario;

public class BD_Editores {
	public BD_Principal _bd_cont_editores;
	public Vector<Editor> _contiene_editores = new Vector<Editor>();

	public Usuario confirmar_Datos_Editor(String aCorreo, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void guardar_cambios_Editor(int aIdUsuario, String aApodo, String aDni, String aCorreo, String aContrasena, String aFoto_de_perfil) {
		throw new UnsupportedOperationException();
	}
}