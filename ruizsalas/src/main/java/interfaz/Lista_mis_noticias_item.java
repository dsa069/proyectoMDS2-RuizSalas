package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import UCL Proyecto.Eliminar_noticia;
import vistas.VistaListarnoticiasgenerico_item;

public class Lista_mis_noticias_item extends Listar_noticias_generico_item {
//	private JButton _editar_noticia;
	public Lista_mis_noticias _lista_mis_noticias;
	public Crear_Editar_Noticia crearEditarNoticia;
//	public Eliminar_noticia _contiene_la_opcion_de;
	
	ocl_proyecto.Periodista periodista;
	
	public Lista_mis_noticias_item(Listar_noticias_generico padre) {
		super(padre);
		this.getAgregarNoticia().setVisible(false);
		this.getNoAgregarNoticia().setVisible(false);
		this.getZonaDeAutorYVersionDeNoticia().setVisible(false);
		this.getTitular2().setVisible(false);
		this.getVerValoracion().setVisible(false);
		this.getQuitarNoticiaDeSeccion().setVisible(false);
		
		this.getEliminarNoticiaPropia().addClickListener(event->ConductorEliminarNoticia());
		this.getEditarNoticia().addClickListener(event->ConductorEditarNoticia());
	}
	
	public void ConductorEliminarNoticia() {
		//Operacion borrar en base de datos
	}
	
	public void ConductorEditarNoticia() {
		this.getLayoutGenericoListarNoticiasGenerico().as(VerticalLayout.class).removeAll();
		crearEditarNoticia = new Crear_Editar_Noticia(null, this.periodista);//Comentario cambiar el null
		this.getLayoutGenericoListarNoticiasGenerico().as(VerticalLayout.class).add(crearEditarNoticia);
	}
}