public class FrequenciaDeVetor07 {
    public static void main(String[] args) {

        // vetor
        int[] vetor = { 1, 2, 3, 3, 4, 5, 6, 6, 6, 5, 5, 2, 2, 3, 1,
                1, 1, 6, 4, 2, 2, 3, 3, 1, 6, 6, 5, 4, 5, 4,
                3, 2, 1, 4, 1, 12, 2, 3, 6, 5, 5, 4, 5, 6, 4,
                2, 3, 1, 1, 6, 2 };

        int[] frequencia = new int[7];
        
        // mostra o vetor original
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("%3d", vetor[i]);
            if(i % 10 == 0)
                System.out.println();
        } // fim for i

        for (int resposta = 0; resposta < vetor.length; resposta++) {

            try {
                ++frequencia[vetor[resposta]];
            } // fim try
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indice da matriz fora dos limites de exceção");
                System.out.printf("  vetor[%d} = %d%n%n", resposta, vetor[resposta]);
            } // fim catch
        } // fim for resposta

        System.out.printf("%s%15s%n", "Indice", "Frequencia");

        for (int mostrar = 1; mostrar < frequencia.length; mostrar++) {
            System.out.printf("%3d%12d", mostrar, frequencia[mostrar]);

            System.out.print("\t");

            for(int asterisco = 1; asterisco <= frequencia[vetor[mostrar]]; asterisco++) {
                System.out.printf("%s", "*");
            } // fim for asterisco

            System.out.println();
            
        } // fim for mostrar

    } // fim main
} // fim classe