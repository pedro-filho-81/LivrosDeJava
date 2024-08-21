package Exemplos1_4;

// criando inicializando e imprimindo vetor
public class CriandoInicializando01 {
    public static void main(String[] args) {
        
        // criando e inicializando um vetor
        int[] numero;           //declarando um vetor
        System.out.println("Declarando um vetor:\nint[] numero;");
        
        numero = new int[ 10 ]; // inicializando um vetor
        System.out.println("\nCriando um vetor:\nnumero = new int[ 10 ];");
        System.out.println("O valor dentro dos colchetes [10]\né a capacidade de armazenamento do vetor.");

        System.out.println("""        
        
        // loop for para adicionar valores ao vetor
        for( int i = 0; i < 10; i++ )
            // o vetor número recebe os valres de i
            numero[ i ] = i; // adicionando valores ao vetor """);

        // loop for para adicionar valores ao vetor
        for( int i = 0; i < 10; i++ )
            numero[ i ] = i; // adicionando valores ao vetor
        
        System.out.println("""
        
        // Exibindo os valores do vetor
        System.out.print("Vetor = { ");
        // loop para mostra os valores do vetor
        for( int i = 0; i < 10; i++ )
            System.out.print(i + " " ); // imprimindo os valores 
        System.out.println("};\n");           
        """);
        System.out.print("Vetor = { ");
        // loop para mostra os valores do vetor
        for( int i = 0; i < 10; i++ )
            System.out.print(i + " " ); // imprimindo os valores
        System.out.println("};\n");

    } // fim main
} // fim classe
