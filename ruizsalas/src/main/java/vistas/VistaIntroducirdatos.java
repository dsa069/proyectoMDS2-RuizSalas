package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;

@Tag("vista-introducirdatos")
@JsModule("./src/vista-introducirdatos.ts")
public class VistaIntroducirdatos extends LitTemplate {

    @Id("vaadinButton")
	private Button vaadinButton;
	@Id("password")
	private PasswordField password;
	@Id("label")
	private TextField label;

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public PasswordField getPassword() {
		return password;
	}

	public void setPassword(PasswordField password) {
		this.password = password;
	}

	public TextField getLabel() {
		return label;
	}

	public void setLabel(TextField label) {
		this.label = label;
	}

	public VistaIntroducirdatos() {
        // You can initialise any data required for the connected UI components here.
    }

}