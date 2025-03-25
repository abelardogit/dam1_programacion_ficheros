import model.Persona;
import model.PersonaManager;
import texto.HTMLFileManager;
import texto.TextFileManager;
import texto.CSVFileManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HelloFilesApp {
    public static void main(String[] args) {
        text();
        html();
        csvWriter();
        csvReader();

    }

    private static void text() {
        readText();
        writeText();
    }

    private static void readText() {
        List<String> data = TextFileManager.read();
        for (String line : data) {
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
        List<Persona> personas = getPersona();
        List<Persona> personas = PersonaManager.getPersona();
        HTMLFileManager.createHTML(personas);
    }

    private static void csvWriter() {
        List<Persona> personas = PersonaManager.getPersona();
        CSVFileManager.createCSV(personas);
    }

    private static void csvReader() {
        List<Persona> personas = CSVFileManager.readCSV();

        Iterator<Persona> itPersonas = personas.iterator();
        boolean personaEncontrada = false; int i = 0;
        Persona persona = null;
        while(itPersonas.hasNext() && !personaEncontrada) {
            persona = itPersonas.next();
            if (persona.getFullName().equalsIgnoreCase("MrIncreible")) {
                personaEncontrada = true;
            }
            i++;
        }

        if (personaEncontrada) {
            System.out.println(persona);
        }
    }

        personas.add(new Persona("MrIncreible", 30));
        personas.add(new Persona("MrsIncreible", 45));
        personas.add(new Persona("BabyIncreible", 1));
        personas.add(new Persona("Prozono", 20));

        return personas;
    }
}
