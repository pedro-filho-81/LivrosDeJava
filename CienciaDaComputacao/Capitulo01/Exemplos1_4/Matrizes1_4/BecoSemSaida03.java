package Exemplos1_4.Matrizes1_4;

import java.util.Scanner; 

public class BecoSemSaida03 {
    public static void main(String[] args) {

    // cria a variável para Scanner
    Scanner entrada = new Scanner(System.in);

    // entrada de dados
    System.out.print("Digite o tamanho: ");
    int tamanho = entrada.nextInt();        // lattice size
    System.out.print("Números de trilhas: ");
    int numeroDeTrilhas = entrada.nextInt();   // número de trilhas
    int becoSemSaida = 0;              // ensaios realizados em um beco sem saída
    
        // simulate trials self-avoiding walks
        for (int t = 0; t < numeroDeTrilhas; t++) {
            boolean[][] a = new boolean[tamanho][tamanho];   // intersections visited 
            int x = tamanho/2, y = tamanho/2;                // current position
    
            // repeatedly take a random step, unless you've already escaped
            while (x > 0 && x < tamanho-1 && y > 0 && y < tamanho-1)  {
    
                // dead-end, so break out of loop
                if (a[x-1][y] && a[x+1][y] && a[x][y-1] && a[x][y+1]) {
                    becoSemSaida++;
                    break;
                } // fim if 
    
                // mark (x, y) as visited
                a[x][y] = true; 
    
                // take a random step to unvisited neighbor
                double r = Math.random(); 
                if (r < 0.25) {
                    if (!a[x+1][y])
                        x++;
                }
                else if (r < 0.50) {
                    if (!a[x-1][y])
                        x--;
                }
                else if (r < 0.75) {
                    if (!a[x][y+1])
                        y++;
                }
                else if (r < 1.00) {
                    if (!a[x][y-1])
                        y--;
                }
            }  // fim while
        } // fim for
    
        System.out.println(100 * becoSemSaida/numeroDeTrilhas + "% beco sem saídas"); 
    } // fim main
} // fim classe
