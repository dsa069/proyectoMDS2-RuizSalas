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
@Table(name="Comentario")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="ValoracionId_valoracion", referencedColumnName="Id_valoracion")
public class Comentario extends ocl_proyecto.Valoracion implements Serializable {
	public Comentario() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_COMENTARIO_COMENTA) {
			this.comenta = (ocl_proyecto.Noticia) owner;
		}
		
		else if (key == ORMConstants.KEY_COMENTARIO_AUTOR) {
			this.autor = (ocl_proyecto.Usuario) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Texto", nullable=true, length=255)	
	private String Texto;
	
	@Column(name="Id_comentario", nullable=false, length=10)	
	private int id_comentario;
	
	@ManyToOne(targetEntity=ocl_proyecto.Noticia.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="NoticiaValoracionId_valoracion", referencedColumnName="ValoracionId_valoracion", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario591160"))	
	private ocl_proyecto.Noticia comenta;
	
	@ManyToOne(targetEntity=ocl_proyecto.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioIdUsuario", referencedColumnName="IdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario476"))	
	private ocl_proyecto.Usuario autor;
	
	public void setTexto(String value) {
		this.Texto = value;
	}
	
	public String getTexto() {
		return Texto;
	}
	
	public void setId_comentario(int value) {
		this.id_comentario = value;
	}
	
	public int getId_comentario() {
		return id_comentario;
	}
	
	public void setComenta(ocl_proyecto.Noticia value) {
		if (comenta != null) {
			comenta.tiene.remove(this);
		}
		if (value != null) {
			value.tiene.add(this);
		}
	}
	
	public ocl_proyecto.Noticia getComenta() {
		return comenta;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Comenta(ocl_proyecto.Noticia value) {
		this.comenta = value;
	}
	
	private ocl_proyecto.Noticia getORM_Comenta() {
		return comenta;
	}
	
	public void setAutor(ocl_proyecto.Usuario value) {
		if (autor != null) {
			autor.escribe.remove(this);
		}
		if (value != null) {
			value.escribe.add(this);
		}
	}
	
	public ocl_proyecto.Usuario getAutor() {
		return autor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Autor(ocl_proyecto.Usuario value) {
		this.autor = value;
	}
	
	private ocl_proyecto.Usuario getORM_Autor() {
		return autor;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
