package factories;

import buttons.Button;
import buttons.WindowsButtonImpl;
import checkboxes.Checkbox;
import checkboxes.WindowsCheckboxImpl;
import textFields.TextField;
import textFields.WindowsTextFieldImpl;

public class WindowsFactoryImpl implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowsButtonImpl();
    }

    @Override
    public TextField createTextfield() {
        return new WindowsTextFieldImpl();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckboxImpl();
    } 
}
