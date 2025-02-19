import texto.TextFileManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HelloFilesApp {
    public static void main(String[] args) {
        text();
    }

    private static void text() {
        readText();
        writeText();
    }

    private static void readText() {
        List<String> data = TextFileManager.read();
        Iterator<String> itLines = data.iterator();
        while(itLines.hasNext()) {
            String line = itLines.next();
            System.out.println(line);
        }
    }

    private static void writeText() {
        List<String> newLines = new ArrayList<>();
        newLines.add("Nueva línea");
        newLines.add("Otra nueva línea");
        TextFileManager.write(newLines);
    }
}
