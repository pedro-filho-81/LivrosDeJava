public class LinhaDeComando15 {
    public static void main(String[] args) {
        
        // verifica se existe argumentos na linha de coando
        if(args.length != 3) {
             System.out.printf("Erro: Por favor, digite novamente o comando inteiro, incluindo%n" + 
                                "um tamanho de array, valor inicial e incremento.%n");
        } // fim if
        else {
            int tamanhoDoArray = Integer.parseInt(args[0]);
            int[] array = new int[tamanhoDoArray];

            int valorInicial = Integer.parseInt(args[1]);
            int incremento = Integer.parseInt(args[2]);

            for(int contar = 0; contar < array.length; contar++)
                array[contar] = valorInicial + incremento * contar;

            System.out.printf("%s%8s%n", "Indice", "Valor");
            
            for(int contar = 0; contar < array.length; contar++)
                System.out.printf("%5d%8d%n", contar, array[contar]);

        } // fim else
    } // fim main    
} // fim classe