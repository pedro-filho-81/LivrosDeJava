package ExemplosCap08.Time2;

/**
 * declarando classe Time2 co construtores sobrecarregados
 */
public class Time2 {

    // variáveis de instância
    public int horas; // 0 - 23
    private int minutos; // 0 - 59
    private int segundos; // 0 - 59

    // construtor se arguentos
    // inicializa as variáveis de instância co zeros
    public Time2()
    {
        this(0, 0, 0); // invoca o construtor co 3 arguentos
    } // final construtor

    // construtor co as horas fornecidas, inutos e segundos co o padrão 0
    public Time2(int horas)
    {
        this(horas, 0, 0); // invoca o construtor co 3 arguentos

    } // final Time2-1

    // construtor horas e inuros fornecidos
    public Time2(int horas, int minutos) 
    {
        this(horas, minutos, 0);
    } // final construtor Time2-2

    public Time2(int horas, int minutos, int segundos) throws IllegalAccessException
    {
        if(horas < 0 || horas >= 24)
            throw new IllegalAccessException();
        if(minutos < 0 || minutos >= 59)
            throw new IllegalStateException();
        if(segundos < 0 || segundos>= 59)
            throw new IllegalStateException();

        this.horas = horas;
        this. minutos = minutos;
        this.segundos = segundos;

    } // final construtor Time2-3

    // outro construtor co o objeto Time2 fornecido
    public Time2(Time2 time)
    {
        // invoca o construtor co três arguentos
        this(time.getHoras, time.getminutos, time.getSegundos);
    }

} // final classe Time2
