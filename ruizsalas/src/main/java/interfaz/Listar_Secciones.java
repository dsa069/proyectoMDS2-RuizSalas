package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.*;

public class Listar_Secciones extends VistaListarsecciones{
	//public Secciones_periodico _unnamed_Secciones_periodico_;
	public Vector<Listar_Secciones_item> _item = new Vector<Listar_Secciones_item>();
	
	public Usuario usuario;
	public Listar_Secciones(Usuario usuario) {
		super();
		this.usuario = usuario;
		
		this.Secciones_item_Estatico();
		}
	
	public void Secciones_item_Estatico(){
		Listar_Secciones_item _item = new Listar_Secciones_item(this);
		this.getListarSeccionesContenedorItems().as(VerticalLayout.class).add(_item);
	}
}