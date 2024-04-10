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

public class SeccionDAO {
	public static Seccion loadSeccionByORMID(int idSeccion) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadSeccionByORMID(session, idSeccion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion getSeccionByORMID(int idSeccion) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return getSeccionByORMID(session, idSeccion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByORMID(int idSeccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadSeccionByORMID(session, idSeccion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion getSeccionByORMID(int idSeccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return getSeccionByORMID(session, idSeccion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByORMID(PersistentSession session, int idSeccion) throws PersistentException {
		try {
			return (Seccion) session.load(ocl_proyecto.Seccion.class, Integer.valueOf(idSeccion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion getSeccionByORMID(PersistentSession session, int idSeccion) throws PersistentException {
		try {
			return (Seccion) session.get(ocl_proyecto.Seccion.class, Integer.valueOf(idSeccion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByORMID(PersistentSession session, int idSeccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Seccion) session.load(ocl_proyecto.Seccion.class, Integer.valueOf(idSeccion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion getSeccionByORMID(PersistentSession session, int idSeccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Seccion) session.get(ocl_proyecto.Seccion.class, Integer.valueOf(idSeccion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySeccion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return querySeccion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySeccion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return querySeccion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion[] listSeccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return listSeccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion[] listSeccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return listSeccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySeccion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Seccion as Seccion");
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
	
	public static List querySeccion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Seccion as Seccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Seccion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion[] listSeccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySeccion(session, condition, orderBy);
			return (Seccion[]) list.toArray(new Seccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion[] listSeccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySeccion(session, condition, orderBy, lockMode);
			return (Seccion[]) list.toArray(new Seccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadSeccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadSeccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Seccion[] seccions = listSeccionByQuery(session, condition, orderBy);
		if (seccions != null && seccions.length > 0)
			return seccions[0];
		else
			return null;
	}
	
	public static Seccion loadSeccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Seccion[] seccions = listSeccionByQuery(session, condition, orderBy, lockMode);
		if (seccions != null && seccions.length > 0)
			return seccions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSeccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return iterateSeccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSeccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return iterateSeccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSeccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Seccion as Seccion");
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
	
	public static java.util.Iterator iterateSeccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Seccion as Seccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Seccion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion createSeccion() {
		return new ocl_proyecto.Seccion();
	}
	
	public static boolean save(ocl_proyecto.Seccion seccion) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().saveObject(seccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ocl_proyecto.Seccion seccion) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().deleteObject(seccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ocl_proyecto.Seccion seccion)throws PersistentException {
		try {
			ocl_proyecto.Noticia[] lContienes = seccion.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].setPertenece_a(null);
			}
			if (seccion.getEs_una() != null) {
				seccion.getEs_una().setEs_una(null);
			}
			
			return delete(seccion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ocl_proyecto.Seccion seccion, org.orm.PersistentSession session)throws PersistentException {
		try {
			ocl_proyecto.Noticia[] lContienes = seccion.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].setPertenece_a(null);
			}
			if (seccion.getEs_una() != null) {
				seccion.getEs_una().setEs_una(null);
			}
			
			try {
				session.delete(seccion);
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
	
	public static boolean refresh(ocl_proyecto.Seccion seccion) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().refresh(seccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ocl_proyecto.Seccion seccion) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().evict(seccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByCriteria(SeccionCriteria seccionCriteria) {
		Seccion[] seccions = listSeccionByCriteria(seccionCriteria);
		if(seccions == null || seccions.length == 0) {
			return null;
		}
		return seccions[0];
	}
	
	public static Seccion[] listSeccionByCriteria(SeccionCriteria seccionCriteria) {
		return seccionCriteria.listSeccion();
	}
}
