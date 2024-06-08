package basededatos;

import ocl_proyecto.Tematica;
import ocl_proyecto.Comentario;
import ocl_proyecto.Noticia;
import ocl_proyecto.Seccion;

public interface iUsuario {

	public Tematica[] cargar_tematicas(int aId_noticia);

	public Comentario[] cargar_listar_comenatrios(int aId_Noticia);
	
	public Seccion[] cargar_secciones_generico();
	
	public Noticia[] cargar_noticias_secciones(int IdSeccion);
	
	public Noticia[] cargar_noticias();
	
	public Noticia[] cargar_noticias_portada(); 

	public Noticia[] Buscar(String aBusqueda);
}