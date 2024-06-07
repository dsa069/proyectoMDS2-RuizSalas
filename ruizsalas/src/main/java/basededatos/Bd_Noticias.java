package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ocl_proyecto.Noticia;
import ocl_proyecto.Periodista;
import ocl_proyecto.PeriodistaDAO;
import ocl_proyecto.NoticiaDAO;
import ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ocl_proyecto.Tematica;
import ocl_proyecto.TematicaDAO;
import ocl_proyecto.UsuarioDAO;
import ocl_proyecto.Usuario_suscrito_;
import ocl_proyecto.Usuario_suscrito_DAO;

public class Bd_Noticias {
	public BD_Principal _bd_cont_noticias;
	public ArrayList<Noticia> _contiene_noticias = new ArrayList<Noticia>();

	public Noticia[] cargar_noticias_a_revisar(boolean aAgregada) 
		throws PersistentException {
			Noticia[] noticias = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			noticias = NoticiaDAO.listNoticiaByQuery(
					"Agregada  '"+aAgregada+"'", null);
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
					"SeccionIdSeccion = '"+aIdSeccion+"'", null);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
		return noticias;
	}

	public void eliminar_noticia_propia(int aId_noticia)
		throws PersistentException {
			Noticia noticia = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			NoticiaDAO.deleteAndDissociate(noticia);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void agregar_noticia(int aId_noticia, boolean aAgregada)
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
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
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
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			NoticiaDAO.deleteAndDissociate(noticia);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void guardar_cambios_noticia(int aId_noticia, String aTexto_corto, String aTexto_largo, String aTitulo, String aImagen_principal, String aUbicacion, Date aFecha, Tematica[] aTematicas, int aId_Usuario) 
		throws PersistentException {
			Noticia noticia = null;
			Periodista periodista = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {

			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			periodista = PeriodistaDAO.getPeriodistaByORMID(aId_Usuario);
			System.out.println("Prueba1");
			if(noticia== null) {
				noticia = NoticiaDAO.createNoticia();
			}
				
			
			
			periodista.publica.add(noticia);
			noticia.setAutor(periodista);
			noticia.setVersion(noticia.getVersion()+1);
			System.out.println("Prueba2");
			noticia.setId_noticia(1);
			System.out.println("Pruebaa");
			noticia.setTexto_corto(aTexto_corto);
			System.out.println("Pruebab");
			noticia.setTexto_largo(aTexto_largo);
			System.out.println("Pruebac");
			noticia.setTitulo(aTitulo);
			System.out.println("Pruebad");
			noticia.setImagen_principal(aImagen_principal);
			System.out.println("Pruebae");
			noticia.setUbicacion(aUbicacion);
			System.out.println("Prueba3");
			noticia.setFecha(aFecha);
			System.out.println("Prueba4");
			
			//Tematicas marcartematicas?????
			NoticiaDAO.save(noticia);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
			System.out.println("Prueba5");
		} catch (Exception e) {
			System.out.println("AAAAAAAAAAAAAAAAAAAAAAAA");
			t.rollback();
		}
	}

	public void valorar_noticia(int aIdUsuario, int aId_noticia, boolean aValoracion) 
		throws PersistentException {
			Noticia noticia = null;
			Usuario_suscrito_ usuario = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			usuario = Usuario_suscrito_DAO.getUsuario_suscrito_ByORMID(aIdUsuario);
			
			if(!noticia.es_valorado_por.contains(usuario)) {//SI YA HA VALORADO, NO PUEDE VOLVER A VALORAR
				noticia.es_valorado_por.add(usuario);
				usuario.realiza.add(noticia);
				if(aValoracion)
					noticia.setNum_likes(noticia.getNum_likes()+1);
				else
					noticia.setNum_dislikes(noticia.getNum_dislikes()+1);
				NoticiaDAO.save(noticia);
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
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			noticias = NoticiaDAO.listNoticiaByQuery(
					"titulo LIKE '%"+aBusqueda+"%'", null);
			t.commit();
			ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			t.rollback();
		}
		return noticias;
	}
}