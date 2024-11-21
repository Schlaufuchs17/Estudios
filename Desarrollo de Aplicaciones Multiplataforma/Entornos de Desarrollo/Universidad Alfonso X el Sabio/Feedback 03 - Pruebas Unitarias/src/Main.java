package Feedback3_AdrianCaballero;
public class ComprobacionNumeros {
    private int num1, num2;
    public ComprobacionNumeros(int n1, int n2) {
        num1= n1;
    num2= n2;
    }

public int numeromayor () {
    int num_mayor = 0;
    if (num1>num2) {
        num_mayor = num1;
    }
    if (num2>num1) {
        num_mayor = num2;
    }
    if (num1==num2) {
        num_mayor = num1;
    }
    return num_mayor;
}

public boolean esPositivo(int n) {
    boolean es_positivo = true;
    if(n>=0) {
        es_positivo = true;
    }
    if(n<0) {
        es_positivo = false;
    }
    return es_positivo;
    }
}