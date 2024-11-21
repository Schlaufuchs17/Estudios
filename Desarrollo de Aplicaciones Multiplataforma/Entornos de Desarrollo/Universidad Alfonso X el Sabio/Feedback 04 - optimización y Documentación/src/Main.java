* Ejemplo: peliculas
*
* @author Adrian Caballero
* @version 28.11.2020
*/

public class Circulo {
    private double centroX;
    private double centroY;
    private double radio;
    public Circulo(double cx, double cy, double r) {
    centroX = cx;
    centroY = cy;
    radio = r;
}

public double getCentroX() {
    return centroX;
}

public double getCircunferencia() {
    return 2 * Math.PI * radio;
}

public void mueve(double deltaX, double deltaY) {
    centroX = centroX + deltaX;
    centroY = centroY + deltaY;
    }

public void escala(double s) {
    radio = radio * s;
    }
}