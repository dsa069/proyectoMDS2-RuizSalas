package basededatos;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ocl_proyecto.Comentario;
import ocl_proyecto.ComentarioDAO;
import ocl_proyecto.Usuario;
import ocl_proyecto.UsuarioDAO;
import ocl_proyecto.Editor;
import ocl_proyecto.EditorDAO;
import ocl_proyecto.Noticia;
import ocl_proyecto.NoticiaDAO;
import ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager;

public class BD_Comentarios {
	public BD_Principal _bd_cont_comentarios;
	public ArrayList<Comentario> _contiene_comentarios = new ArrayList<Comentario>();

	public Comentario[] cargar_listar_comenatrios(int aId_noticia) 
		throws PersistentException {
			Comentario[] comentarios = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			comentarios = ComentarioDAO.listComentarioByQuery(
					"Id_noticia LIKE '%"+aId_noticia+"%'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		//	ProyectoPersistentManager.instance().disposePersistentManager();
		return comentarios;
	}

	public void valorar_comentario(int aIdUsuario, int aIdComentario, boolean aValoracion) 
		throws PersistentException {
			Usuario usuario = null;
			Comentario comentario = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			usuario = UsuarioDAO.getUsuarioByORMID(aIdUsuario);
			comentario = ComentarioDAO.getComentarioByORMID(aIdComentario);
			
			if(!comentario.es_valorado_por.contains(usuario)) {//SI YA HA VALORADO, NO PUEDE VOLVER A VALORAR
				usuario.realiza.add(comentario);
				comentario.es_valorado_por.add(usuario);
				if(aValoracion)
					comentario.setNum_likes(comentario.getNum_likes()+1);
				else
					comentario.setNum_dislikes(comentario.getNum_dislikes()+1);
				ComentarioDAO.save(comentario);
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		//	ProyectoPersistentManager.instance().disposePersistentManager();
	}

	public Comentario escribir_comentario(String aTexto, int aIdUsuario) 
		throws PersistentException {
			Usuario usuario = null;
			Comentario comentario = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			usuario = UsuarioDAO.getUsuarioByORMID(aIdUsuario);
			comentario = ComentarioDAO.createComentario();
			comentario.setAutor(usuario);
			usuario.escribe.add(comentario);
			comentario.setTexto(aTexto);
			ComentarioDAO.save(comentario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		//	ProyectoPersistentManager.instance().disposePersistentManager();
		return comentario;
	}
}