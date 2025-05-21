import buttons.Button;
import checkboxes.Checkbox;
import factories.GuiFactory;
import textFields.TextField;

public class Application {

    private final Button button;
    private final Checkbox checkbox;
    private final TextField textField;
    public Application(GuiFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
        this.textField = factory.createTextfield();
    }

    public void paint() {
        button.render();
        checkbox.render();
        textField.render();
    }
    
}
