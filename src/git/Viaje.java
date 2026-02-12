package git;

public class Viaje {

	    private String destino;
	    private String fechaInicio;
	    private String fechaFin;
	    private double coste;
	    private int dias;

	    public Viaje(String destino, String fechaInicio, String fechaFin, double coste, int dias) {
	        this.destino = destino;
	        this.fechaInicio = fechaInicio;
	        this.fechaFin = fechaFin;
	        this.coste = coste;
	        this.dias = dias;
	    }

	    public String getDestino() {
	        return destino;
	    }

	    public String getFechaInicio() {
	        return fechaInicio;
	    }

	    public String getFechaFin() {
	        return fechaFin;
	    }

	    public double getCoste() {
	        return coste;
	    }

	    public int getDias() {
	        return dias;
	    }

	    public double costePorDia() {
	        if (dias <= 0) return 0;
	        return coste / dias;
	    }

	    @Override
	    public String toString() {
	        return "Destino: " + destino +
	               "\nFechas: " + fechaInicio + " - " + fechaFin +
	               "\nDías: " + dias +
	               "\nCoste total: " + String.format("%.2f", coste) + " €" +
	               "\nCoste por día: " + String.format("%.2f", costePorDia()) + " €";
	    }
	}

	

