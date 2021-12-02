package Exercicios1_2;

public class Exercicio16 {

    /*
     * Um estudante de física obtém resultados inesperados ao usar o código
     * força dupla = G * massa1 * massa2 / r * r;
     * para calcular valores de acordo com a
     * fórmula F = G m 1 m 2 / r 2 .
     * Explique o problema e corrija o código.
     * Solução : Ele divide por r , depois multiplica por r (em vez de dividir por r
     * * r ). Use parênteses:
     * força dupla = G * massa1 * massa2 / (r * r);
     */

    public static void main(String[] args) {

        // fórmula = G * massa1 * massa2 / r * r; ERRADO
        // CORRETO:
        double G = 3.14159;
        double massa1 = 15, massa2 = 23;
        double r = 1.357;

        // cálculos
        double expressao1 = G * massa1 + massa2 / r * r;
        double expressao2 = G * massa1 + massa2 / (r * r);

        // imprime resultado
        System.out.println("\n\tNUMA EXPRESSÃO () => PARÊNTESE FAZ A DIFERENTE");

        System.out.println("double expressao1 = G * massa1 + massa2 / r * r; = " + expressao1);

        System.out.println("double expressao2 = G * massa1 + massa2 / (r * r); = " + expressao2 + "\n");
    } // fim main
} // fim classe
