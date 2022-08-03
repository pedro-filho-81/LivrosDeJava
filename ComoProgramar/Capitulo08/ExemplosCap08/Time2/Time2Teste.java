//package ExemplosCap08.Time2;

public class Time2Teste {
    public static void main(String[] args) throws IllegalAccessException {

        Time2 t1 = new Time2(); // 00:00:00
        Time2 t2 = new Time2(2); // 02:00:00
        Time2 t3 = new Time2(21, 34); // 21:34:00
        Time2 t4 = new Time2(12, 25, 42); // 12:25:42
        Time2 t5 = new Time2(t4); // 12:25:42

        // exibe resultado
        System.out.println("Horarios: ");
        displayTime2("t1: Todos os arguentos padrão:", t1);
        displayTime2("t2: Hora especifica, inutos e segundos padrão", t2);
        displayTime2("t3: Horas e inutos especificos e segundos padrão", t3);
        displayTime2("t4: horas, inutos e segundos espscificados:", t4);
        displayTime2("t5: visualiza o objeto t4 especificado: ", t5);

        // excessão
        try{
            Time2 t6 = new Time2(37,43, 99);
        }
        catch(IllegalAccessException e)
        { 
            Object t6;
            System.out.printf("Excessão enquanto inicializa t6 %s%n ", e.getMessage());
        }

    } // final principal

    public static void displayTime2(String header, Time2 t) 
    {
        System.out.printf("%s%n %s%n %s\n",
                        header, t.toUniversalString(), t.toString());
    }

} // final classe