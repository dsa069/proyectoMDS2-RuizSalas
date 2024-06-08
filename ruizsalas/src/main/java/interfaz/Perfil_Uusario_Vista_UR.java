package interfaz;

public class Perfil_Uusario_Vista_UR extends Perfil_Usuario {
//	private JButton _dar_de_baja;
	public Usuario_Registardo _unnamed_Usuario_Registardo_;
	public Cancelar_cobro_suscripcion _procede_a;
	public Darse_De_Baja Boton;
	
	public Perfil_Uusario_Vista_UR(Usuario_Registardo _usuarioRegistrado, ocl_proyecto.Usuario_suscrito_ suscrito) {
		super(_usuarioRegistrado, suscrito);
		this._unnamed_Usuario_Registardo_ = _usuarioRegistrado;
		this.getDarseDeBajaLayout().setVisible(true);
		
		this.Boton_Baja();
	}
	public void Boton_Baja() {
		this.Boton = new Darse_De_Baja(this._unnamed_Usuario_Registardo_);
		this.getDarseDeBajaLayout().add(this.Boton);
	}
	public void dar_de_baja() {
		throw new UnsupportedOperationException();
	}

	public void cancelar_cobro_suscripcion() {
		throw new UnsupportedOperationException();
	}
}