package interfaz;
import vistas.*;

public class Introducir_datos_registro extends Zona_registrar_periodista {
//	private JLabel _tarjetaL;
//	private JTextField _tarjetaTF;
	//public Registro _unnamed_Registro_;
	public  Usuario usuario;
	public Introducir_datos_registro(Usuario usuario) {
		super(usuario);
		this.usuario = usuario;
		this.getDatosRegistro().setVisible(true);
	}
	
}