import java.security.SecureRandom;
/**
 * v)Construir um programa que leia uma matriz A de 
 * uma dimensão do tipo vetor com 30 elementos do 
 * tipo inteiro. Ao final do programa, apresentar a 
 * quantidade de valores pares e ímpares existentes 
 * na referida matriz.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) 
 * (p. 315). Editora Saraiva. Edição do Kindle. 
 * Pedro, 25/08/2024
 */
public class VetorAParesImpares23 {
      public static void main(String[] args) {
      
      // constante índice
      final int SIZE = 30;

      // vetores
      int[] vetorA = new int[SIZE];

      // resultado
      System.out.println("VetorA:");
      adicionar(vetorA);
      exibirVetor(vetorA);

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
      
      // variaveis
      int somaPar = 0;
      int somaImpar = 0;

      System.out.print("{");
      // loop para exibir vetor
      for (int i = 0; i < vetor.length; i++) {
          // exibir valores
          System.out.printf("%3d", vetor[i]);

          // verifica se o valor do vetor é par ou ímpar
          if (vetor[i] % 2 == 0) { // se par
            // soma 1 como valor par
            somaPar++;
          } else { // se não
            // soma 1 como valor ímpar
            somaImpar++;
          } // end else
      } // fim for
        // pula linha
      System.out.println("  };");
      
      // exibe o resultado dos valores pares
      System.out.printf("O vetor tem %d valores pares.\n", somaPar);
      // resultado dos valores ímpares
      System.out.printf("O vetor tem %d valores ímpares.", somaImpar);
  } // end exibir

} // end class
