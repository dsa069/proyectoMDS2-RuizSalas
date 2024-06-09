package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

import vistas.VistaBannergenerico;

public class Banner_generico extends VistaBannergenerico{
	//	private JButton _pagina_inicio;
	//	private JLabel _nombre_del_periodico;

	public Usuario usuario;
	public Seleccion_de_secciones SS;
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/images/";
	public Image imagen;
	ocl_proyecto.Usuario usuarioBD;
	
	public Banner_generico(Usuario usuario, ocl_proyecto.Usuario usuarioBD) {
		super();
		this.usuario = usuario;
		this.usuarioBD = usuarioBD;

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
        this.getLayoutFotoPerfilBanner().as(VerticalLayout.class).removeAll();
        this.getLayoutFotoPerfilBanner().as(VerticalLayout.class).add(this.imagen);
		
		this.getRegistroLayout().setVisible(false);
		this.getIniciarSesionLayout().setVisible(false);
		this.getNoticiaUsuarioNoRegistradoLayout().setVisible(false);
		this.getCrearEditarNoticiaLayout().setVisible(false);
		this.getHistorialNoticiasLayout().setVisible(false);
		this.getRevisarNoticiasLayout().setVisible(false);
		this.getListarPeriodistaLayout().setVisible(false);
		this.getAltaPeriodistaLayout().setVisible(false);

		this.InicioPortada();
		
		this.getBotonpaginainicio().addClickListener(event->ConductorPortadaBanner());
	}

	public void InicioPortada() {
		this.SS = new Seleccion_de_secciones(this.usuario);
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.SS);
	}
	
	public void ConductorPortadaBanner() {
	}
}