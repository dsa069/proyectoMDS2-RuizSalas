package interfaz;
import vistas.*;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iUsuario_Registardo;
import ocl_proyecto.Tematica;

public class Seleccionar_Tematica extends VistaSeleccionartematica {
	public Vector<Seleccionar_Tematica_itema> _item = new Vector<Seleccionar_Tematica_itema>();
	public Registrado registrado;
	public Tematica[] tem;
	
	ocl_proyecto.Noticia notice;
	
	iUsuario_Registardo iUR = new BD_Principal();
	
	public Seleccionar_Tematica(Registrado registrado, ocl_proyecto.Noticia noticia) {
		super();
		this.registrado = registrado;
		this.notice = noticia;
		
		tem = cargar_tematicas_seleccion();
		for (int i=0; i<tem.length; i++) {
			Seleccionar_Tematica_itema STI = new Seleccionar_Tematica_itema(this, tem[i], this.notice);
			this.getTematicaSelecionableItem().as(VerticalLayout.class).add(STI);
		}
	}
	
	public Tematica[] cargar_tematicas_seleccion() {
		return iUR.cargar_tematicas_seleccion();
	}
}