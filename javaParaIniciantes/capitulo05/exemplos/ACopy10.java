package javaParaIniciantes.capitulo05.exemplos;

public class ACopy10 {
   public static void main(String[] args) {
      
      // variável
      int i;

      // vetores
      int nums1[] = new int[10];
      // este vetor recebe os valores do vetor nums1[]
      int nums2[] = new int[10];

      // atribui valores ao vetor 1
      for(i = 0; i < nums1.length; i++)
         // vetor recebe os valores de i
         nums1[i] = i;
         
      // exibe os  valores do vetor1
      System.out.print("vetor1 = {");
      // loop for para exibir os valores de vetor1
      for(i = 0; i < nums1.length; i++) {
         // exibe os valores de nums1
         System.out.print(nums1[i] + " ");
      } // end for
      System.out.println("};");

      // se vetor nums1 maior ou igual ao vetor mums2
      if (nums1.length >= nums2.length) {
         // loop for para passar os valores do
         // vetor1 para o vetor nums2
         for(i = 0; i < nums1.length; i++) {
            // cópia os valores de nums1 para nums2
            // nums2 recebe os valores de nums1
            nums2[i] = nums1[i]; 
         } // end for
      } // end if

      // exibe os  valores do vetor2
      System.out.print("vetor2 = {");
      // loop for para exibir os valores de vetor2
      for(i = 0; i < nums2.length; i++) {
         // exibe os valores de nums2
         System.out.print(nums2[i] + " ");
      } // end for
      System.out.println("};");

   } // end main
} // end class
