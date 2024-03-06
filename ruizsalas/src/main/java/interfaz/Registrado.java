package interfaz;
import proyectoMDS.*;
//import basededatos.iRegistrado;

public class Registrado extends Usuario {
	public Registrado (MainView mainView){
		super(mainView);
		
		this.getZonaAnuncios().setVisible(false);
		this.getSuscribirse().setVisible(false);
		this.getZonaAnuncios2().setVisible(false);
	}
//	public iRegistrado _iRegistrado;
//	public Editar_Perfil _accede;
}