package interfaz;
import vistas.VistaUsuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS.*;
//import basededatos.iUsuario;
import proyectoMDS.MainView;

public class Usuario extends VistaUsuario {

	public MainView mainView;
	public Usuario(MainView MainView) {
		this.mainView = MainView;
		
		this.Banner();
	}
	//	public iUsuario _iUsuario;
	//	public Busqueda _accede;

	//Ns nada, pero lo subo pq es algo de lo estatico seguro
	//	public Busqueda _busqueda;
	//	public Usuario (MainView MainView) {
	//		this.MainView = MainView;
	//		_busqueda = new Buscar(this);
	//		Busqueda();
	//	}
//	public void Busqueda() {
//
//	}
	public Banner_generico banner;
	public void Banner() {
		this.banner = new Banner_generico(this);
		this.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.banner);
		}
}

