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

public class ComentarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_valoracion;
	public final CollectionExpression es_valorado_por;
	public final StringExpression Texto;
	public final IntegerExpression id_comentario;
	public final IntegerExpression comentaId;
	public final AssociationExpression comenta;
	public final IntegerExpression autorId;
	public final AssociationExpression autor;
	
	public ComentarioDetachedCriteria() {
		super(ocl_proyecto.Comentario.class, ocl_proyecto.ComentarioCriteria.class);
		id_valoracion = new IntegerExpression("id_valoracion", this.getDetachedCriteria());
		es_valorado_por = new CollectionExpression("ORM_es_valorado_por", this.getDetachedCriteria());
		Texto = new StringExpression("Texto", this.getDetachedCriteria());
		id_comentario = new IntegerExpression("id_comentario", this.getDetachedCriteria());
		comentaId = new IntegerExpression("comenta.", this.getDetachedCriteria());
		comenta = new AssociationExpression("comenta", this.getDetachedCriteria());
		autorId = new IntegerExpression("autor.idUsuario", this.getDetachedCriteria());
		autor = new AssociationExpression("autor", this.getDetachedCriteria());
	}
	
	public ComentarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ocl_proyecto.ComentarioCriteria.class);
		id_valoracion = new IntegerExpression("id_valoracion", this.getDetachedCriteria());
		es_valorado_por = new CollectionExpression("ORM_es_valorado_por", this.getDetachedCriteria());
		Texto = new StringExpression("Texto", this.getDetachedCriteria());
		id_comentario = new IntegerExpression("id_comentario", this.getDetachedCriteria());
		comentaId = new IntegerExpression("comenta.", this.getDetachedCriteria());
		comenta = new AssociationExpression("comenta", this.getDetachedCriteria());
		autorId = new IntegerExpression("autor.idUsuario", this.getDetachedCriteria());
		autor = new AssociationExpression("autor", this.getDetachedCriteria());
	}
	
	public NoticiaDetachedCriteria createComentaCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("comenta"));
	}
	
	public UsuarioDetachedCriteria createAutorCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("autor"));
	}
	
	public UsuarioDetachedCriteria createEs_valorado_porCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_es_valorado_por"));
	}
	
	public Comentario uniqueComentario(PersistentSession session) {
		return (Comentario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comentario[] listComentario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

