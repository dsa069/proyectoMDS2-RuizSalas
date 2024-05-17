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
@Table(name="Valoracion")
@Inheritance(strategy=InheritanceType.JOINED)
public class Valoracion implements Serializable {
	public Valoracion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_VALORACION_ES_VALORADO_POR) {
			return ORM_es_valorado_por;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_valoracion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="OCL_PROYECTO_VALORACION_ID_VALORACION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="OCL_PROYECTO_VALORACION_ID_VALORACION_GENERATOR", strategy="native")	
	private int id_valoracion;
	
	@Column(name="Num_dislikes", nullable=true, length=10)	
	private int num_dislikes;
	
	@Column(name="Num_likes", nullable=true, length=10)	
	private int num_likes;
	
	@ManyToMany(targetEntity=ocl_proyecto.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Valoracion", joinColumns={ @JoinColumn(name="ValoracionId_valoracion") }, inverseJoinColumns={ @JoinColumn(name="UsuarioIdUsuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_valorado_por = new java.util.HashSet();
	
	public void setNum_dislikes(int value) {
		this.num_dislikes = value;
	}
	
	public int getNum_dislikes() {
		return num_dislikes;
	}
	
	public void setNum_likes(int value) {
		this.num_likes = value;
	}
	
	public int getNum_likes() {
		return num_likes;
	}
	
	private void setId_valoracion(int value) {
		this.id_valoracion = value;
	}
	
	public int getId_valoracion() {
		return id_valoracion;
	}
	
	public int getORMID() {
		return getId_valoracion();
	}
	
	private void setORM_Es_valorado_por(java.util.Set value) {
		this.ORM_es_valorado_por = value;
	}
	
	private java.util.Set getORM_Es_valorado_por() {
		return ORM_es_valorado_por;
	}
	
	@Transient	
	public final ocl_proyecto.UsuarioSetCollection es_valorado_por = new ocl_proyecto.UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_VALORACION_ES_VALORADO_POR, ORMConstants.KEY_USUARIO_REALIZA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_valoracion());
	}
	
}
