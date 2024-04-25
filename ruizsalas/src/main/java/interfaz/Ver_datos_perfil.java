package interfaz;

import vistas.VistaVerdatosperfil;

public class Ver_datos_perfil extends VistaVerdatosperfil{
	
	public Registrado registrado;
	
	ocl_proyecto.Usuario usuario;
	
	public Ver_datos_perfil(Registrado registrado, ocl_proyecto.Usuario usuario) {
		super();
		this.registrado = registrado;
		this.usuario = usuario;
		
		ocl_proyecto.Usuario_suscrito_ suscrito;
		
		this.getImagenUsuarioVerDatos().setSrc(usuario.getFoto_de_perfil());
		this.getLayoutCorreoUsuario1().setText(usuario.getCorreo());
		this.getLayoutDNIUsuario1().setText(usuario.getDni());
		this.getLayoutNickNameUsuario1().setText(usuario.getApodo());
//		this.getLayoutTarjetaCreditoUsuario1().setText(suscrito.getTarjeta_de_credito());
	}
}