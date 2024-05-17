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

public class SeccionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idSeccion;
	public final BooleanExpression portada;
	public final StringExpression nombre;
	public final CollectionExpression contiene;
	public final IntegerExpression es_unaId;
	public final AssociationExpression es_una;
	
	public SeccionCriteria(Criteria criteria) {
		super(criteria);
		idSeccion = new IntegerExpression("idSeccion", this);
		portada = new BooleanExpression("portada", this);
		nombre = new StringExpression("nombre", this);
		contiene = new CollectionExpression("ORM_contiene", this);
		es_unaId = new IntegerExpression("es_una.idSeccion", this);
		es_una = new AssociationExpression("es_una", this);
	}
	
	public SeccionCriteria(PersistentSession session) {
		this(session.createCriteria(Seccion.class));
	}
	
	public SeccionCriteria() throws PersistentException {
		this(ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession());
	}
	
	public NoticiaCriteria createContieneCriteria() {
		return new NoticiaCriteria(createCriteria("ORM_contiene"));
	}
	
	public TematicaCriteria createEs_unaCriteria() {
		return new TematicaCriteria(createCriteria("es_una"));
	}
	
	public Seccion uniqueSeccion() {
		return (Seccion) super.uniqueResult();
	}
	
	public Seccion[] listSeccion() {
		java.util.List list = super.list();
		return (Seccion[]) list.toArray(new Seccion[list.size()]);
	}
}

