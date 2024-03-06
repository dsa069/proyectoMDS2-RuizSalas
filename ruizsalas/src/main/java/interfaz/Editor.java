package interfaz;

import proyectoMDS.MainView;

//
//import basededatos.iEditor.;
//
public class Editor extends Registrado {
//	public Object _iEditor.;
//	public Noticia_Vista_Editor _accede;
	public Editor (MainView mainView){
		super(mainView);

		this.getRevisarNoticias().setVisible(false);
		this.getVerPeriodistas().setVisible(false);
	} 
}