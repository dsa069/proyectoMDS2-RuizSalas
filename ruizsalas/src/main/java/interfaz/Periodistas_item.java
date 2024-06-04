package interfaz;
import basededatos.BD_Principal;
import basededatos.iEditor;
import vistas.*;

public class Periodistas_item extends VistaPeriodistas_item {
//	private JButton _baja_periodista;
//	private JLabel _foto_periodista;
//	private JLabel _apodo_periodista;
	public Periodistas _periodistas;
	iEditor ieditor = new BD_Principal();
	ocl_proyecto.Periodista periodista;
	public Periodistas_item(Periodistas _periodistas, ocl_proyecto.Periodista periodista) {
		super();
		this._periodistas = _periodistas;
		
//		this.getApodoPeriodistas().setText(periodista.getApodo());
//		this.getFotoPeriodistas().setSrc(periodista.getFoto_de_perfil());
				
		this.getBotonEliminarPeriodista().addClickListener(event->baja_periodista());
	}

	public void baja_periodista() {
		ieditor.baja_periodista(periodista.getIdUsuario());
	}
}