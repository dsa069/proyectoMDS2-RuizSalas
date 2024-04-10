/**
 * Licensee: Carlos Ruiz(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectoMDS2RuizSalas20232024Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			ocl_proyecto.Usuario locl_proyectoUsuario = ocl_proyecto.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			ocl_proyecto.UsuarioDAO.delete(locl_proyectoUsuario);
			ocl_proyecto.Editor locl_proyectoEditor = ocl_proyecto.EditorDAO.loadEditorByQuery(null, null);
			// Delete the persistent object
			ocl_proyecto.EditorDAO.delete(locl_proyectoEditor);
			ocl_proyecto.Usuario_suscrito_ locl_proyectoUsuario_suscrito_ = ocl_proyecto.Usuario_suscrito_DAO.loadUsuario_suscrito_ByQuery(null, null);
			// Delete the persistent object
			ocl_proyecto.Usuario_suscrito_DAO.delete(locl_proyectoUsuario_suscrito_);
			ocl_proyecto.Valoracion locl_proyectoValoracion = ocl_proyecto.ValoracionDAO.loadValoracionByQuery(null, null);
			// Delete the persistent object
			ocl_proyecto.ValoracionDAO.delete(locl_proyectoValoracion);
			ocl_proyecto.Comentario locl_proyectoComentario = ocl_proyecto.ComentarioDAO.loadComentarioByQuery(null, null);
			// Delete the persistent object
			ocl_proyecto.ComentarioDAO.delete(locl_proyectoComentario);
			ocl_proyecto.Periodista locl_proyectoPeriodista = ocl_proyecto.PeriodistaDAO.loadPeriodistaByQuery(null, null);
			// Delete the persistent object
			ocl_proyecto.PeriodistaDAO.delete(locl_proyectoPeriodista);
			ocl_proyecto.Noticia locl_proyectoNoticia = ocl_proyecto.NoticiaDAO.loadNoticiaByQuery(null, null);
			// Delete the persistent object
			ocl_proyecto.NoticiaDAO.delete(locl_proyectoNoticia);
			ocl_proyecto.Seccion locl_proyectoSeccion = ocl_proyecto.SeccionDAO.loadSeccionByQuery(null, null);
			// Delete the persistent object
			ocl_proyecto.SeccionDAO.delete(locl_proyectoSeccion);
			ocl_proyecto.Tematica locl_proyectoTematica = ocl_proyecto.TematicaDAO.loadTematicaByQuery(null, null);
			// Delete the persistent object
			ocl_proyecto.TematicaDAO.delete(locl_proyectoTematica);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProyectoMDS2RuizSalas20232024Data deleteProyectoMDS2RuizSalas20232024Data = new DeleteProyectoMDS2RuizSalas20232024Data();
			try {
				deleteProyectoMDS2RuizSalas20232024Data.deleteTestData();
			}
			finally {
				ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
