package interfaz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

import vistas.*;
public class Noticia extends VistaNoticia{
	public Lista_Comentarios _contiene;
	public Usuario usuario;
	public Listar_tematicas listarTematicas;
	public ver_valoracion valoracion;
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/images/";
	public Image imagen;
	ocl_proyecto.Valoracion valoracionBD;
	ocl_proyecto.Noticia notice;
	
	public Noticia(Usuario usuario, ocl_proyecto.Noticia noticia) {
		super();
		this.usuario = usuario;
		this.valoracionBD = noticia;
		this.notice = noticia;
		this.Listar_Tematicas();
		//ver valoraciones
		this.valoracion = new ver_valoracion(this.usuario, this.valoracionBD);
		this.getVerValoracionEstatico().add(this.valoracion);
		
		this.imagen = new Image();
        File file = new File(IMAGE_PATH + this.notice.getImagen_principal());
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
        this.getLayoutImagenPrincipalNoticia().as(VerticalLayout.class).removeAll();
        this.getLayoutImagenPrincipalNoticia().as(VerticalLayout.class).add(this.imagen);
		
		this.getLayoutTitularVistaNoticia().setText("" + this.notice.getTitulo());
		this.getFechaNoticia().setText("" + String.valueOf(this.notice.getFecha()));
		this.getAutorNoticia().setText("" + this.notice.getAutor().getApodo());
		this.getLugarNoticia().setText("" + this.notice.getUbicacion());
	}

	public void Listar_Tematicas() {
		this.listarTematicas = new Listar_tematicas(this.usuario, this.notice);
		this.getTematicas().as(VerticalLayout.class).add(this.listarTematicas);
	}
}