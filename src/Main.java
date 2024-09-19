import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gestion inventario= new Gestion();

        Auto auto1=new Auto("DHL 297", "Peugeot", 12.3, 4, 15, "automatico");
        Moto moto1=new Moto("BMS 212", "Yamaha", 7.6, 2, 7, 200, true);

        auto1.addPrestaciones("Aire acondicionado");
        auto1.addPrestaciones("Android & Apple car");
        auto1.addPrestaciones("Asientos calefactables");
        inventario.agregarVehiculo(auto1);
        inventario.agregarVehiculo(moto1);

        System.out.println(inventario.devolverListado());


    }
}