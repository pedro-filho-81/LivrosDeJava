
class OrdenacaoVetor01 {
    /**
     * Elaborar um programa que leia os nomes de 20 pessoas em uma variável composta, 
     * processar a ordenação ascendente desses nomes e apresentar a listagem dos nomes 
     * em ordem alfabética.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 330). 
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 24/04/2022 
     */
    public static void main(String[] args) {
        
        // vetor
        int[] nomes = {5, 4, 7, 1, 3, 2, 9, 0, 6, 8};
        System.out.println("\nVetor original:");
        mostrar(nomes);

        ordenarCrescente(nomes);
        System.out.println("\nVetor em ordem crescente:");
        mostrar(nomes);
        
        ordenarDecrescente(nomes);
        System.out.println("\nVetor em ordem decrescente:");
        mostrar(nomes);
        

    } // fim main

    public static void mostrar(int[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("%3d", vetor[i]);
        } // fim for
    } // fim mostrar

    // ordenação
    public static void ordenarCrescente(int[] vetor) {
        
        for(int i = 0; i < vetor.length; i++) {
            for(int j = 0; j < vetor.length; j++) {
                if(vetor[i] < vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                } // fim if
            } // fim for j
        } // fim for i
    } // fim ordenar

    // ordenação
    public static void ordenarDecrescente(int[] vetor) {
        
        for(int i = 0; i < vetor.length; i++) {
            for(int j = 0; j < vetor.length; j++) {
                if(vetor[i] > vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                } // fim if
            } // fim for j
        } // fim for i
    } // fim ordenar

} // fim classe