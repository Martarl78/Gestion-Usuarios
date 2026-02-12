package git;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner (System.in);
		CrearUsuarios usuario = new CrearUsuarios ();

		usuario.nombreUsuario(leer);
		usuario.editarNombreUsuario(leer);
		usuario.email(leer);
		usuario.editarEmail(leer);

	}

}


