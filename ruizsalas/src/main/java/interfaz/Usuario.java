package interfaz;

import vistas.VistaUsuario;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import proyectoMDS.*;
import proyectoMDS.MainView;
import proyectoMDS.MainView;

public class Usuario extends VistaUsuario {
	public Banner_generico banner;
	public MainView mainView;
	ocl_proyecto.Usuario usuario;

	public Usuario(MainView MainView, ocl_proyecto.Usuario usuario) {
		this.mainView = MainView;
		this.usuario = usuario;

		//Banner
		this.banner = new Banner_generico(this, this.usuario);
		this.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.banner);;
	}
}

