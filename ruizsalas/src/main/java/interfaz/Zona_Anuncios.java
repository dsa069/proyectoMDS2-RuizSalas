package interfaz;

import vistas.VistaZonaanuncios;

public class Zona_Anuncios extends VistaZonaanuncios{
	
	public Usuario_No_Registrado usuarioNoRegistrado;
	public Zona_Anuncios(Usuario_No_Registrado usuarioNoRegistrado) {
		super();
		this.usuarioNoRegistrado = usuarioNoRegistrado;
	}
}