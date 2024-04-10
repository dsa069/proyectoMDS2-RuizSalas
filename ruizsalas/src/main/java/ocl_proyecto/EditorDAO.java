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

public class EditorDAO {
	public static Editor loadEditorByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadEditorByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor getEditorByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return getEditorByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadEditorByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor getEditorByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return getEditorByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Editor) session.load(ocl_proyecto.Editor.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor getEditorByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Editor) session.get(ocl_proyecto.Editor.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Editor) session.load(ocl_proyecto.Editor.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor getEditorByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Editor) session.get(ocl_proyecto.Editor.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEditor(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return queryEditor(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEditor(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return queryEditor(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor[] listEditorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return listEditorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor[] listEditorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return listEditorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEditor(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Editor as Editor");
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
	
	public static List queryEditor(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Editor as Editor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Editor", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor[] listEditorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEditor(session, condition, orderBy);
			return (Editor[]) list.toArray(new Editor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor[] listEditorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEditor(session, condition, orderBy, lockMode);
			return (Editor[]) list.toArray(new Editor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadEditorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return loadEditorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Editor[] editors = listEditorByQuery(session, condition, orderBy);
		if (editors != null && editors.length > 0)
			return editors[0];
		else
			return null;
	}
	
	public static Editor loadEditorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Editor[] editors = listEditorByQuery(session, condition, orderBy, lockMode);
		if (editors != null && editors.length > 0)
			return editors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEditorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return iterateEditorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEditorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession();
			return iterateEditorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEditorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Editor as Editor");
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
	
	public static java.util.Iterator iterateEditorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ocl_proyecto.Editor as Editor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Editor", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor createEditor() {
		return new ocl_proyecto.Editor();
	}
	
	public static boolean save(ocl_proyecto.Editor editor) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().saveObject(editor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ocl_proyecto.Editor editor) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().deleteObject(editor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ocl_proyecto.Editor editor)throws PersistentException {
		try {
			ocl_proyecto.Comentario[] lEscribes = editor.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setAutor(null);
			}
			ocl_proyecto.Valoracion[] lRealizas = editor.realiza.toArray();
			for(int i = 0; i < lRealizas.length; i++) {
				lRealizas[i].es_valorado_por.remove(editor);
			}
			return delete(editor);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ocl_proyecto.Editor editor, org.orm.PersistentSession session)throws PersistentException {
		try {
			ocl_proyecto.Comentario[] lEscribes = editor.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setAutor(null);
			}
			ocl_proyecto.Valoracion[] lRealizas = editor.realiza.toArray();
			for(int i = 0; i < lRealizas.length; i++) {
				lRealizas[i].es_valorado_por.remove(editor);
			}
			try {
				session.delete(editor);
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
	
	public static boolean refresh(ocl_proyecto.Editor editor) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().refresh(editor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ocl_proyecto.Editor editor) throws PersistentException {
		try {
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().evict(editor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByCriteria(EditorCriteria editorCriteria) {
		Editor[] editors = listEditorByCriteria(editorCriteria);
		if(editors == null || editors.length == 0) {
			return null;
		}
		return editors[0];
	}
	
	public static Editor[] listEditorByCriteria(EditorCriteria editorCriteria) {
		return editorCriteria.listEditor();
	}
}
