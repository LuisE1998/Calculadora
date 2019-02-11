package calculadora_luis;

public class Calculadora_Luis {

    private int ans;
    
    public Calculadora_Luis(){
        ans=0;
    }
    
    public int suma(int a, int b){
        ans=a+b;
        return ans;
    }
    
    public int resta(int a, int b){
        ans=a-b;
        return ans;
    }
    
    public int multiplicar(int a, int b){
        ans=a*b;
        return ans;
    }
    
    public int dividir(int a, int b){
        if (b==0){
            throw new ArithmeticException("no se puede dividir por cero");
        }
        ans=a/b;
        return ans;
    }
    
    public int potencia(int a, int b){
        ans=1;
        for(int i=0;i<b;i++)
            ans=ans*a;
        return ans;
    }
    
    public int adicionar(int n){
        ans=ans+n;
        return ans;
    }
    
    public int sustraer(int n){
        ans=ans-n;
        return ans;
    }
}