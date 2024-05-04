package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Iniciar_Sesion extends Banner_no_registrado{
	//private Button _confirmar_Datos;
	public Usuario_No_Registrado _unnamed_Usuario_No_Registrado_;
	public Introducir_Datos _contiene;
	
	ocl_proyecto.Usuario user;

	public Iniciar_Sesion(Usuario_No_Registrado _usuarioNoRegistrado, ocl_proyecto.Usuario usuario) {
		super(_usuarioNoRegistrado, usuario);
		this._unnamed_Usuario_No_Registrado_ = _usuarioNoRegistrado;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getIniciarSesionLayout().setVisible(true);
		this.getZonaAnunciosLayout1().setVisible(false);
		this.getZonaAnunciosLayout2().setVisible(false);
		
		this.Datos_Iniciar_Sesion();

		this.getBotonCancelarSesion().addClickListener(event->ConductorRegistro());
		this.getBotonConfirmarSesion().addClickListener(event->confirmar_Datos());
	}

	public void Datos_Iniciar_Sesion() {
		this._contiene = new Introducir_Datos(this._unnamed_Usuario_No_Registrado_);
		this.getDatosIniciarSesionEstaticos().as(VerticalLayout.class).add(this._contiene);
	}
	
	public void confirmar_Datos() {//NOFUNCIONADELTODO
		//ComparacionBd
		this._unnamed_Usuario_No_Registrado_.mainView.removeAll();
        this._unnamed_Usuario_No_Registrado_.mainView.add(this._unnamed_Usuario_No_Registrado_.mainView.UR);//Para no crear otro usuario y usar el del mainview que ya esta creado al registrarse
		//throw new UnsupportedOperationException();
	}
}