package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iRegistrado;
import basededatos.iUsuario_Registardo;

public class Contenido_noticia_completo extends Noticia {
	public Registrado _registrado;
	public iRegistrado iregistrado = new BD_Principal();
	
	ocl_proyecto.Usuario usuario;
	ocl_proyecto.Noticia noticia;
	
	
	public Contenido_noticia_completo(Registrado registrado, ocl_proyecto.Usuario usuario, ocl_proyecto.Noticia noticia) {
		super(registrado, noticia);
		this._registrado = registrado;
		this.noticia = noticia;
		this.usuario = usuario;
		this.getNoticiaCortada().setVisible(false);
		this.getSeleccionarSecciones().setVisible(false);
		this.getSeleccionarTematicas().setVisible(false);
		this.getEliminarNoticia().setVisible(false);
		this.getBotonSuscribirse().setVisible(false);
		
		this.Lista_De_ComentariosComp();
		this.getNoticiaCompleta().setText("" + noticia.getTexto_largo());
		
		this.getBotonLikeNoticia().addClickListener(event->valorar_noticia(true));
		this.getBotonNotLikeNoticia().addClickListener(event->valorar_noticia(false));
	}
	
	public void Lista_De_ComentariosComp() {
		this._contiene = new Lista_Comentarios_UR(this._registrado, this.usuario, this.noticia,this);
		this.getComentariosEstaticos().as(VerticalLayout.class).add(this._contiene);
	}
	
	public void valorar_noticia(boolean valoracion) {
		iregistrado.valorar_noticia(usuario.getIdUsuario(), noticia.getId_valoracion(), valoracion);
	}
}