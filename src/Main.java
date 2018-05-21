import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class Main {
    public static void main(String[] args){
        List <Alumno>  listaAlumnos= new ArrayList<Alumno>(15);
        Alumno a = new Alumno("15120","Juan", "Perezzzzzz", 6);
        listaAlumnos.add(a);
        listaAlumnos.add(new Alumno("15118","Martin", "Anelloooooo", 7));
        listaAlumnos.add(new Alumno("15217","Javier", "Gimenezzzzzz", 8));
        listaAlumnos.add(new Alumno("15316","Nicolas", "Cecchi", 9));
        listaAlumnos.add(new Alumno("15415","Esteban", "Bertea", 10));
        listaAlumnos.add(new Alumno("155","Gabriel", "Aguirre", 10));
        listaAlumnos.add(new Alumno("15623","Marcos", "Firenzeeeeeeee", 9));
        listaAlumnos.add(new Alumno("15734","Ninja", "Perez", 8));
        listaAlumnos.add(new Alumno("158453","Nahuel", "Romerooooooo", 7));
        listaAlumnos.add(new Alumno("15945","Lucio", "Lucifer", 8));
        listaAlumnos.add(new Alumno("16023","Mauricio", "Lopezzzzzzzz", 9));
        listaAlumnos.add(new Alumno("161","Gonzalo", "Rodriguezzzz", 9));
        listaAlumnos.add(new Alumno("17223","Lucas", "Reinaaaaaaaa", 8));
        listaAlumnos.add(new Alumno("16314","Rogelio", "Spadaforaaaa", 6));
        listaAlumnos.add(new Alumno("16419","Sebastian", "Aguirre", 8));



        //1.Obtener todos los alumnos de la lista.
        //listaAlumnos.stream().forEach(b -> System.out.println(b.toString()));
        //2.Obtener una lista de alumnos cuyos apellidos empiezan con “L” o “G”
        //listaAlumnos.stream().filter(b-> b.getApellido().startsWith("L" )|| b.getApellido().startsWith("G")).forEach(b-> System.out.println(b));
        //3.Obtener la cantidad de alumnos de la lista.
        //System.out.println(listaAlumnos.stream().count());
        //4.Obtener un listado de alumnos con un promedio superior a 9
        //listaAlumnos.stream().filter(b-> b.getPromedio()>=9).forEach(b-> System.out.println(b));
        //5.Imprimir los dos primeros alumnos de la lista.
        //listaAlumnos.stream().limit(2).forEach(b-> System.out.println(b));
        //6.Obtener el alumno de menor id
        //listaAlumnos.stream().sorted((a1, a2) ->a1.getId()- a2.getId()).limit(1).forEach(b-> System.out.println(b));
        //7.Imprimir una lista de alumnos cuyos apellidos tengan menos de 10 caracteres
        //listaAlumnos.stream().filter(b->b.getApellido().length()<10).forEach(b-> System.out.println(b));
        //8.Obtener un nuevo listado de alumnos con apellidos que contengan una “m”
        List <Alumno> nuevaLista = new ArrayList<Alumno>();
        nuevaLista= listaAlumnos.stream().filter(b -> b.getApellido().contains("m")).collect(Collectors.toList());
        nuevaLista.forEach(b-> System.out.println(b));

    }
}
