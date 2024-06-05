package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ocl_proyecto.Noticia;
import ocl_proyecto.Periodista;
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

	public Noticia[] cargar_noticias_a_revisar(boolean aAgregada) {
		throw new UnsupportedOperationException();
	}

	public Noticia[] cargar_listar_mis_noticias(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Noticia[] cargar_secciones_generico(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_noticia_propia(int aId_noticia)
		throws PersistentException {
			Noticia noticia = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			NoticiaDAO.deleteAndDissociate(noticia);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		//	ProyectoPersistentManager.instance().disposePersistentManager();
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
		} catch (Exception e) {
			t.rollback();
		}
		//	ProyectoPersistentManager.instance().disposePersistentManager();
	}

	public void no_agregar_noticia(int aId_noticia) 
	throws PersistentException {
		Noticia noticia = null;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
	try {
		noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
		NoticiaDAO.deleteAndDissociate(noticia);
		t.commit();
	} catch (Exception e) {
		t.rollback();
	}
	//	ProyectoPersistentManager.instance().disposePersistentManager();
	}

	public void eliminar_noticia(int aId_noticia) 		
	throws PersistentException {
		Noticia noticia = null;
		PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
	try {
		noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
		NoticiaDAO.deleteAndDissociate(noticia);
		t.commit();
	} catch (Exception e) {
		t.rollback();
	}
	//	ProyectoPersistentManager.instance().disposePersistentManager();
	}

	public void guardar_cambios_noticia(int aId_noticia, String aTexto_corto, String aTexto_largo, String aTitulo, String aImagen_principal, String aUbicacion, Date aFecha, Tematica[] aTematicas) 
		throws PersistentException {
			Noticia noticia = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
	
			noticia.setTexto_corto(aTexto_corto);
			noticia.setTexto_largo(aTexto_largo);
			noticia.setTitulo(aTitulo);
			noticia.setImagen_principal(aImagen_principal);
			noticia.setUbicacion(aUbicacion);
			noticia.setFecha(aFecha);
			//Tematicas marcartematicas?????
			NoticiaDAO.save(noticia);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		//	ProyectoPersistentManager.instance().disposePersistentManager();
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
	} catch (Exception e) {
		t.rollback();
	}
	//	ProyectoPersistentManager.instance().disposePersistentManager();

	}

	public Noticia[] Buscar(String aBusqueda) 
		throws PersistentException {
			Noticia[] noticias = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			noticias = NoticiaDAO.listNoticiaByQuery(
					"titulo LIKE '%"+aBusqueda+"%'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		//	ProyectoPersistentManager.instance().disposePersistentManager();
		return noticias;
	}
	
	public Noticia[] cargar_lista_mis_noticias(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}
}