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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Usuario_suscrito_DetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idUsuario;
	public final StringExpression dni;
	public final StringExpression apodo;
	public final StringExpression correo;
	public final StringExpression contrasena;
	public final StringExpression foto_de_perfil;
	public final BooleanExpression baja;
	public final CollectionExpression escribe;
	public final CollectionExpression realiza;
	
	public Usuario_suscrito_DetachedCriteria() {
		super(ocl_proyecto.Usuario_suscrito_.class, ocl_proyecto.Usuario_suscrito_Criteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		dni = new StringExpression("dni", this.getDetachedCriteria());
		apodo = new StringExpression("apodo", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		foto_de_perfil = new StringExpression("foto_de_perfil", this.getDetachedCriteria());
		baja = new BooleanExpression("baja", this.getDetachedCriteria());
		escribe = new CollectionExpression("ORM_escribe", this.getDetachedCriteria());
		realiza = new CollectionExpression("ORM_realiza", this.getDetachedCriteria());
	}
	
	public Usuario_suscrito_DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ocl_proyecto.Usuario_suscrito_Criteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		dni = new StringExpression("dni", this.getDetachedCriteria());
		apodo = new StringExpression("apodo", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		foto_de_perfil = new StringExpression("foto_de_perfil", this.getDetachedCriteria());
		baja = new BooleanExpression("baja", this.getDetachedCriteria());
		escribe = new CollectionExpression("ORM_escribe", this.getDetachedCriteria());
		realiza = new CollectionExpression("ORM_realiza", this.getDetachedCriteria());
	}
	
	public ComentarioDetachedCriteria createEscribeCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_escribe"));
	}
	
	public ValoracionDetachedCriteria createRealizaCriteria() {
		return new ValoracionDetachedCriteria(createCriteria("ORM_realiza"));
	}
	
	public Usuario_suscrito_ uniqueUsuario_suscrito_(PersistentSession session) {
		return (Usuario_suscrito_) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario_suscrito_[] listUsuario_suscrito_(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario_suscrito_[]) list.toArray(new Usuario_suscrito_[list.size()]);
	}
}

