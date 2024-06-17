package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iPeriodista;

public class Crear_Editar_Noticia extends Banner_Periodista {
	//	private JButton _eliminar_cambios_noticia;
	//	private JButton _guardar_cambios_noticia;
	//	private JTextField _imagen_principal;
	//	private JTextField _ubicacion;
	//	private JTextField _fecha;
	//	private JTextField _titulo;
	//	private JTextField _texto_corto;
	//	private JTextField _texto_largo;
	//	private JScrollPanel _scroll_textfield;
	public Periodista _unnamed_Periodista_;
	public Seleccionar_Tematica _contiene;
	public Zona_insertar_contenido_noticia CENoticia;
	
	iPeriodista iPeriodita = new BD_Principal();
	
	ocl_proyecto.Noticia notice;
	
	public Crear_Editar_Noticia(Periodista _periodista, ocl_proyecto.Periodista periodista, ocl_proyecto.Noticia notice ) {
		super(_periodista, periodista);
		this._unnamed_Periodista_ = _periodista;
		this.notice =notice;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getCrearEditarNoticiaLayout().setVisible(true);

		this.C_E_Noticia();
		
		this.getBotonEliminarNoticiaPropia().addClickListener(event->ConductorMisNoticias());
		this.getBotonConfirmarModificacionNoticia().addClickListener(event->guardar_cambios_noticia());
	}
	
	public void C_E_Noticia() {
		this.CENoticia = new Zona_insertar_contenido_noticia(this._periodista);
		this.getCrearEditarNoticiaEstatico().as(VerticalLayout.class).add(this.CENoticia);
	}

	//COMO LE HACEMOS PARA EL ARRAY DE TEMÁTICAS, SE LO PASAS Y ESTUDIAS UN RATO.
	public void guardar_cambios_noticia() {
		String apodo; 
		String dni; 
		String email; 
		String contrasena; 
		String foto;
		int tarjeta = 0;
		Notification.show("AMBATUKAM "+ this.CENoticia.getModificarTitulo());
//		if (this._unnamed_Editar_datos_.getCampoEmail().getValue().isEmpty()) 
//			email = this.registrado.getCorreo();
//		else 
//			email = this._unnamed_Editar_datos_.getCampoEmail().getValue();
//		
//		if ( this._unnamed_Editar_datos_.getCampoContrasena().isEmpty()) 
//			contrasena = this.registrado.getContrasena();
//		else 
//			contrasena = this._unnamed_Editar_datos_.getCampoContrasena().getValue();
//		
//		if ( this._unnamed_Editar_datos_.getCampoApodo().getValue().isEmpty()) 
//			apodo = this.registrado.getApodo();
//		else 
//			apodo = this._unnamed_Editar_datos_.getCampoApodo().getValue();
//				
//		if ( this._unnamed_Editar_datos_.getCampoFoto().getValue().isEmpty()) 
//			foto = this.registrado.getFoto_de_perfil();
//		else 
//			foto = this._unnamed_Editar_datos_.getCampoFoto().getValue();
//		
//		if ( this._unnamed_Editar_datos_.getCampoDNI().getValue().isEmpty())
//			dni = this.registrado.getDni();
//		else 
//			dni = this._unnamed_Editar_datos_.getCampoDNI().getValue();
		
		
		iPeriodita.guardar_cambios_noticia(this.notice.getId_noticia(), this.notice.getTexto_corto(), this.notice.getTexto_largo(), this.notice.getTitulo(), this.notice.getImagen_principal(), this.notice.getUbicacion(), this.notice.getFecha(), null, periodista.getIdUsuario());
		this.ConductorMisNoticias();
	}
}