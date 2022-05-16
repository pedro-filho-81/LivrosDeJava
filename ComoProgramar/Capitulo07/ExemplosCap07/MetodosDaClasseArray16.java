import java.util.Arrays;

public class MetodosDaClasseArray16 {
    public static void main(String[] args) {
    
        // vetor
        double[] vetor = {8.5, 9.3, 0.2, 5,7, 1.6, 4.8};

        // MOSTRA O VETOR ORIGINAL
        System.out.println("\ndouble Vetor original");
        // loop para mostra os valores do array
        for(double valor : vetor) {
            System.out.printf("%4.1f", valor);
        } // fim for valor
        
        // organiza vetor EMMM ORDEM CRESCENTE
        Arrays.sort(vetor);

        // mostra O VETOR ORGANIZADO
        System.out.printf("%n[ORGANIZA VETOR] Arrays.sort(vetor);\n");
        // loop para mostra os valores do array
        for(double valor : vetor) {
            System.out.printf("%4.1f", valor);
        } // fim for valor

        // PREENCHE VETOR COM 10 ELEMENTOS COM O NÚMERO 7
        // declara e cria umm vetor
        int[] vetor2 = new int[10];
        // chama a classe Arrays fill
        Arrays.fill(vetor2, 7);
        // cabeçalho
        System.out.println("\n\n[PREENCHE VETOR2 COM O VALOR 7] Arrays.fill(vetor2, 7);:");
        // loop para mostrar o vetor2
        for(int valor : vetor2)
            // mostra os valores do vetor2
            System.out.printf("%3d", valor);

            // COPIA VETOR A PARA VETOR B
            // cria e inicializa o vetor A
            int[] vetorA = {1, 2, 3, 4, 5, 6};
            // declara e cria o vetor B
            int[] vetorB = new int[vetorA.length];
            // chama classe System arrayCopy
            System.arraycopy(vetorA, 0, vetorB, 0, vetorA.length);
            
            System.out.println("\n\nVetorA [Original]:"); // pula linha
            // mstra o vetor A
            mostrarVtr(vetorA);
            System.out.println("\nSystem.arraycopy(vetorA, 0, vetorB, 0, vetorA.length);");
            System.out.println("VetorB [Copia do vetorA]:"); // pula linha
            // mostra vetor B que é a cópia de A
            mostrarVtr(vetorB);

            // VERIFICA A IGUALDADE ENTRE O VETOR A E O VETOR B
            boolean igual = Arrays.equals(vetorA, vetorB);
            System.out.println("\nVerifica a igualda de entre vetores:");
            System.out.printf("boolean igual = Arrays.equals(vetorA, vetorB);");
            System.out.printf("\nvetorA %s vetorB\n", (igual ? " == " : " != ") );

            // VERIFICA A IGUALDADE ENTRE O VETOR A E O VETOR 2
            System.out.println("\nVetorA");
            mostrarVtr(vetorA);
            System.out.println("\nVetor2");
            mostrarVtr(vetor2);
            boolean igual2 = Arrays.equals(vetor2, vetorA);
            System.out.println("\nVerifica a igualda de entre vetores:");
            System.out.printf("boolean igual2 = Arrays.equals(vetor2, vetorA);");
            System.out.printf("\nvetor2 %s vetorA\n", (igual2 ? " == " : " != ") );

            // pesquis se o valor 5 pertence ao vetor A
            int localizado = Arrays.binarySearch(vetorA, 5);
            // mmostra vetorA
            System.out.println("\nVetorA");
            mostrarVtr(vetorA);
            // mostre
            System.out.println("\n[PESQUISA VALOR] int localizado = Arrays.binarySearch(vetorA, 5);");
            // se a localização maior ou igual a zero
            if(localizado >= 0)
                // imprima
                System.out.printf("Numero 5 localizado na posicao %d%n", localizado + 1);
            else
                // imprima
                System.out.printf("Numero 5 não localizado");

            // pesquis se o valor 5 pertence ao vetor A
            localizado = Arrays.binarySearch(vetorA, 8675);
                // mostre
            System.out.println("\n[PESQUISA VALOR] localizado = Arrays.binarySearch(vetorA, 8675);");
            // se a localização maior ou igual a zero
            if(localizado >= 0)
                // imprima
                System.out.printf("Numero 8675 localizado na posicao %d%n", localizado + 1);
            else
                // imprima
                System.out.printf("Numero 8675 não localizado");

    } // fim main

    // MÉTODO para MOSTRA VETOR
    public static void mostrarVtr(int[] vetor) {
        // loop para mostrar os valores do vetor
        for(int valor : vetor)
            // imprime os valores do vetor
            System.out.printf("%3d", valor);
    } // fim mostrar vetor

} // fim classe