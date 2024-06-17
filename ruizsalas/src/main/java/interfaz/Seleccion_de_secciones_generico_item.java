package interfaz;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.*;

public class Seleccion_de_secciones_generico_item extends VistaSelecciondeseccionesgenerico_item{
	//private JButton _ir_a_seccion;
	public Seleccion_de_secciones_generico _unnamed_Seleccion_de_secciones_generico_;
	//public Seleccion_de_secciones_generico _seleccion_de_secciones_generico;
	ocl_proyecto.Seccion secc;
	
	public Seleccion_de_secciones_generico_item(Seleccion_de_secciones_generico _seleccion_de_secciones_generico, ocl_proyecto.Seccion seccion) {
		super();
		this._unnamed_Seleccion_de_secciones_generico_ = _seleccion_de_secciones_generico;
		this.secc= seccion;
		
		this.getBotonSeccionX().setText("" + seccion.getNombre());
		this.getBotonSeccionX().addClickListener(event->ConductorSeccion());
	}
	
	public void ConductorSeccion() {
		this._unnamed_Seleccion_de_secciones_generico_._crearEditarSeccionesTematicas.getListaSeccionesEstaticas().as(VerticalLayout.class).removeAll();
		this._unnamed_Seleccion_de_secciones_generico_._crearEditarSeccionesTematicas._contiene = new Lista_secciones_Editor((Editor) this._unnamed_Seleccion_de_secciones_generico_.usuario, this.secc, this._unnamed_Seleccion_de_secciones_generico_._crearEditarSeccionesTematicas );
		this._unnamed_Seleccion_de_secciones_generico_._crearEditarSeccionesTematicas.seccionBD = this.secc;
		this._unnamed_Seleccion_de_secciones_generico_._crearEditarSeccionesTematicas.getListaSeccionesEstaticas().as(VerticalLayout.class).add(this._unnamed_Seleccion_de_secciones_generico_._crearEditarSeccionesTematicas._contiene);
	}
}