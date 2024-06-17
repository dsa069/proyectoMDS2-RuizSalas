package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

import vistas.VistaZonadeautoryversiondenoticia;

public class Zona_de_autor_y_version_de_noticia extends VistaZonadeautoryversiondenoticia{
	
	public Editor editor;
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/images/";
	public Image imagen;
	
	ocl_proyecto.Periodista periodista;
	ocl_proyecto.Noticia noticia;
	
	public Zona_de_autor_y_version_de_noticia(Editor editor, ocl_proyecto.Periodista periodista, ocl_proyecto.Noticia notice) {
		super();
		this.editor = editor;
		this.periodista = periodista;
		this.noticia = notice;
		
		imagen = new Image();
		File file = new File(IMAGE_PATH + this.periodista.getFoto_de_perfil());
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
		this.getLayoutFotoPeriodistaNoticia().as(VerticalLayout.class).removeAll();
		this.getLayoutFotoPeriodistaNoticia().as(VerticalLayout.class).add(this.imagen);
		this.getNombreAutorNoticia().setText("" + periodista.getApodo());
		this.getVersionNoticia().setText("" + String.valueOf(this.noticia.getVersion())); //Ns si es correcto pq convierte el float a String
	}

}