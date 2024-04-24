package interfaz;
import vistas.*;

public class Periodistas_item extends VistaPeriodistas_item {
//	private JButton _baja_periodista;
//	private JLabel _foto_periodista;
//	private JLabel _apodo_periodista;
	public Periodistas _periodistas;
	ocl_proyecto.Periodista periodista;
	public Periodistas_item(Periodistas _periodistas, ocl_proyecto.Periodista periodista) {
		super();
		this._periodistas = _periodistas;
		
		
		//this.getBaja().setBaja(periodista.getBaja()); Ns si tiene que estar
		//this.getApodo().setApodo(periodista.getApodo());
		//this.getFoto_de_perfil().setFot_de_perfil(periodista.getFoto_de_perfil());
				
		this.getBotonEliminarPeriodista().addClickListener(event->baja_periodista());

	}

	public void baja_periodista() {
		//bd operacion
		throw new UnsupportedOperationException();
	}
}