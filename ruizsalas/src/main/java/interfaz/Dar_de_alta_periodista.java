package interfaz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;

import basededatos.BD_Principal;
import basededatos.iEditor;

public class Dar_de_alta_periodista extends Banner_Editor {
	public Editor _unnamed_Editor_;
	public Zona_registrar_periodista _contiene;
	public Lista_periodistas LP;

	public String newFileName;
	private static final String UPLOAD_DIR = "src/main/resources/META-INF/resources/images/";

	ocl_proyecto.Editor editor;
	ocl_proyecto.Periodista periodista = new ocl_proyecto.Periodista();

	iEditor iEdito = new BD_Principal();

	public Dar_de_alta_periodista(Editor _editor, ocl_proyecto.Editor editor) {
		super(_editor, editor);
		this._unnamed_Editor_ = _editor;
		this.editor = editor;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getAltaPeriodistaLayout().setVisible(true);

		//ESTATICO DATOS REGISTAR PERIODISTA
		this._contiene = new Zona_registrar_periodista(this._unnamed_Editor_, this.editor);
		this.getDatosPeriodistaAnadirEstatico().as(VerticalLayout.class).add(this._contiene);


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

		this._contiene.getFotoTextamen().setVisible(isVisible());
		this._contiene.getFotoTextamen().as(VerticalLayout.class).add(upload);

		upload.addSucceededListener(event -> {
			File uploadedFile = buffer.getFileData().getFile();
			try {
				this.newFileName = event.getFileName();
				Path destinationPath = Paths.get(UPLOAD_DIR + newFileName);
				Files.move(uploadedFile.toPath(), destinationPath);

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

		this.getBotonCancelarAnadirPeriodista().addClickListener(event-> {
			this._unnamed_Editor_.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			LP = new Lista_periodistas(this._unnamed_Editor_, this.editor);
			this._unnamed_Editor_.getBannerGenericoEstatico().as(VerticalLayout.class).add(LP);
		});
		this.getBotonConfirmarAnadirPeriodista().addClickListener(event-> this.registrar_periodista());
	}

	public void registrar_periodista() {

		String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";

		if (this._contiene.getCampoEmail().getValue().isEmpty()) 
			Notification.show("Email Vacío");
		else if ( this._contiene.getCampoContrasena().isEmpty()) 
			Notification.show("Contraseña Vacía");
		else if ( this._contiene.getCampoApodo().getValue().isEmpty()) 
			Notification.show("Apodo Vacío");
		else if (this.newFileName == null) 
			Notification.show("Ruta de foto Vacía");
		else if ( this._contiene.getCampoDNI().getValue().isEmpty()) 
			Notification.show("DNI Vacío");
		else if ( this._contiene.getCampoDNI().getValue().length() != 9)
			Notification.show("El DNI debe tener 9 caracteres");
		else if( !this._contiene.getCampoContrasena().getValue().matches(passwordPattern))
			Notification.show("La contrasña debe tener al menos ocho caracteres, un número, una mayúscula, y una minúscula");
		else if (!Character.isLetter(this._contiene.getCampoDNI().getValue().charAt(8))) 
			Notification.show("El DNI debe tener una letra al final");
		else if(!Character.isDigit(this._contiene.getCampoDNI().getValue().charAt(0))||!Character.isDigit(this._contiene.getCampoDNI().getValue().charAt(1))||
				!Character.isDigit(this._contiene.getCampoDNI().getValue().charAt(2))||!Character.isDigit(this._contiene.getCampoDNI().getValue().charAt(3))||
				!Character.isDigit(this._contiene.getCampoDNI().getValue().charAt(4))||!Character.isDigit(this._contiene.getCampoDNI().getValue().charAt(5))||
				!Character.isDigit(this._contiene.getCampoDNI().getValue().charAt(6))||!Character.isDigit(this._contiene.getCampoDNI().getValue().charAt(7)))
			Notification.show("El DNI solo debe tener una letra al final");
		else {
			iEdito.registrar_periodista(this._contiene.getCampoApodo().getValue(), this._contiene.getCampoDNI().getValue(), this._contiene.getCampoEmail().getValue(), this._contiene.getCampoContrasena().getValue(), this.newFileName);
			this._unnamed_Editor_.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			LP = new Lista_periodistas(this._unnamed_Editor_, this.editor);
			this._unnamed_Editor_.getBannerGenericoEstatico().as(VerticalLayout.class).add(LP);
		}
	}
}