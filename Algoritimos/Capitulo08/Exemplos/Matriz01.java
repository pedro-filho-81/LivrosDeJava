package Capitulo08.Exemplos;
public class Matriz01 {
    public static void main(String[] args) {

        // mmatriz
        String[][] matriz = {
                { "Pedro", "Rua qualquer", "235" },
                { "Ana", "Avenida Beatriz", "325" },
                { "Cleonice", "Rua Paraiso", "523" }
        };

        System.out.println("Matriz original:");
        // mostra os valores da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%s   ", matriz[i][j]);
            } // fim for j
            System.out.println();
        } // fimm for i

        System.out.println();

        // organiza a matriz pelo tamanho (quantidade de letras do nome) do primeiro
        // nome
        // exp. Ana = 3 letras, Pedro = 5 letras, etc.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (matriz[i][0].length() < matriz[j][0].length()) {

                    // organiza o nome
                    String temp = matriz[i][0];
                    matriz[i][0] = matriz[j][0];
                    matriz[j][0] = temp;

                    // organiza o endereço
                    temp = matriz[i][1];
                    matriz[i][1] = matriz[j][1];
                    matriz[j][1] = temp;

                    // organiza número
                    temp = matriz[i][2];
                    matriz[i][2] = matriz[j][2];
                    matriz[j][2] = temp;

                } // fim if
            } // fim for j
        } // fim for i

        System.out.println("Matriz organizada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%s   ", matriz[i][j].toUpperCase());
            } // fim for j
            System.out.println();
        } // fimm for i

    } // fim main

} // fimm classe