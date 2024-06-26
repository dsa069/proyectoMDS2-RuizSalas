package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.orm.PersistentException;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;
import ocl_proyecto.UsuarioDAO;
import ocl_proyecto.Usuario_suscrito_;
import ocl_proyecto.Usuario_suscrito_DAO;
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
		try {
			this.suscrito = Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(usuario.getIdUsuario());
			if(suscrito != null) {
				this.getLayoutTarjetaCreditoUsuario1().setVisible(true);
				this.getLayoutTarjetaCreditoUsuario1().setText(""+ suscrito.getTarjeta_de_credito());
			}else
				this.getLayoutTarjetaCreditoUsuario1().setVisible(false);
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		this.imagen = new Image();
        File file = new File(IMAGE_PATH + this.usuario.getFoto_de_perfil());
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
        this.getLayoutImagenUsuarioVerDatos().as(VerticalLayout.class).removeAll();
        this.getLayoutImagenUsuarioVerDatos().as(VerticalLayout.class).add(this.imagen);
		
        this.getLayoutCorreoUsuario1().setText("" + usuario.getCorreo());
		this.getLayoutDNIUsuario1().setText("" + usuario.getDni());
		this.getLayoutNombreUsuario1().setText("" + usuario.getApodo());
		this.getLayoutContrasena().setText("" + usuario.getContrasena());
	}

}