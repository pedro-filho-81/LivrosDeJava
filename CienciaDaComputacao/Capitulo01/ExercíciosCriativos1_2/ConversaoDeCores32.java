import java.util.Scanner;

public class ConversaoDeCores32 {
    /**
     * 1.2.32 Conversão de cores.
     * Vários formatos diferentes são usados ​​para representar a cor. 
     * Por exemplo, o formato primário para monitores LCD, câmeras 
     * digitais e páginas da Web, conhecido como formato RGB, especifica 
     * o nível de vermelho (R), verde (G) e azul (B) em uma escala inteira 
     * de 0 a 255 O formato principal para publicação de livros e revistas, 
     * conhecido como formato CMYK, especifica o nível de ciano (C), 
     * magenta (M), amarelo (Y) e preto (K) em uma escala real de 0,0 a 1,0. 
     * Escreva um programa RGBtoCMYK que converta RGB em CMYK. 
     * Pegue três inteiros — r, g e b — da linha de comando e imprima os valores 
     * CMYK equivalentes. Se os valores RGB forem todos 0, então os valores CMY 
     * serão todos 0 e o valor K será 1; caso contrário, use estas fórmulas:
     * w = máximo (r/255, g/255, b/255)
     * c = (w – (r / 255)) / w
     * m = (w – (g / 255)) / w
     * y = (w – (b / 255)) / w
     * k = 1 - w
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pp. 48-49). 
     * Pearson Educação. Edição do Kindle.
     * @autor Pedro, 17/03/2022
     */
    public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Informe o valor da cor vermelha (0 - 255): ");
        int red = input.nextInt();
        
        System.out.print("Informe o valor para a cor verde (0 - 255): ");
        int green = input.nextInt();

        System.out.print("Informe o valor para a cor azul (0 - 255): ");
        int blue = input.nextInt();

    } // fim main    
} // fim classe
