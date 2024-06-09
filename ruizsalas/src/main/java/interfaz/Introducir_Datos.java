package interfaz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.server.StreamResource;

import vistas.*;

public class Introducir_Datos extends VistaIntroducirdatos{
	//	private JLabel _titulo;
	//	private JButton _cancelar;
	//	private JTextField _correoTF;
	//	private JTextField _contrasenaTF;
	//	private JLabel _correoL;
	//	private JLabel _contrasenaL;
	public Iniciar_Sesion _unnamed_Iniciar_Sesion_;

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

		this.setImagenPerfilIntroducirDatos(createImageFromFile(usuarioBD.getFoto_de_perfil()));
	}

	private Image createImageFromFile(String filePath) {
		File file = new File(filePath);
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
			return image;
		} else {
			Notification.show("File not found: " + filePath, 5000, Notification.Position.MIDDLE);
			return new Image();
		}
	}
}
