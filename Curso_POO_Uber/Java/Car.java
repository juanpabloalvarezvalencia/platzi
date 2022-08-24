package Java;

public class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;

    //Constructor
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
        //Atributo encapsulado con el metodo private, no se puede alterar desde afuera, solo se puede aquí.
        passenger = 4;
    }
    
    //funcion para imprimir los parametros
    void printDataCar()
    {
        System.out.println("License: " + license +  " Driver: " + driver.name + " Passaengers: " + passenger);
    }

    public Integer getPassenger()
    {
        return passenger;
    }

    public void setPassenger(Integer passenger)
    {
        if(passenger == 4)
        {
            this.passenger = passenger;
        }
        else{
            System.out.println("Necesitas asignar cuatro pasajeros");
        }
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }


    
}
