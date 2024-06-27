package basededatos;

import ocl_proyecto.Tematica;
import ocl_proyecto.Comentario;

public interface iRegistrado extends iUsuario {

	public Tematica[] cargar_tematicas_seleccion();

	public void valorar_comentario(int aIdUsuario, int aIdComentario, boolean aValoracion);

	public Comentario escribir_comentario(String aTexto, int aIdUsuario, int aId_noticia);

	public void valorar_noticia(int aIdUsuario, int aId_noticia, boolean aValoracion);

	public void guardar_cambios(int aIdUsuario, String aApodo, String aDni, String aCorreo, String aContrasena, String aFoto_de_perfil, long aTarjeta_de_credito);
}