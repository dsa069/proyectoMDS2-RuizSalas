package interfaz;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.*;

public class Listar_noticias_item extends Listar_noticias_generico_item {
//	private JLabel _ver_valoracion;
	public Listar_noticias _listar_noticias;
	
	public Listar_noticias_item(Listar_noticias_generico padre) {
		super(padre);
		//this.getMarcar().setVisible(false);
		this.getEliminarNoticiaPropia().setVisible(false);
		this.getEditarNoticia().setVisible(false);
		this.getAgregarNoticia().setVisible(false);
		this.getNoAgregarNoticia().setVisible(false);
		this.getZonaDeAutorYVersionDeNoticia().setVisible(false);
		this.getTitular1().setVisible(false);
		this.getQuitarNoticiaDeSeccion().setVisible(false);
		
		this.getTitular2().addClickListener(event->ConductorNoticia());
	}
}