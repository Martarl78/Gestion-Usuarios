package git;

import java.util.Scanner;

public class Main {

	    private static final int MAX_VIAJES = 5;
	    private static Viaje[] viajes = new Viaje[MAX_VIAJES];
	    private static int contador = 0;

	    public static void main(String[] args) {

	        Scanner leer = new Scanner(System.in);
	        int opcion;
		Scanner leer = new Scanner(System.in);
		CalcularIngresos ingresosBanco = new CalcularIngresos();
		CrearUsuarios usuario = new CrearUsuarios ();
		Scanner sc = new Scanner(System.in);

	        do {
	            System.out.println("\n===== MENÚ VIAJES =====");
	            System.out.println("1) Registrar viaje");
	            System.out.println("2) Mostrar viajes");
	            System.out.println("0) Salir");
	            System.out.print("Opción: ");
		// Crear objeto de la clase calculadora (Alumno 3)
		calculadora gastos = new calculadora();

	            opcion = leerInt(leer);
		System.out.println("=== GESTIÓN DE GASTOS DEL USUARIO ===");

	            switch (opcion) {
	                case 1:
	                    registrarViaje(leer);
	                    break;
	                case 2:
	                    mostrarViajes();
	                    break;
	                case 0:
	                    System.out.println("Saliendo :)");
	                    break;
	                default:
	                    System.out.println("Opción inválida.");
	            }
		// Pedir datos al usuario con depuración
		gastos.setAlquiler(pedirNumeroValido(sc, "Introduce el gasto de alquiler: "));
		gastos.setViajes(pedirNumeroValido(sc, "Introduce el gasto en viajes: "));
		gastos.setGastosVarios(pedirNumeroValido(sc, "Introduce los gastos varios: "));

	        } while (opcion != 0);
		// Mostrar resultados
		System.out.println("\n--- RESULTADOS ---");
		System.out.println(gastos.toString());

	        leer.close();
	    }
		System.out.println("\nTotal de gastos calculado: " + gastos.calcularTotalGastos() + " €");

	    private static void registrarViaje(Scanner leer) {
	        if (contador >= MAX_VIAJES) {
	            System.out.println("No se pueden registrar más viajes.");
	            return;
	        }
		sc.close();
	}

	        System.out.println("\n--- Registrar viaje ---");
		double saldo = 0;
		usuario.nombreUsuario(leer);
		usuario.editarNombreUsuario(leer);
		usuario.email(leer);
		usuario.editarEmail(leer);

	        System.out.print("Destino: ");
	        String destino = leer.nextLine();
	public static double pedirNumeroValido(Scanner sc, String mensaje) {
		double numero = 0;
		boolean valido = false;

	        System.out.print("Fecha de inicio: ");
	        String inicio = leer.nextLine();

	        System.out.print("Fecha de fin: ");
	        String fin = leer.nextLine();

	        System.out.print("Días del viaje: ");
	        int dias = leerInt(leer);

	        System.out.print("Coste total (€): ");
	        double coste = leerDouble(leer);

	        Viaje v = new Viaje(destino, inicio, fin, coste, dias);
	        viajes[contador] = v;
	        contador++;

	        System.out.println("\nViaje registrado correctamente.");
	    }
		ingresosBanco.setSaldoBruto(saldo);//Introduce el usuario su dinero
		ingresosBanco.saldo(leer);//Muestra el saldo del usuario
		ingresosBanco.calcularSaldoBruto(leer);//Calculo del saldo introducido por el usuarioo - el interes
		ingresosBanco.calculoViajes(leer);//Para llamar al método de vinted
		ingresosBanco.calculoHerencia(leer);//Para llamar al método de herencia
	}
		while (!valido) {
			System.out.print(mensaje);

	    private static void mostrarViajes() {
	        System.out.println("\n--- Lista de viajes ---");

	        if (contador == 0) {
	            System.out.println("No hay viajes registrados.");
	            return;
	        }

	        for (int i = 0; i < contador; i++) {
	            System.out.println("\nViaje " + (i + 1));
	            System.out.println(viajes[i]);
	        }
	    }

	    private static int leerInt(Scanner leer) {
	        while (true) {
	            String input = leer.nextLine().trim();
	            try {
	                return Integer.parseInt(input);
	            } catch (NumberFormatException e) {
	                System.out.print("Número inválido. Probá otra vez: ");
	            }
	        }
	    }
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
