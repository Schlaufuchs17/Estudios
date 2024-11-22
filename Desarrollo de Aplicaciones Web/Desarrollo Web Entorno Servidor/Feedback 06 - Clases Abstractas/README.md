# Feedback 06 - Clases Abstractas

## Clases Abstractas

 Vamos a crear una clase denominada Figura de la cual no se podrán crear objetos. Esta clase debe tener lo siguiente:

- 2 variables de tipo double denominadas x e y.
- Constructor con argumentos que inicialicen x e y
- Método abstracto denominado área que retorne un double.
  
A continuación crearemos dos clases publicas denominadas Cuadrado y Circulo, las cuales heredarán de la clase Figura.
La clase Circulo tendrá lo siguiente:
- Una variable de clase de tipo double denominada radio.
- Tendrá el constructor con argumentos.
- Desarrollará la lógica necesaria del método área de la clase padre.
La clase Cuadrado tendrá lo siguiente:
- Una variable de clase de tipo double denominada lado.
- Tendrá el constructor con argumentos.
- Desarrollará la lógica necesaria del método área de la clase padre.

## Clase Moto

Esta clase implementará la interfaz Vehículo y contará con una variable de clase denominada velocidad, de tipo entero, inicializada a cero.

El método frenar tiene que retornarnos un mensaje como este return "La moto ha frenado ya y va a " + velocidad + "km/hora";

El método acelerar tiene que comprobar que no superamos la velocidad máxima fijada en la interfaz y nos tiene que retornar al final el siguiente mensaje return "La moto ha acelerado y va a " + velocidad + "km/hora".

En el método main haremos lo siguiente:

- Creamos una matriz de tipo Vehículo con dos cajones.
- En cada cajón metemos un objeto (Coche y Moto)
- Recorremos la matriz de tipo Vehículo mostrando por consola los datos de los métodos frenar y acelerar que hemos introducido a mano.
