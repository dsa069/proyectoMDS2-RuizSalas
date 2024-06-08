/**
 * Licensee: Daniel Salas(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoMDS2RuizSalas20232024Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			ocl_proyecto.Usuario locl_proyectoUsuario = ocl_proyecto.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : realiza, escribe, baja
			ocl_proyecto.UsuarioDAO.save(locl_proyectoUsuario);
			ocl_proyecto.Editor locl_proyectoEditor = ocl_proyecto.EditorDAO.createEditor();
			// Initialize the properties of the persistent object here
			ocl_proyecto.EditorDAO.save(locl_proyectoEditor);
			ocl_proyecto.Usuario_suscrito_ locl_proyectoUsuario_suscrito_ = ocl_proyecto.Usuario_suscrito_DAO.createUsuario_suscrito_();
			// Initialize the properties of the persistent object here
			ocl_proyecto.Usuario_suscrito_DAO.save(locl_proyectoUsuario_suscrito_);
			ocl_proyecto.Valoracion locl_proyectoValoracion = ocl_proyecto.ValoracionDAO.createValoracion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_valorado_por
			ocl_proyecto.ValoracionDAO.save(locl_proyectoValoracion);
			ocl_proyecto.Comentario locl_proyectoComentario = ocl_proyecto.ComentarioDAO.createComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : autor, comenta, id_comentario
			ocl_proyecto.ComentarioDAO.save(locl_proyectoComentario);
			ocl_proyecto.Periodista locl_proyectoPeriodista = ocl_proyecto.PeriodistaDAO.createPeriodista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : publica
			ocl_proyecto.PeriodistaDAO.save(locl_proyectoPeriodista);
			ocl_proyecto.Noticia locl_proyectoNoticia = ocl_proyecto.NoticiaDAO.createNoticia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tiene, contiene, autor, id_noticia, version, agregada
			ocl_proyecto.NoticiaDAO.save(locl_proyectoNoticia);
			ocl_proyecto.Seccion locl_proyectoSeccion = ocl_proyecto.SeccionDAO.createSeccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_una, portada
			ocl_proyecto.SeccionDAO.save(locl_proyectoSeccion);
			ocl_proyecto.Tematica locl_proyectoTematica = ocl_proyecto.TematicaDAO.createTematica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : esta_en, es_una
			ocl_proyecto.TematicaDAO.save(locl_proyectoTematica);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectoMDS2RuizSalas20232024Data createProyectoMDS2RuizSalas20232024Data = new CreateProyectoMDS2RuizSalas20232024Data();
			try {
				createProyectoMDS2RuizSalas20232024Data.createTestData();
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
