package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Vector;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

import basededatos.BD_Principal;
import basededatos.iRegistrado;
import basededatos.iUsuario_Registardo;
import ocl_proyecto.Comentario;

public class Lista_Comentarios_UR extends Lista_Comentarios {
	public Vector<Lista_Comentarios_UR_item> _item = new Vector<Lista_Comentarios_UR_item>();
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/images/";
	public Image imagen;
	public Contenido_noticia_completo CNC;
	public Lista_Comentarios_UR LCUR;

	ocl_proyecto.Comentario comentario;

	iRegistrado iRegitrao = new BD_Principal();

	public Lista_Comentarios_UR(Registrado _registrado, ocl_proyecto.Usuario usuario, ocl_proyecto.Noticia noticia,Contenido_noticia_completo CNC) {
		super(_registrado, usuario, noticia);
		this.CNC = CNC;

		this.getEscribirComentario().setVisible(true);
		this.imagen = new Image();
		File file = new File(IMAGE_PATH + this.user.getFoto_de_perfil());
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
		this.getLayoutImagenFotoPerfilComentar().as(VerticalLayout.class).removeAll();
		this.getLayoutImagenFotoPerfilComentar().as(VerticalLayout.class).add(this.imagen);

		this.getLayoutTextoNombreUsuario().setText("" + user.getApodo());

		this.getBotonAnadirComentarioNoticia().addClickListener(event->escribir_comentario()); 
	}

	@Override
	public void Comentarios_item_Estaticos(){
		comenta = iUsu.cargar_listar_comenatrios(notice.getId_valoracion());
		for (int i=0; i<comenta.length; i++) {
			Us_coment = this.cargar_usuario_comenatrio(comenta[i].getId_valoracion());
			Lista_Comentarios_UR_item LCURI = new Lista_Comentarios_UR_item(this, Us_coment, this.user, comenta[i]);
			this.getContenedorComentariosItem().as(VerticalLayout.class).add(LCURI);
		}
	}

	public void escribir_comentario() {
		iRegitrao.escribir_comentario(this.getCampoEscribirComentario().getValue(), user.getIdUsuario(), notice.getId_valoracion());

		//ramadam
		this.CNC.getComentariosEstaticos().as(VerticalLayout.class).removeAll();
		LCUR = new Lista_Comentarios_UR((Registrado) this.usuario, this.user, this.notice, this.CNC);
		this.CNC.getComentariosEstaticos().as(VerticalLayout.class).add( LCUR);
	}
}