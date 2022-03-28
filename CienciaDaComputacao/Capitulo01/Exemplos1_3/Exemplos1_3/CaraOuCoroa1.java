public class CaraOuCoroa1 {
    /**
     * Este programa usa Math.random() para simular um lançamento de moeda justo. 
     * Cada vez que você o executa, ele imprime Cara ou Coroa. Uma sequência de 
     * lançamentos terá muitas das mesmas propriedades que uma sequência que você 
     * obteria jogando uma moeda honesta, mas não é uma sequência verdadeiramente 
     * aleatória. 
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 53). 
     * Pearson Educação. Edição do Kindle.
     * @data 28/03/2022
     */

    public static void main(String[] args) {
        // simula o jogo cara ou coroa 
        // se random menor que 0,5
        if( Math.random() < 0.5 ) 
            // imprima cara
            System.out.println("Cara");
        else // se não
            // imprima coroa
            System.out.println("Coroa");
    } // fim main
} // fim classe