package interfaz;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.*;

public class Listar_noticias_generico_item extends VistaListarnoticiasgenerico_item {
//	private JButton _acceder_a_noticia;
//	private JLabel _imagen_principal;
//	private JLabel _titulo;
//	private JLabel _resumen_corto;
	public Listar_noticias_generico _listar_noticias_generico;
	
	Noticia_Vista_UNR NUNR;
	
	ocl_proyecto.Valoracion valoracion;
	
	public Listar_noticias_generico_item(Listar_noticias_generico _listar_noticias_generico) {
		super();
		this._listar_noticias_generico = _listar_noticias_generico;
		this.Zona_De_Autor_Y_Version_De_Noticia();
		this.Ver_Valoracion();
		
		this.getBotonImagenListarNoticias().addClickListener(event->ConductorNoticia());
		this.getTitular1().addClickListener(event->ConductorNoticia());
	}
	
	public Zona_de_autor_y_version_de_noticia zonaAutorYVersionDeNoticia;
	public void Zona_De_Autor_Y_Version_De_Noticia() {
		this.zonaAutorYVersionDeNoticia = new Zona_de_autor_y_version_de_noticia(null,null);
		this.getZonaDeAutorYVersionDeNoticia().add(this.zonaAutorYVersionDeNoticia);
	}

	public ver_valoracion verValoracion;
	public void Ver_Valoracion() {
		this.verValoracion = new ver_valoracion(null, this.valoracion);
		this.getVerValoracion().add(this.verValoracion);
	}
	
	public void ConductorNoticia() {//Ir a noticia dependiendo del usuario
		this._listar_noticias_generico.usuario.banner.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		//NUNR = new Noticia_Vista_UNR (this._listar_noticias_generico.usuario, null);
		this._listar_noticias_generico.usuario.banner.getBannergenericolayout().as(VerticalLayout.class).add(_listar_noticias_generico);
	}
}