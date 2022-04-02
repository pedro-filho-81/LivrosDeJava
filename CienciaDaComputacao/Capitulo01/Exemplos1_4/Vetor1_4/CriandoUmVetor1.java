import java.util.Scanner;

public class CriandoUmVetor1 {
    public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entradade dados
        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = input.nextInt();

        // declara e cria um vetor
        double[] vetor = new double[tamanho];

        // loop para inicializar um vetor
        for( int i = 0; i < tamanho; i++ ) {
            // inicializa vetor com números aleatórios
            vetor[i] = Math.random();
        } // fim for

        System.out.print("Vetor original = ");
        // loop para mostrar o vetor
        for( int i = 0; i < tamanho; i++ ) {
            // mostra os valores do vetor
            System.out.printf("%.2f ", vetor[i]);
        } // fim for mostrar
        //System.out.println();

        // variável maior
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        // loop para mostrar o maior valor do vetor
        for( int i = 0; i < tamanho; i++ ) {
            //se vetor maior que maior
            if( vetor[i] > maior )
                // maior recebe o valor do vetor
                maior = vetor[i];
            // se vetor menor que menor
            if( vetor[i] < menor )
                menor = vetor[i];
        } // fim forf

        // variável soma
        double soma = 0;
        // loop para soma os valores do vetor
        for( int i = 0; i < tamanho; i++ ) {
            // soma os valores do vetor
            soma += vetor[i];
        } // fim for
        // Calcula a media dos valores do vetor
        double media = soma / tamanho;
        
        // invertendo valores do vetor
        for( int i = 0; i < tamanho / 2; i++) {
            double temp = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[ tamanho - 1 - i] = temp;
        } // fim for

        System.out.print("\nVetor invertido = ");
        // loop para mostrar o vetor
        for( int i = 0; i < tamanho; i++ ) {
            // mostra os valores do vetor
            System.out.printf("%.2f ", vetor[i]);
        } // fim for mostrar

        // vetor
        double[] vetorCopia = new double[tamanho];
        // loop for para copiar ovetor original
        for( int i = 0; i < tamanho; i++ ) {
            vetorCopia[i] = vetor[i];
        } // fim for

        System.out.print("\nVetor cópia    = ");
        // loop para mostrar o vetor
        for( int i = 0; i < tamanho; i++ ) {
            // mostra os valores do vetor
            System.out.printf("%.2f ", vetor[i]);
        } // fim for mostrar

        System.out.printf("\nMenor valor = %.2f", menor);
        // mostra o maior valor
        System.out.printf("%nMaior valor = %.2f ", maior);
        // mostra o resultado
        System.out.printf("\nSoma = %.2f%nMédia = %.2f%n", soma, media);

    } // fim main
} // fim classe