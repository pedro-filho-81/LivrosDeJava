import java.util.Scanner; 

public class ComparandoInteiros16 {
    /*
        2.16 (Comparando inteiros) Escreva um aplicativo que solicite 
        ao usuário inserir dois inteiros, obtenha dele esses números e exiba o número 
        maior seguido pelas palavras “is larger". Se os números forem iguais, 
        imprima a mensagem “These numbers are equal". 
        Utilize as técnicas mostradas na Figura 2.15
        Pedro, 11/12/2021
    */
    public static void main(String[] args) {
        
        try (// Variável input para Scanner
        Scanner input = new Scanner(System.in)) {
            // entrada de dados
            System.out.print("Digite um inteiro: ");
            int x = input.nextInt();
            System.out.print("Digite outro inteiro: ");
            int y = input.nextInt();

            int maior = x; // maior é x

            // se y maior que maior
            if( y > maior ) {
                maior = y;
            } // fim if

            System.out.println("Maior valor = " + maior );
            
            // se s igural a y
            if( x == y ){
                System.out.println("Números iguais.");
            }
        }

    } // fim main
} // fim classe
