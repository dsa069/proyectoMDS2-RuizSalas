package proyectoMDS;

import interfaz.*;
import vistas.VistaBannersuscrito;
import vistas.VistaNoticia;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * A sample Vaadin view class.
 * <p>
 * 
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {
	
	public Usuario U;
	public Registrado R;
	public Usuario_No_Registrado UNR;
	public Usuario_Registardo UR;
	public Editor E;
	public Periodista P;
	
	ocl_proyecto.Usuario UOCL;
	ocl_proyecto.Noticia N;
	ocl_proyecto.Periodista POCL;
	ocl_proyecto.Seccion S;
	ocl_proyecto.Tematica T;
	ocl_proyecto.Comentario C;
	ocl_proyecto.Usuario_suscrito_ US;
	ocl_proyecto.Valoracion V;
	ocl_proyecto.Editor EOCL;

    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed bean.
     */
	public MainView() {
		U = new Usuario(this, UOCL);
		UNR = new Usuario_No_Registrado(this, UOCL);
		R = new Registrado(this, US);
		UR = new Usuario_Registardo(this, US);
		P = new Periodista(this, POCL);
		E = new Editor(this, EOCL);
		
		add(E);
		
//		Secciones_periodico prueba = new Secciones_periodico(UR);
//        add(prueba);
		
//		VistaBannersuscrito prueba = new VistaBannersuscrito();
//        add(prueba);
	}


//        // Use TextField for standard text input
//        TextField textField = new TextField("Your name");
//        textField.addThemeName("bordered");
//
//        // Button click listeners can be defined as lambda expressions
//        Button button = new Button("Say hello",
//                e -> Notification.show(service.greet(textField.getValue())));
//
//        // Theme variants give you predefined extra styles for components.
//        // Example: Primary button has a more prominent look.
//        button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
//
//        // You can specify keyboard shortcuts for buttons.
//        // Example: Pressing enter in this view clicks the Button.
//        button.addClickShortcut(Key.ENTER);
//
//        // Use custom CSS classes to apply styling. This is defined in shared-styles.css.
//        addClassName("centered-content");
//
//        add(textField, button);


}
