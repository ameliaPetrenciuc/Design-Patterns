package listeners;

import java.io.File;
import java.util.EventListener;

public class LogOpenListener implements EventListener, listeners.EventListener {
    private File log;

    public LogOpenListener(String fileName){
        this.log=new File(fileName);
    }

    public void update(String eventType, File file){
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
