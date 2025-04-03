package Clases;

public class VehiculoPrinter {

    public void print(Vehiculo vehiculo){

        System.out.println("Marca: " + vehiculo.getMarca() + '\n' + "Patente: " + vehiculo.getPatente()
                + '\n' + "Año: " + vehiculo.getAnio() + '\n' + "Capacidad: " + vehiculo.getCapacidadCargaKg() + "kg" + '\n' );

    }

}
