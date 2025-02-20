package texto;

import model.Persona;

import java.io.*;
import java.util.Iterator;
import java.util.List;

public class HTMLFileManager {

    public static void createHTML(List<Persona> personas) {

        File htmlFile = new File("Increibles.html");

        String htmlContent = getHTMLContent();

        StringBuilder sb = new StringBuilder();
        sb.append(htmlContent);

        Iterator<Persona> itPersonas = personas.iterator();
        while(itPersonas.hasNext()) {
            Persona persona = itPersonas.next();
            sb.append("<tr>");
                sb.append("<td>").append(persona.getId()).append("</td>").append("\n");
                sb.append("<td>").append(persona.getFullName()).append("</td>").append("\n");
                sb.append("<td>").append(persona.getAge()).append("</td>").append("\n");
            sb.append("</tr>");
        }
        sb.append("</tbody>").append("\n");
        sb.append("</table>").append("\n");
        sb.append("</body>").append("\n");
        sb.append("</html>").append("\n");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(htmlFile));
            writer.write(sb.toString());
            writer.close();
        } catch(FileNotFoundException fileNotFoundException) {
            System.err.println("😱 File not found!");
        } catch(IOException ioException) {
            System.err.println("😱 IO error was found!");
        }
    }


    private static String getHTMLContent() {
        return """
            <!docctype>
            <html lang="es">
                <head>
                    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
                </head>
                <body>
                    <table class="table">
                      <thead>
                        <tr>
                          <th scope="col">#</th>
                          <th scope="col">Full Name</th>
                          <th scope="col">Age</th>
                        </tr>
                      </thead>
                      <tbody>
        """;
    }
}
