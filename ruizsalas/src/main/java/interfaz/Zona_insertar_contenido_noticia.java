package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

import vistas.VistaZonainsertarcontenidonoticia;

public class Zona_insertar_contenido_noticia extends VistaZonainsertarcontenidonoticia{
	public Seleccionar_Tematica ST;
	public Periodista periodista;
	ocl_proyecto.Noticia noticia;

	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/images/";
	public Image imagen;

	public Zona_insertar_contenido_noticia(Periodista periodista, ocl_proyecto.Noticia noticia) {
		super();
		this.periodista = periodista;
		this.noticia = noticia;

		//Seleccionar temática
		this.ST = new Seleccionar_Tematica(this.periodista, this.noticia, null);
		this.getSeleccionarTematicasEstatico().as(VerticalLayout.class).add(this.ST);

		if(this.noticia != null&&this.noticia.getId_noticia() != 0) {
			this.getModificarTextoCorto().setValue(this.noticia.getTexto_corto());
			this.getModificarTextoLargo().setValue(this.noticia.getTexto_largo());
			this.getModificarTitulo().setValue(this.noticia.getTitulo());
			this.getModificarUbicacion().setValue(this.noticia.getUbicacion());
			this.getModificarFecha().setValue(String.valueOf(this.noticia.getFecha()));

			//DISPLAY IMG
			this.imagen = new Image();
			File file = new File(IMAGE_PATH + this.noticia.getImagen_principal());
			if (file.exists()) {
				StreamResource resource = new StreamResource(file.getName(), () -> {
					try {
						return new FileInputStream(file);
					} catch (FileNotFoundException e) {
						return null;
					}
				});

				Image image = new Image(resource, "Image not found");
				image.setMaxWidth("500px");
				this.imagen = image;
			} 

			this.imagen.getStyle().set("align-self", "center");
			this.getVisulizarImagenPrincipal().as(VerticalLayout.class).removeAll();
			this.getVisulizarImagenPrincipal().as(VerticalLayout.class).add(this.imagen);
		}
	}
}