package Clases;

public class VehiculoPrinter {

    public void print(Vehiculo vehiculo) {

        System.out.println("Marca: " + vehiculo.getMarca() + '\n' + "Patente: " + vehiculo.getPatente()
                + '\n' + "Año: " + vehiculo.getAnio() + '\n' + "Capacidad: " + vehiculo.getCapacidadCargaKg() + "kg" + '\n');
    }

    public void print(Camion vehiculo) {

        System.out.println("Marca: " + vehiculo.getMarca() + '\n' + "Patente: " + vehiculo.getPatente()
                + '\n' + "Año: " + vehiculo.getAnio() + '\n' + "Capacidad: " + vehiculo.getCapacidadCargaKg() + "kg" + '\n');

        if (vehiculo.isTieneAcoplado()) {
            System.out.println("Tiene Acoplado" + '\n');

        } else
            System.out.println("No tiene Acoplado" + '\n');

    }
    public void print(Auto vehiculo){
        System.out.println("Marca: " + vehiculo.getMarca() + '\n' + "Patente: " + vehiculo.getPatente()
                + '\n' + "Año: " + vehiculo.getAnio() + '\n' + "Capacidad: " + vehiculo.getCapacidadCargaKg() + "kg" + '\n'
                + "Cantidad de pasajeros: " + vehiculo.getCantidadPasajero() + '\n' );


    }
}



