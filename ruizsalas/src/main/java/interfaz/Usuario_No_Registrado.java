package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import proyectoMDS.MainView;

public class Usuario_No_Registrado extends Usuario {
	ocl_proyecto.Usuario usuario;
	public Banner_no_registrado BUNR;
	public Usuario_No_Registrado (MainView mainView, ocl_proyecto.Usuario usuario){
		super(mainView, usuario);
		this.usuario = usuario;
		//Banner de inicio de Usuario No Registrado
		this.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		this.BUNR = new Banner_no_registrado(this, this.usuario);
		this.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.BUNR);
	}
}