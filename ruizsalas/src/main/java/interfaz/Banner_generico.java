package interfaz;

import vistas.VistaBannergenerico;

public class Banner_generico extends VistaBannergenerico{
//	private JButton _pagina_inicio;
//	private JLabel _nombre_del_periodico;
	
	public Usuario usuario;
	public Banner_generico(Usuario usuario) {
		super();
		this.usuario = usuario;
		
		this.getRegistroLayout().setVisible(false);
		this.getIniciarSesionLayout().setVisible(false);
		this.getNoticiaUsuarioNoRegistradoLayout().setVisible(false);
		this.getCrearEditarNoticiaLayout().setVisible(false);
		this.getHistorialNoticiasLayout().setVisible(false);
		this.getRevisarNoticiasLayout().setVisible(false);
		this.getPeriodistaLayout1().setVisible(false);
		this.getAltaPeriodistaLayout().setVisible(false);
	}
}