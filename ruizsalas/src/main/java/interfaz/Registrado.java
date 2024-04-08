package interfaz;
//import basededatos.iRegistrado;

public class Registrado extends Usuario {
	public Registrado (proyectoMDS.MainView mainView){
		super(mainView);
		
		this.getZonaAnuncios().setVisible(false);
		this.getZonaAnuncios2().setVisible(false);
	}
//	public iRegistrado _iRegistrado;
//	public Editar_Perfil _accede;
}