package interfaz;

import vistas.VistaZonadeautoryversiondenoticia;

public class Zona_de_autor_y_version_de_noticia extends VistaZonadeautoryversiondenoticia{
	
	public Editor editor;
	ocl_proyecto.Periodista periodista;
	
	public Zona_de_autor_y_version_de_noticia(Editor editor, ocl_proyecto.Periodista periodista) {
		super();
		this.editor = editor;
		this.periodista = periodista;
		
//		this.getFotoPeriodistaNoticia().setSrc(periodista.getFoto_de_perfil());
//		this.getNombreAutorNoticia().setText(periodista.getApodo());
//		//this.getVersionNoticia().setText(periodista.);
	}
}