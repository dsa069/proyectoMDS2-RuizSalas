package interfaz;

import basededatos.BD_Principal;
import basededatos.iUsuario_No_Registrado;
import basededatos.iUsuario_Registardo;

public class Cancelar_cobro_suscripcion {
	public Darse_De_Baja _unnamed_Perfil_Uusario_Vista_UR_;
	public Gestor_banco _unnamed_Gestor_banco_;
	ocl_proyecto.Usuario_suscrito_ suscrito;
	iUsuario_Registardo iusuarioR = new BD_Principal();

	public void cancelar_cobro_suscripcion( Darse_De_Baja _unnamed_Perfil_Uusario_Vista_UR_) {
		this._unnamed_Perfil_Uusario_Vista_UR_=_unnamed_Perfil_Uusario_Vista_UR_;
		iusuarioR.cancelar_cobro_suscripcion(this._unnamed_Perfil_Uusario_Vista_UR_.suscrito.getApodo(), this._unnamed_Perfil_Uusario_Vista_UR_.suscrito.getDni(), this._unnamed_Perfil_Uusario_Vista_UR_.suscrito.getCorreo(), this._unnamed_Perfil_Uusario_Vista_UR_.suscrito.getTarjeta_de_credito());
	}
}