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

public class NoticiaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_valoracion;
	public final CollectionExpression es_valorado_por;
	public final BooleanExpression agregada;
	public final FloatExpression version;
	public final StringExpression texto_corto;
	public final StringExpression texto_largo;
	public final StringExpression titulo;
	public final StringExpression imagen_principal;
	public final DateExpression fecha;
	public final StringExpression ubicacion;
	public final IntegerExpression id_noticia;
	public final IntegerExpression autorId;
	public final AssociationExpression autor;
	public final IntegerExpression pertenece_aId;
	public final AssociationExpression pertenece_a;
	public final CollectionExpression contiene;
	public final CollectionExpression tiene;
	
	public NoticiaCriteria(Criteria criteria) {
		super(criteria);
		id_valoracion = new IntegerExpression("id_valoracion", this);
		es_valorado_por = new CollectionExpression("ORM_es_valorado_por", this);
		agregada = new BooleanExpression("agregada", this);
		version = new FloatExpression("version", this);
		texto_corto = new StringExpression("texto_corto", this);
		texto_largo = new StringExpression("texto_largo", this);
		titulo = new StringExpression("titulo", this);
		imagen_principal = new StringExpression("imagen_principal", this);
		fecha = new DateExpression("fecha", this);
		ubicacion = new StringExpression("ubicacion", this);
		id_noticia = new IntegerExpression("id_noticia", this);
		autorId = new IntegerExpression("autor.", this);
		autor = new AssociationExpression("autor", this);
		pertenece_aId = new IntegerExpression("pertenece_a.idSeccion", this);
		pertenece_a = new AssociationExpression("pertenece_a", this);
		contiene = new CollectionExpression("ORM_contiene", this);
		tiene = new CollectionExpression("ORM_tiene", this);
	}
	
	public NoticiaCriteria(PersistentSession session) {
		this(session.createCriteria(Noticia.class));
	}
	
	public NoticiaCriteria() throws PersistentException {
		this(ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession());
	}
	
	public PeriodistaCriteria createAutorCriteria() {
		return new PeriodistaCriteria(createCriteria("autor"));
	}
	
	public SeccionCriteria createPertenece_aCriteria() {
		return new SeccionCriteria(createCriteria("pertenece_a"));
	}
	
	public TematicaCriteria createContieneCriteria() {
		return new TematicaCriteria(createCriteria("ORM_contiene"));
	}
	
	public ComentarioCriteria createTieneCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_tiene"));
	}
	
	public UsuarioCriteria createEs_valorado_porCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_es_valorado_por"));
	}
	
	public Noticia uniqueNoticia() {
		return (Noticia) super.uniqueResult();
	}
	
	public Noticia[] listNoticia() {
		java.util.List list = super.list();
		return (Noticia[]) list.toArray(new Noticia[list.size()]);
	}
}

