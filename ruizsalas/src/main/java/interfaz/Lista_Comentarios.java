package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iUsuario;
import ocl_proyecto.Comentario;
import vistas.*;

public class Lista_Comentarios extends VistaListacomentarios {
	//public Noticia _unnamed_Noticia_;
	public Vector<Lista_Comentarios_item> _item = new Vector<Lista_Comentarios_item>();

	public Usuario usuario;
	public Comentario[] comenta;

	ocl_proyecto.Usuario user;
	ocl_proyecto.Comentario comentario;
	ocl_proyecto.Noticia notice;
	
	iUsuario iUsu = new BD_Principal();

	public Lista_Comentarios(Usuario usuario, ocl_proyecto.Usuario user) {
		super();
		this.usuario = usuario;
		this.user = user;
		this.getEscribirComentario().setVisible(false);
		
		this.Comentarios_item_Estaticos();
	}

	public void Comentarios_item_Estaticos(){
		comenta = this.cargar_listar_comentarios();
		for (int i=0; i<comenta.length; i++) {
			Lista_Comentarios_item LCI = new Lista_Comentarios_item(this, user, comenta[i]);
			this.getContenedorComentariosItem().as(VerticalLayout.class).add(LCI);
		}
	}
	
	public Comentario[] cargar_listar_comentarios() {
		return iUsu.cargar_listar_comenatrios(notice.getId_noticia());
	}
}