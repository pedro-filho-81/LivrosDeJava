import java.util.Scanner;

public class CrivoDeEratostenes27 {
    /**
     * 7.27 (Crivo de Eratóstenes) Um número primo é qualquer número inteiro maior que 1, 
     * que é uniformemente divisível apenas por ele mesmo e por 1. O Crivo de Eratóstenes 
     * é um método para encontrar números primos. Ele opera como segue:
     * a) Crie um array boolean de tipo primitivo com todos os elementos inicializados como true. 
     * Os elementos do array com índices primos permanecerão true. Todos os outros elementos do 
     * array por fim são configurados como false.
     * b) Iniciando com o índice de array 2, determine se um dado elemento é true. 
     * Se for, faça um loop pelo restante do array e configure como false cada elemento cujo índice 
     * é um múltiplo do índice para o elemento com valor true. Então, continue o processo com 
     * o próximo elemento com valor true. Para o índice de array 2, todos os elementos além do elemento 2 
     * no array que tiverem índices que são múltiplos de 2 (índices 4, 6, 8, 10 etc.) serão configurados 
     * como false; para o índice de array 3, todos os elementos além do elemento 3 no array que tiverem 
     * índices que são múltiplos de 3 (índices 6, 9, 12, 15 etc.) serão configurados como false; e assim por 
     * diante. Quando esse processo for concluído, os elementos de array que ainda forem true indicam que 
     * o índice é um número primo. Esses índices podem ser exibidos. Escreva um aplicativo que utiliza 
     * um array de 1.000 elementos para determinar e exibir os números primos entre 2 e 999. 
     * Ignore elementos de array 0 e 1.
     * Pedro, 22/06/2022
     */
    public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // vetor
        boolean[] primos;

        // entrada de dados
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = input.nextInt();
        primos = new boolean[tamanho];

        // mostra resultados
        System.out.println("Numeros impares");
        adicionar(primos);
        System.out.println("Numeros primos ate " + tamanho);
        mostraPrimos(primos);
        System.out.println("Verdadeiro ou Falso");
        mostrarBoleano(primos);

    } // fim main

    // adicionar
    public static void adicionar(boolean[] primos) {
        // atribui verdadeiro ao índice 2
        primos[2] = true;
        // imprime o número 2
        System.out.print("  2");

        // loop para adicionar números primos
        for(int i = 3; i < primos.length; i += 2) {
                // atribui verdadeiro aos números impares
                primos[i] = true;
                // immprime os números ímpares
                System.out.printf("%3d", i);
                // loop para retirar da lista númmeros ímpares não primos
                for(int j = 2; j < i; j++) {
                    // se índice ímpar não for primo 
                    if(i % j == 0) { 
                        // vetor recebe valor falso
                        primos[i] = false;
                    } // fim if
                } // fim for j
        } // fim for i
        // pula uma linha
        System.out.println();
    } // fim adicionar

    // mostra primos
    public static void mostraPrimos(boolean[] primos) {
        // vetor índice 2 recebe verdadeiro
        primos[2] = true;
        // variável para contar os números primmos
        int contaPrimos = 0;
        // loop para verificar números primos
        for(int i = 2; i < primos.length; i++) {
            // se índice do vetor for verdadeiro
            if(primos[i] == true) { 
                // imprimma o índice
                System.out.printf("%3d", i);
                // conta números primos
                contaPrimos++;
            } // fim if
        } // fim for
        // pula linha
        // imprima a quantidade de números primos
        System.out.printf("\nSao %d numeros.\n", contaPrimos);
    } // fim mostraPrimos

    // mostrar
    public static void mostrarBoleano(boolean[] primos) {
        // imprime o valor do vetor no índice 2
        System.out.printf("%b ", primos[2]);
        // loop para mostrar os valores boleanos do vetor
        for(int i = 3; i < primos.length; i++) {
            
            System.out.printf("%b ", primos[i]);
            if(i % 10 == 0)
                System.out.println();
        } // fim for
    
    } // fim mostrar

} // fim classe