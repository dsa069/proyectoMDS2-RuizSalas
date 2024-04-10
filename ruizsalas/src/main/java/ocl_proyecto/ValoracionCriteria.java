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

public class ValoracionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_valoracion;
	public final CollectionExpression es_valorado_por;
	
	public ValoracionCriteria(Criteria criteria) {
		super(criteria);
		id_valoracion = new IntegerExpression("id_valoracion", this);
		es_valorado_por = new CollectionExpression("ORM_es_valorado_por", this);
	}
	
	public ValoracionCriteria(PersistentSession session) {
		this(session.createCriteria(Valoracion.class));
	}
	
	public ValoracionCriteria() throws PersistentException {
		this(ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createEs_valorado_porCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_es_valorado_por"));
	}
	
	public Valoracion uniqueValoracion() {
		return (Valoracion) super.uniqueResult();
	}
	
	public Valoracion[] listValoracion() {
		java.util.List list = super.list();
		return (Valoracion[]) list.toArray(new Valoracion[list.size()]);
	}
}

