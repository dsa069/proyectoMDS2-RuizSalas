package interfaz;

public class Perfil_Uusario_Vista_UR extends Perfil_Usuario {
//	private JButton _dar_de_baja;
	public Usuario_Registardo _unnamed_Usuario_Registardo_;
	public Cancelar_cobro_suscripcion _procede_a;

	public void dar_de_baja() {
		throw new UnsupportedOperationException();
	}

	public void cancelar_cobro_suscripcion() {
		throw new UnsupportedOperationException();
	}
	
	public Usuario_Registardo _usuarioRegistrado;
	public Perfil_Uusario_Vista_UR(Usuario_Registardo _usuarioRegistrado) {
		super(_usuarioRegistrado);
		this._usuarioRegistrado = _usuarioRegistrado;
		this.getDarseDeBajaLayout().setVisible(true);
		this.getBotonHistorialNoticia().setVisible(false);
		this.getBotonIrAPeriodistas().setVisible(false);
		this.getBotonRevisarNoticia().setVisible(false);
	}
}