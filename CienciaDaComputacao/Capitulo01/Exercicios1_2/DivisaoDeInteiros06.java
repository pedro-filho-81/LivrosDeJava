package Exercicios1_2;

public class DivisaoDeInteiros06 {
    /*
     * Por que 10/3 dá 3 e não 3,33333333 ?
     * Solução : como 10 e 3 são literais inteiros, Java não vê necessidade
     * de conversão de tipo e usa divisão inteira. Você deve escrever 10,0 / 3,0
     * se quiser que os números sejam literais duplos . Se você escrever 10 / 3.0
     * ou 10.0 / 3 , o Java fará a conversão implícita para obter o mesmo resultado.
     */
    public static void main(String[] args) {

        System.out.println("\nDIVISÃO DE INTEIROS");

        // variáveis
        int a = 10;
        int b = 3;
        System.out.println("int a = " + a + " int b = " + b + " => a / b = " + a / b);

        System.out.println("\nDIFERENTE DE: ");

        System.out.println("\nBASTA UM DOS VALORES SER DE PONTO FLUTUANTE PARA MUDAR O RESULTADO");
        
        System.out.println("int a = " + 10.0 + " int b = " + 3 + " => 10.0 / 3 = " + 10.0 / 3);

        System.out.println("\nDIFERENTE DE: ");

        System.out.println("int a = " + 10 + " int b = " + 3.0 + " => 10 / 3.0 = " + 10 / 3.0);

        System.out.println("\nDIFERENTE DE: ");

        System.out.println("\nDIVISÃO DE DOUBLE");

        // variáveis
        double c = 10.0;
        double d = 3.0;
        System.out.println("double c = " + c + " double d = " + d + " => c / d = " + c / d);
        System.out.println();
    } // fim main
} // fim classe
