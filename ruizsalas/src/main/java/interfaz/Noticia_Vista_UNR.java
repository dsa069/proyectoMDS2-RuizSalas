package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Noticia_Vista_UNR extends Banner_no_registrado {
	//private JButton _subscribirse;
	//private JLabel _contenido_cortado_noticia;
	public Usuario_No_Registrado _unnamed_Usuario_No_Registrado_;
	public Contenido_cortado_noticia Noticia;

	public Noticia_Vista_UNR(Usuario_No_Registrado _usuarioNoRegistrado, ocl_proyecto.Usuario usuario) {
		super(_usuarioNoRegistrado, usuario);
		this._unnamed_Usuario_No_Registrado_ = _usuarioNoRegistrado;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getNoticiaUsuarioNoRegistradoLayout().setVisible(true);
		
		this.Noticia_UNR();
	}
	
	public void Noticia_UNR() {
		this.Noticia = new Contenido_cortado_noticia(this._unnamed_Usuario_No_Registrado_);
		this.getNoticiaUsuarioNoRegistradoLayout().as(VerticalLayout.class).add(this.Noticia);
	}
}