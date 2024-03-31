package interfaz;
import vistas.*;
public class Zona_registrar_periodista extends Introducir_Datos{
//	private JTextField _apodoTF;
//	private JTextField _fotoTF;
//	private JTextField _dniTF;
//	private JLabel _fotoL;
//	private JLabel _apodoL;
//	private JLabel _dniL;
//	public Dar_de_alta_periodista _unnamed_Dar_de_alta_periodista_;
	
	public  Usuario usuario;
	public Zona_registrar_periodista(Usuario usuario) {
		super(usuario);
		this.usuario = usuario;
		this.getZonaRegistrarPeriodista().setVisible(true);
		this.getFotoTexto().setVisible(true);
	}
}