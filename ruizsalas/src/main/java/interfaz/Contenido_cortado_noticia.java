package interfaz;

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

		this.getLayoutTextoCorto().setText("" + noticia.getTexto_corto());

		int noticiaTextlargo = (this.noti.getTexto_largo().length() / 2);
		String textoLargo = this.noti.getTexto_largo().substring(0, noticiaTextlargo);
		this.getNoticiaCortada().setText(textoLargo);

		this.getBotonSuscribirseNoticia().addClickListener(event-> {
			this._usuario.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			reg = new Registro(this._usuario, this.usuario);
			this._usuario.getBannerGenericoEstatico().as(VerticalLayout.class).add(reg);
		});
	}
}