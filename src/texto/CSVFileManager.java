package texto;

import model.Persona;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVFileManager {

    public static void createCSV(List<Persona> personas) {

        File csvFile = new File("Increibles.csv");

        String csvHeader = getCSVHeader();

        StringBuilder sb = new StringBuilder();
        sb.append(csvHeader); // Va a almacenar la cabecera de nuestro CSV

        Iterator<Persona> itPersonas = personas.iterator();
        while(itPersonas.hasNext()) {
            Persona persona = itPersonas.next();
            sb.append(persona.toCSV());
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile));
            writer.write(sb.toString());
            writer.close();
        } catch(FileNotFoundException fileNotFoundException) {
            System.err.println("😱 File not found!");
        } catch(IOException ioException) {
            System.err.println("😱 IO error was found!");
        }
    }

    private static String getCSVHeader() {
        return "uuid; fullName; age\n";
    }

    public static List<Persona> readCSV() {
        List<Persona> data = new ArrayList<>();
        String personData;

        File increiblesCSV = new File("Increibles.csv");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(increiblesCSV));

            reader.readLine(); // Leer cabecera, pero no hacemos nada con ella

            // Vamos a leer todas y cada una de las líneas de detalle
            boolean isEOF = false;
            do {
                personData = reader.readLine();
                if (personData != null) {
                    String[] tokens = personData.split(";");
                    int age = Integer.parseInt(tokens[2]);
                    Persona persona = new Persona(tokens[0], tokens[1], age);
                    data.add(persona);
                } else {
                    isEOF = true;
                }
            } while(!isEOF);

            reader.close();
        } catch(FileNotFoundException fileNotFoundException) {
            System.err.println("😱 File not found!");
        } catch(IOException ioException) {
            System.err.println("😱 IO error was found!");
        }

        return data;
    }
}
