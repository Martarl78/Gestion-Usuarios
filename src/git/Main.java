package git;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Crear objeto de la clase calculadora (Alumno 3)
		calculadora gastos = new calculadora();

		System.out.println("=== GESTIÓN DE GASTOS DEL USUARIO ===");

		// Pedir datos al usuario con depuración
		gastos.setAlquiler(pedirNumeroValido(sc, "Introduce el gasto de alquiler: "));
		gastos.setViajes(pedirNumeroValido(sc, "Introduce el gasto en viajes: "));
		gastos.setGastosVarios(pedirNumeroValido(sc, "Introduce los gastos varios: "));

		// Mostrar resultados
		System.out.println("\n--- RESULTADOS ---");
		System.out.println(gastos.toString());

		System.out.println("\nTotal de gastos calculado: " + gastos.calcularTotalGastos() + " €");

		sc.close();
	}

	public static double pedirNumeroValido(Scanner sc, String mensaje) {
		double numero = 0;
		boolean valido = false;

		while (!valido) {
			System.out.print(mensaje);

			if (sc.hasNextDouble()) {
				numero = sc.nextDouble();
				valido = true;
			} else {
				System.out.println("ERROR: Debes introducir un número válido.");
				sc.next(); // limpiar entrada incorrecta
			}
		}

		return numero;
	}
}
