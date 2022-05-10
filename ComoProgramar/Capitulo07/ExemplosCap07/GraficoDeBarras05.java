public class GraficoDeBarras05 {
    public static void main(String[] args) {

        // vetor
        int[] vetor = { 0, 0, 0, 3, 1, 4, 4, 9, 0, 4, 5 };

        System.out.println("Distribuicao das notas:");

        // loop para gerar a saída das notas
        for (int contar = 0; contar < vetor.length; contar++) {

            if (contar == 10) {
                System.out.printf("%5d: ", 100);
            } // fim if
            else {
                System.out.printf("%02d - %02d: ",
                        contar * 10, contar * 10 + 9);
            } // fim else

            // immprime asteriscos
            for (int estrelas = 0; estrelas < vetor[contar]; estrelas++) {
                System.out.print("*");
            } // fim for
            System.out.println();
        } // fim contar

    } // fim main
} // fim classe