package interfaz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
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
                    Notification.show("Error: " + e.getMessage(), 5000, Notification.Position.MIDDLE);
                    return null;
                }
            });

            Image image = new Image(resource, "Image not found");
            image.setMaxWidth("500px");
            this.imagen = image;
        } else {
            Notification.show("File not found: " + IMAGE_PATH + this.usuarioBD.getFoto_de_perfil(), 5000, Notification.Position.MIDDLE);
        }

        this.imagen.getStyle().set("align-self", "center");
        this.getLayoutImagenPerfilIntroducirDatos().as(VerticalLayout.class).removeAll();
        this.getLayoutImagenPerfilIntroducirDatos().as(VerticalLayout.class).add(this.imagen);

        //coger nombre usuario y contrasena
	}
}
