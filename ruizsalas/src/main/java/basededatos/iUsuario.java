package basededatos;

import ocl_proyecto.Tematica;
import ocl_proyecto.Usuario;
import ocl_proyecto.Comentario;
import ocl_proyecto.Noticia;
import ocl_proyecto.Seccion;

public interface iUsuario {

	public Tematica[] cargar_tematicas(int aId_noticia);

	public Comentario[] cargar_listar_comenatrios(int aId_Noticia);
	
	public Seccion[] cargar_secciones_generico();
	
	public Noticia[] cargar_noticias_secciones(int aIdSeccion);
	
	public Noticia[] cargar_noticias();
	
	public Noticia[] cargar_noticias_portada(); 
	
	public int cargar_valoracion(int aIdValoracion);

	public Noticia[] Buscar(String aBusqueda);
	
	public Usuario cargar_usuario_comentario(int aId_comentario);
	
	public Seccion cargar_seccion_palanteypatras(int aId_seccion, boolean aPalanteopatras);
	
	public Seccion cargar_seccion_primero();

}