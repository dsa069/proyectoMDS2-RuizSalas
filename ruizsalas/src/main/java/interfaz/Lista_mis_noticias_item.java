package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iPeriodista;
//import UCL Proyecto.Eliminar_noticia;
import vistas.VistaListarnoticiasgenerico_item;

public class Lista_mis_noticias_item extends Listar_noticias_generico_item {
//	private JButton _editar_noticia;
	public Lista_mis_noticias _lista_mis_noticias;
	public Crear_Editar_Noticia crearEditarNoticia;
//	public Eliminar_noticia _contiene_la_opcion_de;
	
	ocl_proyecto.Periodista periodista;
	ocl_proyecto.Noticia notice;
	
	iPeriodista iPeriodita = new BD_Principal();
	
	public Lista_mis_noticias_item(Lista_mis_noticias padre, ocl_proyecto.Noticia Notas) {
		super(padre, Notas);
		this._lista_mis_noticias = padre;
		this.getAgregarNoticia().setVisible(false);
		this.getNoAgregarNoticia().setVisible(false);
		this.getZonaDeAutorYVersionDeNoticia().setVisible(false);
		this.getTitular2().setVisible(false);
		this.getVerValoracion().setVisible(false);
		this.getQuitarNoticiaDeSeccion().setVisible(false);
		
//		this.getTitular1().setText("" + Notas.getTitulo());
		
		this.getEliminarNoticiaPropia().addClickListener(event->eliminar_noticia_propia());
		this.getEditarNoticia().addClickListener(event->ConductorEditarNoticia());
	}
	
	public void ConductorEditarNoticia() {//NO VA
		this._lista_mis_noticias.periodista.BP.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		crearEditarNoticia = new Crear_Editar_Noticia(this._lista_mis_noticias.periodista, null);
		this._lista_mis_noticias.periodista.BP.getBannergenericolayout().as(VerticalLayout.class).add(crearEditarNoticia);
	}
	
	public void eliminar_noticia_propia() {
		iPeriodita.eliminar_noticia_propia(this.notice.getId_noticia());
	}
}