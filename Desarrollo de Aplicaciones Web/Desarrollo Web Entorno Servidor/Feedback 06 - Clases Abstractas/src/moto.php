<?php

        //VEHICULO
interface Vehiculo {
    public function frenar(); //Frenar
    public function acelerar(); //Acelerar
}

        //MOTO
class Moto implements Vehiculo {
    private static $velocidad = 0;
    //Frenar
    public function frenar() {
        return "La moto ha frenado ya y va a " . self::$velocidad . " km/hora"."<br>";
    }
    //Acelerar
    public function acelerar() {
        $velocidadMaxima = 120;

        if (self::$velocidad < $velocidadMaxima) {
            self::$velocidad += 10;
            return "La moto ha acelerado y va a " . self::$velocidad . " km/hora"."<br>"."<br>";
        } else {
            return "La moto ya ha alcanzado la velocidad máxima de " . $velocidadMaxima . " km/hora"."<br>";
        }
    }
}

        //COCHE
class Coche implements Vehiculo {
    private static $velocidad = 0;
    //Frenar
    public function frenar() {
        return "El coche ha frenado ya y va a " . self::$velocidad . " km/hora"."<br>";
    }
    //Acelerar
    public function acelerar() {
        $velocidadMaxima = 150;

        if (self::$velocidad < $velocidadMaxima) {
            self::$velocidad += 20;
            return "El coche ha acelerado y va a " . self::$velocidad . " km/hora"."<br>"."<br>";
        } else {
            return "El coche ya ha alcanzado la velocidad máxima de " . $velocidadMaxima . " km/hora";
        }
    }
}

        //MAIN
function main() {
    $vehiculos = array(new Coche(), new Moto());

    foreach ($vehiculos as $vehiculo) {
        echo $vehiculo->frenar() . "\n"; //Frenar
        echo $vehiculo->acelerar() . "\n"; //Acelerar
    }
}

main(); //Llamada

?>
