public class ForAprimorado11 {
    public static void main(String[] args) {
        
        // vetor
        int[] vetor = {1, 2, 5, 8, 9, 10, 6, 7, 0, 3, 4};
        int soma = 0;

        // loop co for apriorado
        for(int numero : vetor) {
            System.out.println(numero);
            soma += numero;
        } // fim for

        System.out.println("\nO total dos elementos = " + soma);
    } // fim main    
} // fim classe