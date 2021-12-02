package Exercicios1_2;

public class NumerosAleaUniformes30 {
    /*
        1.2.30 Números aleatórios uniformes. Escreva um programa que 
        imprima cinco números aleatórios uniformes entre 0 e 1, seu 
        valor médio e seus valores mínimo e máximo. 
        Use Math.random (), Math.min () e Math.max ().
        Sedgewick, Robert; Wayne, Kevin. Ciência da computação (p. 48). 
        Pearson Education. Edição do Kindle.
        02/12/2021
    */

    public static void main(String[] args) { 
    
        // variável
        int n = 5;

        // declara 5 variáveis e atribui valores aleatórios
        double x1 = Math.random();
        double x2 = Math.random();
        double x3 = Math.random();
        double x4 = Math.random();
        double x5 = Math.random();

        System.out.println("\nNÚMEROS ALEATÓRIOS.");

        // imprime os 5 valores
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);

        // encontra do o menor valor, o maior valor e a média dos valores
        double menor     = Math.min(x1, Math.min(x2, Math.min(x3, Math.min(x4, x5))));
        double maior   = Math.max(x1, Math.max(x2, Math.max(x3, Math.max(x4, x5))));
        double media = (x1 + x2 + x3 + x4 + x5) / n;

        System.out.println("\nMÉDIA, MENOR E MAIOR VALOR.");
        
        // mostra o resultado
        System.out.println("Média = " + media);
        System.out.println("Menor = " + menor);
        System.out.println("Maior = " + maior);

    } // fim main    
} // fim classe
