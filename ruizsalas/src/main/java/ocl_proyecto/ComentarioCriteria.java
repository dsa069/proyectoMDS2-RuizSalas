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

public class ComentarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_valoracion;
	public final CollectionExpression es_valorado_por;
	public final StringExpression Texto;
	public final IntegerExpression id_comentario;
	public final IntegerExpression comentaId;
	public final AssociationExpression comenta;
	public final IntegerExpression autorId;
	public final AssociationExpression autor;
	
	public ComentarioCriteria(Criteria criteria) {
		super(criteria);
		id_valoracion = new IntegerExpression("id_valoracion", this);
		es_valorado_por = new CollectionExpression("ORM_es_valorado_por", this);
		Texto = new StringExpression("Texto", this);
		id_comentario = new IntegerExpression("id_comentario", this);
		comentaId = new IntegerExpression("comenta.", this);
		comenta = new AssociationExpression("comenta", this);
		autorId = new IntegerExpression("autor.idUsuario", this);
		autor = new AssociationExpression("autor", this);
	}
	
	public ComentarioCriteria(PersistentSession session) {
		this(session.createCriteria(Comentario.class));
	}
	
	public ComentarioCriteria() throws PersistentException {
		this(ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession());
	}
	
	public NoticiaCriteria createComentaCriteria() {
		return new NoticiaCriteria(createCriteria("comenta"));
	}
	
	public UsuarioCriteria createAutorCriteria() {
		return new UsuarioCriteria(createCriteria("autor"));
	}
	
	public UsuarioCriteria createEs_valorado_porCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_es_valorado_por"));
	}
	
	public Comentario uniqueComentario() {
		return (Comentario) super.uniqueResult();
	}
	
	public Comentario[] listComentario() {
		java.util.List list = super.list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

