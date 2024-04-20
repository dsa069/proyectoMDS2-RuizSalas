package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaSeccionesperiodico;

public class Secciones_periodico extends VistaSeccionesperiodico{
	//	private JScrollPanel _scroll;
	//	private JButton _next_page;
	public Usuario _accede;
	public Listar_Secciones _contiene;

	public Secciones_periodico(Usuario usuario) {
		super();
		this._accede = usuario;
		this.Lista_Secciones();
		
		this.getBotonAvazarPaginaPeriodico().addClickListener(event->ConductorPaginaSiguiente());
		this.getBotonVolverPaginaAnterior().addClickListener(event->ConductorPaginaAnterior());
	}

	public void Lista_Secciones() {
		this._contiene = new Listar_Secciones(null);
		this.getListaNoticiasEstatica().as(VerticalLayout.class).add(this._contiene);
	}
	
	public void ConductorPaginaSiguiente() {
		//Botón que nos lleva a la siguiente página del periódico
	}
	
	public void ConductorPaginaAnterior() {
		//Botón que nos lleva a la siguiente página del periódico
	}
}