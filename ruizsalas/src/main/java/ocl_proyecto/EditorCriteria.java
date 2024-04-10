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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EditorCriteria extends AbstractORMCriteria {
	public final IntegerExpression idUsuario;
	public final StringExpression dni;
	public final StringExpression apodo;
	public final StringExpression correo;
	public final StringExpression contrasena;
	public final StringExpression foto_de_perfil;
	public final BooleanExpression baja;
	public final CollectionExpression escribe;
	public final CollectionExpression realiza;
	
	public EditorCriteria(Criteria criteria) {
		super(criteria);
		idUsuario = new IntegerExpression("idUsuario", this);
		dni = new StringExpression("dni", this);
		apodo = new StringExpression("apodo", this);
		correo = new StringExpression("correo", this);
		contrasena = new StringExpression("contrasena", this);
		foto_de_perfil = new StringExpression("foto_de_perfil", this);
		baja = new BooleanExpression("baja", this);
		escribe = new CollectionExpression("ORM_escribe", this);
		realiza = new CollectionExpression("ORM_realiza", this);
	}
	
	public EditorCriteria(PersistentSession session) {
		this(session.createCriteria(Editor.class));
	}
	
	public EditorCriteria() throws PersistentException {
		this(ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession());
	}
	
	public ComentarioCriteria createEscribeCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_escribe"));
	}
	
	public ValoracionCriteria createRealizaCriteria() {
		return new ValoracionCriteria(createCriteria("ORM_realiza"));
	}
	
	public Editor uniqueEditor() {
		return (Editor) super.uniqueResult();
	}
	
	public Editor[] listEditor() {
		java.util.List list = super.list();
		return (Editor[]) list.toArray(new Editor[list.size()]);
	}
}

