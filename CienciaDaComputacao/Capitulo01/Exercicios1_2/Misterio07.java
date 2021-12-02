package Exercicios1_2;

class Misterio07 {
    /*
        O que cada um dos seguintes imprime?
        Explique cada resultado.
        Pedro, 28/11/2021
    */
    public static void main(String[] args) {
        
        // imprime o resultado
        // imprime 2bc porque o sinal de + está concatenando e não somando
        System.out.println (2 + "bc"); // impressões: 2bc
        // imprime 5bc porque o primeiro + soma e o segundo fa a concatenação
        System.out.println (2 + 3 + "bc"); // impressões: 5bc
        // imprime 5bc porque o primeiro + soma e o segundo faz a concatenação
        System.out.println ((2 + 3) + "bc"); // impressões: 5bc
        // imprime bc5 porque o primeiro + faz a concatenação e o segundo soma
        System.out.println ("bc" + (2 + 3)); // impressões: bc5
        // imprime bc23 porque o primeiro + faz a concatenação e o segundo também
        System.out.println ("bc" + 2 + 3); // impressões: bc23

    } // fim main
} // fim classe
