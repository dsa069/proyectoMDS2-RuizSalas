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

	public void eliminar_cambios_noticia() {
		throw new UnsupportedOperationException();
	}

	public void guardar_cambios_noticia() {
		throw new UnsupportedOperationException();
	}
	
	public Periodista _periodista;
	public Crear_Editar_Noticia(Periodista _periodista) {
		super(_periodista);
		this._periodista = _periodista;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getCrearEditarNoticiaLayout().setVisible(true);
		
		this.getBotonEliminarNoticiaPropia().addClickListener(event->EliminarNoticia());
		this.getBotonConfirmarModificaciónNoticia().addClickListener(event->ConductorMisNoticias());
	}
	
	public void EliminarNoticia() {
		//Operacion eliminar
		this.ConductorMisNoticias();
		}
	
	public void ConfirmarModificacionNoticia() {
		//Operacion guardar cambios
		this.ConductorMisNoticias();
		}
}