class Car{

    constructor(license,driver){
        this.id;
        this.license = license;
        this.driver = driver;
        this.passanger;
    }
    
    printDataCar() {
        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)
    }
    
}

/* Forma Antigua de declarar las clases
function Car(license,driver){
    this.id;
    this.license = license;
    this.driver = driver;
    this.passanger;
}

Car.prototype.printDataCar = function () {
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)
}
*/