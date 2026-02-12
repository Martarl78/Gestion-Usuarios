package git;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		CalcularIngresos ingresosBanco = new CalcularIngresos();

		double saldo = 0;

		ingresosBanco.setSaldoBruto(saldo);//Introduce el usuario su dinero
		ingresosBanco.saldo(leer);//Muestra el saldo del usuario
		ingresosBanco.calcularSaldoBruto(leer);//Calculo del saldo introducido por el usuarioo - el interes
		ingresosBanco.calculoViajes(leer);//Para llamar al método de vinted
		ingresosBanco.calculoHerencia(leer);//Para llamar al método de herencia
	}

}
