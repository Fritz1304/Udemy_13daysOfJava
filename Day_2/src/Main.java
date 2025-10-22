import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		 // Definimos la lista fuera del ciclo while
	    List<Person> persons = new ArrayList<>();
	    // Empezamos con el menu
	    var salir = false;
	    while(!salir){
	      mostrarMenu();
	      try {
	        salir = executeOperation(console, persons);
	      } catch(Exception e){
	        System.out.println("Ocurrio un error: " + e.getMessage());
	      }
	    }

	}
	
	 private static void mostrarMenu(){
		    // Mostramos las opciones
		    System.out.print("""
		            **** Listado Personas App ****
		            1. Agregar
		            2. Listar
		            3. Salir
		            """);
		    System.out.print("Proporciona la opcion?: ");
		  }
	
			private static boolean executeOperation(Scanner console, List<Person> persons) {
				var option = Integer.parseInt(console.nextLine());
				var exit = false;

				switch (option) {
				case 1 -> {
					System.out.print("Proporciona el nombre: ");
					var name = console.nextLine();
					System.out.print("Proporciona el telefono: ");
					var phone = console.nextLine();
					System.out.print("Proporciona el email: ");
					var email = console.nextLine();

					var person = new Person(name, phone, email);
					persons.add(person);
					System.out.println("Persona agregada correctamente: " + person);
				}
				case 2 -> {
					System.out.println("Listado de personas:");

					persons.forEach(System.out::println);
				}

				case 3 -> {
					System.out.println("Saliendo...");
					exit = true;
				}
				default -> System.out.println("Opcion erronea: " + option);

				}
				return exit;
			}
	 }
