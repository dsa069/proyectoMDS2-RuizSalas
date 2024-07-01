package interfaz;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Contenido_cortado_noticia extends Noticia{
	public Usuario_No_Registrado _usuario;
	public Registro reg;

	ocl_proyecto.Usuario usuario;
	ocl_proyecto.Noticia noti;

	public Contenido_cortado_noticia(Usuario_No_Registrado _usuario, ocl_proyecto.Noticia noticia, ocl_proyecto.Usuario user) {
		super(_usuario, noticia, user);
		this._usuario = _usuario;
		this.noti = noticia;
		this.usuario = user;
		this.getNoticiaCompleta().setVisible(false);
		this.getSeleccionarSecciones().setVisible(false);
		this.getSeleccionarTematicas().setVisible(false);
		this.getValorarNoticia().setVisible(false);
		this.getEliminarNoticia().setVisible(false);

		//ESTATICO LISTA COMENATRIOS
		this._contiene = new Lista_Comentarios(this._usuario, this.usuario, this.noti);
		this.getComentariosEstaticos().as(VerticalLayout.class).add(this._contiene);

		String[] arrayHTML = this.noti.getTexto_largo().split("</p>");
		String textoCorto = "";
		int parrafada = 0;

		for (String string : arrayHTML) {
			if (parrafada == 0) 
				textoCorto = string;
			parrafada = parrafada + 1;
		}
		textoCorto += "</p>";

		Html finalTextoCorto = new Html(textoCorto);
		this.getNoticiaCortada().as(VerticalLayout.class).removeAll(); 
		this.getNoticiaCortada().as(VerticalLayout.class).add(finalTextoCorto); 

		this.getBotonSuscribirseNoticia().addClickListener(event-> {
			this._usuario.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			reg = new Registro(this._usuario, this.usuario);
			this._usuario.getBannerGenericoEstatico().as(VerticalLayout.class).add(reg);
		});
	}
}