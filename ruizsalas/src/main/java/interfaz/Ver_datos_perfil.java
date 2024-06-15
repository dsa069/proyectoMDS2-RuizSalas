package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

import ocl_proyecto.Usuario_suscrito_;
import vistas.VistaVerdatosperfil;

public class Ver_datos_perfil extends VistaVerdatosperfil{
	
	public Registrado registrado;
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/images/";
	public Image imagen;
	
	ocl_proyecto.Usuario usuario;
	ocl_proyecto.Usuario_suscrito_ suscrito;
	
	public Ver_datos_perfil(Registrado registrado, ocl_proyecto.Usuario usuario) {
		super();
		this.registrado = registrado;
		this.usuario = usuario;
//		this.suscrito = (Usuario_suscrito_) usuario;
		
		this.imagen = new Image();
        File file = new File(IMAGE_PATH + this.usuario.getFoto_de_perfil());
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
            Notification.show("File not found: " + IMAGE_PATH + this.usuario.getFoto_de_perfil(), 5000, Notification.Position.MIDDLE);
        }

        this.imagen.getStyle().set("align-self", "center");
        this.getLayoutImagenUsuarioVerDatos().as(VerticalLayout.class).removeAll();
        this.getLayoutImagenUsuarioVerDatos().as(VerticalLayout.class).add(this.imagen);
		
		this.getLayoutCorreoUsuario1().setText("" + usuario.getCorreo());
		this.getLayoutDNIUsuario1().setText("" + usuario.getDni());
		this.getLayoutNombreUsuario1().setText("" + usuario.getApodo());
		this.getLayoutContrasena().setText("" + usuario.getContrasena());
		if (this.registrado.BR.suscrito != null) {
			this.getLayoutTarjetaCreditoUsuario1().setText("" + String.valueOf(suscrito.getTarjeta_de_credito()));
		}
	}
	
	public void SelectorUsuarioPerfil() {
		//if no es UR
		this.getLayoutTarjetaCreditoUsuario1().setVisible(false);
		//else nada
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