package interfaz;

import basededatos.BD_Principal;
import basededatos.iUsuario_No_Registrado;

public class Enviar_Correo_Confirmacion {
	public Registro _unnamed_Registro_;
	public Gestor_correo _unnamed_Gestor_correo_;
	public Confirmar_Registro CR;
	iUsuario_No_Registrado iusuarioNR = new BD_Principal();

	public void enviar_Correo_Confirmacion(Confirmar_Registro CR) {
		this.CR = CR;
		iusuarioNR.enviar_Correo_Confirmacion(CR.usuario.getApodo(), CR.usuario.getDni(), CR.usuario.getCorreo());
	}
}