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
@Table(name="Usuario")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_ESCRIBE) {
			return ORM_escribe;
		}
		else if (key == ORMConstants.KEY_USUARIO_REALIZA) {
			return ORM_realiza;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="IdUsuario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="OCL_PROYECTO_USUARIO_IDUSUARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="OCL_PROYECTO_USUARIO_IDUSUARIO_GENERATOR", strategy="native")	
	private int idUsuario;
	
	@Column(name="Dni", nullable=true, length=255)	
	private String dni;
	
	@Column(name="Apodo", nullable=true, length=255)	
	private String apodo;
	
	@Column(name="Correo", nullable=true, length=255)	
	private String correo;
	
	@Column(name="Contrasena", nullable=true, length=255)	
	private String contrasena;
	
	@Column(name="Foto_de_perfil", nullable=true, length=255)	
	private String foto_de_perfil;
	
	@Column(name="Baja", nullable=false)	
	private boolean baja;
	
	@OneToMany(mappedBy="autor", targetEntity=ocl_proyecto.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_escribe = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_es_valorado_por", targetEntity=ocl_proyecto.Valoracion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_realiza = new java.util.HashSet();
	
	public void setDni(String value) {
		this.dni = value;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setApodo(String value) {
		this.apodo = value;
	}
	
	public String getApodo() {
		return apodo;
	}
	
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setContrasena(String value) {
		this.contrasena = value;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setFoto_de_perfil(String value) {
		this.foto_de_perfil = value;
	}
	
	public String getFoto_de_perfil() {
		return foto_de_perfil;
	}
	
	public void setBaja(boolean value) {
		this.baja = value;
	}
	
	public boolean getBaja() {
		return baja;
	}
	
	private void setIdUsuario(int value) {
		this.idUsuario = value;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public int getORMID() {
		return getIdUsuario();
	}
	
	private void setORM_Escribe(java.util.Set value) {
		this.ORM_escribe = value;
	}
	
	private java.util.Set getORM_Escribe() {
		return ORM_escribe;
	}
	
	@Transient	
	public final ocl_proyecto.ComentarioSetCollection escribe = new ocl_proyecto.ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_ESCRIBE, ORMConstants.KEY_COMENTARIO_AUTOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Realiza(java.util.Set value) {
		this.ORM_realiza = value;
	}
	
	private java.util.Set getORM_Realiza() {
		return ORM_realiza;
	}
	
	@Transient	
	public final ocl_proyecto.ValoracionSetCollection realiza = new ocl_proyecto.ValoracionSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REALIZA, ORMConstants.KEY_VALORACION_ES_VALORADO_POR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdUsuario());
	}
	
}
