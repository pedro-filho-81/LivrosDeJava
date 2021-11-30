package Exemplos1_2;


public class InteiroAleatorio {
    public static void main(String[] args) {

        // variável recebe valor do usuário
        int n = 5;

        // gera número aleatório entre 0.0 e 1.0
        double r = Math.random();

        // // variável recebe o valor do produto entre r e n
        int value = (int) (r * n);

        // mostra o resultado
        System.out.println(value);
    } // fim main
} // fim classe
