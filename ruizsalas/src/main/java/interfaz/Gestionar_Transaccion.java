package interfaz;

import basededatos.BD_Principal;
import basededatos.iUsuario_No_Registrado;
import basededatos.iUsuario_Registardo;

public class Gestionar_Transaccion {
	public Confirmar_Registro _unnamed_Registro_;
	public Gestor_banco _unnamed_Gestor_banco_;
	
	public iUsuario_No_Registrado iusunoreg = new BD_Principal();


	public void gestionar_Transaccion(Confirmar_Registro _unnamed_Registro_) {
		this._unnamed_Registro_=_unnamed_Registro_;
		iusunoreg.gestionar_Transaccion(this._unnamed_Registro_.usuario.getApodo(), this._unnamed_Registro_.usuario.getDni(), this._unnamed_Registro_.usuario.getCorreo(), this._unnamed_Registro_.usuario.getTarjeta_de_credito());
	}
}