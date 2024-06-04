package interfaz;

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
	
	ocl_proyecto.Seccion seccionBD;
	
	iEditor iEdito = new BD_Principal();

	public Crear_Editar_Secciones_Tematicas(Editor editor) {
		super();
		this._unnamed_Editor_ = editor;
		this.Lista_Secciones_Vista_Editor();
		
		this.getBotonCrearNuevaTematica().addClickListener(event->anadir_seccion());
	}

	//NS SI ES CORRECTO PQ ES CREAR
	public void anadir_seccion() {
		//Operacion base de datos anadir
		iEdito.anadir_seccion(this.seccionBD.getNombre());
		throw new UnsupportedOperationException();
	}

	public void Lista_Secciones_Vista_Editor() {
		this._contiene = new Lista_secciones_Editor(this._unnamed_Editor_);
		this.getListaSeccionesEstaticas().as(VerticalLayout.class).add(this._contiene);
	}
}