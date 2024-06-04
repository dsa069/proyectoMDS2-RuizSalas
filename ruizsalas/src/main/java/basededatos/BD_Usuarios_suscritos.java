package basededatos;

import java.util.Vector;
import ocl_proyecto.Usuario_suscrito_;
import ocl_proyecto.Usuario;

public class BD_Usuarios_suscritos {
	public BD_Principal _bd_cont_us_suscritos;
	public Vector<Usuario_suscrito_> _contiene_usuarios_suscritos = new Vector<Usuario_suscrito_>();

	public void cancelar_cobro_suscripcion(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario crear_Usuario(String aCorreo, String aContrasena, String aApodo, String aFoto_de_perfil, String aDni, int aTarjeta_de_credito) {
		throw new UnsupportedOperationException();
	}

	public Usuario confirmar_Datos_US(String aCorreo, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void guardar_cambios_US(int aIdUsuario, String aApodo, String aDni, String aCorreo, String aContrasena, String aFoto_de_perfil, int aTarjeta_de_credito) {
		throw new UnsupportedOperationException();
	}
}