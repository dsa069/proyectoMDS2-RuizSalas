package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaSeccionesperiodico;

public class Secciones_periodico extends VistaSeccionesperiodico{
	//	private JScrollPanel _scroll;
	//	private JButton _next_page;
	public Usuario _accede;
	public Listar_Secciones _contiene;

	public Usuario usuario;
	public Secciones_periodico(Usuario usuario) {
		super();
		this.usuario = usuario;
		this.Lista_Secciones();
	}

	public Listar_Secciones listaSecciones;
	public void Lista_Secciones() {
		this.listaSecciones = new Listar_Secciones(null);
		this.getListaNoticiasEstatica().as(VerticalLayout.class).add(this.listaSecciones);
	}
}