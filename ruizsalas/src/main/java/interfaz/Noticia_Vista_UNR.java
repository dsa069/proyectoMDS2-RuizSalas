package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Noticia_Vista_UNR extends Banner_no_registrado {
	public Usuario_No_Registrado _unnamed_Usuario_No_Registrado_;
	public Contenido_cortado_noticia Noticia;
	ocl_proyecto.Noticia noticia;

	public Noticia_Vista_UNR(Usuario_No_Registrado _usuarioNoRegistrado, ocl_proyecto.Usuario usuario, ocl_proyecto.Noticia notice) {
		super(_usuarioNoRegistrado, usuario);
		this._unnamed_Usuario_No_Registrado_ = _usuarioNoRegistrado;
		this.noticia = notice;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getNoticiaUsuarioNoRegistradoLayout().setVisible(true);
		//Noticia UNR
		this.Noticia = new Contenido_cortado_noticia(this._unnamed_Usuario_No_Registrado_,this.noticia);
		this.getNoticiaUsuarioNoRegistradoLayout().as(VerticalLayout.class).add(this.Noticia);
		
		this.getBotonSuscribirseGenerico().addClickListener(event->this.ConductorRegistro());
		this.getBotonSuscribirseGenerico().addClickListener(event->this.ConductorRegistro());
	}
}