package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

import vistas.VistaZonadeautoryversiondenoticia;

public class Zona_de_autor_y_version_de_noticia extends VistaZonadeautoryversiondenoticia{
	
	public Editor editor;
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/images/";
	public Image imagen;
	
	ocl_proyecto.Periodista periodista;
	ocl_proyecto.Noticia noticia;
	
	public Zona_de_autor_y_version_de_noticia(Editor editor, ocl_proyecto.Periodista periodista) {
		super();
		this.editor = editor;
		this.periodista = periodista;
		//this.noticia = periodista.publica //SOCORRO AYUDA
		
		imagen = new Image();
		File file = new File(IMAGE_PATH + this.periodista.getFoto_de_perfil());
		if (file.exists()) {
			StreamResource resource = new StreamResource(file.getName(), () -> {
				try {
					return new FileInputStream(file);
				} catch (FileNotFoundException e) {
					Notification.show("Error: " + e.getMessage(), 5000, Notification.Position.MIDDLE);
					return null;
				}
			});
			Image image = new Image(resource, "Image not found");
			image.setMaxWidth("500px");
			this.imagen = image;
		} else {
			Notification.show("File not found: " + IMAGE_PATH + this.periodista.getFoto_de_perfil(), 5000, Notification.Position.MIDDLE);
		}
		
		this.imagen.getStyle().set("align-self", "center");
		this.getLayoutFotoPeriodistaNoticia().as(VerticalLayout.class).removeAll();
		this.getLayoutFotoPeriodistaNoticia().as(VerticalLayout.class).add(this.imagen);
		this.getNombreAutorNoticia().setText("" + periodista.getApodo());
		this.getVersionNoticia().setText("" + String.valueOf(noticia.getVersion())); //Ns si es correcto pq convierte el float a String
	}
	
//	private Image createImageFromFile(String filePath) {
//		File file = new File(filePath);
//		if (file.exists()) {
//			StreamResource resource = new StreamResource(file.getName(), () -> {
//				try {
//					return new FileInputStream(file);
//				} catch (FileNotFoundException e) {
//					Notification.show("Error: " + e.getMessage(), 5000, Notification.Position.MIDDLE);
//					return null;
//				}
//			});
//			Image image = new Image(resource, "Image not found");
//			image.setMaxWidth("500px");
//			return image;
//		} else {
//			Notification.show("File not found: " + filePath, 5000, Notification.Position.MIDDLE);
//			return new Image();
//		}
//	}
}