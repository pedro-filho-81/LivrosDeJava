
public class Time1Test {
    /**
    * objeto time1 utilizado em um aplicativo
    19/06/2022    
    */
    public static void main(String[] args) {
        
        // cria e inicialize o objeto da classe Time1
        Time1 time = new Time1();

        // gera a saida de representação da String de data/hora
        displayTime("depois que o objeto Time1 é criado: ", time);
        System.out.println();
        
        time.setTime(13, 27, 6);
        displayTime("Depois de chamra setTime", time);
        System.out.println();

        // tenta definie data/hora com valores inválidos
        try
        {
            time.setTime(99, 99, 99);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("Excessão: %s%n%n", e.getMessage());
        }

        // exibe a data/hora após uma tentativa de definir valores inválidos
        displayTime("Exibe o valor invalido depois de chamar setTime.", time);

    } // fim main

    // exibe um objeto Time1 nos formatos de 24 horas e 12 horas
    private static void displayTime(String header, Time1 t)
    {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                                header, t.toUniversalString(), t.toString() );
    } 

} // fimm classe