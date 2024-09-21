package Exemplos1_3;

// jogo da moeda cara ou coroa
public class CaraOuCoroa01 {

    public static void main(String[] args) {

        double valor = Math.random();
        // Math.random() < 0,5 =>
        // retorna um valor entre 0 e 1
        if (valor < 0.5) // se for zero
            // imprime cara
            System.out.printf("%.1f %s", valor, "Cara");
        else // se não
             // imprime coroa
            System.out.printf("%.1f %s", valor, "Coroa");

    } // fim main
} // fim classe
