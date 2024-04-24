package interfaz;

import com.vaadin.flow.component.notification.Notification;
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
	public Editar_Perfil editarPerfil;
	public Ver_datos_perfil Datos;
	
	ocl_proyecto.Usuario_suscrito_ registrado;
	
	public Perfil_Usuario(Registrado _registrado, ocl_proyecto.Usuario_suscrito_ registrado) {
		super(_registrado, registrado);
		this._unnamed_Registrado_ = _registrado;
		this.getNoticiaEditorLayout().setVisible(false);
		this.getNoticiaLayout().setVisible(false);
		this.getNoticiaLayoutGenerico().setVisible(false);
		this.getEditarPerfilLayout().setVisible(false);
		this.getDarseDeBajaLayout().setVisible(false);
		
		this.Ver_Datos();
		
		this.getBotonCerrarSesion().addClickListener(event->cerrar_sesion());
		this.getBotonEditarDatosDelPerfil().addClickListener(event->ConductorEditarPerfil());
	}

	public void Ver_Datos() {
		this.Datos = new Ver_datos_perfil(this._unnamed_Registrado_);
		this.getVerDatosEstaticos().add(this.Datos);
	}
	
	public void cerrar_sesion() { 
		//Notification.show("le he dado al boton");
		this._unnamed_Registrado_.mainView.removeAll();
		//Usuario_No_Registrado URNNN = new Usuario_No_Registrado (this._unnamed_Registrado_.mainView);
        this._unnamed_Registrado_.mainView.add(this._unnamed_Registrado_.mainView.UNR);//Para no crear otro usuario y usar el del mainview que ya esta creado al registrarse
		//throw new UnsupportedOperationException();
	}
	
	public void ConductorEditarPerfil() {
		this.getLayoutBannerSuscrito().as(VerticalLayout.class).removeAll();
		editarPerfil = new Editar_Perfil(this._unnamed_Registrado_, this.registrado);
		this.getLayoutBannerSuscrito().as(VerticalLayout.class).add(this.editarPerfil);
	}
}