package interfaz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.*;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;
import com.vaadin.flow.server.StreamResource;

import basededatos.BD_Principal;
import basededatos.iPeriodista;
import ocl_proyecto.Tematica;

public class Crear_Editar_Noticia extends Banner_Periodista {
	public Periodista _unnamed_Periodista_;
	public Zona_insertar_contenido_noticia CENoticia;	

	public Image imagen;
	public String newFileName;
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/images/";
	private static final String UPLOAD_DIR = "src/main/resources/META-INF/resources/images/";

	iPeriodista iPeriodita = new BD_Principal();

	ocl_proyecto.Noticia notice;

	public Crear_Editar_Noticia(Periodista _periodista, ocl_proyecto.Periodista periodista, ocl_proyecto.Noticia notice ) {
		super(_periodista, periodista);
		this._unnamed_Periodista_ = _periodista;
		this.notice =notice;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getCrearEditarNoticiaLayout().setVisible(true);

		//ESTATICO ZONA DATOS
		this.CENoticia = new Zona_insertar_contenido_noticia(this._periodista, this.notice);
		this.getCrearEditarNoticiaEstatico().as(VerticalLayout.class).add(this.CENoticia);





		//UPLOAD
		FileBuffer buffer = new FileBuffer();
		Upload upload = new Upload(buffer);
		upload.setAcceptedFileTypes("image/jpeg", "image/jpg", "image/png", "image/gif");

		Button uploadButton = new Button("Cargar Imagen");
		upload.setUploadButton(uploadButton);
		upload.getStyle().set("align-self", "center");
		upload.getStyle().set("background-color", "#ffffff");
		upload.getStyle().set("border-color", "#000000");
		upload.getStyle().set("border-radius", "6.9px");
		uploadButton.getStyle().set("color", "#000000");

		this.CENoticia.getModificarImagen().setVisible(isVisible());
		this.CENoticia.getModificarImagen().as(VerticalLayout.class).add(upload);

		upload.addSucceededListener(event -> {
			File uploadedFile = buffer.getFileData().getFile();
			try {
				this.newFileName = event.getFileName();
				Path destinationPath = Paths.get(UPLOAD_DIR + newFileName);
				Files.move(uploadedFile.toPath(), destinationPath);

				//DISPLAY
				this.imagen = new Image();
				File file = new File(IMAGE_PATH + this.newFileName);
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
					this.imagen.getStyle().set("align-self", "center");
					this.CENoticia.getVisulizarImagenPrincipal().as(VerticalLayout.class).removeAll();
					this.CENoticia.getVisulizarImagenPrincipal().as(VerticalLayout.class).add(this.imagen);
				}

				Notification.show("Se ha subido la imagen correctamente.");
			} catch (IOException e) {
				Notification.show("Error saving the image: " + e.getMessage(), 5000, Notification.Position.MIDDLE);
			}
		});

		upload.addFailedListener(event -> {
			Notification.show("Image upload failed: " + event.getReason().getMessage(), 5000,
					Notification.Position.MIDDLE);
		});
		upload.addFileRejectedListener(event -> {
			Notification.show("File rejected: " + event.getErrorMessage(), 5000, Notification.Position.MIDDLE);
		});

		this.getBotonEliminarNoticiaPropia().addClickListener(event->{
			this._periodista.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			historialNoticias = new Historial_noticias(this._periodista, this.periodista);
			this._periodista.getBannerGenericoEstatico().as(VerticalLayout.class).add(historialNoticias);
		});
		this.getBotonConfirmarModificacionNoticia().addClickListener(event->guardar_cambios_noticia());
	}

	public void guardar_cambios_noticia() {
		String txtC= null; 
		String txtL= null; 
		String titulo= null; 
		String img= null;
		Date fecha = null; 
		String ubi= null;

		int id = 0;
		if(this.notice != null && this.notice.getId_noticia() != 0)
			id= this.notice.getId_valoracion();

		boolean error = false;

		if (this.CENoticia.getModificarTextoCorto().getValue().isEmpty()) 
			Notification.show("Texto Corto Vacío");
		else if ( this.CENoticia.getModificarTextoLargo().isEmpty()) 
			Notification.show("Texto Largo Vacío");
		else if (this.CENoticia.getModificarTitulo().getValue().isEmpty()) 
			Notification.show("Titulo Vacío");
		else if (this.newFileName == null) 
			Notification.show("Ruta de la imagen Vacío");
		else if ( this.CENoticia.getModificarUbicacion().getValue().isEmpty()) 
			Notification.show("Ubicacion Vacía");
		else if ( this.CENoticia.getModificarFecha().getValue().isEmpty())
			Notification.show("Fecha Vacía");
		else {
			txtL = this.CENoticia.getModificarTextoLargo().getValue();
			ubi =  this.CENoticia.getModificarUbicacion().getValue();
			txtC = this.CENoticia.getModificarTextoCorto().getValue();
			img =  this.newFileName;
			titulo =  this.CENoticia.getModificarTitulo().getValue();
			try {
				fecha = Date.valueOf(this.CENoticia.getModificarFecha().getValue());
			} catch (Exception e) {
				error = true;
				Notification.show("Formato incorrcto, debe ser AAAA-MM-DD");
				e.printStackTrace();
			}
			if(!error) {			
				iPeriodita.guardar_cambios_noticia(id, txtC, txtL, titulo, img, ubi, fecha, this.CENoticia.ST.tematicasNoticia.toArray(new Tematica[0]), periodista.getIdUsuario());

				this._periodista.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
				historialNoticias = new Historial_noticias(this._periodista, this.periodista);
				this._periodista.getBannerGenericoEstatico().as(VerticalLayout.class).add(historialNoticias);
			}
		}
	}
}