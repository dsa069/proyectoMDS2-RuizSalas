package interfaz;
import vistas.*;

public class Introducir_Datos extends VistaIntroducirdatos{
	//	private JLabel _titulo;
	//	private JButton _cancelar;
	//	private JTextField _correoTF;
	//	private JTextField _contrasenaTF;
	//	private JLabel _correoL;
	//	private JLabel _contrasenaL;
	public Iniciar_Sesion _unnamed_Iniciar_Sesion_;

	public Usuario usuario;
	public Introducir_Datos(Usuario usuario) {
		super();
		this.usuario = usuario;
		this.getZonaRegistrarPeriodista().setVisible(false);
		this.getDatosRegistro().setVisible(false);
		this.getFotoTextamen().setVisible(false);
		this.getEditarPerfil().setVisible(false);
		
		//this.getImagenPerfilIntroducirDatos().setSrc(usuarioBD.getFoto_de_perfil());
	}
}
