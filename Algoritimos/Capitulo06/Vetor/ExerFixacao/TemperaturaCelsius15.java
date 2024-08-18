import java.security.SecureRandom;
/*
 * n)Elaborar um programa que leia 20 elementos (valores reais) para 
 * temperaturas em graus Celsius e armazene esses valores em uma matriz A de 
 * uma dimensão. O programa ao final deve apresentar a menor, a maior e a 
 * média das temperaturas lidas. 
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE OLIVEIRA. Algoritmos 
 * (Portuguese Edition) (p. 313). Editora Saraiva. Edição do Kindle. 
 */
public class TemperaturaCelsius15 {
   public static void main(String[] args) {
      
      // constante
      final int SIZE = 20;
      // vetor
      int[] tempeCelsius = new int[SIZE];

      // cabeçalho
      System.out.println("Vetor original:");
      // chama os métodos
      adicionar(tempeCelsius);
      exibir(tempeCelsius);

      // cabeçalho
      System.out.println("Vetor organizado:");
      organizar(tempeCelsius);
      exibir(tempeCelsius);

      // variáveis recebe valor
      int menor = menorValor(tempeCelsius); // menor recebe o menor valor do vetor
      System.out.println("O menor valor é: " + menor);
      
      // maior recebe o maior valor do vetor
      int maior = maiorValor(tempeCelsius);
      // exibe
      System.out.println("O maior valor é: " + maior);

      // soma os valores do vetor
      int soma = somaValores(tempeCelsius);
      System.out.println("Soma += " + soma);

      // média dos valores do vetor
      double media = media(tempeCelsius);
      System.out.printf("A média é: %.2f%n", media);
      
   } // end main

   // método adicionar valores
   public static void adicionar(int[] vetor) {

      // objeto secure random
      SecureRandom alea = new SecureRandom();

      // variáveis
      int i = 0;
      int j = 0;
      int igual = 0;

      // loop do while para adicionar valores ao vetor
      do { // faça

         // vetor recebe valor aleatório
         vetor[i] = -20 + alea.nextInt(100);
         // variável igual e inicializada
         igual = 0;

         // loop for para verificar se vetor tem valores iguais
         for(j = 0; j < i; j++) {
            // se o valor do vetor j igual ao vetor i
            if (vetor[j] == vetor[i]) {
               // informe 1 para igual
               igual = 1;
            } // end if
         } // end for j

         // se igual permanecer zero
         // ou seja, se não tiver o valor
         if (igual == 0)
            // incremente i em 1, ou seja, some 1 a i
            i++; // incrementa i

      // faça enquando i menor que o tamanho do vetor 
      } while(i < vetor.length); // end do while

   } // end adicionar

   // método organizar
   public static void organizar(int[] vetor) {
      int temp;
      for(int i = 1; i < vetor.length; i++) {
         for(int j = vetor.length - 1; j >= i; j--) {
            if (vetor[j - 1] > vetor[j]) {
               temp = vetor[j - 1];
               vetor[j - 1] = vetor[j];
               vetor[j] = temp;
            } // end if
         } // end for j
      } // end for i
   } // end organizar

   // método maior valor
   public static int maiorValor(int[] vetor) {
      // variável
      int maior = vetor[0]; // maior recebe o valor do primeiro elemento
      
      // loop for para achar o maior valor
      for(int i = 0; i < vetor.length; i++) {
         // verifica se no vetor tem um valor maior que maior
         if (vetor[i] > maior) { // se verdade
            // maior recebe o valor
            maior = vetor[i];
         } // end if
      } // end for
      // retorna o maior valor
      return maior;
   } // end maior valor

   // menor valor
   public static int menorValor(int[] vetor)
   {
      int menor = vetor[0]; // menor recebe o valor do primeiro elemento

      // loop para percorrer todo o vetor
      for(int i = 0; i < vetor.length; i++) {
         // verifica se no vetor tem um valor menor que o menor
         if (vetor[i] < menor) { // se verdade
            // menor recebe esse valor
            menor = vetor[i];
         } // end if
      } // end for
      // retorna menor valor
      return menor;
   } // end menor valor

   // método soma
   public static int somaValores(int[] vetor) {
      int soma = 0; // soma inicia com zero
      for(int valor : vetor) // loop for pelo vetor
         soma += valor; // soma os valores do vetor
      return soma; // retorta o total dos valores do vetor
   } // end soma valores

   // método média
   public static double media(int[] vetor) {
      double media = somaValores(vetor) / vetor.length; // recebe o total da soma
      return media; // retorna a média do vetor
   } // end média
   
   // método exibir valores do vetor
   public static void exibir(int[] vetor) {

      // loop for para exibir os valores do vetor
      // cabeçalho
      System.out.print("Vetor = { ");
      
      for(int i = 0; i < vetor.length; i++) {
         // exibe o vetor
         System.out.printf("%d ", vetor[i]);
      } // end for

      System.out.println("};");

   } // end exibir

} // end class
