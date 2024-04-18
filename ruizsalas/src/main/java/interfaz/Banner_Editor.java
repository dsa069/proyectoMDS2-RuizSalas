package interfaz;

public class Banner_Editor extends Banner_registrado {
	//private JButton _ir_a_revisar_noticias;
	//private JButton _ir_a_lista_periodistas;
	public Banner_suscrito _puede_contener;
	
	public Editor _editor;
	public Banner_Editor(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		this.getBotonMisNoticiasGenerico().setVisible(false);
		
		this.getBotonIniciarSesionGenerico().addClickListener(event->ConductorPerfil());
	}
}