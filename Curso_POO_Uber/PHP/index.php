<?php
require_once('Car.php');
require_once('UberX.php');
require_once('UberVan.php');
require_once('UberPool.php');
require_once('Account.php');

$UberX = new UberX("AMQ123",new Account("Andres Herrera","4372683"),"Chevrolet","Spark");
//$uberX->setPassenger(5);
$UberX->printDataCar();

$UberPool = new UberPool("CLO811",new Account("Andrea Herrera","4372683"),"Chevrolet","Twingo");
$UberPool->setPassenger(8);
$UberPool->printDataCar();

$uberVan = new UberVan("OJL395", new Account("Raúl Ramírez", "AND456"), "Nissan", "Versa");
$uberVan->setPassenger(6);
$uberVan->printDataCar();

