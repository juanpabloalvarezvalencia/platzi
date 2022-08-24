package Java;

class Main{

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera","4372683"),"Chevrolet","Twingo");
        //car.license = "AMQ123";
        //car.driver = "Andres Herrera";
        ///car.passenger = 4; //desde aqui no se puede modificara ya que es un metodo privado
        //La unica forma de cambiar passenger es con una funcion
        uberX.setPassenger(4);
        uberX.printDataCar();

        Car car2 = new Car("AMQ5465",new Account("Andrea Herrera","4372683"));
        //car2.license = "AMQ5465";
        //car2.driver = "Andrea Herrera";
        //car2.passenger = 3;        
        car2.setPassenger(3);
        car2.printDataCar();


        UberVan uberVan = new UberVan("CLO811", new Account("Juan Pablo Alvarez","4372683"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
    
}