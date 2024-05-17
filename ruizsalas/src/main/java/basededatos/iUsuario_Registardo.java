package basededatos;

public interface iUsuario_Registardo extends iRegistrado {

	public void cancelar_cobro_suscripcion(String aApodo, String aDni, String aCorreo, String aTarjeta_de_credito);

	public void cancelar_cobro_suscripcion(int aIdUsuario);
}