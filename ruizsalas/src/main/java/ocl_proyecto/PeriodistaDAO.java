/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Daniel Salas(University of Almeria)
 * License Type: Academic
 */
package ocl_proyecto;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class PeriodistaDAO {
	public static Periodista loadPeriodistaByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadPeriodistaByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista getPeriodistaByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return getPeriodistaByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadPeriodistaByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista getPeriodistaByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return getPeriodistaByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Periodista) session.load(ocl_proyecto.Periodista.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista getPeriodistaByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Periodista) session.get(ocl_proyecto.Periodista.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Periodista) session.load(ocl_proyecto.Periodista.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista getPeriodistaByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Periodista) session.get(ocl_proyecto.Periodista.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodista(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return queryPeriodista(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodista(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return queryPeriodista(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista[] listPeriodistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return listPeriodistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista[] listPeriodistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return listPeriodistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodista(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Periodista as Periodista");
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
	
	public static List queryPeriodista(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Periodista as Periodista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Periodista", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista[] listPeriodistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPeriodista(session, condition, orderBy);
			return (Periodista[]) list.toArray(new Periodista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista[] listPeriodistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPeriodista(session, condition, orderBy, lockMode);
			return (Periodista[]) list.toArray(new Periodista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadPeriodistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadPeriodistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Periodista[] periodistas = listPeriodistaByQuery(session, condition, orderBy);
		if (periodistas != null && periodistas.length > 0)
			return periodistas[0];
		else
			return null;
	}
	
	public static Periodista loadPeriodistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Periodista[] periodistas = listPeriodistaByQuery(session, condition, orderBy, lockMode);
		if (periodistas != null && periodistas.length > 0)
			return periodistas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePeriodistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return iteratePeriodistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePeriodistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return iteratePeriodistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePeriodistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Periodista as Periodista");
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
	
	public static java.util.Iterator iteratePeriodistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Periodista as Periodista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Periodista", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista createPeriodista() {
		return new ocl_proyecto.Periodista();
	}
	
	public static boolean save(ocl_proyecto.Periodista periodista) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().saveObject(periodista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ocl_proyecto.Periodista periodista) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().deleteObject(periodista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ocl_proyecto.Periodista periodista)throws PersistentException {
		try {
			ocl_proyecto.Noticia[] lPublicas = periodista.publica.toArray();
			for(int i = 0; i < lPublicas.length; i++) {
				lPublicas[i].setAutor(null);
			}
			ocl_proyecto.Comentario[] lEscribes = periodista.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setAutor(null);
			}
			ocl_proyecto.Valoracion[] lRealizas = periodista.realiza.toArray();
			for(int i = 0; i < lRealizas.length; i++) {
				lRealizas[i].es_valorado_por.remove(periodista);
			}
			return delete(periodista);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ocl_proyecto.Periodista periodista, org.orm.PersistentSession session)throws PersistentException {
		try {
			ocl_proyecto.Noticia[] lPublicas = periodista.publica.toArray();
			for(int i = 0; i < lPublicas.length; i++) {
				lPublicas[i].setAutor(null);
			}
			ocl_proyecto.Comentario[] lEscribes = periodista.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setAutor(null);
			}
			ocl_proyecto.Valoracion[] lRealizas = periodista.realiza.toArray();
			for(int i = 0; i < lRealizas.length; i++) {
				lRealizas[i].es_valorado_por.remove(periodista);
			}
			try {
				session.delete(periodista);
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
	
	public static boolean refresh(ocl_proyecto.Periodista periodista) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().refresh(periodista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ocl_proyecto.Periodista periodista) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().evict(periodista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByCriteria(PeriodistaCriteria periodistaCriteria) {
		Periodista[] periodistas = listPeriodistaByCriteria(periodistaCriteria);
		if(periodistas == null || periodistas.length == 0) {
			return null;
		}
		return periodistas[0];
	}
	
	public static Periodista[] listPeriodistaByCriteria(PeriodistaCriteria periodistaCriteria) {
		return periodistaCriteria.listPeriodista();
	}
}
