package interfaz;
//import basededatos.iRegistrado;
import proyectoMDS.MainView;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Registrado extends Usuario {
	public Registrado (MainView mainView){
		super(mainView);
	
		this.Banner_R_Inico();
	}
//	public iRegistrado _iRegistrado;
//	public Editar_Perfil _accede;
	
	public Banner_registrado BR;
	
	public void Banner_R_Inico() {
		this.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		this.BR = new Banner_registrado(this);
		this.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.BR);	
	}
}