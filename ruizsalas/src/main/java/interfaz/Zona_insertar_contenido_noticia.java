package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaZonainsertarcontenidonoticia;

public class Zona_insertar_contenido_noticia extends VistaZonainsertarcontenidonoticia{
	
	public Periodista periodista;
	public Zona_insertar_contenido_noticia(Periodista periodista) {
		super();
		this.periodista = periodista;
		this.Seleccinar_Tematicas();
		
	}
	
	public Seleccionar_Tematica ST;
	public void Seleccinar_Tematicas() {
		this.ST = new Seleccionar_Tematica(null);
		this.getSeleccionarTematicasEstatico().as(VerticalLayout.class).add(this.ST);
		}
}