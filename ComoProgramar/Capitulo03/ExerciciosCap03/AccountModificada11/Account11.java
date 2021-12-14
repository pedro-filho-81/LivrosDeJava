public class Account11 {

    private String name; // instance variable
    private int balance; // instance variable

    // Account constructor that receives two parameters
    // construtor da conta que recebe dois parâmetro
    public Account11(String name, int balance) {
        // atribui o nome para a variável de instância nome
        this.name = name; // assign name to instance variable name

        // validate that the balance is greater than 0.0; if it's not,
        // valida se o saldo é maior que 0,0; se não for,
        // instance variable balance keeps its default initial value of 0.0
        // o equilíbrio da variável de instância mantém seu valor inicial padrão de 0,0
        if (balance > 0.0) // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
    } // fim construtor

    // method that deposits (adds) only a valid amount to the balance
    // método que deposita (adiciona) apenas uma quantia válida ao saldo
    public void deposit(int depositAmount) {
        if (depositAmount > 0.0) // if the depositAmount is valid
            balance = balance + depositAmount; // add it to the balance
    } // fim depósito

    public void retirada(int sacarDinheiro) {
        if (sacarDinheiro > 0.0)
            if (sacarDinheiro <= balance)
                balance -= sacarDinheiro;

        if (sacarDinheiro > balance)
            System.out.println("Valor do solicitado maior que o saldo.");

    } // fim saque

    // method returns the account balance
    public int getBalance() {
        return balance;
    }

    // method that sets the name
    public void setName(String name) {
        this.name = name;
    }

    // method that returns the name
    public String getName() {
        return name;
    }
    
} // fim classe
