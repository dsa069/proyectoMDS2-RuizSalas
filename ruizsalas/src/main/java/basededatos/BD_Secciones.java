package basededatos;

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

public class BD_Secciones {
	public BD_Principal _bd_cont_secciones;
	public BD_Tematicas _bd_tematicas = new BD_Tematicas();
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

	public void marcar_seccion(Seccion[] aSeccion, int aId_noticia) 
		throws PersistentException {
			Seccion seccion = null;
			Noticia noticia = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			//seccion = SeccionDAO.getSeccionByORMID(aIdSeccion);
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			
			if(!seccion.contiene.contains(noticia))
				seccion.contiene.add(noticia);
			else
				seccion.contiene.remove(noticia);
			SeccionDAO.save(seccion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		//	ProyectoPersistentManager.instance().disposePersistentManager();
	}


	public void anadir_seccion(String aNombre) 
		throws PersistentException {
			Seccion seccion = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			seccion = SeccionDAO.createSeccion();
			seccion.setNombre(aNombre);
			SeccionDAO.save(seccion);
			_bd_tematicas.anadir_seccion(aNombre, seccion.getIdSeccion());
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		//	ProyectoPersistentManager.instance().disposePersistentManager();
	}

	public void borrar_seccion(int aIdSecccion, int aIdTematica)
		throws PersistentException {
			Seccion seccion = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			seccion = SeccionDAO.getSeccionByORMID(aIdSecccion);
			SeccionDAO.deleteAndDissociate(seccion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		//	ProyectoPersistentManager.instance().disposePersistentManager();
	}

	public void quitar_noticia_de_seccion(int aId_noticia, int aIdSeccion) 
		throws PersistentException {
			Seccion seccion = null;
			Noticia noticia = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			seccion = SeccionDAO.getSeccionByORMID(aIdSeccion);
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			seccion.contiene.remove(noticia);
			SeccionDAO.save(seccion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		//	ProyectoPersistentManager.instance().disposePersistentManager();	}
	}
}