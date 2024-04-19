package interfaz;
import vistas.VistaUsuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS.*;
//import basededatos.iUsuario;
import proyectoMDS.MainView;
import proyectoMDS.MainView;
public class Usuario extends VistaUsuario {

	public MainView mainView;
	public Usuario(MainView MainView) {
		this.mainView = MainView;
		
		this.Banner();
	}
	//	public iUsuario _iUsuario;
	//	public Busqueda _accede;

	public Banner_generico banner;
	public void Banner() {
		this.banner = new Banner_generico(this);
		this.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.banner);
		}
}

