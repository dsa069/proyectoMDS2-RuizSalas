package interfaz;
import vistas.*;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iUsuario_Registardo;
import ocl_proyecto.Tematica;

public class Seleccionar_Tematica extends VistaSeleccionartematica {
//	private JLabel _tematicas;
//	public Crear_Editar_Noticia _unnamed_Crear_Editar_Noticia_;
//	public Noticia_Vista_Editor _unnamed_Noticia_Vista_Editor_;
	public Vector<Seleccionar_Tematica_itema> _item = new Vector<Seleccionar_Tematica_itema>();
	public Registrado registrado;
	public Tematica[] tem;
	
	iUsuario_Registardo iUR = new BD_Principal();
	
	public Seleccionar_Tematica(Registrado registrado) {
		super();
		this.registrado = registrado;
		
		Seleccionar_Tematica_itema _item = new Seleccionar_Tematica_itema(this,null);
		this.getTematicaSelecionableItem().as(VerticalLayout.class).add(_item);
		
		tem = cargar_tematicas_seleccion();
		for (int i=0; i<tem.length; i++) {
			Seleccionar_Tematica_itema STI = new Seleccionar_Tematica_itema(this, tem[i]);
			this.getTematicaSelecionableItem().as(VerticalLayout.class).add(STI);
		}
	}
	
	public Tematica[] cargar_tematicas_seleccion() {
		return iUR.cargar_tematicas_seleccion();
	}
}