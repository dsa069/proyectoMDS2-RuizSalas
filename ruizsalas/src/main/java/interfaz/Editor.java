package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS.MainView;

public class Editor extends Registrado {
	public Banner_Editor BE;
	ocl_proyecto.Editor editor;
	
	public Editor (MainView mainView, ocl_proyecto.Editor editor){
		super(mainView, editor);
		this.editor = editor;

		//MAINVIEW A BANNER
		this.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
		this.BE = new Banner_Editor(this, this.editor);
		this.getBannerGenericoEstatico().as(VerticalLayout.class).add(this.BE);	
	} 
}