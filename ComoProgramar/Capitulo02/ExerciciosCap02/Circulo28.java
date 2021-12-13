import java.util.Scanner; 

public class Circulo28 {
    /*
        2.28 (Diâmetro, circunferência e área de um círculo) Eis uma prévia do 
            que veremos mais adiante. Neste capítulo, você aprendeu sobre 
            inteiros e o tipo int. O Java também pode representar números de 
            pontos flutuantes que contêm pontos de fração decimal, como 3,14159. 
            Escreva um aplicativo que leia a entrada a partir do usuário do raio 
            de um círculo como um inteiro e imprima o diâmetro do círculo, 
            circunferência e área utilizando o valor do ponto flutuante 3,14159 
            para S. Utilize as técnicas mostradas na Figura 2.7. [Observação: você 
            também pode empregar a constante Math.PI predefinida para o valor de S. 
            Essa constante é mais precisa que o valor 3,14159. A classe 
            Math é definida no pacote java.lang. As classes nesse pacote são importadas 
            automaticamente, portanto, você não precisa importar
            a classe Math para utilizá-la.] Adote as seguintes fórmulas (r é o raio):
            diâmetro = 2r 
            circunferência = 2Sr 
            área = Sr2
            Não armazene os resultados de cada cálculo em uma variável. Em vez disso, 
            especifique cada cálculo como o valor de saída em uma
            instrução System.out.printf. Os valores produzidos pelos cálculos de
            circunferência e área são números de ponto flutuante. A saída 
            desses valores pode ser gerada com o especificador de formato %f em uma instrução 
            System.out.printf. Você aprenderá mais sobre 
            números de pontos flutuantes no Capítulo 3.
            Pedro, 13/12/2021
    */

    public static void main(String[] args) {
        
        // variável Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o raio da Circunferência: ");
        int raio = input.nextInt();

        // cálculos
        System.out.println("\nRAIO, DIÃMETRO, CIRCUNFÊNCIA e AREA");
        System.out.printf("%s%d%n", "Raio = ", raio );
        System.out.printf("%s%d%n", "Diametro = ", 2 * raio );
        System.out.printf("%s%f%n", "Circunferência = ", 2 * Math.PI * raio);
        System.out.printf("%s%f%n%n", "Area = ", Math.PI * Math.pow(raio, 2) );
    } // fim main    
} // fim classe
