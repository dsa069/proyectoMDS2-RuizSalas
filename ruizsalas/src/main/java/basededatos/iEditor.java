package basededatos;

import ocl_proyecto.Seccion;
import ocl_proyecto.Periodista;
import ocl_proyecto.Noticia;

public interface iEditor extends iRegistrado {

	public Seccion[] cargar_secciones_seleccion(int aId_noticia);

	public Periodista[] cargar_periodistas();

	public Noticia[] cargar_noticias_a_revisar();

	public void marcar_seccion(int aIdSeccion, int aId_noticia);

	public void anadir_seccion(String aNombre);

	public void borrar_seccion(int aIdSeccion);

	public void agregar_noticia(int aId_noticia);

	public void no_agregar_noticia(int aId_noticia);

	public void quitar_noticia_de_seccion(int aId_noticia, int aIdSeccion);

	public void eliminar_noticia(int aId_noticia);

	public void baja_periodista(int aIdUsuario);

	public Periodista registrar_periodista(String aApodo, String aDni, String aCorreo, String aContrasena, String aFoto_de_perfil);

	public void marcar_tematica(int aIdTematica, int aId_noticia);

	public void borrar_comentario(int id_valoracion);
	
	public Seccion cargar_seccion_palanteypatras_portada(int aId_seccion, boolean Palanteopatras);
	
	public Seccion cargar_portada();
	
	public Seccion[] cargar_secciones_vista_editor(); 
	
	public void ordenar_portada(int aId_noticia, boolean orden);
}