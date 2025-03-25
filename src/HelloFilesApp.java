import binario.BDCredentials;
import binario.FicheroBinario;
import model.Persona;
import texto.HTMLFileManager;
import texto.TextFileManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HelloFilesApp {
    public static void main(String[] args) {
        text();
        html();
        csvWriter();
        csvReader();

        binary();
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

    private static void html() {
        List<Persona> personas = PersonaManager.getPersona();
        HTMLFileManager.createHTML(personas);
    }

    private static List<Persona> getPersona() {
        List<Persona> personas = new ArrayList<>();



    private static void binary() {
        BDCredentials myDBCredentials= new BDCredentials(
                "url",
                "user",
                "password",
                3306,
                "database"
        );

        FicheroBinario.escribir(myDBCredentials);
        BDCredentials misCredenciales = FicheroBinario.leer();

        System.out.println(misCredenciales);
    }
}
