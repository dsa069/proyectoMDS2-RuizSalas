package interfaz;


import java.sql.Date;

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
		String txtC; 
		String txtL; 
		String titulo; 
		String img;
		Date fecha = (Date) this.notice.getFecha(); 
		String ubi;
		boolean error = false;

		if (this.CENoticia.getModificarTextoCorto().getValue().isEmpty()) 
			txtC = this.notice.getTexto_corto();
		else 
			txtC = this.CENoticia.getModificarTextoCorto().getValue();
		
		if ( this.CENoticia.getModificarTextoLargo().isEmpty()) 
			txtL =  this.notice.getTexto_largo();
		else 
			txtL = this.CENoticia.getModificarTextoLargo().getValue();
		
		if (this.CENoticia.getModificarTitulo().getValue().isEmpty()) 
			titulo =  this.notice.getTitulo();
		else 
			titulo =  this.CENoticia.getModificarTitulo().getValue();
				
		if (this.CENoticia.getModificarImagen().getValue().isEmpty()) 
			img = this.notice.getImagen_principal();
		else 
			img =  this.CENoticia.getModificarImagen().getValue();
		
		if ( this.CENoticia.getModificarUbicacion().getValue().isEmpty()) 
			ubi =  this.notice.getUbicacion();
		else 
			ubi =  this.CENoticia.getModificarUbicacion().getValue();
		
		
		if ( this.CENoticia.getModificarFecha().getValue().isEmpty())
			fecha = (Date) this.notice.getFecha();
		else
			try {
				fecha = Date.valueOf(this.CENoticia.getModificarFecha().getValue());
			} catch (Exception e) {
				Notification.show("Formato incorrcto, debe ser AAAA-MM-DD");
				error = true;
				e.printStackTrace();
			}
		
		if(!error) {
			iPeriodita.guardar_cambios_noticia(this.notice.getId_valoracion(), txtC, txtL, titulo, img, ubi, fecha, null, periodista.getIdUsuario());
			this.ConductorMisNoticias();
		}
	}
}