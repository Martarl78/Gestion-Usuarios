package git;


public class Main {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		CalcularIngresos ingresosBanco = new CalcularIngresos();
		CrearUsuarios usuario = new CrearUsuarios ();
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

		double saldo = 0;
		usuario.nombreUsuario(leer);
		usuario.editarNombreUsuario(leer);
		usuario.email(leer);
		usuario.editarEmail(leer);

	public static double pedirNumeroValido(Scanner sc, String mensaje) {
		double numero = 0;
		boolean valido = false;

		ingresosBanco.setSaldoBruto(saldo);//Introduce el usuario su dinero
		ingresosBanco.saldo(leer);//Muestra el saldo del usuario
		ingresosBanco.calcularSaldoBruto(leer);//Calculo del saldo introducido por el usuarioo - el interes
		ingresosBanco.calculoViajes(leer);//Para llamar al método de vinted
		ingresosBanco.calculoHerencia(leer);//Para llamar al método de herencia
	}
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
