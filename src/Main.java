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

        impresora.print(vehiculo_1);
        impresora.print(vehiculo_2);
        impresora.print(vehiculo_3);


    }
}