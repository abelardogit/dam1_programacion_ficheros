package texto;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TextFileManager {

        public static List<String> read() {
            List<String> data = new ArrayList<>();
            String readLine;

            File datosTXT = new File("Datos.txt");
            try {
                BufferedReader reader = new BufferedReader(new FileReader(datosTXT));

                boolean isEOF = false;
                do {
                    readLine = reader.readLine();
                    if (readLine != null) {
                        data.add(readLine);
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

    public static void write(List<String> linesToBeStored) {
        File datosTXT = new File("Datos.txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(datosTXT));

            boolean isEOF = false;
            Iterator<String> itLine = linesToBeStored.iterator();
            while(itLine.hasNext()) {
                String newLine = itLine.next();
                writer.write(newLine);
            }
            writer.close();
        } catch(FileNotFoundException fileNotFoundException) {
            System.err.println("😱 File not found!");
        } catch(IOException ioException) {
            System.err.println("😱 IO error was found!");
        }
    }
}
