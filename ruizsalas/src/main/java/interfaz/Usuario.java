package interfaz;
import vistas.VistaUsuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS.*;
//import basededatos.iUsuario;
import proyectoMDS.MainView;
import proyectoMDS.MainView;
public class Usuario extends VistaUsuario {
//	public iUsuario _iUsuario;
	//	public Busqueda _accede;
	public Banner_generico banner;
	public MainView mainView;
	
	ocl_proyecto.Usuario usuario;
	
	public Usuario(MainView MainView, ocl_proyecto.Usuario usuario) {
		this.mainView = MainView;
		this.usuario = usuario;
		this.Banner();
	}

	public void Banner() {
		this.banner = new Banner_generico(this, this.usuario);
		this.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.banner);
	}
}

