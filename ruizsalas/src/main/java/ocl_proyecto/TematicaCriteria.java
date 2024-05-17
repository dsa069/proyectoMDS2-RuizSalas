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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TematicaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idTematica;
	public final IntegerExpression es_unaId;
	public final AssociationExpression es_una;
	public final StringExpression nombre;
	public final CollectionExpression esta_en;
	
	public TematicaCriteria(Criteria criteria) {
		super(criteria);
		idTematica = new IntegerExpression("idTematica", this);
		es_unaId = new IntegerExpression("es_una.idSeccion", this);
		es_una = new AssociationExpression("es_una", this);
		nombre = new StringExpression("nombre", this);
		esta_en = new CollectionExpression("ORM_esta_en", this);
	}
	
	public TematicaCriteria(PersistentSession session) {
		this(session.createCriteria(Tematica.class));
	}
	
	public TematicaCriteria() throws PersistentException {
		this(ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession());
	}
	
	public SeccionCriteria createEs_unaCriteria() {
		return new SeccionCriteria(createCriteria("es_una"));
	}
	
	public NoticiaCriteria createEsta_enCriteria() {
		return new NoticiaCriteria(createCriteria("ORM_esta_en"));
	}
	
	public Tematica uniqueTematica() {
		return (Tematica) super.uniqueResult();
	}
	
	public Tematica[] listTematica() {
		java.util.List list = super.list();
		return (Tematica[]) list.toArray(new Tematica[list.size()]);
	}
}

