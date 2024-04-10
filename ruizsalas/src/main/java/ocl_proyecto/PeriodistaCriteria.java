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

public class PeriodistaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idUsuario;
	public final StringExpression dni;
	public final StringExpression apodo;
	public final StringExpression correo;
	public final StringExpression contrasena;
	public final StringExpression foto_de_perfil;
	public final BooleanExpression baja;
	public final CollectionExpression escribe;
	public final CollectionExpression realiza;
	public final CollectionExpression publica;
	
	public PeriodistaCriteria(Criteria criteria) {
		super(criteria);
		idUsuario = new IntegerExpression("idUsuario", this);
		dni = new StringExpression("dni", this);
		apodo = new StringExpression("apodo", this);
		correo = new StringExpression("correo", this);
		contrasena = new StringExpression("contrasena", this);
		foto_de_perfil = new StringExpression("foto_de_perfil", this);
		baja = new BooleanExpression("baja", this);
		escribe = new CollectionExpression("ORM_escribe", this);
		realiza = new CollectionExpression("ORM_realiza", this);
		publica = new CollectionExpression("ORM_publica", this);
	}
	
	public PeriodistaCriteria(PersistentSession session) {
		this(session.createCriteria(Periodista.class));
	}
	
	public PeriodistaCriteria() throws PersistentException {
		this(ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession());
	}
	
	public NoticiaCriteria createPublicaCriteria() {
		return new NoticiaCriteria(createCriteria("ORM_publica"));
	}
	
	public ComentarioCriteria createEscribeCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_escribe"));
	}
	
	public ValoracionCriteria createRealizaCriteria() {
		return new ValoracionCriteria(createCriteria("ORM_realiza"));
	}
	
	public Periodista uniquePeriodista() {
		return (Periodista) super.uniqueResult();
	}
	
	public Periodista[] listPeriodista() {
		java.util.List list = super.list();
		return (Periodista[]) list.toArray(new Periodista[list.size()]);
	}
}

