package interfaz;

public class Editar_Perfil extends Banner_suscrito {
	//private JButton _guardar_cambios;
	public Registrado _unnamed_Registrado_;
	public Editar_datos _unnamed_Editar_datos_;

	public void guardar_cambios() {
		throw new UnsupportedOperationException();
	}
	
	public Registrado _registrado;
	public Editar_Perfil(Registrado _registrado) {
		super(_registrado);
		this._registrado = _registrado;
		this.getNoticiaEditorLayout().setVisible(false);
		this.getNoticiaLayout().setVisible(false);
		this.getNoticiaLayoutGenerico().setVisible(false);
		this.getPerfilUsuarioLayout().setVisible(false);
		this.getDarseDeBajaLayout().setVisible(false);
	}
}