/**
 * Licensee: Carlos Ruiz(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoMDS2RuizSalas20232024DatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager.instance());
			ocl_proyecto.ProyectoMDS2RuizSalas20232024PersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
