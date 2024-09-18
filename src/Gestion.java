import java.util.ArrayList;

public class Gestion {
    protected ArrayList<Vehiculo>stock;

    public Gestion() {
        this.stock = new ArrayList<>();
    }

    public String agregarVehiculo(Vehiculo vehiculo){
        stock.add(vehiculo);
        return "El vehiculo se añadio correctamente";
    }

    public String eliminarVehiculoXpatente(Vehiculo eliminar){
        String resultado="";

        for(Vehiculo vehiculo : stock){
            if(eliminar.equals(vehiculo)){
                stock.remove(eliminar);
                resultado="El vehiculo se elimino correctamente";
            }else{
                resultado="El vehiculo no se encontro en la lista.";
            }
        }

        return resultado;
    }

    public String devolverListado(){
        String resultado="";

        for(Vehiculo vehiculo : stock){
            resultado+=vehiculo.toString();

            if(vehiculo instanceof Auto){
                resultado+="\n"+((Auto)vehiculo).toString();
            }else if(vehiculo instanceof Moto){
                resultado+="\n"+((Moto)vehiculo).toString();
            }
        }

        if(resultado.isEmpty()){
            return "La lista esta vacia!. ";
        }else{
            return resultado;
        }

    }

    public Vehiculo buscarXpatente(Vehiculo buscar){
        Vehiculo aux=new Vehiculo();

        for(Vehiculo vehiculo : stock){
            if(buscar.equals(vehiculo)){
                aux=vehiculo;
            }else{
                return null;
            }
        }

        return aux;
    }

    public int cantidadVehiculos(){
        return stock.size();
    }


}
