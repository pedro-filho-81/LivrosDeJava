public class TestTime1 {
    /**
     * cria o objeto time e usa e u aplicativo
     * @throws IllegalAccessException
     */
    public static void main(String[] args) 
                throws IllegalAccessException {

        // cria o objeto time
        Time1 time = new Time1();

        // gera a saida co displayTime
        displayTime("Depois do objeto time criado", time);
        System.out.println();

        // altera a data/hora e gera a saída data/hora atualizada
        time.setTime(13, 23, 6);
        displayTime("Depois de setTime", time);
        System.out.println();

        // tenta definir data/hora co valores inválidos
        try {
            time.setTime(99, 99, 99);
        } catch (IllegalAccessException e) {
            //TODO: handle exception
            System.out.printf("Excessao: %s%n%n", e.getMessage());
        }

        // data/hora após a tentativa co valores inválidos
        displayTime("Data e hora após a tentativa conn valores inválidos", time);

    } // final principal

    // método displayTime
    public static void displayTime(String header, Time1 t) 
    {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                            header, t.toUniversalString() ,t.toString());
    } // final displayTime

} // final classe
