package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Historial_noticias extends Banner_Periodista {
	public Periodista _unnamed_Periodista_;
	public Lista_mis_noticias _contiene;
	public Crear_Editar_Noticia CENoticia;

	ocl_proyecto.Periodista periodista;

	public Historial_noticias(Periodista _periodista, ocl_proyecto.Periodista periodista) {
		super(_periodista, periodista);
		this._unnamed_Periodista_ = _periodista;
		this.periodista = periodista;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getHistorialNoticiasLayout().setVisible(true);

		//ESTATICO LISTA MIS NOTICIAS
		this._contiene = new Lista_mis_noticias(this._unnamed_Periodista_, this);
		this._contiene.Noticia_item(this.periodista.getIdUsuario());
		this.getHistorialNoticiasEstatico().as(VerticalLayout.class).add(this._contiene);

		//CREAR NOTICIA DINAMICO
		this.getBotonCrearNoticia().addClickListener(event->{
			this._unnamed_Periodista_.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			CENoticia = new Crear_Editar_Noticia(this._unnamed_Periodista_, this.periodista, null);
			this._unnamed_Periodista_.getBannerGenericoEstatico().as(VerticalLayout.class).add(CENoticia);
		});
	}
}