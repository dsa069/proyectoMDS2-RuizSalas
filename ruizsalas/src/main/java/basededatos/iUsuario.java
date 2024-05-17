package basededatos;

import ocl_proyecto.Tematica;
import ocl_proyecto.Comentario;
import ocl_proyecto.Noticia;

public interface iUsuario {

	public Tematica[] cargar_tematicas(int aId_noticia);

	public Comentario[] cargar_listar_comenatrios(int aId_Noticia);

	public Noticia[] Buscar(String aBusqueda);
}