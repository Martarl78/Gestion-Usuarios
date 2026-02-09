package CrearUsuarios;


import java.util.Scanner;

public class CrearUsuarios {

	public String nombre;
	public String nuevoNombre;
	public  String email;
	public  String nuevoEmail;
	

	// Constructor
	public CrearUsuarios () {
	}

	public CrearUsuarios (String nombre, String email) {

		this.nombre = nombre;
		this.email = email;
	}


	public void nombreUsuario(Scanner leer) {

		System.out.println("Introduzca su nombre: " );
		nombre = leer.nextLine();
		System.out.println("Su nombre es: " +nombre);
		System.out.println("\n");	
	}

	public void editarNombreUsuario(Scanner leer) {

		String editarNombre;

		do {
			System.out.println("¿Quiere editar su nombre?");
			editarNombre = leer.nextLine();
		} while (!editarNombre.equalsIgnoreCase("si") && !editarNombre.equalsIgnoreCase("no"));
		if (editarNombre.equalsIgnoreCase("no")) {
			editarNombre = "No se ha editado nada, su nombre sigue siendo: " +nombre;
			System.out.println("\n");
			System.out.println(editarNombre);
		} else {
			System.out.println("Escriba su nuevo nombre: ");
			nuevoNombre = leer.nextLine();
			editarNombre = nuevoNombre;
			System.out.println("Nombre Antiguo: "+nombre);
			System.out.println("Nombre nuevo: " +nuevoNombre);
			System.out.println("\n");
		}
		
	}
		 
		public void email (Scanner leer) {
			
			System.out.println("Introduzca su email: " );
			email = leer.nextLine();
			System.out.println("Su email es: " +email);
			System.out.println("\n");
		}
		
		
		public void editarEmail (Scanner leer) {
			
			String editarEmail;

			do {
				System.out.println("¿Quiere editar su email?");
				editarEmail = leer.nextLine();
			} while (!editarEmail.equalsIgnoreCase("si") && !editarEmail.equalsIgnoreCase("no"));
			if (editarEmail.equalsIgnoreCase("no")) {
				editarEmail = "No se ha editado nada, su email sigue siendo: " +email;
				System.out.println("\n");
				System.out.println(editarEmail);
			} else {
				System.out.println("Escriba su nuevo email: ");
				nuevoEmail = leer.nextLine();
				editarEmail = nuevoEmail;
				System.out.println("Email Antiguo: "+email);
				System.out.println("Email nuevo: " +nuevoEmail);
				System.out.println("\n");
			}
			
		}
	

}