package interfaz;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.*;
//import basededatos.iUsuario_Registardo;

public class Usuario_Registardo extends Registrado {
	//public iUsuario_Registardo _iUsuario_Registardo;
	//public Perfil_Uusario_Vista_UR _accede;
	public Usuario_Registardo(proyectoMDS.MainView mainView){
		super(mainView);
		
		this.Banner_UR_Inico();
	} 
	public Banner_registrado BUR;
	
	public void Banner_UR_Inico() {
		this.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		this.BUR = new Banner_registrado(null);
		this.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.BUR);	
	}
}