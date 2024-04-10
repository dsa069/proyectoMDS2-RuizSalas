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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Seccion")
public class Seccion implements Serializable {
	public Seccion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_SECCION_CONTIENE) {
			return ORM_contiene;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="IdSeccion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="OCL_PROYECTO_SECCION_IDSECCION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="OCL_PROYECTO_SECCION_IDSECCION_GENERATOR", strategy="native")	
	private int idSeccion;
	
	@Column(name="Portada", nullable=false)	
	private boolean portada;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@OneToMany(mappedBy="pertenece_a", targetEntity=ocl_proyecto.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene = new java.util.HashSet();
	
	@OneToOne(mappedBy="es_una", targetEntity=ocl_proyecto.Tematica.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private ocl_proyecto.Tematica es_una;
	
	public void setPortada(boolean value) {
		this.portada = value;
	}
	
	public boolean getPortada() {
		return portada;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setIdSeccion(int value) {
		this.idSeccion = value;
	}
	
	public int getIdSeccion() {
		return idSeccion;
	}
	
	public int getORMID() {
		return getIdSeccion();
	}
	
	private void setORM_Contiene(java.util.Set value) {
		this.ORM_contiene = value;
	}
	
	private java.util.Set getORM_Contiene() {
		return ORM_contiene;
	}
	
	@Transient	
	public final ocl_proyecto.NoticiaSetCollection contiene = new ocl_proyecto.NoticiaSetCollection(this, _ormAdapter, ORMConstants.KEY_SECCION_CONTIENE, ORMConstants.KEY_NOTICIA_PERTENECE_A, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setEs_una(ocl_proyecto.Tematica value) {
		if (this.es_una != value) {
			ocl_proyecto.Tematica les_una = this.es_una;
			this.es_una = value;
			if (value != null) {
				es_una.setEs_una(this);
			}
			if (les_una != null && les_una.getEs_una() == this) {
				les_una.setEs_una(null);
			}
		}
	}
	
	public ocl_proyecto.Tematica getEs_una() {
		return es_una;
	}
	
	public String toString() {
		return String.valueOf(getIdSeccion());
	}
	
}
