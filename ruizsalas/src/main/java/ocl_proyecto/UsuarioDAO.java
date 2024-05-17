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

public class UsuarioDAO {
	public static Usuario loadUsuarioByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return getUsuarioByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return getUsuarioByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario) session.load(ocl_proyecto.Usuario.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario) session.get(ocl_proyecto.Usuario.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario) session.load(ocl_proyecto.Usuario.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario) session.get(ocl_proyecto.Usuario.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Usuario as Usuario");
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
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Usuario as Usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy);
			return (Usuario[]) list.toArray(new Usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy, lockMode);
			return (Usuario[]) list.toArray(new Usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy, lockMode);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Usuario as Usuario");
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
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Usuario as Usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario createUsuario() {
		return new ocl_proyecto.Usuario();
	}
	
	public static boolean save(ocl_proyecto.Usuario usuario) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().saveObject(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ocl_proyecto.Usuario usuario) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().deleteObject(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ocl_proyecto.Usuario usuario)throws PersistentException {
		if (usuario instanceof ocl_proyecto.Editor) {
			return ocl_proyecto.EditorDAO.deleteAndDissociate((ocl_proyecto.Editor) usuario);
		}
		
		if (usuario instanceof ocl_proyecto.Usuario_suscrito_) {
			return ocl_proyecto.Usuario_suscrito_DAO.deleteAndDissociate((ocl_proyecto.Usuario_suscrito_) usuario);
		}
		
		if (usuario instanceof ocl_proyecto.Periodista) {
			return ocl_proyecto.PeriodistaDAO.deleteAndDissociate((ocl_proyecto.Periodista) usuario);
		}
		
		try {
			ocl_proyecto.Comentario[] lEscribes = usuario.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setAutor(null);
			}
			ocl_proyecto.Valoracion[] lRealizas = usuario.realiza.toArray();
			for(int i = 0; i < lRealizas.length; i++) {
				lRealizas[i].es_valorado_por.remove(usuario);
			}
			return delete(usuario);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ocl_proyecto.Usuario usuario, org.orm.PersistentSession session)throws PersistentException {
		if (usuario instanceof ocl_proyecto.Editor) {
			return ocl_proyecto.EditorDAO.deleteAndDissociate((ocl_proyecto.Editor) usuario, session);
		}
		
		if (usuario instanceof ocl_proyecto.Usuario_suscrito_) {
			return ocl_proyecto.Usuario_suscrito_DAO.deleteAndDissociate((ocl_proyecto.Usuario_suscrito_) usuario, session);
		}
		
		if (usuario instanceof ocl_proyecto.Periodista) {
			return ocl_proyecto.PeriodistaDAO.deleteAndDissociate((ocl_proyecto.Periodista) usuario, session);
		}
		
		try {
			ocl_proyecto.Comentario[] lEscribes = usuario.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setAutor(null);
			}
			ocl_proyecto.Valoracion[] lRealizas = usuario.realiza.toArray();
			for(int i = 0; i < lRealizas.length; i++) {
				lRealizas[i].es_valorado_por.remove(usuario);
			}
			try {
				session.delete(usuario);
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
	
	public static boolean refresh(ocl_proyecto.Usuario usuario) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().refresh(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ocl_proyecto.Usuario usuario) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().evict(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
		Usuario[] usuarios = listUsuarioByCriteria(usuarioCriteria);
		if(usuarios == null || usuarios.length == 0) {
			return null;
		}
		return usuarios[0];
	}
	
	public static Usuario[] listUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
		return usuarioCriteria.listUsuario();
	}
}
