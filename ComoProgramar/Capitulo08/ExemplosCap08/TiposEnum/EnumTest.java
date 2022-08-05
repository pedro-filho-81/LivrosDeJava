/**
 * testando enum Book
 */
import java.util.EnumSet;

public class EnumTest
{   
    public static void main(String[] args)
    {
        System.out.println("Todos os livros:");

        // imprime todos os livros de enum
        for(Book book : Book.values())
        {
            System.out.printf("%-10s%-45s%s%n", book,
                        book.getTitulo(), book.getCopyrightYear());
        }

        System.out.println("\nExiba um intervalo de 4 constantes de enumeração:");

        // imprime os 4 primeiros livros
        for(Book book : EnumSet.range(Book.JHTP, Book.CPPHTP))
        {            
            System.out.printf("%-10s%-45s%s%n", book,
                       book.getTitulo(), book.getCopyrightYear());
        }

    } // final principal
} // final classe