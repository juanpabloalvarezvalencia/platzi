package Java;

class UberPool extends Car {
    String brand;
    String model;

    /*Constructro debe inicializar el padre*/ 
    public UberPool(String license, Account driver, String brand, String model){
        super(license,driver);//Inicializa el constructor del padre CAR
        this.brand = brand;
        this.model = model;
    }
}
