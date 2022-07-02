import java.security.SecureRandom;

public class TartarugaVersusLebre28 {
    /**
     * 7.28 (Simulação: a tartaruga e a lebre) Neste problema, você recriará a
     * clássica
     * corrida da tartaruga e da lebre. Você utilizará geração de números aleatórios
     * para
     * desenvolver uma simulação desse evento memorável. Nossos competidores começam
     * a corrida no quadrado 1 de 70 quadrados. Cada um representa uma possível
     * posição ao
     * longo do percurso da competição. A linha de chegada está no quadrado 70.
     * O primeiro competidor a alcançar ou passar o quadrado 70 é recompensado com
     * um cesto
     * de cenouras frescas e alface. O percurso envolve subir uma montanha
     * escorregadia,
     * por isso, ocasionalmente os competidores perdem terreno. Um relógio emite um
     * tique por
     * segundo. A cada tique-taque do relógio, seu aplicativo deve ajustar a posição
     * dos animais
     * de acordo com as regras na Figura 7.32. Use variáveis para monitorar as
     * posições dos
     * animais (isto é, os números de posição são 1 a 70). Inicie cada animal na
     * posição
     * 1 (a "largada"). Se um animal escorregar para a esquerda do quadrado 1,
     * mova-o novamente
     * para o quadrado 1 Gere as porcentagens na Figura 7.32 produzindo um inteiro
     * aleatório i no
     * intervalo 1 d i d 10. Para a tartaruga, realize uma caminhada rápida quando 1
     * d i d 5,
     * um escorregão quando 6 d i d 7 ou uma caminhada lenta quando 8 d i d 10.
     * Utilize uma
     * técnica semelhante para mover a lebre. Comece a corrida exibindo BANG !!!!! E
     * LA VÃO ELES !!!!!
     * Então, para cada tique do relógio (isto é, para cada repetição de um loop),
     * exiba uma linha de
     * 70 posições mostrando a letra T na posição da tartaruga e a letra H na
     * posição da lebre. Ocasionalmente,
     * os competidores ocuparão o mesmo quadrado. Nesse caso, a tartaruga morde a
     * lebre e seu aplicativo deve
     * exibir AI!!! começando nessa posição. Todas as outras posições da saída
     * diferentes de T, H ou AI!!!
     * (no caso de um empate) devem estar em branco. Depois de cada linha ser
     * exibida, teste se o animal
     * alcançou ou passou o quadrado 70. Se tiver alcançado, exiba o vencedor e
     * termine a simulação.
     * Se a tartaruga ganhar, exiba A TARTARUGA VENCEU!!! ÊH!!! Se a lebre ganhar,
     * exiba A LEBRE GANHOU. OH.
     * Se os dois ganharem na mesma hora, você pode querer favorecer a tartaruga (a
     * "coitadinha") ou exibir
     * OCORREU UM EMPATE. Se nenhum animal ganhar, realize o loop novamente para
     * simular o próximo tique do
     * relógio. Quando você estiver pronto para executar seu aplicativo, monte um
     * grupo de fãs para observar
     * a corrida. Você se surpreenderá com a empolgação da sua audiência! Mais
     * adiante no livro, introduziremos
     * várias capacidades do Java, como gráficos, imagens, animação, som e
     * multithreading. À medida que estudar
     * esses recursos, você pode se divertir aprimorando sua simulação da competição
     * entre a lebre e a tartaruga
     * Pedro, 25/06/2022
     */
    public static void main(String[] args) {

        // constantes
        final int SIZE = 71;
        
        // vetores
        String[] pistaDaCorrida = new String[SIZE];

        // objeto secure rando
        SecureRandom alea = new SecureRandom();

        // variáveis
        int respTartaruga;
        int respLebre;

        // exibe pista
        pista(pistaDaCorrida);
        verPista(pistaDaCorrida);

        // cabeçalho
        System.out.println("BANG!!!");
        System.out.println("E LA VAO ELES!!!");

        respLebre = lebre(pistaDaCorrida);
        verPista(pistaDaCorrida);

        respTartaruga =  tartaruga(pistaDaCorrida);
        verPista(pistaDaCorrida);

        if(respLebre == respTartaruga)
            System.out.println("EnnPATE!!!");
        // SE A TARTARUGA CHEGAR NO FINAL ANTES DA LEBRE
        else if(respTartaruga < respLebre) { 
            // EXIBIR
            System.out.printf("Tartaruga venceu!");
        } // final if
        else { // SE NAO
            // EXIBIR
            System.out.printf("Lebre venceu!");            
        } // final else

    } // final principal

