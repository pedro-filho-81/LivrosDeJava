package ExemplosCap06;

import java.security.SecureRandom;

public class NumeroAleatorio01 {
    public static void main(String[] args) {
        
        // cria o objeto numeroAlea para a classe SecureRandom e inicializa
        SecureRandom numeroAlea = new SecureRandom();

        // loop for 20 vezes
        for( int i = 0; i < 20; i++ ) {

            // cria variável que recebe valor aleatório entre 1 e 6 inclusive
            int face = 1 + numeroAlea.nextInt(6);

            // se i multiplo de 5
            if( i % 5 == 0 )
                // pule uma linha
                System.out.println();

            // imprime valor gerado
            System.out.printf("%3d", face );

        } // fim for
    } // fim main
} // fim classe
