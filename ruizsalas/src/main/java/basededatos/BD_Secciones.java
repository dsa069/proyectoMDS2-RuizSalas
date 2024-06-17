package basededatos;

import java.util.ArrayList;
import java.util.List;
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
	public Bd_Noticias _bd_noticias = new Bd_Noticias();
	public BD_Tematicas _bd_tematicas = new BD_Tematicas();
	public ArrayList<Seccion> _contiene_secciones = new ArrayList<Seccion>();

	public Seccion[] cargar_secciones_seleccion() 
		throws PersistentException {
			Seccion[] seccion = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			seccion = SeccionDAO.listSeccionByQuery(null, null);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
		return seccion;
	}
	
	public Seccion cargar_seccion_primero() 
			throws PersistentException {
				Seccion[] seccion = null;
				PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
			try {
				seccion = SeccionDAO.listSeccionByQuery("Portada  ='"+0+"'", null, null);
				t.commit();
				ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
			} catch (Exception e) {
				t.rollback();
			}
			return seccion[0];
		}
	
	public Seccion cargar_portada() 
			throws PersistentException {
				Seccion seccion = null;
				PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
			try {
				seccion = SeccionDAO.loadSeccionByQuery("Portada  ='"+1+"'", null);
				t.commit();
				ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
			} catch (Exception e) {
				t.rollback();
			}
			return seccion;
		}
	
	public Seccion cargar_seccion_palanteypatras(int aId_seccion, boolean Palanteopatras) 
			throws PersistentException {
				List<Seccion> seccion = null;
				Seccion seccActual= null;
				PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
			try {
				seccion = SeccionDAO.querySeccion("Portada  ='"+0+"'", null, null);
				seccActual = SeccionDAO.getSeccionByORMID(aId_seccion);
				if(seccion.contains(seccActual)) {
					if(Palanteopatras) { 
						if(seccion.indexOf(seccActual) != seccion.size()-1)
							return seccion.get(seccion.indexOf(seccActual)+1);
						else 
							return seccion.get(0);
					}
					else if(!Palanteopatras ) {
						if(seccion.indexOf(seccActual) != 0) 
							return seccion.get(seccion.indexOf(seccActual)-1);
						else
							return seccion.get(seccion.size()-1);
					}
				}
				t.commit();
				ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
			} catch (Exception e) {
				t.rollback();
			}
			return null;
		}
	
	public Seccion cargar_seccion_palanteypatras_portada(int aId_seccion, boolean Palanteopatras) 
			throws PersistentException {
				List<Seccion> seccion = null;
				Seccion seccActual= null;
				PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
			try {
				seccion = SeccionDAO.querySeccion(null, null);
				seccActual = SeccionDAO.getSeccionByORMID(aId_seccion);
				if(seccion.contains(seccActual)) {
					if(Palanteopatras) { 
						if(seccion.indexOf(seccActual) != seccion.size()-1)
							return seccion.get(seccion.indexOf(seccActual)+1);
						else 
							return seccion.get(0);
					}
					else if(!Palanteopatras ) {
						if(seccion.indexOf(seccActual) != 0) 
							return seccion.get(seccion.indexOf(seccActual)-1);
						else
							return seccion.get(seccion.size()-1);
					}
				}
				t.commit();
				ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
			} catch (Exception e) {
				t.rollback();
			}
			return null;
		}

	public Seccion[] cargar_secciones_vista_editor() 
		throws PersistentException {
			Seccion[] seccion = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			seccion = SeccionDAO.listSeccionByQuery(null, null);
		//	for(Seccion secc : seccion) 
		//		_bd_noticias.cargar_secciones_generico(secc.getIdSeccion());
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
		return seccion;
	}

	public Seccion[] cargar_secciones_generico() 
		throws PersistentException {
			Seccion[] seccion = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			seccion = SeccionDAO.listSeccionByQuery("Portada  ='"+0+"'", null, null);
//			for(Seccion secc : seccion) 
//				_bd_noticias.cargar_secciones_generico(secc.getIdSeccion());
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
		return seccion;
	}

	public void marcar_seccion(int aSeccion, int aId_noticia) 
		throws PersistentException {
			Seccion seccion = null;
			Noticia noticia = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			seccion = SeccionDAO.getSeccionByORMID(aSeccion);
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			
			if(!seccion.contiene.contains(noticia))
				seccion.contiene.add(noticia);
			else
				seccion.contiene.remove(noticia);
			SeccionDAO.save(seccion);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}


	public Seccion anadir_seccion(String aNombre) 
		throws PersistentException {
			Seccion seccion = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			seccion = SeccionDAO.createSeccion();
			seccion.setNombre(aNombre);
			SeccionDAO.save(seccion);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
		return seccion;
	}

	public void borrar_seccion(int aIdSecccion)
		throws PersistentException {
			Seccion seccion = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			seccion = SeccionDAO.getSeccionByORMID(aIdSecccion);
			SeccionDAO.deleteAndDissociate(seccion);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
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
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}
}