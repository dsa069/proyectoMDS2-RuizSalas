package interfaz;

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
	
	public Crear_Editar_Noticia(Periodista _periodista, ocl_proyecto.Periodista periodista) {
		super(_periodista, periodista);
		this._unnamed_Periodista_ = _periodista;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getCrearEditarNoticiaLayout().setVisible(true);

		this.C_E_Noticia();
		
		this.getBotonEliminarNoticiaPropia().addClickListener(event->eliminar_cambios_noticia());
		this.getBotonConfirmarModificacionNoticia().addClickListener(event->guardar_cambios_noticia());
	}
	
	public void C_E_Noticia() {
		this.CENoticia = new Zona_insertar_contenido_noticia(this._periodista);
		this.getCrearEditarNoticiaEstatico().as(VerticalLayout.class).add(this.CENoticia);
	}
	
	public void eliminar_cambios_noticia() {
		//Operacion eliminar
		this.ConductorMisNoticias();
	}

	//COMO LE HACEMOS PARA EL ARRAY DE TEMÁTICAS
	public void guardar_cambios_noticia() {
		//Operacion guardar cambios
		this.ConductorMisNoticias();
		iPeriodita.guardar_cambios_noticia(this.notice.getId_noticia(), this.notice.getTexto_corto(), this.notice.getTexto_largo(), this.notice.getTitulo(), this.notice.getImagen_principal(), this.notice.getUbicacion(), this.notice.getFecha(), null, periodista.getIdUsuario());
	}
}