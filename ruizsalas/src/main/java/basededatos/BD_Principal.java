package basededatos;

import interfaz.Editor;
import interfaz.Registrado;
// import interfaz.Usuario;
// import interfaz.Periodista;
import interfaz.Usuario_Registardo;
import interfaz.Usuario_No_Registrado;
import ocl_proyecto.Seccion;
// import ocl_proyecto.Periodista;
import ocl_proyecto.Noticia;
import ocl_proyecto.Tematica;
import ocl_proyecto.Comentario;
import java.util.Date;

import org.orm.PersistentException;
// import ocl_proyecto.Usuario;

public class BD_Principal implements iEditor, iPeriodista, iUsuario_Registardo, iRegistrado, iUsuario_No_Registrado, iUsuario {
	public BD_Editores _bd_editores = new BD_Editores();
	public BD_Usuarios_suscritos _bd_us_suscritos = new BD_Usuarios_suscritos();
	public BD_Comentarios _bd_comentarios = new BD_Comentarios();
	public BD_Periodistas _bd_periodistas = new BD_Periodistas();
	public Bd_Noticias _bd_noticias = new Bd_Noticias();
	public BD_Secciones _bd_secciones = new BD_Secciones();
	public BD_Tematicas _bd_tematicas = new BD_Tematicas();

	public Editor get_Editor() {
		throw new UnsupportedOperationException();
	}

	public Registrado get_Registrado() {
		throw new UnsupportedOperationException();
	}

	public interfaz.Usuario get_Usuario() {
		throw new UnsupportedOperationException();
	}

	public interfaz.Periodista get_Periodista() {
		throw new UnsupportedOperationException();
	}

	public Usuario_Registardo get_Usuario_Registardo() {
		throw new UnsupportedOperationException();
	}

	public Usuario_No_Registrado get_Usuario_No_Registrado() {
		throw new UnsupportedOperationException();
	}

	public Seccion[] cargar_secciones_seleccion() {
		throw new UnsupportedOperationException(); //NOSE SI HACE FALTA, SE VERÁ
	}

	public ocl_proyecto.Periodista[] cargar_periodistas() {
		try {
			_bd_periodistas.cargar_periodistas();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Noticia[] cargar_noticias_a_revisar(boolean aAgregada) {
		try {
			_bd_noticias.cargar_noticias_a_revisar(aAgregada);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Seccion[] cargar_secciones_generico() {
		try {
			_bd_secciones.marcar_seccion(aIdSeccion, aId_noticia);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void marcar_seccion(int aIdSeccion, int aId_noticia) {
		try {
			_bd_secciones.marcar_seccion(aIdSeccion, aId_noticia);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void anadir_seccion(String aNombre) {
		try {
			_bd_secciones.anadir_seccion(aNombre);
			_bd_tematicas.anadir_seccion(aNombre);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void borrar_seccion(int aIdSeccion, int aIdTematica) {
		try {
			_bd_secciones.borrar_seccion(aIdSeccion, aIdTematica);
			_bd_tematicas.borrar_seccion(aIdSeccion, aIdTematica);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void agregar_noticia(int aId_noticia, boolean aAgregada) {
		try {
			_bd_noticias.agregar_noticia(aId_noticia, aAgregada);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void no_agregar_noticia(int aId_noticia) {
		try {
			_bd_noticias.no_agregar_noticia(aId_noticia);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void quitar_noticia_de_seccion(int aId_noticia) {
		try {
			_bd_secciones.quitar_noticia_de_seccion(aId_noticia);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminar_noticia(int aId_noticia) {
		try {
			_bd_noticias.eliminar_noticia(aId_noticia);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void baja_periodista(int aIdUsuario) {
	try {
		_bd_periodistas.baja_periodista(aIdUsuario);
	} catch (PersistentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	public ocl_proyecto.Periodista registrar_periodista(String aApodo, String aDni, String aCorreo, String aContrasena, String aFoto_de_perfil) {
		try {
			_bd_periodistas.baja_periodista(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void marcar_tematica(int aIdTematica, int aId_noticia) {
		try {
			_bd_tematicas.marcar_tematica(aIdTematica, aId_noticia);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Tematica[] cargar_tematicas_seleccion() {
		try {
			_bd_periodistas.baja_periodista(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void valorar_comentario(int aIdUsuario, int aIdComentario, boolean aValoracion) {
		try {
			_bd_periodistas.baja_periodista(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Comentario escribir_comentario(String aTexto) {
		try {
			_bd_periodistas.baja_periodista(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void valorar_noticia(int aIdUsuario, int aId_noticia, boolean aValoracion) {
		try {
			_bd_noticias.valorar_noticia(aIdUsuario, aId_noticia, aValoracion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void guardar_cambios(int aIdUsuario, String aApodo, String aDni, String aCorreo, String aContrasena, String aFoto_de_perfil, String aTarjeta_de_credito) {
		try {
			_bd_periodistas.baja_periodista(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Tematica[] cargar_tematicas(int aId_noticia) {
		try {
			_bd_periodistas.baja_periodista(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Comentario[] cargar_listar_comenatrios(int aId_Noticia) {
		try {
			_bd_periodistas.baja_periodista(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Noticia[] Buscar(String aBusqueda) {
		try {
			_bd_periodistas.baja_periodista(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminar_noticia_propia(int aId_noticia) {
		try {
			_bd_periodistas.baja_periodista(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void guardar_cambios_noticia(int aId_noticia, String aTexto_corto, String aTexto_largo, String aTitulo, String aImagen_principal, String aUbicacion, Date aFecha, Tematica[] aTematicas) {
		try {
			_bd_periodistas.baja_periodista(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cancelar_cobro_suscripcion(String aApodo, String aDni, String aCorreo, String aTarjeta_de_credito) {
		try {
			_bd_periodistas.baja_periodista(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cancelar_cobro_suscripcion(int aIdUsuario) {
		try {
			_bd_periodistas.baja_periodista(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enviar_Correo_Confirmacion(String aApodo, String aDni, String aCorreo) {
		try {
			_bd_periodistas.baja_periodista(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void gestionar_Transaccion(String aApodo, String aDni, String aCorreo, String aTarjeta_de_credito) {
		try {
			_bd_periodistas.baja_periodista(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enviar_Correo_Confirmacion() {
		try {
			_bd_periodistas.baja_periodista(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}

	public ocl_proyecto.Usuario gestionar_Transaccion(String aCorreo, String aContrasena, String aApodo, String aFoto_de_perfil, String aDni, String aTarjeta_de_credito) {
		try {
			_bd_periodistas.baja_periodista(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}

	public ocl_proyecto.Usuario confirmar_Datos(String aCorreo, String aContrasena) {
		try {
			_bd_periodistas.baja_periodista(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}
}