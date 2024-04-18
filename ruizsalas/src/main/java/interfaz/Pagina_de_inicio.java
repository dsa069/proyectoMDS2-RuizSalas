package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPaginadeinicio;

public class Pagina_de_inicio extends VistaPaginadeinicio{
	//	private JScrollPanel _scroll;
	//	private JButton _next_page;
	public Usuario _unnamed_Usuario_;
	public Noticias_en_Portada _contiene;

	public Usuario usuario;
	public Pagina_de_inicio(Usuario usuario) {
		super();
		this.usuario = usuario;
		this.Noticias_Portada();
		
	}

	public Noticias_en_Portada noticiaPortada;
	public void Noticias_Portada() {
		this.noticiaPortada = new Noticias_en_Portada(null);
		this.getListaPortadaEstatica().as(VerticalLayout.class).add(this.noticiaPortada);
	}
	
	
}