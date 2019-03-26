
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Persona a = new Persona(23,234567999,"Pepe");
        Persona b = new Persona(19,888888888,"Cacho");
        Persona c = new Persona(33,666666666,"Tito");
        Persona d = new Persona(10,444444444,"Beto");

        List<Persona> personas;
        personas = Arrays.asList(a,b,c,d);
        System.out.println(String.format("Personas %s",personas));
        System.out.println(String.format("Mayores a 21: %s",personas.stream()
        .filter(p->p.getEdad() > 21)
        .collect(Collectors.toList())));




    }

}