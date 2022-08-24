package Java;

class UberX extends Car {
    String brand;
    String model;

    /*Constructro debe inicializar el padre*/ 
    public UberX(String license, Account driver, String brand, String model){
        super(license,driver);//Inicializa el constructor del padre CAR
        this.brand = brand;
        this.model = model;
    }
    
    @Override
    void printDataCar()
    {
        super.printDataCar();
        System.out.println("Modelo: " + model + " Brand: " + brand);
    } 
}
