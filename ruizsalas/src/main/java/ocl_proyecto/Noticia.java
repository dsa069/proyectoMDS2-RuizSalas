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
@Table(name="Noticia")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="ValoracionId_valoracion", referencedColumnName="Id_valoracion")
public class Noticia extends ocl_proyecto.Valoracion implements Serializable {
	public Noticia() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_NOTICIA_CONTIENE) {
			return ORM_contiene;
		}
		else if (key == ORMConstants.KEY_NOTICIA_TIENE) {
			return ORM_tiene;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_NOTICIA_AUTOR) {
			this.autor = (ocl_proyecto.Periodista) owner;
		}
		
		else if (key == ORMConstants.KEY_NOTICIA_PERTENECE_A) {
			this.pertenece_a = (ocl_proyecto.Seccion) owner;
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
	
	@Column(name="Agregada", nullable=false)	
	private boolean agregada;
	
	@Column(name="Version", nullable=false, length=10)	
	private float version;
	
	@Column(name="Texto_corto", nullable=true, length=255)	
	private String texto_corto;
	
	@Column(name="Texto_largo", nullable=true, length=255)	
	private String texto_largo;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="Imagen_principal", nullable=true, length=255)	
	private String imagen_principal;
	
	@Column(name="Fecha", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fecha;
	
	@Column(name="Ubicacion", nullable=true, length=255)	
	private String ubicacion;
	
	@Column(name="Id_noticia", nullable=false, length=10)	
	private int id_noticia;
	
	@ManyToOne(targetEntity=ocl_proyecto.Periodista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="PeriodistaUsuarioIdUsuario", referencedColumnName="UsuarioIdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKNoticia896785"))	
	private ocl_proyecto.Periodista autor;
	
	@ManyToOne(targetEntity=ocl_proyecto.Seccion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="SeccionIdSeccion", referencedColumnName="IdSeccion") }, foreignKey=@ForeignKey(name="FKNoticia914393"))	
	private ocl_proyecto.Seccion pertenece_a;
	
	@ManyToMany(mappedBy="ORM_esta_en", targetEntity=ocl_proyecto.Tematica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene = new java.util.HashSet();
	
	@OneToMany(mappedBy="comenta", targetEntity=ocl_proyecto.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene = new java.util.HashSet();
	
	public void setAgregada(boolean value) {
		this.agregada = value;
	}
	
	public boolean getAgregada() {
		return agregada;
	}
	
	public void setVersion(float value) {
		this.version = value;
	}
	
	public float getVersion() {
		return version;
	}
	
	public void setTexto_corto(String value) {
		this.texto_corto = value;
	}
	
	public String getTexto_corto() {
		return texto_corto;
	}
	
	public void setTexto_largo(String value) {
		this.texto_largo = value;
	}
	
	public String getTexto_largo() {
		return texto_largo;
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setImagen_principal(String value) {
		this.imagen_principal = value;
	}
	
	public String getImagen_principal() {
		return imagen_principal;
	}
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setUbicacion(String value) {
		this.ubicacion = value;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setId_noticia(int value) {
		this.id_noticia = value;
	}
	
	public int getId_noticia() {
		return id_noticia;
	}
	
	public void setAutor(ocl_proyecto.Periodista value) {
		if (autor != null) {
			autor.publica.remove(this);
		}
		if (value != null) {
			value.publica.add(this);
		}
	}
	
	public ocl_proyecto.Periodista getAutor() {
		return autor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Autor(ocl_proyecto.Periodista value) {
		this.autor = value;
	}
	
	private ocl_proyecto.Periodista getORM_Autor() {
		return autor;
	}
	
	public void setPertenece_a(ocl_proyecto.Seccion value) {
		if (pertenece_a != null) {
			pertenece_a.contiene.remove(this);
		}
		if (value != null) {
			value.contiene.add(this);
		}
	}
	
	public ocl_proyecto.Seccion getPertenece_a() {
		return pertenece_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenece_a(ocl_proyecto.Seccion value) {
		this.pertenece_a = value;
	}
	
	private ocl_proyecto.Seccion getORM_Pertenece_a() {
		return pertenece_a;
	}
	
	private void setORM_Contiene(java.util.Set value) {
		this.ORM_contiene = value;
	}
	
	private java.util.Set getORM_Contiene() {
		return ORM_contiene;
	}
	
	@Transient	
	public final ocl_proyecto.TematicaSetCollection contiene = new ocl_proyecto.TematicaSetCollection(this, _ormAdapter, ORMConstants.KEY_NOTICIA_CONTIENE, ORMConstants.KEY_TEMATICA_ESTA_EN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Tiene(java.util.Set value) {
		this.ORM_tiene = value;
	}
	
	private java.util.Set getORM_Tiene() {
		return ORM_tiene;
	}
	
	@Transient	
	public final ocl_proyecto.ComentarioSetCollection tiene = new ocl_proyecto.ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_NOTICIA_TIENE, ORMConstants.KEY_COMENTARIO_COMENTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
