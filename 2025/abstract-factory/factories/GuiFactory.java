package factories;

import buttons.Button;
import checkboxes.Checkbox;
import textFields.TextField;

public interface GuiFactory {
    Button createButton();
    TextField createTextfield();
    Checkbox createCheckbox();
}
