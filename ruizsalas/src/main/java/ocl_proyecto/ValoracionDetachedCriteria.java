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

public class ValoracionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_valoracion;
	public final CollectionExpression es_valorado_por;
	
	public ValoracionDetachedCriteria() {
		super(ocl_proyecto.Valoracion.class, ocl_proyecto.ValoracionCriteria.class);
		id_valoracion = new IntegerExpression("id_valoracion", this.getDetachedCriteria());
		es_valorado_por = new CollectionExpression("ORM_es_valorado_por", this.getDetachedCriteria());
	}
	
	public ValoracionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ocl_proyecto.ValoracionCriteria.class);
		id_valoracion = new IntegerExpression("id_valoracion", this.getDetachedCriteria());
		es_valorado_por = new CollectionExpression("ORM_es_valorado_por", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createEs_valorado_porCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_es_valorado_por"));
	}
	
	public Valoracion uniqueValoracion(PersistentSession session) {
		return (Valoracion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Valoracion[] listValoracion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Valoracion[]) list.toArray(new Valoracion[list.size()]);
	}
}

