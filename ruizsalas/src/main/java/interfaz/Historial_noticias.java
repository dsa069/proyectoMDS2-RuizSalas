package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Historial_noticias extends Banner_Periodista {
//	private JButton _crear_noticia;
//	private JScrollPanel _scroll;
//	private JLabel _zona;
	public Periodista _unnamed_Periodista_;
	public Lista_mis_noticias _contiene;
	
	public Periodista _periodista;
	public Historial_noticias(Periodista _periodista) {
		super(_periodista);
		this._periodista = _periodista;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getHistorialNoticiasLayout().setVisible(true);
		
		this.getBotonCrearNoticia().addClickListener(event->ConductorCrearNoticia());
	}
	
	public Crear_Editar_Noticia CENoticia;
	public void ConductorCrearNoticia() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		CENoticia = new Crear_Editar_Noticia(null);
		this.getBannergenericolayout().as(VerticalLayout.class).add(CENoticia);
		}
}