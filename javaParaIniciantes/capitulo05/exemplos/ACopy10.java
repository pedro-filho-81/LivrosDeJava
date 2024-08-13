package javaParaIniciantes.capitulo05.exemplos;

public class ACopy10 {
   public static void main(String[] args) {
      
      // variável
      int i;

      // vetores
      int nums1[] = new int[10];
      int nums2[] = new int[10];

      // atribui valores ao vetor 1
      for(i = 0; i < nums1.length; i++)
         nums1[i] = i;

      if (nums1.length >= nums2.length) {
         for(i = 0; i < nums1.length; i++) {
            // cópia de nums1 para nums2
            nums2[i] = nums1[i]; 
         } // end for
      } // end if

      System.out.print("vetor = {");
      // exibe os valores
      for(i = 0; i < nums2.length; i++) {
         System.out.print(nums2[i] + " ");
      } // end for

   } // end main
} // end class
