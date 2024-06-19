package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iEditor;
import vistas.*;

public class Lista_secciones_Editor_item extends Listar_Secciones_item {
	public Lista_secciones_Editor _lista_secciones_Editor;
	public Lista_noticas_Editor _contiene;
	public Editor _editor;
	public Seleccion_de_secciones_generico SES;
	
	iEditor iEdito = new BD_Principal();

	public Lista_secciones_Editor_item(Lista_secciones_Editor padre,Editor _editor, ocl_proyecto.Seccion seccion) {
		super(padre, seccion);
		this._editor = _editor;
		this._lista_secciones_Editor = padre;
		this.getBorrarSeccion().setVisible(true);
		
		this.getBorrarSeccion().addClickListener(event->borrar_seccion());
	}
	
	@Override
	public void Listar_Noticia() {
		Notification.show("AAAAAAAAAAAAAAA");
		this._contiene = new Lista_noticas_Editor(this._editor, this);
		this.getListaDeNoticiasEstatico().add(this._contiene);
		this._contiene.Noticia_item(seccion.getIdSeccion());
	}

	
	public void borrar_seccion() {
		iEdito.borrar_seccion(seccion.getIdSeccion());
		this._lista_secciones_Editor.CBT.SESG.SESVE.banerReg.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
		SES = new Seleccion_de_secciones_generico(this._lista_secciones_Editor._editor, this._lista_secciones_Editor.CBT.SESG.SESVE);
		this._lista_secciones_Editor.CBT.SESG.SESVE.banerReg.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(this.SES);
		
	}
}