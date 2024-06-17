package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import ocl_proyecto.Seccion;
import vistas.*;

public class Seleccion_de_secciones_Vista_Editor extends Seleccion_de_secciones {
	//private JButton _editar_secciones;
	//public Listar_noticias _unnamed_Listar_noticias_;
	public Vector<Seleccion_de_secciones_Vista_Editor_item> _item = new Vector<Seleccion_de_secciones_Vista_Editor_item>();
	public Editor _editor;
	public Seleccion_de_secciones_generico SESG;
	public Banner_registrado banerReg;
	
	ocl_proyecto.Seccion seccion;
	
	public Seleccion_de_secciones_Vista_Editor(Editor _editor, ocl_proyecto.Editor usuarioocl, Banner_registrado banerReg ) {
		super(_editor, usuarioocl, banerReg );
		this._editor = _editor;
		this.banerReg = banerReg;
		
		this.getBotonEditarSecciones().setVisible(true);
		
		this.getBotonEditarSecciones().addClickListener(event->ConductorEditarSecciones());
	}
	
	@Override
	public void Seleccion_de_secciones_item_Estatico() {
		sec = cargar_secciones();
		for (int i=0; i<sec.length; i++) {
			Seleccion_de_secciones_Vista_Editor_item SSVE = new Seleccion_de_secciones_Vista_Editor_item(this, sec[i]);
			this.getLayoutSeccionesContenidasPeriodico().add(SSVE);
		}
	}
	
	public void ConductorEditarSecciones() {
		this.banerReg.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
		SESG = new Seleccion_de_secciones_generico(this._editor, this);
		this.banerReg.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.SESG);
	}
}