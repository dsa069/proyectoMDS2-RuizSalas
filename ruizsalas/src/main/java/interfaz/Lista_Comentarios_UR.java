package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Vector;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

import basededatos.BD_Principal;
import basededatos.iRegistrado;
import basededatos.iUsuario_Registardo;
import ocl_proyecto.Comentario;

public class Lista_Comentarios_UR extends Lista_Comentarios {
	//	private JButton _escribir_comentario;
	//	private JLabel _foto;
	//	private JLabel _mi_apodo;
	//	public Noticia_completa _unnamed_Noticia_completa_;
	public Vector<Lista_Comentarios_UR_item> _item = new Vector<Lista_Comentarios_UR_item>();
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/images/";
	public Image imagen;
	public Registrado _registrado;

	ocl_proyecto.Usuario user;
	ocl_proyecto.Comentario comentario;
	ocl_proyecto.Noticia notice;

	iRegistrado iRegitrao = new BD_Principal();

	public Lista_Comentarios_UR(Registrado _registrado, ocl_proyecto.Usuario usuario, ocl_proyecto.Noticia noticia) {
		super(_registrado, usuario, noticia);
		this._registrado = _registrado;
		this.notice = noticia;
		this.user = usuario;
		this.getEscribirComentario().setVisible(true);

		this.imagen = new Image();
        File file = new File(IMAGE_PATH + this.user.getFoto_de_perfil());
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
            Notification.show("File not found: " + IMAGE_PATH + this.user.getFoto_de_perfil(), 5000, Notification.Position.MIDDLE);
        }

        this.imagen.getStyle().set("align-self", "center");
        this.getLayoutImagenFotoPerfilComentar().as(VerticalLayout.class).removeAll();
        this.getLayoutImagenFotoPerfilComentar().as(VerticalLayout.class).add(this.imagen);
		
		this.getLayoutTextoNombreUsuario().setText("" + user.getApodo());

		//this.getCampoEscribirComentario().addClickListener(event->escribir_comentario()); //ESCRIBIR COMENTARIOO CLICK LISTENER???
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

	@Override
	public void Comentarios_item_Estaticos(){
		comenta = this.cargar_listar_comenatrios();
		for (int i=0; i<comenta.length; i++) {
			Lista_Comentarios_UR_item LCURI = new Lista_Comentarios_UR_item(this, user, comenta[i]);
			this.getContenedorComentariosItem().as(VerticalLayout.class).add(LCURI);
		}
	}

	//NS SI ES CORRECTO PQ ES CREAR
	public void escribir_comentario() {
		iRegitrao.escribir_comentario(comentario.getTexto(), user.getIdUsuario(), notice.getId_noticia());
		//throw new UnsupportedOperationException();
	}
}