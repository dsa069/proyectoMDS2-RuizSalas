package interfaz;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.*;
public class Noticia extends VistaNoticia{
	//private JScrollPanel _scroll;
	//private JLabel _imagen_principal;
	//private JLabel _fecha;
	//private JLabel _autor;
	//private JLabel _ubicacion;
	//private JLabel _titulo;
	//private JLabel _valoracion;
	public Lista_Comentarios _contiene;

	public Usuario usuario;
	public Listar_tematicas listarTematicas;
	public ver_valoracion valoracion;
	public Noticia(Usuario usuario) {
		super();
		this.usuario = usuario;
		this.Lista_De_Comentarios();
		this.Listar_Tematicas();
		this.Ver_Valoraciones();
	}

	public void Listar_Tematicas() {
		this.listarTematicas = new Listar_tematicas(null);
		this.getTematicas().as(VerticalLayout.class).add(this.listarTematicas);
	}
	
	public void Lista_De_Comentarios() {
		this._contiene = new Lista_Comentarios(null);
		this.getComentariosEstaticos().as(VerticalLayout.class).add(this._contiene);
	}

	public void Ver_Valoraciones() {
		this.valoracion = new ver_valoracion(null);
		this.getVerValoracionEstatico().add(this.valoracion);
	}
}