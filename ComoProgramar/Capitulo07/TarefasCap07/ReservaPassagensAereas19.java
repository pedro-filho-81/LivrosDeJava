import java.util.Scanner;

public class ReservaPassagensAereas19 {
    /**
     * 7.19 (Sistema de reservas de passagens aéreas) Uma pequena companhia aérea
     * acabou de comprar um computador para seu novo sistema automatizado de reservas.
     * Você foi solicitado a desenvolver o novo sistema. Você escreverá um
     * aplicativo para atribuir assentos em cada voo da companhia aérea 
     * (capacidade: 10 assentos). Seu aplicativo deve exibir as seguintes alternativas: 
     * Please type 1 for First Class e Please type 2 for Economy. 
     * [Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica]. 
     * Se o usuário digitar 1, seu aplicativo deve atribuir assentos na primeira classe 
     * (poltronas 1 a 5). Se o usuário digitar 2, seu aplicativo deve atribuir um assento 
     * na classe econômica (poltronas 6 a 10). Seu aplicativo deve exibir um cartão de embarque 
     * indicando o número da poltrona da pessoa e se ela está na primeira classe ou na classe 
     * econômica. Utilize um array unidimensional do tipo primitivo boolean para representar 
     * o gráfico de assentos do avião. Inicialize todos os elementos do array como false para 
     * indicar que todas as poltronas estão desocupadas. À medida que cada assento é atribuído, 
     * configure o elemento correspondente do array como true para indicar que o assento não 
     * está mais disponível.Seu aplicativo nunca deve atribuir uma poltrona que já foi reservada. 
     * Quando a classe econômica estiver lotada, seu aplicativo deve perguntar à pessoa se ela 
     * aceita ficar na primeira classe (e vice-versa). Se sim, faça a atribuição apropriada de 
     * assento. Se não, exiba a mensagem "Next flight leaves in 3 hours" [O próximo voo parte em 3 horas].
     * Pedro, 30/05/2022
     */
    public static void main(String[] args) {

        // declara e cria um vetor
        boolean[] passagens = new boolean[10];

        // inicializa um vetor e adicionar valores
        for (int i = 0; i < passagens.length; i++) {
            // adiciona valores ao vetor
            passagens[i] = false;
        } // fim for

        mostrar(passagens);

        processarDados(passagens);

        mostrar(passagens);

    } // fim main

    // adicionar
    public static void processarDados(boolean[] vetor) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // variável
        int contar = 0;
        int contar2 = 5;

        while (contar < 10) {

            // entrada de dados
            System.out.println("\n\n*** Passagens Aereas: ***\n\tDigite:");
            System.out.println("*************************");
            System.out.println(" 1 para primeira classe" +
                    "\n 2 para classe economica:" +
                    "\n-1 para sair do sistema.");
            System.out.println("*************************");
            int opcao = input.nextInt();

            if (opcao == -1 || contar >= 9)
                break;

            // opção
            switch (opcao) {
                case 1: 
                    if (contar < 5) {
                        vetor[contar] = true;
                        System.out.println("*******************");
                        System.out.printf("*Passagem emitida:*\n*Primeira classe: *\n*Poltrona[%d]      *\n",
                                contar + 1);
                        System.out.println("*******************");
                        contar++;
                    } // fim if
                    else {
                        System.out.println("\nPrimeira classe esgotada.\nSo temos a classe economica.");
                    }
                    break;
        
                case 2:

                    // classeEconomica();
                    if (contar < 10) {
                        vetor[contar2] = true;
                        System.out.println("*******************");
                        System.out.printf("*Passagem emitida:*\n*Classe economica:*\n*Poltrona[%d]      *\n",
                                contar2 + 1);
                        System.out.println("*******************");
                        contar2++;
                    } // fim if
                    else {
                        System.out.println("\nClasse economica esgotada.\nAceita focar na primeira classe.");
                    }
                    break;

                default:
                    System.out.println("Opçao indevida.");
                    break;
            } // fim switch

        } // fim while
        
    } // fim adicionar

    // método mostrar
    public static void mostrar(boolean[] vetor) {

        // cabeçalho
        System.out.printf("\n%s%20s%23s%n", "Poltronas:", "Primeira classe", "Classe economica");
        // loop para mostra os valores do vetor
        for (boolean valor : vetor) {
            // mostrar
            System.out.printf("%7b", valor);
        } // fim for aprimorado

    } // fim mostrar

} // fim classe