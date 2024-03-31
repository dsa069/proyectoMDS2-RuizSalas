package interfaz;

import vistas.VistaConfirmarregistro;

public class Confirmar_Registro extends VistaConfirmarregistro{

	public Introducir_datos_registro _contiene;
	public Enviar_Correo_Confirmacion _procede_a;
	
	public void enviar_Correo_Confirmacion() {
		throw new UnsupportedOperationException();
	}

	public void gestionar_Transaccion() {
		throw new UnsupportedOperationException();
	}
	
	public Usuario_No_Registrado usuarioNoRegistrado;
	public Confirmar_Registro(Usuario_No_Registrado usuarioNoRegistrado) {
		super();
		this.usuarioNoRegistrado = usuarioNoRegistrado;
	}
}
