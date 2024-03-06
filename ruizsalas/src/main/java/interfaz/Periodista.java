package interfaz;

import proyectoMDS.MainView;

//import basededatos.iPeriodista.;

public class Periodista extends Registrado {
	public Periodista (MainView mainView){
		super(mainView);
		
		this.getRevisarNoticias().setVisible(false);
		this.getVerPeriodistas().setVisible(false);
	}
//	public Object _iPeriodista.;
//	public Historial_noticias _accede;
}