package basededatos;

import java.util.Vector;
import ocl_proyecto.Tematica;

public class BD_Tematicas {
	public BD_Principal _bd_cont_tematica;
	public Vector<Tematica> _contiene_tematicas = new Vector<Tematica>();

	public Tematica[] cargar_tematicas_seleccion() {
		throw new UnsupportedOperationException();
	}

	public Tematica[] cargar_tematicas(int aId_noticia) {
		throw new UnsupportedOperationException();
	}

	public void anadir_seccion(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void borrar_seccion(int aIdSeccion, int aIdTematica) {
		throw new UnsupportedOperationException();
	}

	public void marcar_tematica(int aId_Tematica, int aId_noticia) {
		throw new UnsupportedOperationException();
	}
}