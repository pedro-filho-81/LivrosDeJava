package Vetor;
public class InvertendoString4 {
    /**
     * 1.4.4 Escreva um fragmento de código que inverta a ordem dos 
     * valores em um array de string unidimensional. 
     * Não crie outra matriz para armazenar o resultado. 
     * Dica: Use o código no texto para trocar os valores de dois elementos.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 118). 
     * Pearson Educação. Edição do Kindle.
     * Pedro, 10/04/2022
     */
    public static void main(String[] args) {
        
        // declara, cria e inicializa vetor
        String[] palavras = {"Pedro", "Joao", "Maria", "Jose", "Cleonica", "Madalena", "Tatiane"};
        
        // Cabeçalho
        System.out.println("\nVetor original");
        
        // chama o método para mostrar os elemetos do vetor
        mostrar(palavras, palavras.length);

        // cabeçalho
        System.out.println("\nVetor invertido:");
        // chama a função para mostra os elementos do vetor
        inverterVetor( palavras );

    } // fim main
    
    // método para mostrar os elementos do vetor
    public static void mostrar( String[] vetor, int tamanho) {
        
        //loop para mostrar os elementos
        for( int i = 0; i < tamanho; i++)
            // mostra os elementos do vetor
            System.out.printf("%s  ", vetor[i]);
        
    } // fim método mostrar

    // método mostrar valor
    public static void inverterVetor( String[]vetor ) {

            // loop para inverter os elementos do vetor
            for(int j = vetor.length - 1; j > -1; j--) {
                                
                // imprime
                System.out.printf("%s  ", vetor[j]);

            } // fim for interno
        //} // fim for externo
        
    } // fim mostrar

} // fim classe
