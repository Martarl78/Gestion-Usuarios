package git;

import java.util.Scanner;


// Clase calculadora
 
public class calculadora {

    // ATRIBUTOS PRIVADOS 
    private double alquiler;
    private double viajes;
    private double gastosVarios;

    // CONSTRUCTORES

    public calculadora() {
        this.alquiler = 0;
        this.viajes = 0;
        this.gastosVarios = 0;
    }

    public calculadora(double alquiler, double viajes, double gastosVarios) {
        this.alquiler = alquiler;
        this.viajes = viajes;
        this.gastosVarios = gastosVarios;
    }

   

    public double getAlquiler() {
        return alquiler;
    }

    public double getViajes() {
        return viajes;
    }

    public double getGastosVarios() {
        return gastosVarios;
    }

    
    public void setAlquiler(double alquiler) {
        this.alquiler = alquiler;
    }

    public void setViajes(double viajes) {
        this.viajes = viajes;
    }

    public void setGastosVarios(double gastosVarios) {
        this.gastosVarios = gastosVarios;
    }

    //  MÉTODO PRINCIPAL

    public double calcularTotalGastos() {
        return alquiler + viajes + gastosVarios;
    }

    // MÉTODO DE DEPURACIÓN 

    
     // Pide un número al usuario y valida que sea correcto 
   
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

    // MOSTRAR DATOS 

    @Override
    public String toString() {
        return "Gastos del usuario:\n" +
                "Alquiler: " + alquiler + " €\n" +
                "Viajes: " + viajes + " €\n" +
                "Gastos varios: " + gastosVarios + " €\n" +
                "TOTAL: " + calcularTotalGastos() + " €";
    }
}
