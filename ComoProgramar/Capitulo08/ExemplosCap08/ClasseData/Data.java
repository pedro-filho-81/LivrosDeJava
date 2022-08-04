/**
 * Data.java
 * Declara a classe Data
 */
public class Data {

    // variáveis de instância
    private int month; // meses 1 - 12
    private int day; // 1 - 31 confore o mês 
    private int year; // qualquer ano

    private static final int[] daysPerMonth = 
                    { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
    // construtor: confira o valor adequado para ês dia e ano
    public Data(int day, int month, int year) throws IllegalAccessException 
    {
        // verifica se o month está entre 0 - 12
        if(month <= 0 || month > 12) 
            throw new IllegalAccessException("month (" + month +  ") deve ser entre 1 - 12");

        // verifica se o dia esta diacordo co o month
        if(day <= 0 || day > daysPerMonth[month] && !(month == 2 && day == 29))
            throw new IllegalArgumentException("day (" + day + 
                ") fora do intervalo para o mês e ano especificados");

        // verifique no ano bissexto se o mês é 2 e o dia é 29
        if(month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)))
                    throw new IllegalStateException("day (" + day + 
                        ") fora do intervalo para o mês e ano especificados");

        this.day = day;
        this.month = month;
        this.year =year;

        System.out.println("Construtor de objeto para a data: " + this);
        
    } // final construtor

    // retorna o dia es e ano
    public String toString()
    {
        return String.format("%d/%d/%d", day, month, year );
    }

} // final classe DAta
