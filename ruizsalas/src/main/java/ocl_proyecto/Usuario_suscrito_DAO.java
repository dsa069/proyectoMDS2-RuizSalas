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

public class Usuario_suscrito_DAO {
	public static Usuario_suscrito_ loadUsuario_suscrito_ByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadUsuario_suscrito_ByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito_ getUsuario_suscrito_ByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return getUsuario_suscrito_ByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito_ loadUsuario_suscrito_ByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadUsuario_suscrito_ByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito_ getUsuario_suscrito_ByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return getUsuario_suscrito_ByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito_ loadUsuario_suscrito_ByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario_suscrito_) session.load(ocl_proyecto.Usuario_suscrito_.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito_ getUsuario_suscrito_ByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario_suscrito_) session.get(ocl_proyecto.Usuario_suscrito_.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito_ loadUsuario_suscrito_ByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_suscrito_) session.load(ocl_proyecto.Usuario_suscrito_.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito_ getUsuario_suscrito_ByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_suscrito_) session.get(ocl_proyecto.Usuario_suscrito_.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_suscrito_(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return queryUsuario_suscrito_(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_suscrito_(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return queryUsuario_suscrito_(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito_[] listUsuario_suscrito_ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return listUsuario_suscrito_ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito_[] listUsuario_suscrito_ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return listUsuario_suscrito_ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_suscrito_(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Usuario_suscrito_ as Usuario_suscrito_");
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
	
	public static List queryUsuario_suscrito_(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Usuario_suscrito_ as Usuario_suscrito_");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_suscrito_", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito_[] listUsuario_suscrito_ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_suscrito_(session, condition, orderBy);
			return (Usuario_suscrito_[]) list.toArray(new Usuario_suscrito_[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito_[] listUsuario_suscrito_ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_suscrito_(session, condition, orderBy, lockMode);
			return (Usuario_suscrito_[]) list.toArray(new Usuario_suscrito_[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito_ loadUsuario_suscrito_ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadUsuario_suscrito_ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito_ loadUsuario_suscrito_ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadUsuario_suscrito_ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito_ loadUsuario_suscrito_ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_suscrito_[] usuario_suscrito_s = listUsuario_suscrito_ByQuery(session, condition, orderBy);
		if (usuario_suscrito_s != null && usuario_suscrito_s.length > 0)
			return usuario_suscrito_s[0];
		else
			return null;
	}
	
	public static Usuario_suscrito_ loadUsuario_suscrito_ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_suscrito_[] usuario_suscrito_s = listUsuario_suscrito_ByQuery(session, condition, orderBy, lockMode);
		if (usuario_suscrito_s != null && usuario_suscrito_s.length > 0)
			return usuario_suscrito_s[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_suscrito_ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return iterateUsuario_suscrito_ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_suscrito_ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return iterateUsuario_suscrito_ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_suscrito_ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Usuario_suscrito_ as Usuario_suscrito_");
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
	
	public static java.util.Iterator iterateUsuario_suscrito_ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Usuario_suscrito_ as Usuario_suscrito_");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_suscrito_", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito_ createUsuario_suscrito_() {
		return new ocl_proyecto.Usuario_suscrito_();
	}
	
	public static boolean save(ocl_proyecto.Usuario_suscrito_ usuario_suscrito_) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().saveObject(usuario_suscrito_);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ocl_proyecto.Usuario_suscrito_ usuario_suscrito_) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().deleteObject(usuario_suscrito_);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ocl_proyecto.Usuario_suscrito_ usuario_suscrito_)throws PersistentException {
		try {
			ocl_proyecto.Comentario[] lEscribes = usuario_suscrito_.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setAutor(null);
			}
			ocl_proyecto.Valoracion[] lRealizas = usuario_suscrito_.realiza.toArray();
			for(int i = 0; i < lRealizas.length; i++) {
				lRealizas[i].es_valorado_por.remove(usuario_suscrito_);
			}
			return delete(usuario_suscrito_);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ocl_proyecto.Usuario_suscrito_ usuario_suscrito_, org.orm.PersistentSession session)throws PersistentException {
		try {
			ocl_proyecto.Comentario[] lEscribes = usuario_suscrito_.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setAutor(null);
			}
			ocl_proyecto.Valoracion[] lRealizas = usuario_suscrito_.realiza.toArray();
			for(int i = 0; i < lRealizas.length; i++) {
				lRealizas[i].es_valorado_por.remove(usuario_suscrito_);
			}
			try {
				session.delete(usuario_suscrito_);
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
	
	public static boolean refresh(ocl_proyecto.Usuario_suscrito_ usuario_suscrito_) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().refresh(usuario_suscrito_);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ocl_proyecto.Usuario_suscrito_ usuario_suscrito_) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().evict(usuario_suscrito_);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito_ loadUsuario_suscrito_ByCriteria(Usuario_suscrito_Criteria usuario_suscrito_Criteria) {
		Usuario_suscrito_[] usuario_suscrito_s = listUsuario_suscrito_ByCriteria(usuario_suscrito_Criteria);
		if(usuario_suscrito_s == null || usuario_suscrito_s.length == 0) {
			return null;
		}
		return usuario_suscrito_s[0];
	}
	
	public static Usuario_suscrito_[] listUsuario_suscrito_ByCriteria(Usuario_suscrito_Criteria usuario_suscrito_Criteria) {
		return usuario_suscrito_Criteria.listUsuario_suscrito_();
	}
}
