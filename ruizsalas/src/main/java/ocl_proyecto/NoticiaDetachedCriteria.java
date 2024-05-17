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

public class NoticiaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public NoticiaDetachedCriteria() {
		super(ocl_proyecto.Noticia.class, ocl_proyecto.NoticiaCriteria.class);
		id_valoracion = new IntegerExpression("id_valoracion", this.getDetachedCriteria());
		es_valorado_por = new CollectionExpression("ORM_es_valorado_por", this.getDetachedCriteria());
		agregada = new BooleanExpression("agregada", this.getDetachedCriteria());
		version = new FloatExpression("version", this.getDetachedCriteria());
		texto_corto = new StringExpression("texto_corto", this.getDetachedCriteria());
		texto_largo = new StringExpression("texto_largo", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		imagen_principal = new StringExpression("imagen_principal", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		ubicacion = new StringExpression("ubicacion", this.getDetachedCriteria());
		id_noticia = new IntegerExpression("id_noticia", this.getDetachedCriteria());
		autorId = new IntegerExpression("autor.", this.getDetachedCriteria());
		autor = new AssociationExpression("autor", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.idSeccion", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
	}
	
	public NoticiaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ocl_proyecto.NoticiaCriteria.class);
		id_valoracion = new IntegerExpression("id_valoracion", this.getDetachedCriteria());
		es_valorado_por = new CollectionExpression("ORM_es_valorado_por", this.getDetachedCriteria());
		agregada = new BooleanExpression("agregada", this.getDetachedCriteria());
		version = new FloatExpression("version", this.getDetachedCriteria());
		texto_corto = new StringExpression("texto_corto", this.getDetachedCriteria());
		texto_largo = new StringExpression("texto_largo", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		imagen_principal = new StringExpression("imagen_principal", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		ubicacion = new StringExpression("ubicacion", this.getDetachedCriteria());
		id_noticia = new IntegerExpression("id_noticia", this.getDetachedCriteria());
		autorId = new IntegerExpression("autor.", this.getDetachedCriteria());
		autor = new AssociationExpression("autor", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.idSeccion", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
	}
	
	public PeriodistaDetachedCriteria createAutorCriteria() {
		return new PeriodistaDetachedCriteria(createCriteria("autor"));
	}
	
	public SeccionDetachedCriteria createPertenece_aCriteria() {
		return new SeccionDetachedCriteria(createCriteria("pertenece_a"));
	}
	
	public TematicaDetachedCriteria createContieneCriteria() {
		return new TematicaDetachedCriteria(createCriteria("ORM_contiene"));
	}
	
	public ComentarioDetachedCriteria createTieneCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_tiene"));
	}
	
	public UsuarioDetachedCriteria createEs_valorado_porCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_es_valorado_por"));
	}
	
	public Noticia uniqueNoticia(PersistentSession session) {
		return (Noticia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Noticia[] listNoticia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Noticia[]) list.toArray(new Noticia[list.size()]);
	}
}

