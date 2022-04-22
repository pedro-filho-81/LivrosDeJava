import java.util.Scanner;

public class LerMostrarEleentosA {
    /**
     * a)Elaborar um programa que efetue a leitura de dez nomes de pessoas em 
     * uma matriz A do tipo vetor e apresentá-los em seguida.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (pp. 310-311). 
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 22/04/2022
     * */
     public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);
        // vetor
        String[] palavras = new String[10];

        // loop para adicionar noes
        for( int i = 0; i < 10; i++) {

        // entrada de dados
        System.out.println("Digite un String: ");
        palavras[i] = input.nextLine();

        } // fi for

        // ostra noes
        for(int i = 0; i < 10; i++) {
            System.out.printf("%8s", palavras[i]);
        } // fi ostrar

    } // fi ain
} // fi classe