    // cria tartaruga
    public static int tartaruga(String[] pista) {

        // objeto SecureRandonn
        SecureRandom alea = new SecureRandom();

        // variável
        int contador = 1;
        int contaT = 0;
        int valor;
        
        pista[contador] = " T ";

        // enquanto contador < pista.length
        while(contador < pista.length) {

            // se contador
            valor = 1 + alea.nextInt(20);

            // se contador aior que 1 e nnenor ou igual a 5
            if(valor >= 1 && valor <= 5)
                // contador adiciona 3
                contador += 3; // cainhada rápida
            else if(valor >= 6 && valor <= 8)
                // escorregão
                contador -= 6;
            else if(valor >= 9 && valor <= 12)
                //cainhada lenta
                contador += 1;
            else if(valor >= 13 && valor <= 15)
                // salto grande
                contador += 9;
            else if(valor >= 16 && valor <= 17)
                // escorregão grande
                contador -= 12;
            else if(valor >= 18 && valor <= 20)
                //escorregão pequeno
                contador -= 2;

            if(contador <= 0)
                contador = 1;
            else if( contador >  70)
                contador = 70;

            if(pista[contador] == "_" || pista[contador] == " T ") { 
                pista[contador] = " T ";
                contaT++; // conta a quantidade de T
            } // final if
            else if(pista[contador] == " L " && contador < 70)
                pista[contador] = " AI!!! ";

            contador++; // adiciona 1 ao contador
            
        } // final while

      return contaT; // conta quantas vezes T deu a volta na posta

    } // final tartaruga

    // cria lebre
    public static int lebre(String[] pista) {

        // objeto SecureRandonn
        SecureRandom alea = new SecureRandom();

        // variável
        int contador = 1;
        int contaL = 0;
        int valor;
        
        pista[contador] = " L ";

        // enquanto contador < pista.length
        while(contador < pista.length) {

            // valor recebe aleatório entre 1 e 20
            valor = 1 + alea.nextInt(20);

            // se contador aior que 1 e nnenor ou igual a 5
            if(valor >= 1 && valor <= 5)
                // contador adiciona 3
                contador += 3; // cainhada rápida
            else if(valor >= 6 && valor <= 8)
                // escorregão
                contador -= 6;
            else if(valor >= 9 && valor <= 12)
                //cainhada lenta
                contador += 1;
            else if(valor >= 13 && valor <= 15)
                // salto grande
                contador += 9;
            else if(valor >= 16 && valor <= 17)
                // escorregão grande
                contador -= 12;
            else if(valor >= 18 && valor <= 20)
                //escorregão pequeno
                contador -= 2;

            if(contador <= 0)
                contador = 1;
            else if( contador >  70)
                contador = 70;

            if(pista[contador] == "_" || pista[contador] == " L ") { 
                pista[contador] = " L ";
                contaL++; // conta a quantidade de T
            } // final if
            else if(pista[contador] == " T " && contador < 70)
                pista[contador] = " AI!!! ";
    
            contador++; // adiciona 1 ao contador
            
        } // final while

        return contaL; // retorna quantas vezes a lebre correu até o final
      
    } // final lebre

    // CORRIDA DA TARTARUGA
    public static void pista(String[] pista) {

        // cria pista da corrida
        for (int i = 1; i < pista.length; i++) {
            // pista
            pista[i] = "_";
        } // fi for pista

    } // fi pista

    // ostra pista
    public static void verPista(String[] pista) {
        for (int i = 1; i < pista.length; i++) {
            System.out.printf("%s", pista[i]);
        } // final for
        System.out.printf("\n\n");
    } // fi verPista

} // final classe