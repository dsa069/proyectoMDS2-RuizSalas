package interfaz;
import vistas.*;
//import basededatos.iUsuario_Registardo;

public class Usuario_Registardo extends Registrado {
	//public iUsuario_Registardo _iUsuario_Registardo;
	//public Perfil_Uusario_Vista_UR _accede;
	public Usuario_Registardo(proyectoMDS.MainView mainView){
		super(mainView);
		
		this.getMisNoticias().setVisible(false);
		this.getRevisarNoticias().setVisible(false);
		this.getVerPeriodistas().setVisible(false);
	} 
	
}