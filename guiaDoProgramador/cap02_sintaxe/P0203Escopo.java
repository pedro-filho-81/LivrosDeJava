package guiaDoProgramador.cap02_sintaxe;
// Demonstração de excopo
public class P0203Escopo {
	public static void main (String arg[]) { // Início do bloco 1
		int i = 5; // Variável do bloco 1
		{ // Início do bloco 2
			int j = 0; // Variável do bloco 2
			System.out.println("int i = " + i);	// Uso de i dentro do seu escopo
			j = 5 * i;					// Uso de j dentro do seu escopo
         System.out.println("j = 5 * i;");
			System.out.println("valor de j = " + j);
			{ // Inicio do bloco 3
				System.out.println("valor de i = " + i);	// Uso de i dentro do seu escopo
				System.out.println("valor de j = " + j);	// Uso de j dentro do seu escopo
			} // end bloco 3
		} // end bloco 2
		System.out.println("valor de i = " + i);	// Uso de i dentro do seu escopo
//		System.out.println(j);	// ERRO! Uso de j FORA do seu escopo
	} // end main
} // end class