package ExemplosCap06;

import java.security.SecureRandom;

public class RolandoDado02 {
    public static void main(String[] args) {

        // cria o objeto numeroAlea para a classe SecureRandon
        SecureRandom numeroAlea = new SecureRandom();

        // variáveis frequência
        int frequencia1 = 0;
        int frequencia2 = 0;
        int frequencia3 = 0;
        int frequencia4 = 0;
        int frequencia5 = 0;
        int frequencia6 = 0;

        // loop for
        for (int i = 0; i < 6000000; i++) {

            // variável
            int face = 1 + numeroAlea.nextInt(6);

            switch (face) {

                case 1:
                    frequencia1++;
                    break;

                case 2:
                    frequencia2++;
                    break;

                case 3:
                    frequencia3++;
                    break;

                case 4:
                    frequencia4++;
                    break;

                case 5:
                    frequencia5++;
                    break;

                case 6:
                    frequencia6++;
                    break;
            } // fim switch
        } // fim for

        // imprime resultado
        System.out.println("Face\tFrequency"); // cabeçalhos de saída
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
                frequencia1, frequencia2, frequencia3, frequencia4,
                frequencia5, frequencia6);
    } // fim main
}// fim class
