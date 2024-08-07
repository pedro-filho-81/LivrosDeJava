package Exemplos1_2;
/*
 * Este programa usa o método Java Math.random() para gerar um número 
 * aleatório r entre 0,0 (inclusive) e 1,0 (exclusive); então multiplica 
 * r pelo argumento de linha de comando n para obter um número aleatório 
 * maior ou igual a 0 e menor que n; então usa uma conversão para truncar 
 * o resultado para ser um valor inteiro entre 0 e n-1.
 * Sedgewick, Robert; Wayne, Kevin. Computer Science: 
 * An Interdisciplinary Approach (p. 34). Pearson Education. 
 * Edição do Kindle.
 */
public class InteiroAleatorio {
    public static void main(String[] args) {

        // variável recebe valor do usuário
        int n = 1000;

        // gera número aleatório entre 0.0 e 1.0
        double r = Math.random();

        // // variável recebe o valor do produto entre r e n
        int value = (int) (r * n);

        // mostra o resultado
        System.out.println(value);
    } // fim main
} // fim classe
