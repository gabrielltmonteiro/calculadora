package calculadora;

public class Calculadora {
    private double valorA;
    private double valorB;
    
    public Calculadora() {
        this(0.0, 0.0);
    }
    public Calculadora(double valorA, double valorB){
        setValorA(valorA);
        setValorB(valorB);  
    }
    public double getValorA(){
        return valorA; 
    }
    public double getValorB(){
        return valorB; 
    }
    public void setValorA(double ValorA){
        this.valorA = valorA;
        System.out.println(valorA);
    }
    public void setValorB(double ValorB){
        this.valorB = valorB;
        System.out.println(valorB);
    }
    public double getAdicao(){
        System.out.println(valorA+" "+valorB);
        return(getValorA() + getValorB());
    }
    public double getSubtracao(){
        return(getValorA() - getValorB());
    }
    public double getProduto(){
        return(getValorA() * getValorB());
    }
    public double getDivisao(){
        return(getValorA() / getValorB());
    }
}
