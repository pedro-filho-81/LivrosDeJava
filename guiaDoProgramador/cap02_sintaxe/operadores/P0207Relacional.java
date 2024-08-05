package guiaDoProgramador.cap02_sintaxe.operadores;

// operadores relacionais

public class P0207Relacional {
	public static void main (String args[]) {

		int a = 15, b = 12; // declara e inicia variáveis
		
      System.out.println("Valores:\ta = " + a + ", b = " + b); 
		
      System.out.println("Igual a:\ta == b -> " + (a == b)); 	// operações relacionais
		System.out.println("Diferente de:\ta != b -> " + (a != b));
		System.out.println("menor que\ta < b -> " + (a < b));
		System.out.println("maior que:\ta > b -> " + (a > b));
		System.out.println("menor ou iqual a:\ta <= b -> " + (a <= b));
		System.out.println("maior ou igual a:\ta >= b -> " + (a >= b));
	} // end main
} // end class