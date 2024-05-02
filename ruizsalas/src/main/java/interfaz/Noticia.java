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
	
	ocl_proyecto.Valoracion valoracionBD;
	
	public Noticia(Usuario usuario, ocl_proyecto.Noticia noticia) {
		super();
		this.usuario = usuario;
		this.Lista_De_Comentarios();
		this.Listar_Tematicas();
		this.Ver_Valoraciones();
		
//		this.getImagenPrincipalNoticia().setSrc(noticia.getImagen_principal());
//		this.getLayoutTitularVistaNoticia().setText(noticia.getTitulo());
//		this.getFechaNoticia().setText(noticia.getFecha());
//		this.getAutorNoticia().setText(noticia.getAutor());
//		this.getLugarNoticia().setText(noticia.getUbicacion());
	}

	public void Listar_Tematicas() {
		this.listarTematicas = new Listar_tematicas(this.usuario);
		this.getTematicas().as(VerticalLayout.class).add(this.listarTematicas);
	}
	
	public void Lista_De_Comentarios() {
	}

	public void Ver_Valoraciones() {
		this.valoracion = new ver_valoracion(this.usuario, this.valoracionBD);
		this.getVerValoracionEstatico().add(this.valoracion);
	}
}