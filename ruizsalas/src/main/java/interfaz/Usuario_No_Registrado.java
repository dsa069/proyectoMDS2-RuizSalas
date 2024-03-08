package interfaz;
//import basededatos.iUsuario_No_Registrado;

public class Usuario_No_Registrado extends Usuario {
	public Usuario_No_Registrado (proyectoMDS.MainView mainView){
		super(mainView);

		this.getMisNoticias().setVisible(false);
		this.getIniciarSesion().setVisible(false);
		this.getRevisarNoticias().setVisible(false);
		this.getVerPeriodistas().setVisible(false);
	} 
//	public iUsuario_No_Registrado _iUsuario_No_Registrado;
//	public Registro _accede;
}