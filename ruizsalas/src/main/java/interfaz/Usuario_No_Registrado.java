package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS.MainView;

public class Usuario_No_Registrado extends Usuario {
	ocl_proyecto.Usuario usuario;
	public Usuario_No_Registrado (MainView mainView, ocl_proyecto.Usuario usuario){
		super(mainView, usuario);
		this.usuario = usuario;

		this.Banner_URN_Inico();
	} 
	public Registro _accede;
	public Banner_no_registrado BUNR;
	
	public void Banner_URN_Inico() {
		this.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		this.BUNR = new Banner_no_registrado(this, this.usuario);
		this.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.BUNR);	
	}
	
}