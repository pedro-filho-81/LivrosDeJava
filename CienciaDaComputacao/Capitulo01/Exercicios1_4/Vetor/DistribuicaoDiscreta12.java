package Vetor;

public class DistribuicaoDiscreta12 {
    public static void main(String[] args) {

        // read in frequency of occurrence of n values
        int n = args.length;
        // vetor frequência
        int[] freq = new int[n];
        // loop para adicionar valor ao vetor
        for (int i = 0; i < n; i++) {
            // vetor recebe valores da linha de comando
            // exp: java DistribuicaoDiscreta12.java 1 2 3 
            freq[i] = Integer.parseInt(args[i]);
        } // fim for

        // compute total count of all frequencies
        // soma o total dos elementos do vetor
        int total = 0;
        // loop para somar os valores do vetor
        for (int i = 0; i < n; i++) {
            // soma os elemntos do vetor
            total += freq[i];
        } // fim for

        // generate random integer with probability proportional to frequency
        // gera números aleatórios entre 0 e total
        int r = (int) (total * Math.random());   // integer in [0, total)
        int sum = 0;
        int event = -1;
        for (int i = 0; i < n && sum <= r; i++) {
            sum += freq[i];
            event = i;
        }
         
        System.out.println(event);
    }      
}
