package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ocl_proyecto.Periodista;
import ocl_proyecto.PeriodistaDAO;
import ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager;
import ocl_proyecto.Tematica;
import ocl_proyecto.TematicaDAO;

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

	public void marcar_tematica(int aId_Tematica, int aId_noticia) 
		throws PersistentException {
			Tematica tematica = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			tematica = TematicaDAO.getTematicaByORMID(aId_Tematica);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		//	ProyectoPersistentManager.instance().disposePersistentManager();
	}
}