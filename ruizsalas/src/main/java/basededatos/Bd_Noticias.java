package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;


import ocl_proyecto.Comentario;
import ocl_proyecto.ComentarioDAO;
import ocl_proyecto.Noticia;
import ocl_proyecto.Periodista;
import ocl_proyecto.PeriodistaDAO;
import ocl_proyecto.NoticiaDAO;
import ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager;
import ocl_proyecto.Seccion;
import ocl_proyecto.SeccionDAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ocl_proyecto.Tematica;
import ocl_proyecto.TematicaDAO;
import ocl_proyecto.Usuario;
import ocl_proyecto.UsuarioDAO;
import ocl_proyecto.Usuario_suscrito_;
import ocl_proyecto.Usuario_suscrito_DAO;
import ocl_proyecto.Valoracion;
import ocl_proyecto.ValoracionDAO;

public class Bd_Noticias {
	public BD_Principal _bd_cont_noticias;
	public ArrayList<Noticia> _contiene_noticias = new ArrayList<Noticia>();

	public int cargar_valoracion(int aIdValoracion) 
			throws PersistentException {
		Noticia noticia = null;
		int ratio = 0;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.getNoticiaByORMID(aIdValoracion);
			double media = (double) noticia.getNum_likes()/(noticia.getNum_dislikes() + noticia.getNum_likes());
			ratio = (int) (media * 100);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
		return ratio;
	}

	public Noticia[] cargar_noticias_a_revisar() 
			throws PersistentException {
		Noticia[] noticias = null;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			noticias = NoticiaDAO.listNoticiaByQuery(
					"Agregada  ='"+0+"'", null);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
		return noticias;
	}

	public Noticia[] cargar_listar_mis_noticias(int aIdUsuario) 
			throws PersistentException {
		Noticia[] noticias = null;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			noticias = NoticiaDAO.listNoticiaByQuery(
					"PeriodistaUsuarioIdUsuario = '"+aIdUsuario+"'", null);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
		return noticias;
	}

	public Noticia[] cargar_noticias_secciones(int aIdSeccion) 
			throws PersistentException {
		Noticia[] noticias = null;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			noticias = NoticiaDAO.listNoticiaByQuery(
					"SeccionIdSeccion = '"+aIdSeccion+"'AND Agregada  ='"+1+"'", null);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
		return noticias;
	}

	public Noticia[] cargar_noticias_portada() 
			throws PersistentException {
		Noticia[] noticias = null;
		Seccion porta = null;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			porta = SeccionDAO.loadSeccionByQuery(
					"Portada ='"+1+"'", null);
			noticias = NoticiaDAO.listNoticiaByQuery(
					"SeccionIdSeccion ='"+porta.getIdSeccion()+"'AND Agregada  ='"+1+"'", "Id_noticia");
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
		return noticias;
	}

	public void ordenar_portada(int aId_noticia, boolean orden)
			throws PersistentException {
		Noticia noticia = null;

		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			
			noticia= NoticiaDAO.getNoticiaByORMID(aId_noticia);
			if(orden)
				noticia.setId_noticia(noticia.getId_noticia()+1);
			else if(noticia.getId_noticia()!= 0)
				noticia.setId_noticia(noticia.getId_noticia()-1);

			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}
	
