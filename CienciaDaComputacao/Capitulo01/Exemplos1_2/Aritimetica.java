package Exemplos1_2;
/*
 * A aritmética para inteiros é construída em Java. A maior parte deste
 * código é dedicada à tarefa de obter os valores de entrada e saída; 
 * a aritmética real está nas declarações simples no meio do programa 
 * que atribuem valores a p, q e r.
 * Sedgewick, Robert; Wayne, Kevin. Computer Science: An Interdisciplinary 
 * Approach (p. 23). Pearson Education. Edição do Kindle.
 */
// cria a classe Aritimética
public class Aritimetica {
    // função principal
    public static void main(String[] args) {

        // entrada de dados
        int a = 5; // primeiro valor
        int b = 2; // segundo valor

        // calcula
        int sum = a + b;
        int prod = a * b;
        int quot = a / b;
        int rem = a % b;

        // mostra resultado
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " = " + rem);
        System.out.println(a + " = " + quot + " * " + b + " + " + rem);
    } // fim main
} // fim class
