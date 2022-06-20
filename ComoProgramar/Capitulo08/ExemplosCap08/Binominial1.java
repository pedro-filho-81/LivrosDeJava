public class Binominial1 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
    
        double[][] binomial = new double[n+1][];
    
        // initialize first row
        binomial[1] = new double[1 + 2];
        binomial[1][1] = 1.0;
    
        // fill in coefficients of binomial distribution
        for (int i = 2; i <= n; i++) {
            binomial[i] = new double[i+2];
            for (int k = 1; k < binomial[i].length - 1; k++)
                binomial[i][k] = 0.5 * (binomial[i-1][k-1] + binomial[i-1][k]);
        }
    
        // print binomial coefficients
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < binomial[i].length - 1; k++) {
                System.out.print(binomial[i][k] + " ");
            }
            System.out.println();
        }
    }    
}