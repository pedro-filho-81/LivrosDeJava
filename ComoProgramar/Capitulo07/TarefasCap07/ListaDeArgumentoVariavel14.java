public class ListaDeArgumentoVariavel14 {
    /**
     * 7.14 (Lista de argumento de comprimento variável) Escreva um aplicativo que 
     * calcula o produto de uma série de inteiros que são passados para método product 
     * utilizando uma lista de argumentos de comprimento variável. 
     * Teste seu método com várias chamadas, cada uma com um número diferente de argumentos.
     * Pedro, 23/05/2022
     */
    public static void main(String[] args) {
        
        // variáveis
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        int n4 = 40;
        int n5 = 50;

        // mostra resultado
        System.out.println("Valores das variáveis:");
        System.out.printf("n1 = %3d\nn2 = %3d\nn3 = %3d\nn4 = %3d\nn5 = %3d\n",
                            n1, n2, n3, n4, n5);

        // mostra resultado dos produtos
        System.out.printf("%d x %d = %d\n",
                            n1, n2, produto(n1, n2));
        System.out.printf("%d x %d x %d= %d\n",
                            n1, n2, n3, produto(n1, n2, n3));
        System.out.printf("%d x %d x %d x %d = %d\n",
                            n1, n2, n3, n4, produto(n1, n2, n3, n4));
        System.out.printf("%d x %d x %d x %d x %d = %d\n",
                            n1, n2, n3, n4, n5, produto(n1, n2, n3, n4, n5));
        
    } // fim mmain

    // calcula o produto das variáveis
    public static int produto(int... numeros) {

        // variável
        int prod = 1;

        // loop for aprommorado para calcular o produto do valor
        for(int valor : numeros) {
            
            // calcula o produto
            prod *= valor;
        } // fimm for aprimorado

        // retorna o produto
        return prod;

    } // fim produto

} // fim classe