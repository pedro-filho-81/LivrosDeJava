import java.security.SecureRandom;

public class VetorBComParImparVtrA25 {
/**
 * x)Elaborar um programa que leia uma matriz A de 
 * uma dimensão com seis elementos do tipo real. 
 * Construir uma matriz B, em que cada posição de 
 * índice ímpar da matriz B deve ser atribuída com um 
 * elemento de índice par existente na matriz A e 
 * cada posição de índice par da matriz B deve ser 
 * atribuída com um elemento de índice ímpar 
 * existente na matriz A. Apresentar os elementos das 
 * duas matrizes.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) 
 * (p. 315). Editora Saraiva. Edição do Kindle. 
 * Pedro, 27/08/2024
 * @param args
 */ 
   public static void main(String[] args) {
      
      // constante índice
      final int SIZE = 6;

      // vetores
      double[] vetorA = new double[SIZE];
      double[] vetorB = new double[SIZE];
      
      // resultado
      System.out.println("VetorA:");
      adicionar(vetorA);
      exibirVetor(vetorA);

      // Cria o vetorB
      System.out.println("VetorB:");
      // loop for para adicionar valores no vetorB
      for(int i = 0; i < vetorA.length; i++) {
         // se o índice i for par
         if (i % 2 == 0) {
            // vetorB recebe os valores dos índices ímpares do vetorA
            vetorB[i] = vetorA[i + 1];
         } // end if
         else { // se índice for par
            // vetorB recebe os valores dos índices pares do vetorA 
            vetorB[i] = vetorA[i - 1];
         } // end if else
      } // end for
      
      exibirVetor(vetorB);

   } // end main

   // método adicionar valores não repetidos ao vetor
   public static void adicionar(double[] vetor) {

      // objeto
      SecureRandom alea = new SecureRandom();

      // variáveis
      int i = 0, j = 0;
      int item = 0;

      do {
         // adiciona valor suposto aleatório a variável
         double valorAlea = 1 + alea.nextInt(100);
         // indica que o vetor tem um valor igual
         item = 1; // e o incremento não será executado (loop infinito)

         // vetor recebe o valor aleatório;
         vetor[i] = valorAlea;
         // e informa que o contador pode ser incrementado
         item = 0; //  reinicializa
         
         // loop pelo vetor para verificar se 
         // o vetor tem um valor igual ao informado acima
         for(j = 0; j < i; j++) {
            // se os vetores tiverem valores iguais
            if (vetor[j] == vetor[i]) {
               // informa que existe no vetor um valor igual
               item = 1; // e o loop se repete sem fazer a incrementação
            } // end if
         } // end for

         // se o valor adicionado ao vetor não for igual
         // ou seja se item igual a zero
         if (item == 0) {
            // incrementa i em 1
            i++;
         } // end if item

         // faça enquanto o índice i for menor que o tamanho vetor
         // ou seja, se verdade, repete tudo outra vez, 
         // até a condição ser falsa.
      } while (i < vetor.length);
   } // end adicionar
   
    // método exibir
    public static void exibirVetor(double[] vetor) {
      
      System.out.print("{");
      // loop para exibir vetor
      for (int i = 0; i < vetor.length; i++) {
          // exibir valores
          System.out.printf("%7.2f", vetor[i]);
      } // fim for
      // pula linha
      System.out.println("  };");
      
  } // end exibir

} // end class