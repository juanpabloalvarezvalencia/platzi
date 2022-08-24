<?php

/**
 * Nos referimos al namespace configurado en composer.json
 * que apunta a la carpeta src
 */

namespace Text;

/**
 * El nombre de la clase debe ser igual 
 * al nombre del archivo
 */

class Format
{
    public static function upperText($value)
    {
        return strtoupper($value);
    }

    public static function lowerText($value)
    {
        return strtolower($value);
    }

    public static function strlenText($value)
    {
        return  strlen($value);
    }


}

