package Exemplos1_3;

// imprime olá mundo com while
public class DezOlaMundo02 {
    public static void main(String[] args) {

        // imprime
        System.out.println("1st Olá, Mundo!");
        System.out.println("2nd Olá, Mundo!");
        System.out.println("3rd Olá, Mundo!");

        // conta de i = 4 até 10 inclusive
        int i = 4;
        while (i <= 10) {

            // imprime
            System.out.println(i + "th Olá, Mundo!");

            // i recebe a soma de i + 1
            i = i + 1;

        } // fim while
    } // fim main
} // fim classe
