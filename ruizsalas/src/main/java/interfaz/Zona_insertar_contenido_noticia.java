package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaZonainsertarcontenidonoticia;

public class Zona_insertar_contenido_noticia extends VistaZonainsertarcontenidonoticia{
	public Seleccionar_Tematica ST;
	public Periodista periodista;
	ocl_proyecto.Noticia noticia;

	public Zona_insertar_contenido_noticia(Periodista periodista, ocl_proyecto.Noticia noticia) {
		super();
		this.periodista = periodista;
		this.noticia = noticia;

		//Seleccionar temática
		this.ST = new Seleccionar_Tematica(this.periodista, this.noticia, null);
		this.getSeleccionarTematicasEstatico().as(VerticalLayout.class).add(this.ST);
	}
}