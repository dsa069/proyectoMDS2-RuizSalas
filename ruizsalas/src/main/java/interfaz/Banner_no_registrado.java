package interfaz;

public class Banner_no_registrado extends Banner_generico {
//	private JLabel _zona_Anuncios;
//	private JButton _boton_Subscribirse;
	public Seleccion_de_secciones_generico _puede_contener;
	
	public Usuario_No_Registrado _usuarioNoRegistrado;
	public Banner_no_registrado(Usuario_No_Registrado _usuarioNoRegistrado) {
		super(_usuarioNoRegistrado);
		this._usuarioNoRegistrado = _usuarioNoRegistrado;
		this.getBotonRevisarNoticiaGenerico().setVisible(false);
		this.getBotonIniciarSesionGenerico().setVisible(false);
		this.getBotonMisNoticiasGenerico().setVisible(false);
		this.getBotonVerPeriodistasGenerico().setVisible(false);
	}
}