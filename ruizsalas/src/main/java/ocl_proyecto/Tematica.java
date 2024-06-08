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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Tematica")
public class Tematica implements Serializable {
	public Tematica() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TEMATICA_ESTA_EN) {
			return ORM_esta_en;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TEMATICA_ES_UNA) {
			this.es_una = (ocl_proyecto.Seccion) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdTematica", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="OCL_PROYECTO_TEMATICA_IDTEMATICA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="OCL_PROYECTO_TEMATICA_IDTEMATICA_GENERATOR", strategy="native")	
	private int idTematica;
	
	@OneToOne(optional=false, targetEntity=ocl_proyecto.Seccion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="SeccionIdSeccion", referencedColumnName="IdSeccion", nullable=false) }, foreignKey=@ForeignKey(name="FKTematica458824"))	
	private ocl_proyecto.Seccion es_una;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@ManyToMany(targetEntity=ocl_proyecto.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Noticia_Tematica", joinColumns={ @JoinColumn(name="TematicaIdTematica") }, inverseJoinColumns={ @JoinColumn(name="NoticiaValoracionId_valoracion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_esta_en = new java.util.HashSet();
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setIdTematica(int value) {
		this.idTematica = value;
	}
	
	public int getIdTematica() {
		return idTematica;
	}
	
	public int getORMID() {
		return getIdTematica();
	}
	
	public void setEs_una(ocl_proyecto.Seccion value) {
		if (this.es_una != value) {
			ocl_proyecto.Seccion les_una = this.es_una;
			this.es_una = value;
			if (value != null) {
				es_una.setEs_una(this);
			}
			if (les_una != null && les_una.getEs_una() == this) {
				les_una.setEs_una(null);
			}
		}
	}
	
	public ocl_proyecto.Seccion getEs_una() {
		return es_una;
	}
	
	private void setORM_Esta_en(java.util.Set value) {
		this.ORM_esta_en = value;
	}
	
	private java.util.Set getORM_Esta_en() {
		return ORM_esta_en;
	}
	
	@Transient	
	public final ocl_proyecto.NoticiaSetCollection esta_en = new ocl_proyecto.NoticiaSetCollection(this, _ormAdapter, ORMConstants.KEY_TEMATICA_ESTA_EN, ORMConstants.KEY_NOTICIA_CONTIENE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdTematica());
	}
	
}
