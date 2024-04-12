package interfaz;

import vistas.VistaMensajedeerror;

public class Mensaje_de_error extends VistaMensajedeerror {
	public Usuario usuario;
	public Mensaje_de_error(Usuario usuario) {
		super();
	this.usuario = usuario;
	}	
}