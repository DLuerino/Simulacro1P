import java.util.ArrayList;

public class Auto extends Vehiculo{
    private ArrayList<String> prestaciones=new ArrayList<>();
    private String cambio;

    public Auto(String patente, String marca, double consumo, int cantRuedas, double precio, String cambio) {
        super(patente, marca, consumo, cantRuedas, precio);
        this.prestaciones = new ArrayList<>();
        this.cambio = cambio;
    }

    public Auto(String cambio) {
        prestaciones = new ArrayList<>();
        this.cambio = cambio;
    }

    public Auto() {
        prestaciones = new ArrayList<>();
    }

    public void addPrestaciones(String nueva){
        prestaciones.add(nueva);
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    //    @Override
//    public String toString() {
//        return " [ AUTO ] \n"+" Patente:  "+getPatente()+"\n Marca: "+getMarca()+"\n Consumo de combustible: "+getConsumo()+"\n Cantidad de ruedas: "+getCantRuedas()+"\n Precio: "+getPrecio()+"$"+"\n Prestaciones: "+getPrestaciones();
//    }


    @Override
    public String toString() {
        return "Auto{" +
                "prestaciones='" + prestaciones + '\'' +
                ", Tipo de cambio de marcha =" + cambio +
                ", patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", consumo=" + consumo +
                ", cantRuedas=" + cantRuedas +
                ", precio=" + precio +
                '}';
    }

}
