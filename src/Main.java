public class Main {
    public static void main(String[] args) {
        Auto auto1=new Auto("DHL 297", "Peugeot", 12.3, 4, 15, "Motor 1.6 swap ferrari 458 Italia");
        Moto moto1=new Moto("BMS 212", "Yamaha", 7.6, 2, 7, 200, true);

        Gestion inventario= new Gestion();
        inventario.agregarVehiculo(auto1);
        inventario.agregarVehiculo(moto1);

        System.out.println(inventario.devolverListado());
    }
}