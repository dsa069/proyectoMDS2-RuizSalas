package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import ocl_proyecto.EditorDAO;
import ocl_proyecto.Seccion;
import vistas.*;

public class Listar_Secciones extends VistaListarsecciones{
	public Usuario usuario;
	public Secciones_periodico SecccccP;
	ocl_proyecto.Seccion seccion;
	public boolean ramadam;

	public Listar_Secciones(Usuario usuario, ocl_proyecto.Seccion secc, Secciones_periodico SecccccP, boolean ramadam) {
		super();
		this.usuario = usuario;
		this.seccion = secc;
		this.SecccccP = SecccccP;
		this.ramadam = ramadam;

		//ITEM ESTATICO NO EDITOR
		if(ramadam) {
			Listar_Secciones_item _item = new Listar_Secciones_item(this,seccion );
			this.getListarSeccionesContenedorItems().as(VerticalLayout.class).add(_item);
		}
	}
}