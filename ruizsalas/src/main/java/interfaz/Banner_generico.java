package interfaz;

import vistas.VistaBannergenerico;

public class Banner_generico extends VistaBannergenerico{
//	private JButton _pagina_inicio;
//	private JLabel _nombre_del_periodico;
	
	public Usuario usuario;
	public Banner_generico(Usuario usuario) {
		super();
		this.usuario = usuario;
	}
}