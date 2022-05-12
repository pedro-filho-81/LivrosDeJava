public class PassandoArrayParaMetodo12 {
    public static void main(String[] args) {

        // vetor
        int[] vetor = { 1, 2, 5, 8, 9, 10, 6, 7, 0, 3, 4 };
        int soma = 0;

        // vetor original
        System.out.println("\nVetor original:");

        // loop co for apriorado
        for (int numero : vetor) {
            System.out.printf("%3d", numero);
            soma += numero;
        } // fim for

        System.out.println("\nO total dos elementos = " + soma);

        modificaVetor(vetor);

        // vetor original
        System.out.println("\nVetor modificado:");
        // loop com for apriorado
        for (int numero : vetor) {
            System.out.printf("%3d", numero);
        } // fim for

        System.out.println();

        modificaElemento(vetor[5]);

    } // fim main

    // método modifica vetor
    public static void modificaVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor[i] * 2;
        } // fim for i
    } // fim modificaVetor

    public static void modificaElemento(int elemento) {
        // mmostra o elemento original
        System.out.printf("\nO valor do elemento antes da modificacao = %3d%n", elemento);
        // modifica o elemento
        elemento *= 7;
        // mostra o elemmento modificado
        System.out.printf("\nO valor do elemento x 7 = %3d%n", elemento);
    } // fim modificaElemento

} // fimm classe