package AE3;

import Objetos.Suma;
import Objetos.Resta;
import Objetos.Producto;
import Objetos.Cociente;

public class Main {

	public static void main(String[] args) {
		
		Suma suma = new Suma();
		Resta resta = new Resta();
		Producto producto = new Producto();
		Cociente cociente = new Cociente();
		
		System.out.println("Resultado de la suma");
		System.out.println("Suma de dos numeros reales: "+suma.sumareal(2.5,2.5));
		System.out.println("Suma de dos numeros enteros: "+suma.sumaint(7,7));
		System.out.println("Suma de tres números reales: "+suma.sumareal(2.5,2.5,3.7));
		System.out.println("Resultado del valor acumulado: "+suma.ValorAcumulado(5));
			
		System.out.println("Resultados de la resta");
		System.out.println("Resta de dos números reales: "+resta.resultado(4.5,8.5));
		System.out.println("Resta de dos números enteros: "+resta.resultado(12,4));
		System.out.println("Resta de tres números reales: "+resta.resultado(1.2,8.7,4.4));
		System.out.println("Resultado del valor acumulado: "+resta.resultado(15));
		
		System.out.println("Resultados de la clase producto");
		System.out.println("Multiplicación de dos números enteros: "+producto.productoint(2, 5));
		System.out.println("Multiplicación de dos números reales: "+producto.producto(3.5, 5.5));
		System.out.println("Multiplicación de tres números reales: "+producto.producto(5.5, 8.5, 9.5));
		System.out.println("Cálculo de la potencia: "+producto.potencia(5, 5));

		System.out.println("Resultados de la clase cociente");
        System.out.println("El valor de la division es "+cociente.cociente(10,2));
        System.out.println("El valor de la division es "+cociente.cocienteint(5.1,3.5));
      
        try {
            System.out.println("El inverso es: "+cociente.inverso(0)); 
        } catch(Exception ex){
            System.out.println("El 0 no tiene numero inverso"); 
        }
        System.out.println("La raiz es: "+cociente.raiz(9));
	}
}
