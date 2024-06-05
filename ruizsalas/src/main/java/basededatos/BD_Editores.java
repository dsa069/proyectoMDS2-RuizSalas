package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ocl_proyecto.Editor;
import ocl_proyecto.EditorDAO;
import ocl_proyecto.Noticia;
import ocl_proyecto.NoticiaDAO;
import ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager;
import ocl_proyecto.Tematica;
import ocl_proyecto.TematicaDAO;
import ocl_proyecto.Usuario;

public class BD_Editores {
	public BD_Principal _bd_cont_editores;
	public Vector<Editor> _contiene_editores = new Vector<Editor>();

	public Usuario confirmar_Datos_Editor(String aCorreo, String aContrasena) 
		throws PersistentException {
			Editor editor = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			editor = EditorDAO.loadEditorByQuery(
					"correo = '"+aCorreo+"' AND contrasena = '"+aContrasena+"'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		//	ProyectoPersistentManager.instance().disposePersistentManager();
		return editor;
	}

	public void guardar_cambios_Editor(int aIdUsuario, String aApodo, String aDni, String aCorreo, String aContrasena, String aFoto_de_perfil) 
		throws PersistentException {
			Editor editor = null;
			PersistentTransaction t = ProyectoMDS2RuizSalas20232024PersistentManager.instance().getSession().beginTransaction();
		try {
			editor = EditorDAO.getEditorByORMID(aIdUsuario);
			editor.setApodo(aApodo);
			editor.setDni(aDni);
			editor.setCorreo(aCorreo);
			editor.setContrasena(aContrasena);
			editor.setFoto_de_perfil(aFoto_de_perfil);
			EditorDAO.save(editor);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		//	ProyectoPersistentManager.instance().disposePersistentManager();
	}
}
