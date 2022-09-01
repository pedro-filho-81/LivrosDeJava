import java.util.Scanner;

public class Exponenciacao14 
{
    /**
     * 6.14 (Exponenciação) Escreva um método integerPower(base, exponent) 
     * que retorne o valor de baseexponente Por exemplo, 
     * integerPower(3, 4) calcula 34 (ou 3 * 3 * 3 * 3). Suponha que exponent 
     * seja um inteiro não zero, positivo, e base, um inteiro. Use uma instrução 
     * for ou while para controlar o cálculo. Não utilize métodos da classe Math. 
     * Incorpore esse método a um aplicativo que lê os valores inteiros para base 
     * e exponent e realiza o cálculo com o método integerPower.
     * Pedro, 01/09/2022
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor inteiro para a base: ");
        int base = input.nextInt();
        System.out.print("Digite o valor do expoente: ");
        int expo = input.nextInt();
        
        expoente(base, expo);

    } // final principal

    // exponenciação
    public static void expoente(int base, int expo)
    {
        int resultado = 1;

        for(int i = 1; i <= expo; i++)
        {
            resultado *= base;
        }
        
        System.out.printf("base %d elevado a %d = %d\n", base, expo, resultado);
    } // final expoente
} // final classe