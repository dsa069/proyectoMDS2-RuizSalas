package interfaz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

import vistas.*;

public class Lista_Comentarios_item extends VistaListacomentarios_item {
//	private JLabel _foto;
//	private JLabel _mi_apodo;
//	private JLabel _comentario;
//	private JLabel _valoracion;
	public Lista_Comentarios _lista_Comentarios;
	public ver_valoracion valoracion;
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/images/";
	public Image imagen;
	
	ocl_proyecto.Valoracion valoracionBD;
	ocl_proyecto.Comentario comentario;
	ocl_proyecto.Usuario usuario;
	
	public Lista_Comentarios_item(Lista_Comentarios _lista_Comentarios, ocl_proyecto.Usuario usuario, ocl_proyecto.Comentario comentario) { //Esto se puede hacer?
		super();
		this._lista_Comentarios = _lista_Comentarios;
		this.valoracionBD = comentario;
		this.usuario = usuario;
		this.getValorarComentarioNegativamente().setVisible(false);
		this.getValorarComentarioPositivamente().setVisible(false);
		this.getBorrarComentario().setVisible(false);
		
		this.imagen = new Image();
        File file = new File(IMAGE_PATH + this.usuario.getFoto_de_perfil());
        if (file.exists()) {
            StreamResource resource = new StreamResource(file.getName(), () -> {
                try {
                    return new FileInputStream(file);
                } catch (FileNotFoundException e) {
                    return null;
                }
            });

            Image image = new Image(resource, "Image not found");
            image.setMaxWidth("500px");
            this.imagen = image;
        } 

        this.imagen.getStyle().set("align-self", "center");
        this.getLayoutImagenUsuarioComento().as(VerticalLayout.class).removeAll();
        this.getLayoutImagenUsuarioComento().as(VerticalLayout.class).add(this.imagen);
		
		this.getLayoutZonaComentarioEscrito().setText("" + comentario.getTexto());
		this.getLayoutApodoComentarista().setText("" + usuario.getApodo());
		
		this.Ver_Valoraciones();
	}
	
	
	public void Ver_Valoraciones() {
		this.valoracion = new ver_valoracion(this._lista_Comentarios.usuario, this.valoracionBD);
		this.getLayoutVerValoracionComentario().as(VerticalLayout.class).add(this.valoracion);
	}
}