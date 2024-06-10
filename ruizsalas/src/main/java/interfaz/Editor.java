package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS.MainView;

//import basededatos.iEditor.;

public class Editor extends Registrado {
//	public Object _iEditor.;
//	public Noticia_Vista_Editor _accede;
	public Banner_Editor BE;
	ocl_proyecto.Editor editor;
	
	public Editor (MainView mainView, ocl_proyecto.Editor editor){
		super(mainView, editor);
		this.editor = editor;

		this.Banner_E_Inico();
	} 
	
	public void Banner_E_Inico() {
		this.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		this.BE = new Banner_Editor(this, this.editor);
		this.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.BE);	
	}
}