import Clases.Camion;
import Clases.Vehiculo;
import Clases.VehiculoPrinter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        VehiculoPrinter impresora = new VehiculoPrinter();
        Vehiculo vehiculo_1 = new Vehiculo("KZI 598", "Fiat", 2011, 300);
        Vehiculo vehiculo_2 = new Vehiculo("AA 657 PL", "Audi", 2019, 355);
        Vehiculo vehiculo_3 = new Vehiculo("DD 486 JS", "Peugeot", 2024, 400);

        Camion camion_1 = new Camion("IUV 357", "Mercedes", 2011, 4500, true);
        Camion camion_2 = new Camion("IS 813 YS", "Mercedes", 2025, 6000, false);

        impresora.print(vehiculo_1);
        impresora.print(vehiculo_2);
        impresora.print(vehiculo_3);
        impresora.print(camion_1);
        impresora.print(camion_2);


    }
}