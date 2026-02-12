package moduloviajes;

import java.util.Scanner;

public class PrincipalViajes {

	    private static final int MAX_VIAJES = 5;
	    private static Viaje[] viajes = new Viaje[MAX_VIAJES];
	    private static int contador = 0;

	    public static void main(String[] args) {

	        Scanner leer = new Scanner(System.in);
	        int opcion;

	        do {
	            System.out.println("\n===== MENÚ VIAJES =====");
	            System.out.println("1) Registrar viaje");
	            System.out.println("2) Mostrar viajes");
	            System.out.println("0) Salir");
	            System.out.print("Opción: ");

	            opcion = leerInt(leer);

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

	        } while (opcion != 0);

	        leer.close();
	    }

	    private static void registrarViaje(Scanner leer) {
	        if (contador >= MAX_VIAJES) {
	            System.out.println("No se pueden registrar más viajes.");
	            return;
	        }

	        System.out.println("\n--- Registrar viaje ---");

	        System.out.print("Destino: ");
	        String destino = leer.nextLine();

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

	    private static double leerDouble(Scanner leer) {
	        while (true) {
	            String input = leer.nextLine().trim().replace(",", ".");
	            try {
	                return Double.parseDouble(input);
	            } catch (NumberFormatException e) {
	                System.out.print("Número inválido. Probá otra vez: ");
	            }
	        }
	    }
	}

