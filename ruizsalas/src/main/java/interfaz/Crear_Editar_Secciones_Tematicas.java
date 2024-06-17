package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;
import vistas.VistaCreareditarseccionestematicas;

public class Crear_Editar_Secciones_Tematicas extends VistaCreareditarseccionestematicas{
	//	private JButton _anadir_seccionB;
	//	private JTextField _anadir_seccionTF;
	//	private JLabel _anadir_seccionL;
	//	private Jbutton _next_page;
	//	private JScrollPanel _scroll;
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
		this.Lista_Secciones_Vista_Editor();
		
		this.getBotonCrearNuevaTematica().addClickListener(event->anadir_seccion());
		this.getCrearTematicasPalante().addClickListener(event->ConductorPagina(true));
		this.getCrearTematicasPatras().addClickListener(event->ConductorPagina(false));
	}

	//NS SI ES CORRECTO PQ ES CREAR
	public void anadir_seccion() {
		//Operacion base de datos anadir
		iEdito.anadir_seccion(this.getLabelCrearEditarSeccionesTematicas().getValue());
	}

	public void Lista_Secciones_Vista_Editor() {
		this._contiene = new Lista_secciones_Editor(this._unnamed_Editor_, this.seccionBD, this);
		this.getListaSeccionesEstaticas().as(VerticalLayout.class).add(this._contiene);
	}
	
	public void ConductorPagina(boolean Palanteopatras) {
		this.getListaSeccionesEstaticas().as(VerticalLayout.class).removeAll();
		_contiene = new Lista_secciones_Editor(this._unnamed_Editor_, this.seccionBD =  iEdito.cargar_seccion_palanteypatras_portada(this.seccionBD.getIdSeccion(), Palanteopatras), this);
		this.getListaSeccionesEstaticas().as(VerticalLayout.class).add(_contiene);
	}
}