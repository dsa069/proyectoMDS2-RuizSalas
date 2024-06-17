package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iUsuario;
import ocl_proyecto.Comentario;
import vistas.*;

public class Lista_Comentarios extends VistaListacomentarios {
	public Vector<Lista_Comentarios_item> _item = new Vector<Lista_Comentarios_item>();

	public Usuario usuario;
	public Comentario[] comenta;
	ocl_proyecto.Usuario Us_coment;

	ocl_proyecto.Usuario user;
	ocl_proyecto.Comentario comentario;
	ocl_proyecto.Noticia notice;
	
	iUsuario iUsu = new BD_Principal();

	public Lista_Comentarios(Usuario usuario, ocl_proyecto.Usuario user, ocl_proyecto.Noticia notic) {
		super();
		this.usuario = usuario;
		this.user = user;
		this.notice = notic;
		this.getEscribirComentario().setVisible(false);
		this.Comentarios_item_Estaticos();
	}

	public void Comentarios_item_Estaticos(){
		comenta = this.cargar_listar_comenatrios();
		for (int i=0; i<comenta.length; i++) {
			Us_coment = this.cargar_usuario_comenatrio(comenta[i].getId_valoracion());
			Lista_Comentarios_item LCI = new Lista_Comentarios_item(this, this.Us_coment, comenta[i]);
			this.getContenedorComentariosItem().as(VerticalLayout.class).add(LCI);
		}
	}
	
	public Comentario[] cargar_listar_comenatrios() {
		return iUsu.cargar_listar_comenatrios(notice.getId_valoracion());
	}
	
	public ocl_proyecto.Usuario cargar_usuario_comenatrio(int Id_comenatrio) {
		return iUsu.cargar_usuario_comentario(Id_comenatrio);
	}
}