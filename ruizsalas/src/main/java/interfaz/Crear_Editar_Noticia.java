package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
	
	public Crear_Editar_Noticia(Periodista _periodista) {
		super(_periodista);
		this._unnamed_Periodista_ = _periodista;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getCrearEditarNoticiaLayout().setVisible(true);

		this.C_E_Noticia();
		
		this.getBotonEliminarNoticiaPropia().addClickListener(event->eliminar_cambios_noticia());
		this.getBotonConfirmarModificaciónNoticia().addClickListener(event->guardar_cambios_noticia());
	}
	
	public void C_E_Noticia() {
		this.CENoticia = new Zona_insertar_contenido_noticia(this._periodista);
		this.getCrearEditarNoticiaEstatico().as(VerticalLayout.class).add(this.CENoticia);
	}
	
	public void eliminar_cambios_noticia() {
		//Operacion eliminar
		this.ConductorMisNoticias();
		//throw new UnsupportedOperationException();
	}

	public void guardar_cambios_noticia() {
		//Operacion guardar cambios
		this.ConductorMisNoticias();
		//throw new UnsupportedOperationException();
	}
}