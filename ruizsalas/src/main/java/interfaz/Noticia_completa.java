package interfaz;

public class Noticia_completa extends Banner_suscrito {
	//private JButton _me_gusta;
	//private JButton _no_me_gusta;
	//private JLabel _contenido_noticia_completo;
	public Registrado _unnamed_Registrado_;
	public Lista_Comentarios_UR _contiene;
	public Contenido_noticia_completo Noticia;
	
	ocl_proyecto.Noticia noticia;
	
	public Noticia_completa(Registrado _registrado, ocl_proyecto.Usuario_suscrito_ suscrito) {
		super(_registrado, suscrito);
		this._unnamed_Registrado_ = _registrado;
		this.getNoticiaEditorLayout().setVisible(false);
		this.getTextoPerfil().setVisible(false);
		this.getPerfilUsuarioLayout().setVisible(false);
		this.getDarseDeBajaLayout().setVisible(false);
		this.getEditarPerfilLayout().setVisible(false);
		
		this.Ver_Noticia();
	}
	
	public void Ver_Noticia() {
		this.Noticia = new Contenido_noticia_completo(this._unnamed_Registrado_, this.noticia);
		this.getNoticiaLayout().add(this.Noticia);
	}

	public void valorar_noticia() {
		throw new UnsupportedOperationException();
	}
}