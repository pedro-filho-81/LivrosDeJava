import java.security.SecureRandom;

/**
 * w)Elaborar um programa que leia duas matrizes A e 
 * B de uma dimensão do tipo vetor com dez elementos 
 * inteiros cada. Construir uma matriz C de mesmos 
 * tipo e dimensão que seja formada pelo quadrado da 
 * soma dos elementos correspondentes nas matrizes A 
 * e B. Apresentar os elementos da matriz C.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) 
 * (p. 315). Editora Saraiva. Edição do Kindle. 
 * Pedro, 25/08/2024.
 */
public class VetorCQuadradoDeAmaisB24 {
   public static void main(String[] args) {
      
      // constante índice
      final int SIZE = 10;

      // vetores
      int[] vetorA = new int[SIZE];
      int[] vetorB = new int[SIZE];
      int[] vetorC = new int[SIZE];
      
      // resultado
      System.out.println("VetorA:");
      adicionar(vetorA);
      exibirVetor(vetorA);

      // resultado
      System.out.println("VetorB:");
      adicionar(vetorB);
      exibirVetor(vetorB);

      System.out.println("VetorC é formado pelo quadrado da soma dos vetores A e B.");
      // loop for para adicionar valores ao vetorC
      for(int i = 0; i < SIZE; i++) {
         // vetorC recebe o quadrado da soma dos valores dos vetores A e B
         vetorC[i] = (vetorA[i] + vetorB[i]) * (vetorA[i] + vetorB[i]);
      } // end for
      exibirVetor(vetorC);

      // loop for
   } // end main

   // método adicionar valores não repetidos ao vetor
   public static void adicionar(int[] vetor) {

      // objeto
      SecureRandom alea = new SecureRandom();

      // variáveis
      int i = 0, j = 0;
      int item = 0;

      do {
         // adiciona valor suposto aleatório a variável
         int valorAlea = 1 + alea.nextInt(100);
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
    public static void exibirVetor(int[] vetor) {
      
      System.out.print("{");
      // loop para exibir vetor
      for (int i = 0; i < vetor.length; i++) {
          // exibir valores
          System.out.printf("%7d", vetor[i]);
      } // fim for
      // pula linha
      System.out.println("  };");
      
  } // end exibir

} // end class
