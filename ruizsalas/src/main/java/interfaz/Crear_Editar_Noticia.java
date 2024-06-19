package interfaz;
import java.sql.Date;
import java.util.*;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BD_Principal;
import basededatos.iPeriodista;
import ocl_proyecto.Tematica;

public class Crear_Editar_Noticia extends Banner_Periodista {
	public Periodista _unnamed_Periodista_;
	public Zona_insertar_contenido_noticia CENoticia;	
	iPeriodista iPeriodita = new BD_Principal();

	ocl_proyecto.Noticia notice;

	public Crear_Editar_Noticia(Periodista _periodista, ocl_proyecto.Periodista periodista, ocl_proyecto.Noticia notice ) {
		super(_periodista, periodista);
		this._unnamed_Periodista_ = _periodista;
		this.notice =notice;
		this.getLayoutGenericoVistaGenerica().setVisible(false);
		this.getCrearEditarNoticiaLayout().setVisible(true);

		//ESTATICO ZONA DATOS
		this.CENoticia = new Zona_insertar_contenido_noticia(this._periodista, this.notice);
		this.getCrearEditarNoticiaEstatico().as(VerticalLayout.class).add(this.CENoticia);

		this.getBotonEliminarNoticiaPropia().addClickListener(event->ConductorMisNoticias());
		this.getBotonConfirmarModificacionNoticia().addClickListener(event->guardar_cambios_noticia());
	}

	public void guardar_cambios_noticia() {
		String txtC= null; 
		String txtL= null; 
		String titulo= null; 
		String img= null;
		Date fecha = null; 
		String ubi= null;
		int idNoticia = 0;
		
		boolean error = false;

		if(this.notice == null||this.notice.getId_noticia() == 0) {
			error = true;
			if (this.CENoticia.getModificarTextoCorto().getValue().isEmpty()) 
				Notification.show("Texto Corto Vacío");
			else if ( this.CENoticia.getModificarTextoLargo().isEmpty()) 
				Notification.show("Texto Largo Vacío");
			else if (this.CENoticia.getModificarTitulo().getValue().isEmpty()) 
				Notification.show("Titulo Vacío");
			else if (this.CENoticia.getModificarImagen().getValue().isEmpty()) 
				Notification.show("Ruta de la imagen Vacío");
			else if ( this.CENoticia.getModificarUbicacion().getValue().isEmpty()) 
				Notification.show("Ubicacion Vacía");
			else if ( this.CENoticia.getModificarFecha().getValue().isEmpty())
				Notification.show("Fecha Vacía");
			else {
				txtL = this.CENoticia.getModificarTextoLargo().getValue();
				ubi =  this.CENoticia.getModificarUbicacion().getValue();
				txtC = this.CENoticia.getModificarTextoCorto().getValue();
				img =  this.CENoticia.getModificarImagen().getValue();
				titulo =  this.CENoticia.getModificarTitulo().getValue();
				try {
					fecha = Date.valueOf(this.CENoticia.getModificarFecha().getValue());
					error = false;
				} catch (Exception e) {
					Notification.show("Formato incorrcto, debe ser AAAA-MM-DD");
					e.printStackTrace();
				}
			}
		}else {
			idNoticia =this.notice.getId_valoracion();
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
		}
		if(!error) {
			
			for (Tematica amai : this.CENoticia.ST.tematicasNoticia.toArray(new Tematica[0])) 
				Notification.show("AMAIIIIIIIIIIIII"+ amai.getNombre());
			
			Tematica[] aux =  this.CENoticia.ST.tematicasNoticia.toArray(new Tematica[0]);
			for (Tematica tematica : aux) {
				Notification.show("AMAIIIIIIIIIIIII"+ tematica.getNombre());
			}

			
			iPeriodita.guardar_cambios_noticia(idNoticia, txtC, txtL, titulo, img, ubi, fecha, aux, periodista.getIdUsuario());
			this.ConductorMisNoticias();
		}
	}
}