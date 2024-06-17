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
	public Editar_Perfil editarPerfil;
	public Ver_datos_perfil Datos;
	
	ocl_proyecto.Usuario_suscrito_ registrado;
	ocl_proyecto.Usuario user;
	
	public Perfil_Usuario(Registrado _registrado, ocl_proyecto.Usuario registrado) {
		super(_registrado, registrado);
		this._unnamed_Registrado_ = _registrado;
		this.user = registrado;
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
		this.Datos = new Ver_datos_perfil(this._unnamed_Registrado_, this.user);
		this.getVerDatosEstaticos().add(this.Datos);
	}
	
	public void cerrar_sesion() { 
		this._unnamed_Registrado_.mainView.removeAll();
        this._unnamed_Registrado_.mainView.add(this._unnamed_Registrado_.mainView.UNR);
	}
	
	public void ConductorEditarPerfil() {
		this.getLayoutBannerSuscrito().as(VerticalLayout.class).removeAll();
		editarPerfil = new Editar_Perfil(this._unnamed_Registrado_, this.user);
		this.getLayoutBannerSuscrito().as(VerticalLayout.class).add(this.editarPerfil);
	}
}