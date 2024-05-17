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
// import ocl_proyecto.Usuario;

public class BD_Principal implements iEditor, iPeriodista, iUsuario_Registardo, iRegistrado, iUsuario_No_Registrado, iUsuario {
	public BD_Editores _bd_editores;
	public BD_Usuarios_suscritos _bd_us_suscritos;
	public BD_Comentarios _bd_comentarios;
	public BD_Periodistas _bd_periodistas;
	public Bd_Noticias _bd_noticias;
	public BD_Secciones _bd_secciones;
	public BD_Tematicas _bd_tematicas;

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
		throw new UnsupportedOperationException();
	}

	public ocl_proyecto.Periodista[] cargar_periodistas() {
		throw new UnsupportedOperationException();
	}

	public Noticia[] cargar_noticias_a_revisar(boolean aAgregada) {
		throw new UnsupportedOperationException();
	}

	public Seccion[] cargar_secciones_generico() {
		throw new UnsupportedOperationException();
	}

	public void marcar_seccion(int aIdSeccion, int aId_noticia) {
		throw new UnsupportedOperationException();
	}

	public void anadir_seccion(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void borrar_seccion(int aIdSeccion, int aIdTematica) {
		throw new UnsupportedOperationException();
	}

	public void agregar_noticia(int aId_noticia, boolean aAgregada) {
		throw new UnsupportedOperationException();
	}

	public void no_agregar_noticia(int aId_noticia) {
		throw new UnsupportedOperationException();
	}

	public void quitar_noticia_de_seccion(int aId_noticia) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_noticia(int aId_noticia) {
		throw new UnsupportedOperationException();
	}

	public void baja_periodista(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public ocl_proyecto.Periodista registrar_periodista(String aApodo, String aDni, String aCorreo, String aContrasena, String aFoto_de_perfil) {
		throw new UnsupportedOperationException();
	}

	public void marcar_tematica(int aIdTematica, int aId_noticia) {
		throw new UnsupportedOperationException();
	}

	public Tematica[] cargar_tematicas_seleccion() {
		throw new UnsupportedOperationException();
	}

	public void valorar_comentario(int aIdUsuario, int aIdComentario, boolean aValoracion) {
		throw new UnsupportedOperationException();
	}

	public Comentario escribir_comentario(String aTexto) {
		throw new UnsupportedOperationException();
	}

	public void valorar_noticia(int aIdUsuario, int aId_noticia, boolean aValoracion) {
		throw new UnsupportedOperationException();
	}

	public void guardar_cambios(int aIdUsuario, String aApodo, String aDni, String aCorreo, String aContrasena, String aFoto_de_perfil, String aTarjeta_de_credito) {
		throw new UnsupportedOperationException();
	}

	public Tematica[] cargar_tematicas(int aId_noticia) {
		throw new UnsupportedOperationException();
	}

	public Comentario[] cargar_listar_comenatrios(int aId_Noticia) {
		throw new UnsupportedOperationException();
	}

	public Noticia[] Buscar(String aBusqueda) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_noticia_propia(int aId_noticia) {
		throw new UnsupportedOperationException();
	}

	public void guardar_cambios_noticia(int aId_noticia, String aTexto_corto, String aTexto_largo, String aTitulo, String aImagen_principal, String aUbicacion, Date aFecha, Tematica[] aTematicas) {
		throw new UnsupportedOperationException();
	}

	public void cancelar_cobro_suscripcion(String aApodo, String aDni, String aCorreo, String aTarjeta_de_credito) {
		throw new UnsupportedOperationException();
	}

	public void cancelar_cobro_suscripcion(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void enviar_Correo_Confirmacion(String aApodo, String aDni, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void gestionar_Transaccion(String aApodo, String aDni, String aCorreo, String aTarjeta_de_credito) {
		throw new UnsupportedOperationException();
	}

	public void enviar_Correo_Confirmacion() {
		throw new UnsupportedOperationException();
	}

	public ocl_proyecto.Usuario gestionar_Transaccion(String aCorreo, String aContrasena, String aApodo, String aFoto_de_perfil, String aDni, String aTarjeta_de_credito) {
		throw new UnsupportedOperationException();
	}

	public ocl_proyecto.Usuario confirmar_Datos(String aCorreo, String aContrasena) {
		throw new UnsupportedOperationException();
	}
}