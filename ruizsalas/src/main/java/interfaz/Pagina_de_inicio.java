package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPaginadeinicio;

public class Pagina_de_inicio extends VistaPaginadeinicio{
	//	private JScrollPanel _scroll;
	//	private JButton _next_page;
	public Usuario _unnamed_Usuario_;
	public Noticias_en_Portada _contiene;

	public Pagina_de_inicio(Usuario usuario) {
		super();
		this._unnamed_Usuario_ = usuario;
		this.Noticias_Portada();
		
		this.getBotonContinuarPaginaInicio().addClickListener(event->ConductorSiguientePagina());
	}
	
	public void Noticias_Portada() {
		this._contiene = new Noticias_en_Portada(null);
		this.getListaPortadaEstatica().as(VerticalLayout.class).add(this._contiene);
	}
	
	public void ConductorSiguientePagina() {
		//Botón que nos lleva a la siguiente página del periódico
	}
}