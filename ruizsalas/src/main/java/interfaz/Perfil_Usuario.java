package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import proyectoMDS.MainView;

public class Perfil_Usuario extends Banner_suscrito {
//	private JLabel _zona;
//	private JButton _cerrar_sesion;
//	private JButton _editar_perfil;
//	private JLabel _apodo;
//	private JLabel _foto;
//	private JLabel _dni;
//	private JLabel _correo;
//	private JLabel _contrasena;
//	private JLabel _tarjeta;
	public Registrado _unnamed_Registrado_;
	
	public Registrado _registrado;
	public Usuario_No_Registrado URNNN;
	public Editar_Perfil editarPerfil;
	
	public Perfil_Usuario(Registrado _registrado) {
		super(_registrado);
		this._registrado = _registrado;
		this.getNoticiaEditorLayout().setVisible(false);
		this.getNoticiaLayout().setVisible(false);
		this.getNoticiaLayoutGenerico().setVisible(false);
		this.getEditarPerfilLayout().setVisible(false);
		this.getDarseDeBajaLayout().setVisible(false);
		
		this.getBotonCerrarSesion().addClickListener(event->cerrar_sesion());
		this.getBotonEditarDatosDelPerfil().addClickListener(event->ConductorEditarPerfil());
	}

	public void cerrar_sesion() {
		this._registrado.mainView.removeAll();
		URNNN = new Usuario_No_Registrado (this.URNNN.mainView);
        this.URNNN.mainView.add(URNNN);
		//throw new UnsupportedOperationException();
	}
	
	public void ConductorEditarPerfil() {
		this.getLayoutBannerSuscrito().as(VerticalLayout.class).removeAll();
		editarPerfil = new Editar_Perfil(null);
		this.getLayoutBannerSuscrito().as(VerticalLayout.class).add(this.editarPerfil);
	}
}