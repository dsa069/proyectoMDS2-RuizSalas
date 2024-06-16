package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Contenido_cortado_noticia extends Noticia{
	public Usuario_No_Registrado _usuario;
	public Registro reg;
	
	ocl_proyecto.Usuario usuario;
	ocl_proyecto.Noticia noti;
	
	public Contenido_cortado_noticia(Usuario_No_Registrado _usuario, ocl_proyecto.Noticia noticia) {
		super(_usuario, noticia);
		this._usuario = _usuario;
		this.noti = noticia;
		this.getNoticiaCompleta().setVisible(false);
		this.getSeleccionarSecciones().setVisible(false);
		this.getSeleccionarTematicas().setVisible(false);
		this.getValorarNoticia().setVisible(false);
		this.getEliminarNoticia().setVisible(false);
		
		this.Lista_De_Comentarios_UNR();
//		this.Listar_Tematicas();
		
		this.getNoticiaCortada().setText("" + noticia.getTexto_corto());
		
		this.getBotonSuscribirseNoticia().addClickListener(event->ConductorRegistro());
	}
	
	public void Lista_De_Comentarios_UNR() {
		this._contiene = new Lista_Comentarios(this._usuario, this.usuario, this.noti);
		this.getComentariosEstaticos().as(VerticalLayout.class).add(this._contiene);
	}
	
//	public void Listar_Tematicas() {
//		this.listarTematicas = new Listar_tematicas(this._usuario, this.noti);
//		this.getTematicas().as(VerticalLayout.class).add(this.listarTematicas);
//	}
	
	public void ConductorRegistro() {
		this._usuario.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		reg = new Registro(this._usuario, this.usuario);
		this._usuario.getBannerGenericoEstatico().as(VerticalLayout.class).add(reg);
	}
}