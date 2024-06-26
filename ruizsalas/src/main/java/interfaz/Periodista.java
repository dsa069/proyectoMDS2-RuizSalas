package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import proyectoMDS.MainView;

public class Periodista extends Registrado {
	public Banner_Periodista BP;
	ocl_proyecto.Periodista periodista;

	public Periodista (MainView mainView, ocl_proyecto.Periodista periodista){
		super(mainView, periodista);
		this.periodista = periodista;
		
		//banner periodista inicio
		this.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		this.BP = new Banner_Periodista(this, this.periodista);
		this.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.BP);
	}
}