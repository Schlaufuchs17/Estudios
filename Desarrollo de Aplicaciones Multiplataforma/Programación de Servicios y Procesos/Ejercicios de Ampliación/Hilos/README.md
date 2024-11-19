# Hilos

## Requerimiento 1
Realiza un programa en Java que pida 4 números por pantalla y determinará cuál de ellos es primo y cual no. El programa lanzará un hilo de ejecución por cada número, debido a la complejidad de
tiempo que puede llevar el calcular si es primo o no, para que pueda ejecutarse en paralelo.

Cada vez que un hilo acabe, mostrará por pantalla el numero procesado, el nombre del hilo que lo ha procesado, el tiempo que ha tardado en procesar el número y si es primo o no.

Se valorará si toda la información que se vaya a mostrar esta encapsulada en un objeto.

## Requerimiento 2
Realiza un programa en Java que generé una simulación de una cadena de procesamiento de correos electrónicos o emails. Los emails tendrán un id, un destinatario, un remitente, un asunto y un cuerpo
del mensaje.

Las cartas de correo no se quieren enviar directamente a los destinatarios ya que se quiere registrar cuantos correos se mandan en determinadas franjas horarias. Por lo tanto, las cartas se depositarán
en un buffer que tendrá una capacidad de 5 cartas como máximo, por temas de espacio de memoria.

Por otro lado, habrá 3 hilos que producirán 10 emails cada uno, cada uno de ellos tendrá un destinatario, un remitente, un asunto y un cuerpo de mensaje diferente, e irán poniendo los emails
en el buffer cada 0,5 segundos, imprimiendo por pantalla cada vez que meta dicho mail en el buffer su nombre y el id del email metido.
Del mismo modo, habrá 2 hilos que consuman los emails del buffer siempre que haya email disponible. Cada vez que un consumidor coja un email, simulará su envio simplemente imprimiendo por pantalla los datos del email, así como el nombre del hilo consumidor que ha cogido dicho email.

## Requerimiento 3
Queremos ampliar el requerimiento 2. En nuestra empresa queremos evitar que se envíen mails a pikachu@gmail.com, por lo que no se deben meter en el buffer aquellos email lo tengan como
destinatario. Se deberá imprimir por pantalla cada vez que hagamos este descarte. 

**Nota**: Esta lógica irá dentro del buffer de procesamiento de emails, no de los productores o los consumidores.