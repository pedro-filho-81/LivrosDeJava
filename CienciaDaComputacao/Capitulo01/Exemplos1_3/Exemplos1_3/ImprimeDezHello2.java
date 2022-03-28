public class ImprimeDezHello2 {
    /**
     * Este programa usa um loop while para a tarefa simples 
     * e repetitiva de imprimir a saída mostrada abaixo. 
     * Após a terceira linha, as linhas a serem impressas 
     * diferem apenas no valor do índice contando a linha impressa, 
     * então definimos uma variável i para conter esse índice. 
     * Depois de inicializar o valor de i para 4, entramos em um 
     * loop while onde usamos o valor de i na instrução System.out.println() 
     * e o incrementamos a cada vez no loop. Após imprimir o 10º Hello, 
     * o valor de i se torna 11 e o loop termina.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pp. 55-56). 
     * Pearson Educação. Edição do Kindle.
     * @data 28/03/2022
     */
    public static void main(String[] args) {
        // imprime
        System.out.println("1 st Hello");
        System.out.println("2 nd Hello");
        System.out.println("3 rd Hello");

        // variável
        int contador = 4;
        // loop while enquanto contador menor ou igual a 10
        while( contador <= 10 ) {
            // imprima
            System.out.println( contador + " th Hello");

            // incrementa contador em 1
            contador++;

        } // fim while
    } // fim main
} // fim classe