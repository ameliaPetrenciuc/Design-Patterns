import app.Application;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Demo {
    private static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName=System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            factory=new MacOSFactory();
        }else{
            factory=new WindowsFactory();
        }
        app=new Application(factory);
        return app;
    }
    public static void main(String[] args) {
        Application app=configureApplication();
        app.paint();
    }
}