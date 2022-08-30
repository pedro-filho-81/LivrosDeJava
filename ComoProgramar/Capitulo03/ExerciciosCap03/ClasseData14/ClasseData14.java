
public class ClasseData14 {
    
    //variáveis de instância
    private int dia;
    private int mes;
    private int ano;

    // construtor
    public ClasseData14(int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    } // final construtor

    public void setDia(int dia)
    {
        if( dia > 0 && dia <= 31)
         this.dia = dia;
    } // final dia

    public int getDia()
    {
        return dia;
    } // final get dia

    public void setmes(int mes)
    {
        if(mes >= 1 && mes <= 31)
            this.mes = mes;
    } // final mes

    public int getmes()
    {
        return mes;
    }

    public void setAno (int ano)
    {
        if(ano > 1500 && ano < 2500)
            this.ano = ano;
    } // final ano

    public int getAno()
    {
        return ano;
    } // final ano

    public void displayData()
    {
        System.out.printf("Data: %d/%d/%d\n", getDia(), getmes(), getAno());
    } // final display

} // final da classe
