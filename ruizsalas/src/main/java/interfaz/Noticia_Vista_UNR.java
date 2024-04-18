package interfaz;

public class Noticia_Vista_UNR extends Banner_no_registrado {
	//private JButton _subscribirse;
	//private JLabel _contenido_cortado_noticia;
	//public Usuario_No_Registrado _unnamed_Usuario_No_Registrado_;
	
	public Usuario_No_Registrado _usuarioNoRegistrado;
	public Noticia_Vista_UNR(Usuario_No_Registrado _usuarioNoRegistrado) {
		super(_usuarioNoRegistrado);
		this._usuarioNoRegistrado = _usuarioNoRegistrado;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getNoticiaUsuarioNoRegistradoLayout().setVisible(true);
	}
}