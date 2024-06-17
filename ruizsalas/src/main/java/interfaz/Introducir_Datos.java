package interfaz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

import vistas.*;

public class Introducir_Datos extends VistaIntroducirdatos{
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/images/";
	public Image imagen;
	public Usuario usuario;

	ocl_proyecto.Usuario usuarioBD;

	public Introducir_Datos(Usuario usuario, ocl_proyecto.Usuario user) {
		super();
		this.usuario = usuario;
		this.usuarioBD = user;
		this.getZonaRegistrarPeriodista().setVisible(false);
		this.getDatosRegistro().setVisible(false);
		this.getFotoTextamen().setVisible(false);
		this.getEditarPerfil().setVisible(false);

		this.imagen = new Image();
		File file = new File(IMAGE_PATH + this.usuarioBD.getFoto_de_perfil());
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
		this.getLayoutImagenPerfilIntroducirDatos().as(VerticalLayout.class).removeAll();
		this.getLayoutImagenPerfilIntroducirDatos().as(VerticalLayout.class).add(this.imagen);
	}
}
