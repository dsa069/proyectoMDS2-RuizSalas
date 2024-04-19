package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Editar_Perfil extends Banner_suscrito {
	//private JButton _guardar_cambios;
	public Registrado _unnamed_Registrado_;
	public Editar_datos _unnamed_Editar_datos_;

	public Registrado _registrado;
	public Editar_Perfil(Registrado _registrado) {
		super(_registrado);
		this._registrado = _registrado;
		this.getNoticiaEditorLayout().setVisible(false);
		this.getNoticiaLayout().setVisible(false);
		this.getNoticiaLayoutGenerico().setVisible(false);
		this.getPerfilUsuarioLayout().setVisible(false);
		this.getDarseDeBajaLayout().setVisible(false);

		this.getBotonGuardarEditarPerfil().addClickListener(event->ConductorGuardarCambios());
		this.getBotonCancelarEditarPerfil().addClickListener(event->ConductorPerfilSuscrito());
	}

	public Perfil_Usuario perfil;
	public void ConductorGuardarCambios() { //PERFIL UR???????????????????????????????????????????????????????????
		
	
	}
	
	public void guardar_cambios() {
		//Operacion de guardar
		this.ConductorPerfilSuscrito();
		//throw new UnsupportedOperationException();
	}
	
	public void ConductorPerfilSuscrito() {
		this.getLayoutBannerSuscrito().as(VerticalLayout.class).removeAll();
		perfil = new Perfil_Usuario(null);
		this.getLayoutBannerSuscrito().as(VerticalLayout.class).add(this.perfil);
	}
}