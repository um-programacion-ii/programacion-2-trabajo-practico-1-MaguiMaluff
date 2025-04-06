import Clases.Auto;
import Clases.Camion;
import Clases.Vehiculo;
import Clases.VehiculoPrinter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        VehiculoPrinter impresora = new VehiculoPrinter();
        List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

        Vehiculo vehiculo_1 = new Vehiculo("KZI 598", "Fiat", 2011, 300);
        Vehiculo vehiculo_2 = new Vehiculo("AA 657 PL", "Audi", 2019, 355);
        Vehiculo vehiculo_3 = new Vehiculo("DD 486 JS", "Peugeot", 2024, 400);

        Camion camion_1 = new Camion("IUV 357", "Mercedes", 2011, 4500, true);
        Camion camion_2 = new Camion("IS 813 YS", "Mercedes", 2025, 6000, false);

        Auto auto_1 = new Auto("ABY 489", "Volkswagen", 1999, 5);
        Auto auto_2 = new Auto("SR 489 HY", "Mercedes", 2020, 2);

        Collections.addAll(listaVehiculos, vehiculo_1, camion_1, auto_1, vehiculo_2, camion_2, auto_2, vehiculo_3);

        impresora.print(listaVehiculos);
    }
}