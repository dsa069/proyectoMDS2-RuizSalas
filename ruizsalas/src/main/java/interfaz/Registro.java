package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Registro extends Banner_no_registrado {
	//	private JButton _ir_a_iniciar_sesion;
	//	private JButton _confirmar_registro;
	//	private JLabel _tienes_cuenta;
	public Usuario_No_Registrado _unnamed_Usuario_No_Registrado_;
	public Iniciar_Sesion Ses;
	
	public Introducir_datos_registro Datos;
	public Confirmar_Registro Boton;
	
	ocl_proyecto.Usuario user;
	
	public Registro(Usuario_No_Registrado _usuarioNoRegistrado, ocl_proyecto.Usuario usuario) {
		super(_usuarioNoRegistrado, usuario);
		this._unnamed_Usuario_No_Registrado_ = _usuarioNoRegistrado;
		this.user = usuario;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getRegistroLayout().setVisible(true);
		this.getZonaAnunciosLayout1().setVisible(false);
		this.getZonaAnunciosLayout2().setVisible(false);

		this.Datos_Registro();
		this.Confirmar();
		
		this.getBotonIniciarSesion().addClickListener(event->ConductorIniciarSesion());
		this.getBotonCancelarRegistro().addClickListener(event->ConductorPortadaBanner());
	}
	
	public void Datos_Registro() {
		this.Datos = new Introducir_datos_registro(this._unnamed_Usuario_No_Registrado_, this.user);
		this.getDatosRegistroEstatico().as(VerticalLayout.class).add(this.Datos);
	}
	
	public void Confirmar() {
		this.Boton = new Confirmar_Registro(this._unnamed_Usuario_No_Registrado_);
		this.getBotonConfirmarRegistroEstaticoLayout().as(VerticalLayout.class).add(this.Boton);
	}

	public void ConductorIniciarSesion() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		Ses = new Iniciar_Sesion(this._unnamed_Usuario_No_Registrado_, this.usuario);
		this.getBannergenericolayout().as(VerticalLayout.class).add(Ses);
	}
}