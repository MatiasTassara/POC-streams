
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

        //mayores de 21
        System.out.println(String.format("Mayores a 21: %s",personas.stream()
        .filter(p->p.getEdad() > 21)
        .collect(Collectors.toList())));
        //mayores de 18
        System.out.println(String.format("Menores a 18 %s", personas.stream()
                .filter(p -> p.getEdad() < 18)
                .collect(Collectors.toList()))
        );
        //mayores de 21 y documento > 20000000
        System.out.println(String.format("Mayores a 21 y DNI mayor a 20.000.000 %s", personas.stream()
                .filter(persona -> persona.getEdad() > 21)
                .filter(persona -> persona.getDni() > 20000000)
                .collect(Collectors.toList()))
        );


    }

}