import java.util.Scanner;

public class VerificandoPedidos27 {
    public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // variável
        boolean crescente;

        // entrada de dados
        System.out.print("Digite o valor de x: ");
        double x = input.nextDouble();
        System.out.print("Digite o valor de y: ");
        double y = input.nextDouble();
        System.out.print("Digite o valor de z: ");
        double z = input.nextDouble();

        // comparação
        crescente = ( x > y && y > z );
        
        // mostra resultado
        System.out.printf("%.0f maior que %.0f e %.0f maior que %.0f? %b%n", x, y, y, z, crescente );

    } // fim main
} // fim classe