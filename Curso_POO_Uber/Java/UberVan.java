package Java;
import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    /*Constructro debe inicializar el padre*/ 
    public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license,driver);//Inicializa el constructor del padre CAR
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    public UberVan(String license, Account driver){
        super(license,driver);//Inicializa el constructor del padre CAR
    }

    /*
    * Polimorfismo: Cuando cambio el comportamiento de un metodo de la case padre.
    *  En este caso estoy cambiando el comportamento del metodo setPassenger de Car
    */
    @Override
    public void setPassenger(Integer passenger) {
        if(passenger == 6)
        {
            this.passenger = passenger;
        }
        else{
            System.out.println("Necesitas asignar seis pasajeros");
        }
    }

}
