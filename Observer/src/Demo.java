import editor.Editor;
import listeners.EmailNotificationListener;
import listeners.LogOpenListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Demo {
    public static void main(String[] args) {
       Editor editor=new Editor();
       editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
       editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

       try{
           editor.openFile("test.txt");
           editor.saveFile();
       }catch(Exception e){
           e.printStackTrace();
       }
    }
}