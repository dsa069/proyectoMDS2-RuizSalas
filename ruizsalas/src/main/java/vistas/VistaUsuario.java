package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;

@Tag("vista-usuario")
@JsModule("./src/vista-usuario.ts")
public class VistaUsuario extends LitTemplate {

    public VistaUsuario() {
        // You can initialise any data required for the connected UI components here.
    }

}