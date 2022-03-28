import java.util.Scanner;
import java.security.SecureRandom;

public class ReservaDePassagem19 {
    /**
     * 7.19 (Sistema de reservas de passagens aéreas)
     * Uma pequena companhia aérea acabou de comprar um computador
     * para seu novo sistema automatizado de reservas. Você foi solicitado
     * a desenvolver o novo sistema. Você escreverá um aplicativo para atribuir
     * assentos em cada voo da companhia aérea (capacidade: 10 assentos).
     * Seu aplicativo deve exibir as seguintes alternativas: Please type 1 for
     * First Class e Please type 2 for Economy. [Por favor digite 1 para Primeira
     * Classe e digite 2 para Classe Econômica]. Se o usuário digitar 1,
     * seu aplicativo deve atribuir assentos na primeira classe (poltronas 1 a 5).
     * Se o usuário digitar 2, seu aplicativo deve atribuir um assento na classe
     * econômica
     * (poltronas 6 a 10). Seu aplicativo deve exibir um cartão de embarque
     * indicando
     * o número da poltrona da pessoa e se ela está na primeira classe ou na classe
     * econômica.
     * Utilize um array unidimensional do tipo primitivo boolean para representar
     * o gráfico de assentos do avião. Inicialize todos os elementos do array como
     * false para
     * indicar que todas as poltronas estão desocupadas. À medida que cada assento é
     * atribuído,
     * configure o elemento correspondente do array como true para indicar que o
     * assento não
     * está mais disponível.Seu aplicativo nunca deve atribuir uma poltrona que já
     * foi reservada.
     * Quando a classe econômica estiver lotada, seu aplicativo deve perguntar à
     * pessoa se ela
     * aceita ficar na primeira classe (e vice-versa). Se sim, faça a atribuição
     * apropriada de assento.
     * Se não, exiba a mensagem "Next flight leaves in 3 hours" [O próximo voo parte
     * em 3 horas].
     * 
     * @author Pedro,24/03/2022
     */
    public static void main(String[] args) {

        // cria o objeto Scanner
        Scanner input = new Scanner(System.in);

        // objeto SecureRandom
        SecureRandom numAleatorio = new SecureRandom();

        // declara, cria e inicializa o vetor
        boolean[] passagemAerea = { false, false, false, false, false, false, false, false, false, false };

        // CHAMA O MÉTODO
        mostrar(passagemAerea);

        // loop for para reserva das passagens
        for (int reserva = 0; reserva < 3; reserva++) {

            // chama o método menu
            menu();

            // usuário escolhe a opção desejada
            System.out.print("Digite a opção desejada: ");
            int opcao = input.nextInt(); // opção do usuário

            pesquisarPassagem(passagemAerea, opcao);
            mostrar(passagemAerea);

            // enquanto opção maior que 2 faça
            while (opcao > 0 ) {

                // chama o método menu
                menu();
                System.out.println("Estou no WHILE.");
                // digite                
                System.out.print("Digite a opção desejada: ");
                opcao = input.nextInt(); // opção do usuário
                    
                pesquisarPassagem(passagemAerea, opcao);
                mostrar(passagemAerea);
            
            } // fim while

            // se opção igual a -1
            if (opcao <= 0)
                // sair do sistema
                break;

            // entrada de dados
            System.out.print("Digite o número da passage,: ");
            int passagem = input.nextInt();

        } // fim for

    } // fim main

    // mostra o vetor
    public static void mostrar(boolean[] vetor) {

        // cabeçalho
        System.out.println("\nPASSAGENS AÉREAS");
        System.out.printf("%s%10s%n", "Poltronas", "Ocupadas");

        // loop for para mostra o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%3d%15b%n", i + 1, vetor[i]);
        } // fim for

    } // fim método

    // menu
    public static void menu() {

        System.out.println("=-=-=- MENU DA CLASSE -=-=-= ");
        System.out.println("*****************************");
        System.out.println("*    1 - primeira classe    *");
        System.out.println("*    2 - Classe Econômica  *");
        System.out.println("*   -1 - Sair               *");
        System.out.println("*****************************");

    } // fim menu

    // método pesquisar passagem
    public static void pesquisarPassagem( boolean[] vetor, int opcao ) {

        // se opção igual a 1
        if( opcao == 1 ) {
            // loop for para pesquisar primeira classe 
            for( int i = 0; i < vetor.length / 2; i++ ) {
                // se vetor[i] == false
                if( vetor[i] == false ) {
                    vetor[i] = true;
                    break;
                } // fim if vetor false
            } // fim for opçao 1
        } // fim if
        // se não, se opção igual a 2
        else if( opcao == 2 ) {
            // loop for para pesquisar classe econômica
            for( int j = 5; j < vetor.length; j++ ) {
                if ( vetor[ j ] == false ) {
                    vetor[j] = true;
                    break;
                } // fim if vetor j
            } // fim for opção 2
        } // fim else if opção 2
    } // fim método pesquisaPassagem

    // método adicionar passagem ao vetor
    public static int primeiraClasse(int[] vetor) {

        // objeto SecureRandon
        SecureRandom numAleatorio = new SecureRandom();

        // variável
        int passagem = 0;

        for (int valor = 0; valor < 5; valor++) {

            // passagem recebe entre 1 e 5 inclusive
            passagem = 1 + numAleatorio.nextInt(5);

            // loop for para verificar o valor do vetor
            for (int verificar = 0; verificar < 5; verificar++) {

                // se o valor igual a passagem informe
                if (vetor[verificar] != passagem) {
                    vetor[verificar] = passagem;
                    System.out.println("Verificar = " + passagem );
                } // fim if vetor
                else {
                    System.out.printf("%s%n", "Passagem");
                } // fim else

            } // fim for interno
        } // fim for exerno

        return passagem;

    } // fim método

} // fim classe