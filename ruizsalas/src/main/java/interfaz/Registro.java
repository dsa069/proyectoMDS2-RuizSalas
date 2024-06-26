package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Registro extends Banner_no_registrado {
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
		//datos registro
		this.Datos = new Introducir_datos_registro(this._unnamed_Usuario_No_Registrado_, this.user);
		this.getDatosRegistroEstatico().as(VerticalLayout.class).add(this.Datos);
		
		//confirmar
		this.Boton = new Confirmar_Registro(this._unnamed_Usuario_No_Registrado_, this.Datos);
		this.getBotonConfirmarRegistroEstaticoLayout().as(VerticalLayout.class).add(this.Boton);
		
		this.getBotonIniciarSesion().addClickListener(event->{
			this._unnamed_Usuario_No_Registrado_.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			Ses = new Iniciar_Sesion(this._unnamed_Usuario_No_Registrado_, this.usuario);
			this._unnamed_Usuario_No_Registrado_.getBannerGenericoEstatico().as(VerticalLayout.class).add(Ses);});
		
		this.getBotonCancelarRegistro().addClickListener(event->{
			this._usuarioNoRegistrado.getBannerGenericoEstatico().as(VerticalLayout.class).removeAll();
			noRegistro = new Banner_no_registrado(this._usuarioNoRegistrado, this.usuario);
			this._usuarioNoRegistrado.getBannerGenericoEstatico().as(VerticalLayout.class).add(noRegistro);	
		});
	}
}