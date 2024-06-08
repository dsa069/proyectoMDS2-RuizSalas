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

public class TematicaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idTematica;
	public final IntegerExpression es_unaId;
	public final AssociationExpression es_una;
	public final StringExpression nombre;
	public final CollectionExpression esta_en;
	
	public TematicaDetachedCriteria() {
		super(ocl_proyecto.Tematica.class, ocl_proyecto.TematicaCriteria.class);
		idTematica = new IntegerExpression("idTematica", this.getDetachedCriteria());
		es_unaId = new IntegerExpression("es_una.idSeccion", this.getDetachedCriteria());
		es_una = new AssociationExpression("es_una", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		esta_en = new CollectionExpression("ORM_esta_en", this.getDetachedCriteria());
	}
	
	public TematicaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ocl_proyecto.TematicaCriteria.class);
		idTematica = new IntegerExpression("idTematica", this.getDetachedCriteria());
		es_unaId = new IntegerExpression("es_una.idSeccion", this.getDetachedCriteria());
		es_una = new AssociationExpression("es_una", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		esta_en = new CollectionExpression("ORM_esta_en", this.getDetachedCriteria());
	}
	
	public SeccionDetachedCriteria createEs_unaCriteria() {
		return new SeccionDetachedCriteria(createCriteria("es_una"));
	}
	
	public NoticiaDetachedCriteria createEsta_enCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("ORM_esta_en"));
	}
	
	public Tematica uniqueTematica(PersistentSession session) {
		return (Tematica) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tematica[] listTematica(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tematica[]) list.toArray(new Tematica[list.size()]);
	}
}

