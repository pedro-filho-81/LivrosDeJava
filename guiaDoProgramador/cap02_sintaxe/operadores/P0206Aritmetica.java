package guiaDoProgramador.cap02_sintaxe.operadores;

// operadores aritimético

public class P0206Aritmetica {
	public static void main (String args[]) {

		// variáveis
		int a = 5, b = 2; // declara e inicia variáveis
		System.out.println("Valores: a = " + a + ", b = " + b); 
		System.out.println("valor negativo -b = " + (-b)); // operações aritméticas
		System.out.println("Adição: a + b = " + (a + b)); 
		System.out.println("Subtração: a - b = " + (a - b));
		System.out.println("multiplicação: a * b = " + (a * b));
		System.out.println("Divisão int: a / b = " + (a / b));
		System.out.println("Divisão (float) a / b = " + ((float)a / b));
		System.out.println("Resto: a % b = " + (a % b));
		System.out.println("Incremento: a++ = " + (a++));
		System.out.println("valor positivo:  b = " + ( b));
		System.out.println("Valores após incremento:\na = " + a + ", b = " + b);
	} // end main
} // end class