	public void eliminar_noticia_propia(int aId_noticia)
			throws PersistentException {
		Noticia noticia = null;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			Comentario[] comentarios = ComentarioDAO.listComentarioByQuery("comenta.id = " + aId_noticia, null);
			for (Comentario comentarios1 : comentarios) {
				ComentarioDAO.deleteAndDissociate(comentarios1);
			}
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			NoticiaDAO.deleteAndDissociate(noticia);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void agregar_noticia(int aId_noticia)
			throws PersistentException {
		Noticia noticia = null;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			noticia.setAgregada(true);
			NoticiaDAO.save(noticia);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void no_agregar_noticia(int aId_noticia) 
			throws PersistentException {
		Noticia noticia = null;
		Comentario[] comentarios = null;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			comentarios = ComentarioDAO.listComentarioByQuery("comenta.id = " + aId_noticia, null);
			for (Comentario comentarios1 : comentarios) {
				ComentarioDAO.deleteAndDissociate(comentarios1);
			}
			NoticiaDAO.deleteAndDissociate(noticia);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void eliminar_noticia(int aId_noticia) 		
			throws PersistentException {
		Noticia noticia = null;
		Comentario[] comentarios = null;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			comentarios = ComentarioDAO.listComentarioByQuery("comenta.id = " + aId_noticia, null);
			for (Comentario comentarios1 : comentarios) {
				ComentarioDAO.deleteAndDissociate(comentarios1);
			}
			NoticiaDAO.deleteAndDissociate(noticia);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void guardar_cambios_noticia(int aId_noticia, String aTexto_corto, String aTexto_largo, String aTitulo, String aImagen_principal, String aUbicacion, Date aFecha, Tematica[] aTematicas, int aId_Usuario) 
			throws PersistentException {
		Tematica tematics = null;
		Noticia noticia = null;
		Periodista periodista = null;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {

			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			periodista = PeriodistaDAO.getPeriodistaByORMID(aId_Usuario);
			if(noticia == null || aId_noticia == 0)
				noticia = NoticiaDAO.createNoticia();
	

			periodista.publica.add(noticia);
			noticia.setAutor(periodista);
			noticia.setVersion(noticia.getVersion()+1);
			noticia.setId_noticia(1);
			noticia.setTexto_corto(aTexto_corto);
			noticia.setTexto_largo(aTexto_largo);
			noticia.setTitulo(aTitulo);
			noticia.setUbicacion(aUbicacion);
			noticia.setFecha(aFecha);
			if(aImagen_principal != null)
				noticia.setImagen_principal(aImagen_principal);

			NoticiaDAO.save(noticia);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace(); 
		} 
		
		PersistentTransaction a = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			for (Tematica tem : aTematicas) {
				tematics = TematicaDAO.getTematicaByORMID(tem.getIdTematica());
				tematics.esta_en.add(noticia);
				noticia.contiene.add(tematics);
				TematicaDAO.save(tematics);
				NoticiaDAO.save(noticia);
			}
			a.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void valorar_noticia(int aIdUsuario, int aId_noticia, boolean aValoracion) 
			throws PersistentException {
		Noticia noticia = null;
		Usuario usuario = null;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			usuario = UsuarioDAO.getUsuarioByORMID(aIdUsuario);

			if(!usuario.realiza.contains(noticia)) {//SI YA HA VALORADO, NO PUEDE VOLVER A VALORAR
				noticia.es_valorado_por.add(usuario);
				usuario.realiza.add(noticia);
				if(aValoracion) {
					noticia.setNum_likes(noticia.getNum_likes()+1);
				}
				else {
					noticia.setNum_dislikes(noticia.getNum_dislikes()+1);
				}
				NoticiaDAO.save(noticia);
				UsuarioDAO.save(usuario);
			}
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Noticia[] Buscar(String aBusqueda) 
			throws PersistentException {
		Noticia[] noticias = null;
		ArrayList<Noticia> notisTematica = new ArrayList<>();
		Tematica[] tematicas = null;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			if (aBusqueda.charAt(0) == '#'&& aBusqueda.length()>1) {
				noticias = NoticiaDAO.listNoticiaByQuery("Agregada  ='"+1+"'", null);
				tematicas = TematicaDAO.listTematicaByQuery("Nombre LIKE '%"+aBusqueda.substring(1)+"%'", null);
				for (Tematica tematica : tematicas) {
					for (Noticia noticia : noticias) {
							if(noticia.contiene.contains(tematica)&&!notisTematica.contains(noticia))
								notisTematica.add(noticia);
					}
				}
			}else {
				noticias = NoticiaDAO.listNoticiaByQuery(
						"titulo LIKE '%"+aBusqueda+"%' AND Agregada  ='"+1+"'", null);
				return noticias;
				}
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
		return notisTematica.toArray(new Noticia[0]);
	}
}