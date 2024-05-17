package basededatos;

import java.util.Vector;
import ocl_proyecto.Noticia;
import java.util.Date;
import ocl_proyecto.Tematica;

public class Bd_Noticias {
	public BD_Principal _bd_cont_noticias;
	public Vector<Noticia> _contiene_noticias = new Vector<Noticia>();

	public Noticia[] cargar_noticias_a_revisar(boolean aAgregada) {
		throw new UnsupportedOperationException();
	}

	public Noticia[] cargar_listar_mis_noticias(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Noticia[] cargar_secciones_generico(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_noticia_propia(int aId_noticia) {
		throw new UnsupportedOperationException();
	}

	public void agregar_noticia(int aId_noticia, boolean aAgregada) {
		throw new UnsupportedOperationException();
	}

	public void no_agregar_noticia(int aId_noticia) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_noticia(int aId_noticia) {
		throw new UnsupportedOperationException();
	}

	public void guardar_cambios_noticia(int aId_noticia, String aTexto_corto, String aTexto_largo, String aTitulo, String aImagen_principal, String aUbicacion, Date aFecha, Tematica[] aTematicas) {
		throw new UnsupportedOperationException();
	}

	public void valorar_noticia(int aIdUsuario, int aId_noticia, boolean aValoracion) {
		throw new UnsupportedOperationException();
	}

	public Noticia[] Buscar(String aBusqueda) {
		throw new UnsupportedOperationException();
	}
}