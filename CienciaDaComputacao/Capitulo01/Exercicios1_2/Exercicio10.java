public class Exercicio10 {
    /*
     * 1.2.10 Suponha que uma variável a seja declarada como int a = 2147483647
     * (ou equivalentemente, Integer.MAX_VALUE).
     * O que cada um dos seguintes imprime?
     * System.out.println (a);
     * System.out.println (a + 1);
     * System.out.println (2-a);
     * System.out.println (-2-a);
     * System.out.println (2 * a);
     * System.out.println (4 * a);
     * Explique cada resultado.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da computação (p. 45).
     * Pearson Education. Edição do Kindle.
     * Pedro, 28/11/2021
     */

    public static void main(String[] args) {
        
        // cria a variável a e atribui o maios valor inteiro
        int a = Integer.MAX_VALUE;

        // O que cada um dos seguintes imprime?
        // imprime o maior valor de a = 2147483647
        System.out.println(a); 

        // estoura o limite de a imprime -2147483648
        // limite do inteiro 2147483647 + 1 gera um valor negativo
        System.out.println(a + 1);

        // imprime -2147483645
        // a = -2147483648 - 2 =>  
        // -2147483645 valor dentro do limite do menor inteiro
        System.out.println(2 - a);

        // imprime 2147483647
        // acima a vale -2147483645 - 2 =  2147483647 limite de a
        System.out.println(-2 - a);

        // imprime -2 porque estourou o limite de a
        System.out.println(2 * a);

        // imprime -4 porque estourou o limite de a
        System.out.println(4 * a);

    }// fim main
} // fim classe
