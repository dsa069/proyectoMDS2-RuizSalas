package basededatos;

import ocl_proyecto.Usuario;

public interface iUsuario_No_Registrado extends iUsuario {

	public void enviar_Correo_Confirmacion(String aApodo, String aDni, String aCorreo);

	public void gestionar_Transaccion(String aApodo, String aDni, String aCorreo, String aTarjeta_de_credito);

	public void enviar_Correo_Confirmacion();

	public Usuario gestionar_Transaccion(String aCorreo, String aContrasena, String aApodo, String aFoto_de_perfil, String aDni, String aTarjeta_de_credito);

	public Usuario confirmar_Datos(String aCorreo, String aContrasena);
}