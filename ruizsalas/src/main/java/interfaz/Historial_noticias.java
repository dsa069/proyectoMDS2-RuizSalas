package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Historial_noticias extends Banner_Periodista {
	//	private JButton _crear_noticia;
	//	private JScrollPanel _scroll;
	//	private JLabel _zona;
	public Periodista _unnamed_Periodista_;
	public Lista_mis_noticias _contiene;
	public Crear_Editar_Noticia CENoticia;
	
	public Historial_noticias(Periodista _periodista) {
		super(_periodista);
		this._unnamed_Periodista_ = _periodista;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getHistorialNoticiasLayout().setVisible(true);

		this.Mis_Noticias();
		
		this.getBotonCrearNoticia().addClickListener(event->ConductorCrearNoticia());
	}

	public void Mis_Noticias() {
		this._contiene = new Lista_mis_noticias(this._unnamed_Periodista_);
		this.getHistorialNoticiasEstatico().as(VerticalLayout.class).add(this._contiene);
	}
	
	public void ConductorCrearNoticia() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		CENoticia = new Crear_Editar_Noticia(this._unnamed_Periodista_);
		this.getBannergenericolayout().as(VerticalLayout.class).add(CENoticia);
	}
}