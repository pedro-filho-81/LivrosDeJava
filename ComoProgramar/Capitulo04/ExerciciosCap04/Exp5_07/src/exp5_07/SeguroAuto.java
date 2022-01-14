package exp5_07;

public class SeguroAuto {

    // cria variáveis de instância
    private int numeroDaConta; // número da conta da apólice
    private String modeloDoCarro; // carro da apólice
    private String estado; // abreviatura do estado com 2 letras maiúscula
    
    // cria o construtor da classe
    public SeguroAuto( int numeroDaConta,  String modeloDoCarro, String estado ) {
        this.numeroDaConta = numeroDaConta;
        this.modeloDoCarro  = modeloDoCarro;
        this.estado = estado;
    } // fim construtor
    
    // configura o número da conta
    public void setNumeroDAConta( int numeroDaConta ) {
        this.numeroDaConta = numeroDaConta;
    } // fim set número da conta
    
    public int getNumeroDaConta() {
        return numeroDaConta;
    } // fim get número da conta
    
    public void setModeloDoCarro( String modeloDoCarro ) {
        this.modeloDoCarro = modeloDoCarro;
    } // fim set modelo do carro
    
    public String getModeloDoCarro() {
        return modeloDoCarro;
    } // fim get modelo do carro
    
    public void setEstado( String estado ) {
        this.estado = estado;
    } // fim set estado
    
    public String getEstado() {
        return estado;
    } // fim get estado
    
    // método predicado é retornado se o estado tem seguros “sem culpa”
    public boolean isNoFaultState()
    {
         boolean noFaultState; 
    
        // determina se o estado tem seguros de automóvel “sem culpa” ÿ
        switch ( getEstado() ) // obtém a abreviatura do estado do objeto AutoPolicyÿ
        {
            case "MA": 
            case "NJ": 
            case "NY": 
            case "PA":
                noFaultState = true;
                break;
    
            default:
                noFaultState = false;
                break;
        } // fim switch
            
        return noFaultState;
                
    } // fim isNoFaultState 
} // fim da classe
