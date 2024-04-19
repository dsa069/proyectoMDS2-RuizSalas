package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBannergenerico;

public class Banner_generico extends VistaBannergenerico{
	//	private JButton _pagina_inicio;
	//	private JLabel _nombre_del_periodico;

	public Usuario usuario;
	public Seleccion_de_secciones SS;
	
	public Banner_generico(Usuario usuario) {
		super();
		this.usuario = usuario;

		this.getRegistroLayout().setVisible(false);
		this.getIniciarSesionLayout().setVisible(false);
		this.getNoticiaUsuarioNoRegistradoLayout().setVisible(false);
		this.getCrearEditarNoticiaLayout().setVisible(false);
		this.getHistorialNoticiasLayout().setVisible(false);
		this.getRevisarNoticiasLayout().setVisible(false);
		this.getListarPeriodistaLayout().setVisible(false);
		this.getAltaPeriodistaLayout().setVisible(false);

		this.InicioPortada();
	}

	public void InicioPortada() {
		this.SS = new Seleccion_de_secciones(this.usuario);
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.SS);
	}
}