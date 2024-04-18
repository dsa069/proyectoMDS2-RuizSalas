package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Registro extends Banner_no_registrado {
//	private JButton _ir_a_iniciar_sesion;
//	private JButton _confirmar_registro;
//	private JLabel _tienes_cuenta;
	public Usuario_No_Registrado _unnamed_Usuario_No_Registrado_;

	public void confirmar_Registro() {
		throw new UnsupportedOperationException();
	}
	
	public Usuario_No_Registrado _usuarioNoRegistrado;
	public Registro(Usuario_No_Registrado _usuarioNoRegistrado) {
		super(_usuarioNoRegistrado);
		this._usuarioNoRegistrado = _usuarioNoRegistrado;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getRegistroLayout().setVisible(true);
		this.getZonaAnunciosLayout1().setVisible(false);
		this.getZonaAnunciosLayout2().setVisible(false);
		
		this.getBotonIniciarSesion().addClickListener(event->ConductorIniciarSesion());
		this.getBotonCancelarRegistro().addClickListener(event->ConductorPortadaBanner());
	}
	
	public Iniciar_Sesion Ses;
	public void ConductorIniciarSesion() {
		this.getBannergenericolayout().as(VerticalLayout.class).removeAll();
		Ses = new Iniciar_Sesion(null);
		this.getBannergenericolayout().as(VerticalLayout.class).add(Ses);
		}
	
}