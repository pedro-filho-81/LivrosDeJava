public class TesteTime01 {
    public static void main(String[] args) throws IllegalAccessException {
        
        // cria o objeto Time01
        Time01 time = new Time01();

        // mostra a hora no formato universal
        displayTime("Horas antes da alteracao", time);
        System.out.println(); // pula linha

        // alterando às horas
        time.setTime(13, 25, 23);
        displayTime("Horas depois da alteracao:", time);
        System.out.println(); // pula linha

        try {
            time.setTime(99, 99, 99);
        }
        catch(IllegalAccessException e)
        {
            System.out.printf("Excessao: %s%n%n", e.getMessage());    
        } // fim catch

        displayTime("Horas depois:", time);

    } // fim main

    // cria método displayTime para mostrar 
    // as horas no formato 24 e 12 horas
    public static void displayTime(String cabecalho, Time01 hora) {
        // mostra às horas no formato 24 e 12 horas
        System.out.printf("%s%nHora universal: %s%nHora padrao: %s%n",
                        cabecalho, hora.toUniversalString(), hora.toString());
    } // fim display

} // fim classe