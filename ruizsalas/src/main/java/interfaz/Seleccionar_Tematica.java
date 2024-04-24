package interfaz;
import vistas.*;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Seleccionar_Tematica extends VistaSeleccionartematica {
//	private JLabel _tematicas;
//	public Crear_Editar_Noticia _unnamed_Crear_Editar_Noticia_;
//	public Noticia_Vista_Editor _unnamed_Noticia_Vista_Editor_;
	public Vector<Seleccionar_Tematica_itema> _item = new Vector<Seleccionar_Tematica_itema>();
	public Registrado registrado;
	public Seleccionar_Tematica(Registrado registrado) {
		super();
		this.registrado = registrado;
		
		Seleccionar_Tematica_itema _item = new Seleccionar_Tematica_itema(this,null);
		this.getTematicaSelecionableItem().as(VerticalLayout.class).add(_item);
	}
}