/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Carlos Ruiz(University of Almeria)
 * License Type: Academic
 */
package ocl_proyecto;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class NoticiaDAO {
	public static Noticia loadNoticiaByORMID(int id_valoracion) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadNoticiaByORMID(session, id_valoracion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(int id_valoracion) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return getNoticiaByORMID(session, id_valoracion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByORMID(int id_valoracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadNoticiaByORMID(session, id_valoracion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(int id_valoracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return getNoticiaByORMID(session, id_valoracion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByORMID(PersistentSession session, int id_valoracion) throws PersistentException {
		try {
			return (Noticia) session.load(ocl_proyecto.Noticia.class, Integer.valueOf(id_valoracion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(PersistentSession session, int id_valoracion) throws PersistentException {
		try {
			return (Noticia) session.get(ocl_proyecto.Noticia.class, Integer.valueOf(id_valoracion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByORMID(PersistentSession session, int id_valoracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Noticia) session.load(ocl_proyecto.Noticia.class, Integer.valueOf(id_valoracion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(PersistentSession session, int id_valoracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Noticia) session.get(ocl_proyecto.Noticia.class, Integer.valueOf(id_valoracion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return queryNoticia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return queryNoticia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return listNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return listNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Noticia", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryNoticia(session, condition, orderBy);
			return (Noticia[]) list.toArray(new Noticia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryNoticia(session, condition, orderBy, lockMode);
			return (Noticia[]) list.toArray(new Noticia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Noticia[] noticias = listNoticiaByQuery(session, condition, orderBy);
		if (noticias != null && noticias.length > 0)
			return noticias[0];
		else
			return null;
	}
	
	public static Noticia loadNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Noticia[] noticias = listNoticiaByQuery(session, condition, orderBy, lockMode);
		if (noticias != null && noticias.length > 0)
			return noticias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return iterateNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return iterateNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Noticia", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia createNoticia() {
		return new ocl_proyecto.Noticia();
	}
	
	public static boolean save(ocl_proyecto.Noticia noticia) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().saveObject(noticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ocl_proyecto.Noticia noticia) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().deleteObject(noticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ocl_proyecto.Noticia noticia)throws PersistentException {
		try {
			if (noticia.getAutor() != null) {
				noticia.getAutor().publica.remove(noticia);
			}
			
			if (noticia.getPertenece_a() != null) {
				noticia.getPertenece_a().contiene.remove(noticia);
			}
			
			ocl_proyecto.Tematica[] lContienes = noticia.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].está_en.remove(noticia);
			}
			ocl_proyecto.Comentario[] lTienes = noticia.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].setComenta(null);
			}
			ocl_proyecto.Usuario[] lEs_valorado_pors = noticia.es_valorado_por.toArray();
			for(int i = 0; i < lEs_valorado_pors.length; i++) {
				lEs_valorado_pors[i].realiza.remove(noticia);
			}
			return delete(noticia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ocl_proyecto.Noticia noticia, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (noticia.getAutor() != null) {
				noticia.getAutor().publica.remove(noticia);
			}
			
			if (noticia.getPertenece_a() != null) {
				noticia.getPertenece_a().contiene.remove(noticia);
			}
			
			ocl_proyecto.Tematica[] lContienes = noticia.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].está_en.remove(noticia);
			}
			ocl_proyecto.Comentario[] lTienes = noticia.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].setComenta(null);
			}
			ocl_proyecto.Usuario[] lEs_valorado_pors = noticia.es_valorado_por.toArray();
			for(int i = 0; i < lEs_valorado_pors.length; i++) {
				lEs_valorado_pors[i].realiza.remove(noticia);
			}
			try {
				session.delete(noticia);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(ocl_proyecto.Noticia noticia) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().refresh(noticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ocl_proyecto.Noticia noticia) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().evict(noticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByCriteria(NoticiaCriteria noticiaCriteria) {
		Noticia[] noticias = listNoticiaByCriteria(noticiaCriteria);
		if(noticias == null || noticias.length == 0) {
			return null;
		}
		return noticias[0];
	}
	
	public static Noticia[] listNoticiaByCriteria(NoticiaCriteria noticiaCriteria) {
		return noticiaCriteria.listNoticia();
	}
}
