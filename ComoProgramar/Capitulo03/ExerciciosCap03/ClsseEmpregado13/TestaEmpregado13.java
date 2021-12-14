import java.util.Scanner; 

public class TestaEmpregado13 {
    /*
        3.13 (Classe Employee) Crie uma classe chamada Employee que inclua três variáveis de instância — 
            um primeiro nome (tipo String), um sobrenome (tipo String) e um salário mensal (double). 
            Forneça um construtor que inicializa as três variáveis de instância. Forneça um 
            método set e um get para cada variável de instância. Se o salário mensal não for positivo, 
            não configure seu valor. Escreva um aplicativo de teste chamado EmployeeTest que demonstre 
            as capacidades da classe Employee. Crie dois objetos Employee e exiba o salário anual
            de cada objeto. Então dê a cada Employee um aumento de 10% e exiba novamente o salário 
            anual de cada Employee.
            Pedro, 14/12/2021
    */
    
    public static void main(String[] args) {
        
        // cria variável da classe
        Empregado13 empregado = new Empregado13("Pedro", "Santos", 1000.00 );

        // variável input de Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("\nPRIMEIRO EMPREGADO");

        // mostra o primeiro empregado
        System.out.printf("Nome: %s%nSobre-nome: %s%nSalário R$ %.2f%n%n",
                    empregado.getNome(),
                    empregado.getSobreNome(),
                    empregado.getSalario() );

        // entrada de dados
        System.out.print("Informe o nome do empregado: ");
        String nomeEmpregado = input.nextLine();
        empregado.setNome(nomeEmpregado);

        System.out.print("Sobre nome: " );
        String sobreNome = input.nextLine();
        empregado.setSobreNome(sobreNome);

        System.out.print("Salario R$ " );
        double salario = input.nextDouble();
        empregado.setSalario(salario);

        System.out.println("\nNOVOS EMPREGADO");

        // mostra o primeiro empregado
        System.out.printf("Nome: %s%nSobre-nome: %s%nSalário R$ %.2f%n%n",
                    empregado.getNome(),
                    empregado.getSobreNome(),
                    empregado.getSalario() );
    } // fim main
} // fim classe
