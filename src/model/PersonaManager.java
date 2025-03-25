package model;

import java.util.ArrayList;
import java.util.List;

public class PersonaManager {

    public static List<Persona> getPersona() {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("MrIncreible", 30));
        personas.add(new Persona("MrsIncreible", 45));
        personas.add(new Persona("BabyIncreible", 1));
        personas.add(new Persona("Prozono", 20));

        return personas;
    }
}
