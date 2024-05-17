package basededatos;

import java.util.Vector;
import ocl_proyecto.Comentario;

public class BD_Comentarios {
	public BD_Principal _bd_cont_comentarios;
	public Vector<Comentario> _contiene_comentarios = new Vector<Comentario>();

	public Comentario[] cargar_listar_comenatrios(int aId_noticia) {
		throw new UnsupportedOperationException();
	}

	public void valorar_comentario(int aIdUsuario, int aIdComentario, boolean aValoracion) {
		throw new UnsupportedOperationException();
	}

	public String escribir_comentario(String aTexto) {
		throw new UnsupportedOperationException();
	}
}