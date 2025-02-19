import texto.TextFileManager;

import java.util.Iterator;
import java.util.List;

public class HelloFilesApp {
    public static void main(String[] args) {
        texto();
    }

    private static void texto() {
        List<String> data = TextFileManager.read();
        Iterator<String> itLines = data.iterator();
        while(itLines.hasNext()) {
            String line = itLines.next();
            System.out.println(line);
        }
    }
}
