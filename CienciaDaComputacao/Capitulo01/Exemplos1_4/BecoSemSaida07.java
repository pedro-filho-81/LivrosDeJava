import java.util.Scanner;

public class BecoSemSaida07 {

    public static void main(String[] args) {
    
        // cria o objeto input da classe Scanner e inicializa
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o tamanho do vetor: ");
        int n = input.nextInt();        // lattice size
        System.out.print("Digite um valor: ");
        int trials = input.nextInt();   // number of trials
        int deadEnds = 0;               // trials resulting in a dead end

        // simulate trials self-avoiding walks
        for (int t = 0; t < trials; t++) {
            boolean[][] a = new boolean[n][n];   // intersections visited 
            int x = n/2, y = n/2;                // current position

            // repeatedly take a random step, unless you've already escaped
            while (x > 0 && x < n-1 && y > 0 && y < n-1)  {

                // dead-end, so break out of loop
                if (a[x-1][y] && a[x+1][y] && a[x][y-1] && a[x][y+1]) {
                    deadEnds++;
                    break;
                } 

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
            } 
        } 

        System.out.println(100*deadEnds/trials + "% dead ends"); 
    } 
} 
