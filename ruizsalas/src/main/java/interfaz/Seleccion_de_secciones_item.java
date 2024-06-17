package interfaz;

public class Seleccion_de_secciones_item extends Seleccion_de_secciones_generico_item {
	public Seleccion_de_secciones _seleccion_de_secciones;
	Secciones_periodico SesPP;
	public ocl_proyecto.Seccion seccion;
	
	public Seleccion_de_secciones_item(Seleccion_de_secciones padre, ocl_proyecto.Seccion seccion) {
		super(padre, seccion);
		this._seleccion_de_secciones = padre;
		this.seccion = seccion;
	}
	
	@Override
	public void ConductorSeccion() {
		this._seleccion_de_secciones.getLayoutGenericoSeccionesBanner().removeAll();
		SesPP = new Secciones_periodico(this._seleccion_de_secciones._usuario, this.seccion, this);
		this._seleccion_de_secciones.getLayoutGenericoSeccionesBanner().add(SesPP);
	}
}