package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS.MainView;

//import basededatos.iEditor.;

public class Editor extends Registrado {
//	public Object _iEditor.;
//	public Noticia_Vista_Editor _accede;
	public Banner_Editor BE;
	
	public Editor (MainView mainView){
		super(mainView);

		this.Banner_E_Inico();
	} 
	
	public void Banner_E_Inico() {
		this.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		this.BE = new Banner_Editor(null);
		this.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.BE);	
	}
}