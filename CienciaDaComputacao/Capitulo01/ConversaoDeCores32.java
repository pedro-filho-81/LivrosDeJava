
/*
 * 1.2.32 Conversão de cores.
 * Vários formatos diferentes são usados ​​para representar cores. Por 
 * exemplo, o formato primário para telas LCD, câmeras digitais e páginas 
 * da web, conhecido como formato RGB, especifica o nível de vermelho 
 * (R), verde (G) e azul (B) em uma escala inteira de 0 a 255. O formato 
 * primário para publicação de livros e revistas, conhecido como formato 
 * CMYK, especifica o nível de ciano (C), magenta (M), amarelo (Y) e 
 * preto (K) em uma escala real de 0,0 a 1,0. Escreva um programa 
 * RGBtoCMYK que converte RGB para CMYK. Pegue três inteiros — r, g e b — 
 * da linha de comando e imprima os valores CMYK equivalentes. Se os 
 * valores RGB forem todos 0, então os valores CMY serão todos 0 e o 
 * valor K será 1; caso contrário, use estas fórmulas: 
 * w = max (r / 255, g / 255, b / 255)
 * c = (w – (r / 255)) / w
 * m = (w – (g / 255)) / w
 * y = (w – (b / 255)) / w
 * k = 1 – w
 * Sedgewick, Robert; Wayne, Kevin. Computer Science: An 
 * Interdisciplinary Approach (pp. 48-49). Pearson Education. 
 * Edição do Kindle.
 */
import java.util.Scanner;

public class ConversaoDeCores32 {
   public static void main(String[] args) {
      
      // objeto Scannet
      Scanner input = new Scanner(System.in);

      // variáveis
      float r, g, b;
      float c, m, y, w;
      float k = 1;
      float max;

      System.out.println("CONVERSÃO DE CORES RGB para CMYK.");
      
      // entrada de dados
      System.out.print("Digite o valor de R entre 0 e 255 inclusive: ");
      r = input.nextFloat();
      System.out.print("Digite o valor de G entre 0 e 255 inclusive: ");
      g = input.nextFloat();
      System.out.print("Digite o valor de B entre 0 e 255 inclusive: ");
      b = input.nextFloat();

      System.err.printf("RGB:\nr = %.7f\ng = %.7f\nb = %.7f\nCmYK\n", r, g, b);
      w = Math.max(r / 255, Math.max(g / 255, b / 255));
      System.err.printf("w = %.7f\n", w);
      c = (w - (r / 255)) / w;
      System.out.printf("c = %.7f\n", c);
      m = (w - (g / 255)) / w;
      System.out.printf("m = %.7f\n", m);
      y = (w - (b / 255)) / w;
      System.out.printf("y = %.7f\n", y);
      k = 1 - w;
      System.err.printf("k = %.7f\n", k);

      input.close();

   } // end main
} // end class
