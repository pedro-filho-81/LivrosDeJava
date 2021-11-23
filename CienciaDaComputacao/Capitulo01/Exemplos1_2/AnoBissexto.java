package Exemplos1_2;

/*
    Imprime verdadeiro se n corresponder a um ano bissexto e falso caso contrário.
  * Assume n> = 1582, correspondendo a um ano no calendário gregoriano.
*/
public class AnoBissexto {
    public static void main(String[] args) {

        // cria e inicializa a variável
        int year = 1582; // ano 1582
        boolean isLeapYear;

        // ano é divisível por 4
        isLeapYear = (year % 4 == 0);

        // ano é divisível por 4 e não por 100
        isLeapYear = isLeapYear && (year % 100 != 0);

        // ano é divisível por 4, não é divisível por 100 e é divisível por 400
        isLeapYear = isLeapYear || (year % 400 == 0);

        // imprime o resultado
        System.out.println(year + " È um ano bissexto? " + isLeapYear);

    } // fim main
} // fim classe
