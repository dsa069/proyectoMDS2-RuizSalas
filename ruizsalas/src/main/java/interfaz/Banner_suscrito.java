package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBannersuscrito;

public class Banner_suscrito extends VistaBannersuscrito{
	public Registrado registrado;

	ocl_proyecto.Usuario registradoBD;

	public Banner_suscrito(Registrado registrado, ocl_proyecto.Usuario suscrito) {
		super();
		this.registrado = registrado;
		this.registradoBD = suscrito;
	}
}