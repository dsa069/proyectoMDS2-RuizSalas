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
	Noticia_completa NUN;
	
	ocl_proyecto.Noticia Notas;
	
	public Listar_noticias_generico_item(Listar_noticias_generico _listar_noticias_generico, ocl_proyecto.Noticia Notas) {
		super();
		this._listar_noticias_generico = _listar_noticias_generico;
		this.Notas = Notas;
		
//		this.getImagenListarNoticias().setSrc(Notas.getImagen_principal());
//		this.getResumenNoticia().setText(Notas.getTexto_corto());
		
		this.getBotonImagenListarNoticias().addClickListener(event->ConductorNoticiaUNR());
		this.getTitular1().addClickListener(event->ConductorNoticia());
		this.getTitular2().addClickListener(event->ConductorNoticia());
	}
	
	public void ConductorNoticiaUNR() {//Ir a noticia dependiendo del usuario
		this._listar_noticias_generico.usuario.banner.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		NUNR = new Noticia_Vista_UNR (this._listar_noticias_generico.usuario.mainView.UNR, null);
		this._listar_noticias_generico.usuario.banner.getBannergenericolayout().as(VerticalLayout.class).add(NUNR);
	}
	
	public void ConductorNoticia() {//Ir a noticia dependiendo del usuario
		this._listar_noticias_generico.usuario.banner.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
		NUN = new Noticia_completa (this._listar_noticias_generico.usuario.mainView.R, null);
		this._listar_noticias_generico.usuario.banner.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(NUN);
	}
}