package app;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory){
        button=guiFactory.createButton();
        checkbox=guiFactory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
