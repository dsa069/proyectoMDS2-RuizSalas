package basededatos;

import java.util.Vector;
import ocl_proyecto.Seccion;

public class BD_Secciones {
	public BD_Principal _bd_cont_secciones;
	public Vector<Seccion> _contiene_secciones = new Vector<Seccion>();

	public Seccion[] cargar_secciones_seleccion() {
		throw new UnsupportedOperationException();
	}

	public Seccion[] cargar_secciones_vista_editor() {
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

	public void borrar_seccion(int aIdSecccion, int aIdTematica) {
		throw new UnsupportedOperationException();
	}

	public void quitar_noticia_de_seccion(int aId_noticia) {
		throw new UnsupportedOperationException();
	}
}