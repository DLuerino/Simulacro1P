public class Moto extends Vehiculo{
    private int cilindrada;
    private boolean baul;

    public Moto(String patente, String marca, double consumo, int cantRuedas, double precio, int cilindrada, boolean baul) {
        super(patente, marca, consumo, cantRuedas, precio);
        this.cilindrada = cilindrada;
        this.baul = baul;
    }

    public Moto() {

    }

    public boolean isBaul() {
        return baul;
    }

    public void setBaul(boolean baul) {
        this.baul = baul;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                ", baul=" + baul +
                ", patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", consumo=" + consumo +
                ", cantRuedas=" + cantRuedas +
                ", precio=" + precio +
                '}';
    }
}
