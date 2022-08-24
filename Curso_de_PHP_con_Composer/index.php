<?php

require __DIR__ . '/vendor/autoload.php';

//echo Text\Format::upperText("hola mundo");

echo upper("hola mundo");
echo lower("hola mundo");
echo strlen("hola mundo");

/**
 * 
 * Instrucciónes:
 * 
 * 1. Se crea el archivo composer.json con la configuración interna
 * 2. Se crea la carpeta src
 * 3. Se crean los archivos Format.php y helpers.php en la carpeta src
 * 4. Se ejecuta el comando composer dum en la terminal, para crear automaticamente la carpeta vendor.
 * 5. Se coloca al inicio del index.php la linea require __DIR__ . '/vendor/autoload.php';
 */
