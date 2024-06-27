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
@Table(name="`Usuario suscrito`")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioIdUsuario", referencedColumnName="IdUsuario")
public class Usuario_suscrito_ extends ocl_proyecto.Usuario implements Serializable {
	public Usuario_suscrito_() {
	}
	
	@Column(name="Tarjeta_de_credito", nullable=true)	
	private long tarjeta_de_credito;
	
	public void setTarjeta_de_credito(long value) {
		this.tarjeta_de_credito = value;
	}
	
	public long getTarjeta_de_credito() {
		return tarjeta_de_credito;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
