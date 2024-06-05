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
		try {
			return _bd_secciones.cargar_secciones_seleccion();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ocl_proyecto.Periodista[] cargar_periodistas() {
		try {
			return _bd_periodistas.cargar_periodistas();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Noticia[] cargar_noticias_a_revisar(boolean aAgregada) {
		try {
			return _bd_noticias.cargar_noticias_a_revisar(aAgregada);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Seccion[] cargar_secciones_generico() {
		try {
			return _bd_secciones.cargar_secciones_generico();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void marcar_seccion(Seccion[] aSeccion, int aId_noticia) {
		try {
			_bd_secciones.marcar_seccion(aSeccion, aId_noticia);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void anadir_seccion(String aNombre) {
		try {
			_bd_secciones.anadir_seccion(aNombre);
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

	public void quitar_noticia_de_seccion(int aId_noticia, int aIdSeccion ) {
		try {
			_bd_secciones.quitar_noticia_de_seccion(aId_noticia, aIdSeccion);
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
			return _bd_periodistas.registrar_periodista(aApodo, aDni, aCorreo, aContrasena, aFoto_de_perfil);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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
			return _bd_tematicas.cargar_tematicas_seleccion();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void valorar_comentario(int aIdUsuario, int aIdComentario, boolean aValoracion) {
		try {
			_bd_comentarios.valorar_comentario(aIdUsuario, aIdComentario, aValoracion);;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Comentario escribir_comentario(String aTexto, int aIdUsuario) {
		try {
			return _bd_comentarios.escribir_comentario(aTexto, aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void valorar_noticia(int aIdUsuario, int aId_noticia, boolean aValoracion) {
		try {
			_bd_noticias.valorar_noticia(aIdUsuario, aId_noticia, aValoracion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void guardar_cambios(int aIdUsuario, String aApodo, String aDni, String aCorreo, String aContrasena, String aFoto_de_perfil, int aTarjeta_de_credito) {
		try {
			_bd_editores.guardar_cambios_Editor(aIdUsuario, aApodo, aDni, aCorreo, aContrasena, aFoto_de_perfil);
			_bd_periodistas.guardar_cambios_Periodista(aIdUsuario, aApodo, aDni, aCorreo, aContrasena, aFoto_de_perfil);
			_bd_us_suscritos.guardar_cambios_US(aIdUsuario, aApodo, aDni, aCorreo, aContrasena, aFoto_de_perfil, aTarjeta_de_credito);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Tematica[] cargar_tematicas(int aId_noticia) {
		try {
			return _bd_tematicas.cargar_tematicas(aId_noticia);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//HOMEMADE
	public Noticia[] cargar_lista_mis_noticias(int aIdUsuario) {
		try {
			return _bd_noticias.cargar_lista_mis_noticias(aIdUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public Comentario[] cargar_listar_comenatrios(int aId_Noticia) {
		try {
			return _bd_comentarios.cargar_listar_comenatrios(aId_Noticia);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Noticia[] Buscar(String aBusqueda) {
		try {
			return _bd_noticias.Buscar(aBusqueda);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void eliminar_noticia_propia(int aId_noticia) {
		try {
			_bd_noticias.eliminar_noticia_propia(aId_noticia);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void guardar_cambios_noticia(int aId_noticia, String aTexto_corto, String aTexto_largo, String aTitulo, String aImagen_principal, String aUbicacion, Date aFecha, Tematica[] aTematicas) {
		try {
			_bd_noticias.guardar_cambios_noticia(aId_noticia, aTexto_corto, aTexto_largo, aTitulo, aImagen_principal, aUbicacion, aFecha, aTematicas);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cancelar_cobro_suscripcion(String aApodo, String aDni, String aCorreo, int aTarjeta_de_credito) {

	}

	public void cancelar_cobro_suscripcion(int aIdUsuario) {

	}

	public void enviar_Correo_Confirmacion(String aApodo, String aDni, String aCorreo) {

	}

	public void gestionar_Transaccion(String aApodo, String aDni, String aCorreo, int aTarjeta_de_credito) {

	}

	public void enviar_Correo_Confirmacion() {
		
		}

	public ocl_proyecto.Usuario gestionar_Transaccion(String aCorreo, String aContrasena, String aApodo, int aFoto_de_perfil, String aDni, String aTarjeta_de_credito) {
		try {
			return _bd_us_suscritos.crear_Usuario(aCorreo, aContrasena, aApodo, aTarjeta_de_credito, aDni, aFoto_de_perfil);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return null;
	}

	public ocl_proyecto.Usuario confirmar_Datos(String aCorreo, String aContrasena) {
		try {
			return _bd_editores.confirmar_Datos_Editor(aCorreo, aContrasena);
			return _bd_periodistas.confirmar_Datos_Periodista(aCorreo, aContrasena);
			return _bd_us_suscritos.confirmar_Datos_US(aCorreo, aContrasena);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return null;
	}
}