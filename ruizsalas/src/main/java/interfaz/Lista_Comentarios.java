package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iUsuario;
import ocl_proyecto.Comentario;
import ocl_proyecto.UsuarioDAO;
import vistas.*;

public class Lista_Comentarios extends VistaListacomentarios {
	public Vector<Lista_Comentarios_item> _item = new Vector<Lista_Comentarios_item>();

	public Usuario usuario;
	public Comentario[] comenta;
	ocl_proyecto.Usuario Us_coment;

	ocl_proyecto.Usuario user;
	ocl_proyecto.Noticia notice;

	iUsuario iUsu = new BD_Principal();

	public Lista_Comentarios(Usuario usuario, ocl_proyecto.Usuario user, ocl_proyecto.Noticia notic) {
		super();
		this.usuario = usuario;
		this.user = user;
		this.notice = notic;
		this.getEscribirComentario().setVisible(false);

		try {
			if(UsuarioDAO.getUsuarioByORMID(user.getIdUsuario()) == null) {
				comenta = iUsu.cargar_listar_comenatrios(notice.getId_valoracion());
				for (int i=0; i<comenta.length; i++) {
					Us_coment = iUsu.cargar_usuario_comentario(comenta[i].getId_valoracion());
					Lista_Comentarios_item LCI = new Lista_Comentarios_item(this, this.Us_coment, comenta[i]);
					this.getContenedorComentariosItem().as(VerticalLayout.class).add(LCI);
				}
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}