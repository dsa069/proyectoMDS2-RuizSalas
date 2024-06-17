package interfaz;
//import basededatos.iPeriodista.;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS.MainView;

public class Periodista extends Registrado {
	
	ocl_proyecto.Periodista periodista;
	
	public Periodista (MainView mainView, ocl_proyecto.Periodista periodista){
		super(mainView, periodista);
		this.periodista = periodista;

		this.Banner_P_Inico();
	}

	public Banner_Periodista BP;

	public void Banner_P_Inico() {
		this.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		this.BP = new Banner_Periodista(this, this.periodista);
		this.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.BP);	
	}
}