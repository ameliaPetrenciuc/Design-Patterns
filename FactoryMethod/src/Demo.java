import factory.Dialog;
import factory.HtmlDialog;
import factory.WindowsDialog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBussinessLogic();
    }

    static void configure(){
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog=new WindowsDialog();
        }else{
            dialog=new HtmlDialog();
        }
    }
    static void runBussinessLogic(){
        dialog.renderWindow();
    }
}