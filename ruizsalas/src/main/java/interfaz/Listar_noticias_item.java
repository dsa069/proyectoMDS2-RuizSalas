package interfaz;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.*;

public class Listar_noticias_item extends Listar_noticias_generico_item {
//	private JLabel _ver_valoracion;
	public Listar_noticias _listar_noticias;
	
	ocl_proyecto.Valoracion valoracion;
	
	public Listar_noticias_item(Listar_noticias padre, ocl_proyecto.Noticia Notas) {
		super(padre, Notas);
		this._listar_noticias = padre;
		this.valoracion = Notas;
		//this.getMarcar().setVisible(false);
		this.getEliminarNoticiaPropia().setVisible(false);
		this.getEditarNoticia().setVisible(false);
		this.getAgregarNoticia().setVisible(false);
		this.getNoAgregarNoticia().setVisible(false);
		this.getZonaDeAutorYVersionDeNoticia().setVisible(false);
		this.getTitular1().setVisible(false);
		this.getQuitarNoticiaDeSeccion().setVisible(false);
		
		this.Ver_Valoracion();
		
		this.getTitular2().setText("" + Notas.getTitulo());
		
	}
	
	public ver_valoracion verValoracion;
	public void Ver_Valoracion() {
		this.verValoracion = new ver_valoracion(this._listar_noticias._usuario, this.valoracion);
		this.getVerValoracion().add(this.verValoracion);
	}
}
