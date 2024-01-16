import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        // Aquí se crean personas a partir del constructor Persona
        Persona persona1 = new Persona("Lidia", "Galiano");
        Persona persona2 = new Persona("Desire", "Maya");
        Persona persona3 = new Persona("Penélope", "Castellana");
        Persona persona4= new Persona("Antonio", "Gris");
        Persona persona5= new Persona ("Estefanía", "Gallego");

        // Se añade cada persona la lista
        List<Persona>lista =  new ArrayList<Persona>();
        lista.add(persona1);
        lista.add(persona2);
        lista.add(persona3);
        lista.add(persona4);
        lista.add(persona5);


        //
        Collections.sort(lista, Comparator.comparing(Persona::getNombre));

        System.out.println("Personas ordenadas por orden alfabético:");
        for (Persona persona : lista) {
            System.out.println(persona.getNombre()+ " "+ persona.getApellido());}

        System.out.println("-----------------------------------------------------------------------");
        Collections.sort(lista, Comparator.comparing(Persona::getApellido));

        System.out.println("Personas ordenadas por orden alfabético en Apellidos:");
        for (Persona persona : lista) {
            System.out.println(persona.getNombre()+ " "+ persona.getApellido());}

        System.out.println("-----------------------------------------------------------------------");

        Collections.sort(lista, Comparator.comparing(Persona::getApellido, Comparator.reverseOrder()));

        System.out.println("Personas ordenadas por orden alfabético en Apellidos inverso:");
        for (Persona persona : lista) {
            System.out.println(persona.getNombre()+ " "+ persona.getApellido());}






        }



    }
