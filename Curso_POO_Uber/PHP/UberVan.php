<?php
require_once('Car.php');

class UberVan extends Car{

    public $typeCarAccepted;
    public $seatsMaterial;
    protected $passenger;//En php no es necesario asignar esta funcion para polimorfismo, pero en los otros lenguajes si.

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial)
    {
        parent::__construct($license,$driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }

    /**
     * Polimorfismo, modificamos el metodo setPassenger de la clase padre Car, para que acepte 6 pasajeros. 
     */
    public function setPassenger($passenger) {
    
        if ($passenger == 6) {
            $this->passenger = $passenger;
        }
        else {
            echo "Necesitas asignar 6 pasajeros";
        }
    
    }

}