package interfaz;

import vistas.VistaBannersuscrito;

public class Banner_suscrito extends VistaBannersuscrito{
	public Seleccion_de_secciones_generico _unnamed_Seleccion_de_secciones_generico_;
	public Banner_Editor _unnamed_Banner_Editor_;
	public Banner_registrado _unnamed_Banner_registrado_;
	public Banner_Periodista _unnamed_Banner_Periodista_;
	
	public Registrado registrado;
	public Banner_suscrito(Registrado registrado) {
		super();
		this.registrado = registrado;
	}
}