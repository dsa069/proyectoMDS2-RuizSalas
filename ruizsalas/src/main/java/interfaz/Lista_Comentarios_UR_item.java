package interfaz;

import com.vaadin.flow.component.notification.Notification;

import basededatos.BD_Principal;
import basededatos.iRegistrado;

public class Lista_Comentarios_UR_item extends Lista_Comentarios_item {
//	private JButton _me_gusta;
//	private JButton _no_me_gusta;
	public Lista_Comentarios_UR _lista_Comentarios_UR;
	public iRegistrado iregistrao = new BD_Principal();
	
	ocl_proyecto.Usuario usuario;
	ocl_proyecto.Comentario comentar;
	
	public Lista_Comentarios_UR_item(Lista_Comentarios_UR padre, ocl_proyecto.Usuario user, ocl_proyecto.Comentario comentario) {
		super(padre, user, comentario);
		this._lista_Comentarios_UR = padre;
		this.usuario = user;
		this.comentar = comentario;
		this.getValorarComentarioNegativamente().setVisible(true);
		this.getValorarComentarioPositivamente().setVisible(true);
		try {
		Notification.show("CUm "+this.valoracionBD.getId_valoracion());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		this.getValorarComentarioNegativamente().addClickListener(event->valorar_comentario(false));
		this.getValorarComentarioPositivamente().addClickListener(event->valorar_comentario(true));
	}
	
	public void valorar_comentario(boolean valoracion) {
		iregistrao.valorar_comentario(usuario.getIdUsuario(), comentar.getId_valoracion(), valoracion);
		this._lista_Comentarios_UR.ramadam();
	}
}