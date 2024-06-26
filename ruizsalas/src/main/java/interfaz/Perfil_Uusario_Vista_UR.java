package interfaz;

public class Perfil_Uusario_Vista_UR extends Perfil_Usuario {
	public Usuario_Registardo _unnamed_Usuario_Registardo_;
	public Darse_De_Baja Boton;
	ocl_proyecto.Usuario_suscrito_ user;

	public Perfil_Uusario_Vista_UR(Usuario_Registardo _usuarioRegistrado, ocl_proyecto.Usuario_suscrito_ suscrito) {
		super(_usuarioRegistrado, suscrito);
		this._unnamed_Usuario_Registardo_ = _usuarioRegistrado;
		this.user = suscrito;
		this.getDarseDeBajaLayout().setVisible(true);
		
		//Darse de baja
		this.Boton = new Darse_De_Baja(this._unnamed_Usuario_Registardo_, this.user);
		this.getDarseDeBajaLayout().add(this.Boton);
	}
}