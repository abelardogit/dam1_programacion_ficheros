import model.Persona;

import java.util.*;

public class HelloCollections {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        System.out.println(ANSI_RED + "Texto de color rojo" + ANSI_RESET);
        String abelardo = "abelardo";
        String pbelardo = abelardo.replaceFirst("a", "p");
        System.out.println(pbelardo);
    }
}
