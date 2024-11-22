<?php

            //CLASE ABSTRACTA FIGURA
abstract class Figura {
    protected $x;
    protected $y;
    public function __construct($x, $y) {
        $this->x = $x;
        $this->y = $y;
    }

//Metodo abstracto area
    abstract public function area(): float;
}


            //CIRCULO
class Circulo extends Figura {

    // Variable de clase
    private static $radio;

    public function __construct($x, $y, $radio) {
        parent::__construct($x, $y);
        self::$radio = $radio;
    }

    // Implementacion del metodo area
    public function area(): float {
        return M_PI * pow(self::$radio, 2);
    }
}

            //CUADRADO
class Cuadrado extends Figura {
    //Variable de clase
    private static $lado;

    public function __construct($x, $y, $lado) {
        parent::__construct($x, $y);
        self::$lado = $lado;
    }

    //Implementacion del metodo area
    public function area(): float {
        return pow(self::$lado, 2);
    }
}

$circulo = new Circulo(0, 0, 5);
echo "Area del circulo: " . $circulo->area()."<br>"; 

$cuadrado = new Cuadrado(0, 0, 4);
echo "Area del cuadrado: " . $cuadrado->area()."<br>";

?>
