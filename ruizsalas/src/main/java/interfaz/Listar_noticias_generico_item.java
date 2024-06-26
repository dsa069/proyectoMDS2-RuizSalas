package interfaz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

import ocl_proyecto.Editor;
import ocl_proyecto.EditorDAO;
import ocl_proyecto.Periodista;
import ocl_proyecto.PeriodistaDAO;
import ocl_proyecto.UsuarioDAO;
import ocl_proyecto.Usuario_suscrito_;
import ocl_proyecto.Usuario_suscrito_DAO;
import vistas.*;

public class Listar_noticias_generico_item extends VistaListarnoticiasgenerico_item {
	public Listar_noticias_generico _listar_noticias_generico;
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/images/";
	public Image imagen;

	Noticia_Vista_UNR NUNR;
	Noticia_completa NUN;
	Noticia_Vista_Editor NVE;

	ocl_proyecto.Noticia Notas;
	ocl_proyecto.Usuario user;

	public Listar_noticias_generico_item(Listar_noticias_generico _listar_noticias_generico, ocl_proyecto.Noticia Notas) {
		super();
		this._listar_noticias_generico = _listar_noticias_generico;
		this.Notas = Notas;
		this.user = this.Notas.getAutor();

		this.imagen = new Image();
		File file = new File(IMAGE_PATH + this.Notas.getImagen_principal());
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
		this.getLayoutImagenNoticiaCojonesPlaceholderRoggenrola().as(VerticalLayout.class).removeAll();
		this.getLayoutImagenNoticiaCojonesPlaceholderRoggenrola().as(VerticalLayout.class).add(this.imagen);
		this.getResumenNoticia().setText("" + Notas.getTexto_corto());
	}
}
