package Clases;

public class Auto extends Vehiculo{

    private int cantidadPasajero;

    public Auto(String patente, String marca, int anio, int cantidadPasajero) {
        super(patente, marca, anio, cantidadPasajero);
        this.cantidadPasajero = cantidadPasajero;
    }

    public int getCantidadPasajero() {
        return cantidadPasajero;
    }

    public void setCantidadPasajero(int cantidadPasajero) {
        this.cantidadPasajero = cantidadPasajero;
    }
}
