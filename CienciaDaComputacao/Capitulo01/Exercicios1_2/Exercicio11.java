package Exercicios1_2;

public class Exercicio11 {
    /*
        1.2.11 Suponha que uma variável a seja declarada como 
                duplo a = 3,14159. O que cada um dos seguintes imprime?
                System.out.println (a);
                System.out.println (a + 1);
                System.out.println (8 / (int) a);
                System.out.println (8 / a);
                System.out.println ((int) (8 / a));
                Explique cada resultado.
        Sedgewick, Robert; Wayne, Kevin. Ciência da computação (p. 45). 
        Pearson Education. Edição do Kindle.
        Pedro Filho, 28/11/2021
    */
    
    public static void main(String[] args) {
        
        // variável
        double a = 3.14159;

        // imprime o resultado
        System.out.println (a); // imprime o valor de a 3,14159
        System.out.println (a + 1); // soma 1 a a imprime 4,14159
        System.out.println (8 / (int) a); // divide 8 / (int = inteiro de a) 4 e imprime 2
        System.out.println (8 / a); // divide 8 / 4,14159 e imprime 2.5464812403910124
        System.out.println ((int) (8 / a)); // divide (int = inteiro da divisão) (8 / 4) e imprime 2
        
    } // fim main
} // fim classe
