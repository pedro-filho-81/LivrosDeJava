// package ExemplosCap08.TiposEnum;
/**
 * Figura 8.10: Book.java
 *  Declarando um tipo enum com um construtor 
 * e campos de instância explícitos 
 * e métodos de acesso para esses campos
 */
public enum Book {

    // declara constantes do tipo enum
    JHTP("Java Como Programar", "2015"),
    CHTP("C Como Programar", "2013"),
    IW3HTP("Internet & World Wide Web Como Programar", "2012"),
    CPPHTP("C++ Como Programar", "2014"),
    VBHTP("Visual Basic Como Programar", "2014"),
    CSHARP("Visual C# Como Programar", "2014");

    // campos de instância
    private final String titulo; // titulo do livro
    private final String copyrightYear; // ano dos direitos autorais

    // construtor enum
    Book(String titulo, String copyrightYear)
    {
        this.titulo = titulo;
        this.copyrightYear = copyrightYear;
    } // final construtor

    // retorna o valor do titulo
    public String getTitulo()
    {
        return titulo;
    } // final getTitulo

    // retorna o valor de copyrightYear
    public String getCopyrightYear()
    {
        return copyrightYear;
    } // final copyrightYear
    
} // final book