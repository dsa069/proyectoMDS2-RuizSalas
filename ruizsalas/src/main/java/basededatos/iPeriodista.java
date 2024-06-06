package basededatos;

import java.util.Date;

import interfaz.Noticia;
import ocl_proyecto.Tematica;

public interface iPeriodista extends iRegistrado {

	public void eliminar_noticia_propia(int aId_noticia);

	public void guardar_cambios_noticia(int aId_noticia, String aTexto_corto, String aTexto_largo, String aTitulo, String aImagen_principal, String aUbicacion, Date aFecha, Tematica[] aTematicas, int aId_Usuario);

	public ocl_proyecto.Noticia[] cargar_listar_mis_noticias(int aIdUsuario);
}