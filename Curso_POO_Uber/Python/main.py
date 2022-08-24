from Car import Car
from Account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    
    car = Car("AMQ123",Account("Andres Herrera","4372683"))
    # car.license = "AMQ123"
    # car.driver = "Andres Herrera"
    car.passenger = 4
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("AMQ5465",Account("Andrea Herrera","4372682"))
    # car2.license = "AMQ5465"
    # car2.driver = "Andrea Herrera"
    car2.passenger = 3
    print(vars(car2))
    print(vars(car2.driver))

