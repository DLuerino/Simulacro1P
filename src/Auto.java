public class Auto extends Vehiculo{
    private String prestaciones;
    private int cambios;

    public Auto(String patente, String marca, double consumo, int cantRuedas, double precio, String prestaciones, int cambios) {
        super(patente, marca, consumo, cantRuedas, precio);
        this.prestaciones = prestaciones;
        this.cambios = cambios;
    }

    public Auto() {

    }

    public String getPrestaciones() {
        return prestaciones;
    }

    public void setPrestaciones(String prestaciones) {
        this.prestaciones = prestaciones;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

//    @Override
//    public String toString() {
//        return " [ AUTO ] \n"+" Patente:  "+getPatente()+"\n Marca: "+getMarca()+"\n Consumo de combustible: "+getConsumo()+"\n Cantidad de ruedas: "+getCantRuedas()+"\n Precio: "+getPrecio()+"$"+"\n Prestaciones: "+getPrestaciones();
//    }


    @Override
    public String toString() {
        return "Auto{" +
                "prestaciones='" + prestaciones + '\'' +
                ", cambios=" + cambios +
                ", patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", consumo=" + consumo +
                ", cantRuedas=" + cantRuedas +
                ", precio=" + precio +
                '}';
    }

    public int cambiarMarcha
}
