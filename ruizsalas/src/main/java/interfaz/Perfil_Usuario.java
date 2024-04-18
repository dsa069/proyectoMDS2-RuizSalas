package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
	public Perfil_Usuario(Registrado _registrado) {
		super(_registrado);
		this._registrado = _registrado;
		this.getNoticiaEditorLayout().setVisible(false);
		this.getNoticiaLayout().setVisible(false);
		this.getNoticiaLayoutGenerico().setVisible(false);
		this.getEditarPerfilLayout().setVisible(false);
		this.getDarseDeBajaLayout().setVisible(false);
		
		this.getBotonCerrarSesion().addClickListener(event->ConductorCerrarSesion());
		this.getBotonEditarDatosDelPerfil().addClickListener(event->ConductorEditarPerfil());
	}

	public void cerrar_sesion() {
		throw new UnsupportedOperationException();
	}
	
	public Pagina_de_inicio pagInicio; //Preguntar al Joker y a María
	public void ConductorCerrarSesion() {
		//Operacion de cerrar sesion
		this.getLayoutBannerSuscrito().as(VerticalLayout.class).removeAll();
		pagInicio = new Pagina_de_inicio(null);
		this.getLayoutBannerSuscrito().as(VerticalLayout.class).add(this.pagInicio);
	}
	
	public Editar_Perfil editarPerfil;
	public void ConductorEditarPerfil() {
		this.getLayoutBannerSuscrito().as(VerticalLayout.class).removeAll();
		editarPerfil = new Editar_Perfil(null);
		this.getLayoutBannerSuscrito().as(VerticalLayout.class).add(this.editarPerfil);
	}
}