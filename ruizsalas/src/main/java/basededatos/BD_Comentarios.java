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
					"NoticiaValoracionId_valoracion = '"+aId_noticia+"'", null);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
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
			System.out.println("Prueba1");
			usuario = UsuarioDAO.getUsuarioByORMID(aIdUsuario);
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			comentario = ComentarioDAO.createComentario();
			
			System.out.println("Prueba2");
			comentario.setAutor(usuario);
			System.out.println("Pruebac");
			usuario.escribe.add(comentario);
			System.out.println("Pruebad");
			comentario.setComenta(noticia);
			System.out.println("Pruebae");
			noticia.tiene.add(comentario);
			System.out.println("Prueba3");
			comentario.setTexto(aTexto);
			comentario.setNum_likes(0);
			comentario.setNum_dislikes(0);
			comentario.setId_comentario(1);
			System.out.println("Prueba4");
			ComentarioDAO.save(comentario);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			System.out.println("HOLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
			t.rollback();
		}
		return comentario;
	}
}