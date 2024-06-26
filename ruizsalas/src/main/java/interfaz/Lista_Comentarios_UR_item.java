package interfaz;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iRegistrado;

public class Lista_Comentarios_UR_item extends Lista_Comentarios_item {
	public Lista_Comentarios_UR _lista_Comentarios_UR;
	public iRegistrado iregistrao = new BD_Principal();

	ocl_proyecto.Usuario usuario;
	ocl_proyecto.Comentario comentar;
	ocl_proyecto.Usuario userSesion;

	public Lista_Comentarios_UR_item(Lista_Comentarios_UR padre, ocl_proyecto.Usuario user, ocl_proyecto.Usuario userSesion, ocl_proyecto.Comentario comentario) {
		super(padre, user, comentario);
		this._lista_Comentarios_UR = padre;
		this.usuario = user;
		this.userSesion = userSesion;
		this.comentar = comentario;
		this.getValorarComentarioNegativamente().setVisible(true);
		this.getValorarComentarioPositivamente().setVisible(true);
		this.getValorarComentarioNegativamente().addClickListener(event->valorar_comentario(false));
		this.getValorarComentarioPositivamente().addClickListener(event->valorar_comentario(true));
	}

	public void valorar_comentario(boolean valoracion) {
		iregistrao.valorar_comentario(userSesion.getIdUsuario(), comentar.getId_valoracion(), valoracion);

		this._lista_Comentarios_UR.CNC.getComentariosEstaticos().as(VerticalLayout.class).removeAll();
		_lista_Comentarios_UR.LCUR = new Lista_Comentarios_UR((Registrado) this._lista_Comentarios_UR.usuario, this._lista_Comentarios_UR.user, this._lista_Comentarios_UR.notice, this._lista_Comentarios_UR.CNC);
		this._lista_Comentarios_UR.CNC.getComentariosEstaticos().as(VerticalLayout.class).add( _lista_Comentarios_UR.LCUR);
	}
}