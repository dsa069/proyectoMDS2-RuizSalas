package basededatos;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ocl_proyecto.Comentario;
import ocl_proyecto.ComentarioDAO;
import ocl_proyecto.Usuario;
import ocl_proyecto.UsuarioDAO;
import ocl_proyecto.Valoracion;
import ocl_proyecto.ValoracionDAO;
import ocl_proyecto.Editor;
import ocl_proyecto.EditorDAO;
import ocl_proyecto.Noticia;
import ocl_proyecto.NoticiaDAO;
import ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager;

public class BD_Comentarios {
	public BD_Principal _bd_cont_comentarios;
	public ArrayList<Comentario> _contiene_comentarios = new ArrayList<Comentario>();
	
	public int cargar_valoracion(int aIdValoracion) 
		throws PersistentException {
			Comentario comentario = null;
			int ratio = 0;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			comentario = ComentarioDAO.getComentarioByORMID(aIdValoracion);
			double media = (double) comentario.getNum_likes()/(comentario.getNum_likes() + comentario.getNum_dislikes());
			ratio = (int) (media * 100);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
		return ratio;
	}
	
	public Comentario[] cargar_listar_comenatrios(int aId_noticia) 
		throws PersistentException {
			Comentario[] comentarios = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			comentarios = ComentarioDAO.listComentarioByQuery(
					"NoticiaValoracionId_valoracion = '"+aId_noticia+"'", null);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
		return comentarios;
	}

	public Usuario cargar_usuario_comentario(int aId_comentario) 
			throws PersistentException {
				Comentario comentario = null;
				Usuario usuario = null;
				PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
			try {
				comentario = ComentarioDAO.getComentarioByORMID(aId_comentario);
				usuario = UsuarioDAO.getUsuarioByORMID(comentario.getAutor().getIdUsuario());
				t.commit();
				ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
			} catch (Exception e) {
				t.rollback();
			}
			return usuario;
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
				if(aValoracion) {
					comentario.setNum_likes(comentario.getNum_likes()+1);
				} else {
					comentario.setNum_dislikes(comentario.getNum_dislikes()+1);
				}
				ComentarioDAO.save(comentario);
				UsuarioDAO.save(usuario);
			}
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Comentario escribir_comentario(String aTexto, int aIdUsuario, int aId_noticia) 
		throws PersistentException {
			Usuario usuario = null;
			Comentario comentario = null;
			Noticia noticia = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			usuario = UsuarioDAO.getUsuarioByORMID(aIdUsuario);
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			comentario = ComentarioDAO.createComentario();
			
			comentario.setAutor(usuario);
			usuario.escribe.add(comentario);
			comentario.setComenta(noticia);
			noticia.tiene.add(comentario);
			comentario.setTexto(aTexto);
			comentario.setNum_likes(0);
			comentario.setNum_dislikes(0);
			comentario.setId_comentario(1);
			ComentarioDAO.save(comentario);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
		return comentario;
	}
	
	public void borrar_comentario(int aId_comentario)
			throws PersistentException {
		Comentario comentario = null;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			comentario = ComentarioDAO.getComentarioByORMID(aId_comentario);
			ComentarioDAO.deleteAndDissociate(comentario);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}
}