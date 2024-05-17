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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class SeccionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idSeccion;
	public final BooleanExpression portada;
	public final StringExpression nombre;
	public final CollectionExpression contiene;
	public final IntegerExpression es_unaId;
	public final AssociationExpression es_una;
	
	public SeccionDetachedCriteria() {
		super(ocl_proyecto.Seccion.class, ocl_proyecto.SeccionCriteria.class);
		idSeccion = new IntegerExpression("idSeccion", this.getDetachedCriteria());
		portada = new BooleanExpression("portada", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
		es_unaId = new IntegerExpression("es_una.idSeccion", this.getDetachedCriteria());
		es_una = new AssociationExpression("es_una", this.getDetachedCriteria());
	}
	
	public SeccionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ocl_proyecto.SeccionCriteria.class);
		idSeccion = new IntegerExpression("idSeccion", this.getDetachedCriteria());
		portada = new BooleanExpression("portada", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
		es_unaId = new IntegerExpression("es_una.idSeccion", this.getDetachedCriteria());
		es_una = new AssociationExpression("es_una", this.getDetachedCriteria());
	}
	
	public NoticiaDetachedCriteria createContieneCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("ORM_contiene"));
	}
	
	public TematicaDetachedCriteria createEs_unaCriteria() {
		return new TematicaDetachedCriteria(createCriteria("es_una"));
	}
	
	public Seccion uniqueSeccion(PersistentSession session) {
		return (Seccion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Seccion[] listSeccion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Seccion[]) list.toArray(new Seccion[list.size()]);
	}
}

