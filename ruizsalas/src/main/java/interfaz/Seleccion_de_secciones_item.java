package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Seleccion_de_secciones_item extends Seleccion_de_secciones_generico_item {
	public Seleccion_de_secciones _seleccion_de_secciones;
	Secciones_periodico SesPP;
	public ocl_proyecto.Seccion seccion;
	
	public Seleccion_de_secciones_item(Seleccion_de_secciones padre, ocl_proyecto.Seccion seccion) {
		super(padre, seccion);
		this._seleccion_de_secciones = padre;
		this.seccion = seccion;
		//this.getMarcar().setVisible(false);
	}
	
	@Override
	public void ConductorSeccion() {
		//if estas en pagina de inicio te lleva a secciones pariodico
		this._seleccion_de_secciones.getLayoutGenericoSeccionesBanner().removeAll();
		SesPP = new Secciones_periodico(this._seleccion_de_secciones._usuario, this.seccion, this);
		this._seleccion_de_secciones.getLayoutGenericoSeccionesBanner().add(SesPP);
		
		
		//cargas la seccion deseada en secciones pariodico
//		this._seleccion_de_secciones._usuario.banner.SS._item.Ses().removeAll();
//		this._contiene = new Listar_Secciones(this._accede);
//		this.getListaNoticiasEstatica().as(VerticalLayout.class).add(this._contiene);
	}
}