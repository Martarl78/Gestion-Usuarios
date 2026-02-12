package git;

import java.util.Scanner;

public class CalcularIngresos {

	public double saldo;
	public double saldoBruto;
	public double interes = 21;
	public double ingresos;
	public double ventaWallapop;
	public String herencia;


	public CalcularIngresos () {

	}


	public CalcularIngresos (double interes, double ingresos, double ventaWallapop, double saldo, double saldoBruto) {
		this.interes = interes;
		this.ingresos = ingresos;
		this.ventaWallapop = ventaWallapop;
		this.saldo = saldo;
		this.saldoBruto = saldoBruto;
	}


	public CalcularIngresos (double interes, double ingresos, double ventaWallapop, String herencia, double saldo, double saldoBruto) {
		this.interes = interes;
		this.ingresos = ingresos;
		this.ventaWallapop = ventaWallapop;
		this.herencia = herencia;
		this.saldo = saldo;
		this.saldoBruto = saldoBruto;
	}




	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getSaldoBruto() {
		return saldoBruto;
	}


	public void setSaldoBruto(double saldoBruto) {
		this.saldoBruto = saldoBruto;
	}


	public double getInteres() {
		return interes;
	}


	public void setInteres(double interes) {
		this.interes = interes;
	}


	public double getIngresos() {
		return ingresos;
	}


	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}


	public double getVentaWallapop() {
		return ventaWallapop;
	}


	public void setVentaWallapop(double ventaWallapop) {
		this.ventaWallapop = ventaWallapop;
	}


	public String getHerencia() {
		return herencia;
	}


	public void setHerencia(String herencia) {
		this.herencia = herencia;
	}


	public void saldo (Scanner leer) {

		System.out.println("Introduce tu saldo actual de tu cuenta bancaria: ");
		saldo = leer.nextDouble();
		System.out.println(saldo);
	}


	public double calcularSaldoBruto (Scanner leer) {

		double calculoNeto;
		System.out.println("Introduzca su sueldo bruto para calcular el neto: ");
		saldoBruto = leer.nextDouble();
		calculoNeto = (saldoBruto - ((saldoBruto * interes) / 100));
		System.out.println("Su saldo neto es: " +calculoNeto);
		saldo = saldo + calculoNeto;
		System.out.println("Su dinero en el banco despues de su sueldo es: " +saldo);
		System.out.println("\n");
		return calculoNeto;
	}

	public void calculoViajes (Scanner leer) {

		String wallapop;
		String concepto;

		do {
			System.out.println("¿Usted ha vendido algo en Wallapop?");
			wallapop = leer.next();
		} while (!wallapop.equalsIgnoreCase("si") && !wallapop.equalsIgnoreCase("no"));
		if (wallapop.equalsIgnoreCase("no")) {
			wallapop = "No se ha vendido nada, su saldo sigue siendo de: " +saldo;
			System.out.println("\n");
			System.out.println(wallapop);
		} else {
			System.out.println("Inserte el dinero ganado con sus ventas de vinted: ");
			ventaWallapop = leer.nextDouble();
			System.out.println("Indique el concepto de la venta: ");
			concepto = leer.next();
			saldo = saldo + ventaWallapop;
			System.out.println("Dinero ganado: "+ventaWallapop);
			System.out.println("El concepto de venta es: " +concepto);
			System.out.println("Dinero actual: " +saldo);
			System.out.println("\n");
		}
	}


	public void calculoHerencia (Scanner leer) {

		double dineroHerencia;
		do {
			System.out.println("¿Usted heredó algo de dinero?");
			herencia = leer.next();
		} while (!herencia.equalsIgnoreCase("si") && !herencia.equalsIgnoreCase("no"));
		if (herencia.equalsIgnoreCase("no")) {
			herencia = "No se ha obtenido ningúna herencia, su dinero sigue siendo de: " +saldo;
			System.out.println("\n");
			System.out.println(herencia);
		} else {
			System.out.println("Inserte el dinero que usted ha heredado: ");
			dineroHerencia = leer.nextDouble();
			saldo = saldo + dineroHerencia;
			System.out.println("Su dinero actual es: " +saldo);
		}
	}
}
