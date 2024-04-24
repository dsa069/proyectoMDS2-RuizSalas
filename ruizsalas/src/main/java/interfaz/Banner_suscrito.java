package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBannersuscrito;

public class Banner_suscrito extends VistaBannersuscrito{
	public Seleccion_de_secciones_generico _unnamed_Seleccion_de_secciones_generico_;
	public Banner_Editor _unnamed_Banner_Editor_;
	public Banner_registrado _unnamed_Banner_registrado_;
	public Banner_Periodista _unnamed_Banner_Periodista_;
	public Registrado registrado;
	
	ocl_proyecto.Usuario_suscrito_ registradoBD;

	public Banner_suscrito(Registrado registrado, ocl_proyecto.Usuario_suscrito_ registradoBD) {
		super();
		this.registrado = registrado;
		this.registradoBD = registradoBD;
	}
}