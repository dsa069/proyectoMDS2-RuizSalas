package interfaz;

import vistas.*;

import java.util.ArrayList;
import java.util.Vector;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import basededatos.BD_Principal;
import basededatos.iUsuario_Registardo;
import ocl_proyecto.Tematica;

public class Seleccionar_Tematica extends VistaSeleccionartematica {
	public Registrado registrado;
	public Tematica[] tem;
	public ArrayList<Tematica> tematicasNoticia = new ArrayList<>();
	public Seleccionar_Tematica_itema STI;
	ocl_proyecto.Noticia notice;
	iUsuario_Registardo iUR = new BD_Principal();
	
	public Seleccionar_Tematica(Registrado registrado, ocl_proyecto.Noticia noticia) {
		super();
		this.registrado = registrado;
		this.notice = noticia;
		
		tem = iUR.cargar_tematicas_seleccion();
		for (int i=0; i<tem.length; i++) {
			STI = new Seleccionar_Tematica_itema(this, tem[i], this.notice, false);
			this.getTematicaSelecionableItem().as(VerticalLayout.class).add(STI);
		}
	}
}