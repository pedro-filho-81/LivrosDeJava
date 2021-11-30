package Exemplos1_3;

// jogo da moeda cara ou coroa
public class CaraOuCoroa01 {

    public static void main(String[] args) {

        // Math.random() < 0,5 =>
        // retorna um valor entre 0 e 1
        if (Math.random() < 0.5) // se for zero
            // imprime cara
            System.out.println("Cara");
        else // se não
             // imprime coroa
            System.out.println("Coroa");

    } // fim main
} // fim classe
