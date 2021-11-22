package Exemplos1_2;

public class OperacaoDupla {

    public static void main(String[] args) {

        // cria e inicializa as variáveis
        double a = 5;
        double b = 2;

        // calcula
        double sum = a + b;
        double prod = a * b;
        double quot = a / b;
        double rem = a % b;

        // mostra resultado
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " = " + rem);

        System.out.println(); // pula linha
        
        System.out.println("sin(pi/2) = " + Math.sin(Math.PI / 2));
        System.out.println("log(e)    = " + Math.log(Math.E));
    } // fim main
} // fim classe
