import java.security.SecureRandom;

public class PercentualNumImpares27 {
   /**
    * z)Elaborar um programa que leia uma matriz A de 
    uma dimensão com dez elementos numéricos 
    inteiros. Apresentar o total de elementos ímpares 
    existentes na matriz e também o percentual do 
    valor total de números ímpares em relação à 
    quantidade total de elementos armazenados na matriz.
    JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
    OLIVEIRA. Algoritmos (Portuguese Edition) 
    (p. 316). Editora Saraiva. Edição do Kindle. 
    Pedro, 27/08/2024
    * @param args
    */
   public static void main(String[] args) {

      // constante índice
      final int SIZE = 10;

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
      
      // variável
      int contaImpar = 0;

      System.out.print("{");
      // loop para exibir vetor
      for (int i = 0; i < vetor.length; i++) {
          // exibir valores
          System.out.printf("%5d", vetor[i]);
          // se o valor do vetor for par
          if (vetor[i] % 2 != 0) {
            contaImpar++;
          } // end if
      } // fim for
      // pula linha
      System.out.println("  };");
      
      System.out.printf("\nO vetor tem %3d números ímpares.\n", contaImpar);
      System.out.printf("Isso representa   %d%% porcento do total.", contaImpar * 100 / vetor.length);
  } // end exibir

} // end class
