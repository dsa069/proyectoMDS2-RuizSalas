package interfaz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.server.StreamResource;

import basededatos.BD_Principal;
import basededatos.iEditor;
import vistas.*;

public class Periodistas_item extends VistaPeriodistas_item {
//	private JButton _baja_periodista;
//	private JLabel _foto_periodista;
//	private JLabel _apodo_periodista;
	public Periodistas _periodistas;
	iEditor ieditor = new BD_Principal();
	ocl_proyecto.Periodista periodista;
	public Periodistas_item(Periodistas _periodistas, ocl_proyecto.Periodista periodista) {
		super();
		this._periodistas = _periodistas;
		
		this.getApodoPeriodistas().setText("" + periodista.getApodo());
//		this.setFotoPeriodistas(createImageFromFile(periodista.getFoto_de_perfil()));
				
		this.getBotonEliminarPeriodista().addClickListener(event->baja_periodista());
	}

	public void baja_periodista() {
		ieditor.baja_periodista(periodista.getIdUsuario());
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