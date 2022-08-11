
public class Retangulo {
    // variáveis de instância
    private float largura = 1f; // valor da largura
    private float altura = 1f; // valor da altura

    // construtor
    public Retangulo(float largura, float altura)
    {
        if(largura <= 0.0f || largura >= 20.0f)
            throw new IllegalArgumentException("Largura tem que está entre 1 e 20.");
        if(altura <= 0.0f || altura > 20.0f)
            throw new IllegalArgumentException("Altura tem que está entre 1 e 20");
        
        this.altura = altura;
        this.largura = largura;
    } // final construtor

    public void setAltura(float altura)
    {
        if(altura <= 0.0f || altura > 20.0f)
            throw new IllegalArgumentException("Altura te que está entre 1 e 20");
    
        this.altura = altura;
        
    } // final setAltura

    public float getAltura()
    {
        return altura;
    } // final get altura

    public void setLargura( float largura)
    {
        if(largura <= 0.0f || largura >= 20.0f)
            throw new IllegalArgumentException("Largura te que esté entre 1,00 e 20,00");

        this.largura = largura;
    } // final setLargura

    public float getLargura()
    {
        return largura;
    } // final getLargura

    public void perimetro()
    {
        System.out.printf("Prei^tro do retângulo = %.2f\n", 2 * (getAltura() * getLargura()));
    } // final ir

    public void area() 
    {
        System.out.printf("Area do retângulo = %.2f%n", getAltura() * getLargura());
    } // final area

} // final classe retângulo