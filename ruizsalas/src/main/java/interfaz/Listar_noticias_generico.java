package interfaz;

import vistas.*;
import java.util.Vector;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import basededatos.BD_Principal;
import basededatos.iEditor;
import basededatos.iUsuario;
import ocl_proyecto.Noticia;

public class Listar_noticias_generico extends VistaListarnoticiasgenerico {
	public Usuario usuario;
	public Noticia[] notice;
	iUsuario iUsuario = new BD_Principal();
	
	public Listar_noticias_generico(Usuario usuario) {
		super();
		this.usuario = usuario;
	}
}