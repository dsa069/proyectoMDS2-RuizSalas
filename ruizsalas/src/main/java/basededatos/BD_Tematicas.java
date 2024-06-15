package basededatos;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ocl_proyecto.Noticia;
import ocl_proyecto.NoticiaDAO;
import ocl_proyecto.Periodista;
import ocl_proyecto.PeriodistaDAO;
import ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager;
import ocl_proyecto.Seccion;
import ocl_proyecto.SeccionDAO;
import ocl_proyecto.Tematica;
import ocl_proyecto.TematicaDAO;

public class BD_Tematicas {
	public BD_Principal _bd_cont_tematica;
	public ArrayList<Tematica> _contiene_tematicas = new ArrayList<Tematica>();

	public Tematica[] cargar_tematicas_seleccion() 		
	throws PersistentException {
		Tematica[] tematica = null;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
	try {
		tematica = TematicaDAO.listTematicaByQuery(null, null);
		t.commit();
		ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
	} catch (Exception e) {
		t.rollback();
	}
		return tematica;
	}

	public Tematica[] cargar_tematicas(int aId_noticia)
	throws PersistentException {
		Tematica[] tematicas = null;
		ArrayList<Tematica> tematicasNoticia = new ArrayList<Tematica>();
		Noticia noticia = null;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
	try {
		noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
		tematicas = TematicaDAO.listTematicaByQuery(null, null);
		for(Tematica tematica : tematicas) {
			if(noticia.contiene.contains(tematica))
				tematicasNoticia.add(tematica);
		}
		t.commit();
		ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
	} catch (Exception e) {
		t.rollback();
	}
		return tematicasNoticia.toArray(new Tematica[0]);
	}

	public void anadir_seccion(String aNombre, int aIdSeccion) 
		throws PersistentException {
			Tematica tematica = null;
			Seccion seccion = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			seccion = SeccionDAO.getSeccionByORMID(aIdSeccion);
			tematica = TematicaDAO.createTematica();
			tematica.setNombre(aNombre);
			tematica.setEs_una(seccion);
			seccion.setEs_una(tematica);
			TematicaDAO.save(tematica);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();

		} catch (Exception e) {
			t.rollback();
		}
	}

	public void borrar_seccion(int aIdTematica)
		throws PersistentException {
			Tematica tematica = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			tematica = TematicaDAO.getTematicaByORMID(aIdTematica);
			TematicaDAO.deleteAndDissociate(tematica);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void marcar_tematica(int aId_Tematica, int aId_noticia) 
		throws PersistentException {
			Tematica tematica = null;
			Noticia noticia = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			tematica = TematicaDAO.getTematicaByORMID(aId_Tematica);
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			if(!tematica.esta_en.contains(noticia))
				tematica.esta_en.add(noticia);
			else
				tematica.esta_en.remove(noticia);
			TematicaDAO.save(tematica);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}
}