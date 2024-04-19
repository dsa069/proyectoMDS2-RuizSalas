package interfaz;
//import basededatos.iUsuario_No_Registrado;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS.MainView;

public class Usuario_No_Registrado extends Usuario {
	public Usuario_No_Registrado (MainView mainView){
		super(mainView);

		this.Banner_URN_Inico();
	} 
//	public iUsuario_No_Registrado _iUsuario_No_Registrado;
	public Registro _accede;
	public Banner_no_registrado BUNR;
	
	public void Banner_URN_Inico() {
		this.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		this.BUNR = new Banner_no_registrado(this);
		this.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.BUNR);	
	}
	
}