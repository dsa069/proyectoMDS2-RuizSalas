package interfaz;

public class Perfil_Usuario extends Banner_suscrito {
//	private JLabel _zona;
//	private JButton _cerrar_sesion;
//	private JButton _editar_perfil;
//	private JLabel _apodo;
//	private JLabel _foto;
//	private JLabel _dni;
//	private JLabel _correo;
//	private JLabel _contrasena;
//	private JLabel _tarjeta;
	public Registrado _unnamed_Registrado_;
	
	public Registrado _registrado;
	public Perfil_Usuario(Registrado _registrado) {
		super(_registrado);
		this._registrado = _registrado;
		this.getNoticiaEditorLayout().setVisible(false);
		this.getNoticiaLayout().setVisible(false);
		this.getNoticiaLayoutGenerico().setVisible(false);
		this.getEditarPerfilLayout().setVisible(false);
		this.getDarseDeBajaLayout().setVisible(false);
	}

	public void cerrar_sesion() {
		throw new UnsupportedOperationException();
	}
}