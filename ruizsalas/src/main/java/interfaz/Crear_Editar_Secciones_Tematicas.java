package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;
import vistas.VistaCreareditarseccionestematicas;

public class Crear_Editar_Secciones_Tematicas extends VistaCreareditarseccionestematicas{
	public Editor _unnamed_Editor_;
	public Lista_secciones_Editor _contiene;
	public Seleccion_de_secciones_generico SESG;

	ocl_proyecto.Seccion seccionBD;

	iEditor iEdito = new BD_Principal();

	public Crear_Editar_Secciones_Tematicas(Editor editor, ocl_proyecto.Seccion seccionBD,  Seleccion_de_secciones_generico SESG) {
		super();
		this._unnamed_Editor_ = editor;
		this.seccionBD = seccionBD;
		this.SESG=SESG;

		//ESTATICO LISTA SECCIONES VISTA EDITOR
		this._contiene = new Lista_secciones_Editor(this._unnamed_Editor_, this.seccionBD, this);
		this.getListaSeccionesEstaticas().as(VerticalLayout.class).add(this._contiene);

	
		this.getBotonCrearNuevaTematica().addClickListener(event->anadir_seccion());
		
		//Flechas 
		this.getCrearTematicasPalante().addClickListener(event->{
			this.getListaSeccionesEstaticas().as(VerticalLayout.class).removeAll();
			_contiene = new Lista_secciones_Editor(this._unnamed_Editor_, this.seccionBD =  iEdito.cargar_seccion_palanteypatras_portada(this.seccionBD.getIdSeccion(), true), this);
			this.getListaSeccionesEstaticas().as(VerticalLayout.class).add(_contiene);
		});
		this.getCrearTematicasPatras().addClickListener(event->{
			this.getListaSeccionesEstaticas().as(VerticalLayout.class).removeAll();
			_contiene = new Lista_secciones_Editor(this._unnamed_Editor_, this.seccionBD =  iEdito.cargar_seccion_palanteypatras_portada(this.seccionBD.getIdSeccion(), false), this);
			this.getListaSeccionesEstaticas().as(VerticalLayout.class).add(_contiene);
		});
	}

	public void anadir_seccion() {
		iEdito.anadir_seccion(this.getLabelCrearEditarSeccionesTematicas().getValue());
		this.SESG.SESVE.banerReg.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
		SESG = new Seleccion_de_secciones_generico(this._unnamed_Editor_, this.SESG.SESVE);
		this.SESG.SESVE.banerReg.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.SESG);
	}
}