package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iRegistrado;

public class Editar_Perfil extends Banner_suscrito {
	//private JButton _guardar_cambios;
	public Registrado _unnamed_Registrado_;
	public Editar_datos _unnamed_Editar_datos_;
	public Perfil_Usuario perfil;
	
	ocl_proyecto.Usuario_suscrito_ registrado;
	
	iRegistrado iRegistrao = new BD_Principal();
	
	public Editar_Perfil(Registrado _registrado, ocl_proyecto.Usuario_suscrito_ registrado) {
		super(_registrado, registrado);
		this._unnamed_Registrado_ = _registrado;
		this.getNoticiaEditorLayout().setVisible(false);
		this.getNoticiaLayout().setVisible(false);
		this.getNoticiaLayoutGenerico().setVisible(false);
		this.getPerfilUsuarioLayout().setVisible(false);
		this.getDarseDeBajaLayout().setVisible(false);

		this.Editar_Dato();
		
		this.getBotonGuardarEditarPerfil().addClickListener(event->guardar_cambios());
		this.getBotonCancelarEditarPerfil().addClickListener(event->ConductorPerfilSuscrito());
	}
	
	public void Editar_Dato() {
		this. _unnamed_Editar_datos_ = new Editar_datos(this._unnamed_Registrado_, this.registrado);
		this.getEditarDatosEstaticos().add(this. _unnamed_Editar_datos_);
	}

	public void guardar_cambios() {//CUANDO TENGAMOS LA BASE DE DATOS PONER DISTINCION ENTRE UR Y DEMAS
		//Operacion de guardar
		iRegistrao.guardar_cambios(this.registrado.getIdUsuario(), this.registrado.getApodo(), this.registrado.getDni(), this.registrado.getCorreo(), this.registrado.getContrasena(), this.registrado.getFoto_de_perfil(), this.registrado.getTarjeta_de_credito());
		this.ConductorPerfilSuscrito();
		//throw new UnsupportedOperationException();
	}
	
	public void ConductorPerfilSuscrito() {
		this.getLayoutBannerSuscrito().as(VerticalLayout.class).removeAll();
		perfil = new Perfil_Usuario(this._unnamed_Registrado_, this.registrado);
		this.getLayoutBannerSuscrito().as(VerticalLayout.class).add(this.perfil);
	}
}