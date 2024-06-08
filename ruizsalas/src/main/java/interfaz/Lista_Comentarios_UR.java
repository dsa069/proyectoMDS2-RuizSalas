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

	public Registrado _registrado;

	ocl_proyecto.Usuario user;
	ocl_proyecto.Comentario comentario;

	iRegistrado iRegitrao = new BD_Principal();

	public Lista_Comentarios_UR(Registrado _registrado, ocl_proyecto.Usuario usuario) {
		super(_registrado, usuario);
		this._registrado = _registrado;
		this.getEscribirComentario().setVisible(true);

//		this.setImagenFotoPerfilComentar(createImageFromFile(user.getFoto_de_perfil()));
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
		comenta = this.cargar_listar_comentarios();
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