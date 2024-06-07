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
	//private JScrollPanel _scroll;
	//private JLabel _imagen_principal;
	//private JLabel _fecha;
	//private JLabel _autor;
	//private JLabel _ubicacion;
	//private JLabel _titulo;
	//private JLabel _valoracion;
	public Lista_Comentarios _contiene;

	public Usuario usuario;
	public Listar_tematicas listarTematicas;
	public ver_valoracion valoracion;
	
	ocl_proyecto.Valoracion valoracionBD;
	ocl_proyecto.Periodista periodista;
	
	public Noticia(Usuario usuario, ocl_proyecto.Noticia noticia) {
		super();
		this.usuario = usuario;
		this.Lista_De_Comentarios();
		this.Listar_Tematicas();
		this.Ver_Valoraciones();
		
//		this.setImagenPrincipalNoticia(createImageFromFile(noticia.getImagen_principal()));
//		this.getLayoutTitularVistaNoticia().setText("" + noticia.getTitulo());
//		this.getFechaNoticia().setText("" + String.valueOf(noticia.getFecha()));
//		this.getAutorNoticia().setText("" + noticia.getAutor().getApodo());
//		this.getLugarNoticia().setText("" + noticia.getUbicacion());
	}

	public void Listar_Tematicas() {
		this.listarTematicas = new Listar_tematicas(this.usuario);
		this.getTematicas().as(VerticalLayout.class).add(this.listarTematicas);
	}
	
	public void Lista_De_Comentarios() {
	}

	public void Ver_Valoraciones() {
		this.valoracion = new ver_valoracion(this.usuario, this.valoracionBD);
		this.getVerValoracionEstatico().add(this.valoracion);
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