package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Banner_registrado extends Banner_generico {
	//private JButton _visitar_Perfil;
	public Banner_suscrito _puede_contener;
	
	public Registrado _registrado;
	public Banner_registrado(Registrado _registrado) {
		super(_registrado);
		this._registrado = _registrado;
		this.getBotonSuscribirseGenerico().setVisible(false);
		this.getZonaAnunciosLayout1().setVisible(false);
		this.getZonaAnunciosLayout2().setVisible(false);
		
		this.getBotonIniciarSesionGenerico().addClickListener(event->ConductorPerfilUNR());
	}
	
	public Perfil_Uusario_Vista_UR PerfilURN;
	public void ConductorPerfilUNR() {
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
		PerfilURN = new Perfil_Uusario_Vista_UR(null);
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(PerfilURN);
		}
	
	public Perfil_Usuario Perfil;
	public void ConductorPerfil() {
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).removeAll();
		Perfil = new Perfil_Usuario(null);
		this.getLayoutGenericoVistaGenerica().as(VerticalLayout.class).add(Perfil);
		}
}