package factories;

import buttons.Button;
import buttons.MacOsButtonImpl;
import checkboxes.Checkbox;
import checkboxes.MacOsCheckboxImpl;
import textFields.MacOsTextFieldImpl;
import textFields.TextField;

public class MacOsFactoryImpl implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacOsButtonImpl();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckboxImpl();
    }

    @Override
    public TextField createTextfield() {
        return new MacOsTextFieldImpl();
    }
}
