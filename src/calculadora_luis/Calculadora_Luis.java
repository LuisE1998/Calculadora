package calculadora_luis;

public class Calculadora_Luis {

    private static int ans;
    
    public Calculadora_Luis(){
        ans=0;
    }
    
    public static void main(String[] args){
        int a=0,b=0,c=0;
        a=suma(2,5);
        System.out.println("La suma es: "+a);
        b=adicionar(3);
        System.out.println("La adicion al es da: "+b);
        c=dividir(4,2);
        System.out.println("La division da: "+c);
    }
    
    public static int suma(int a, int b){
        ans=a+b;
        return ans;
    }
    
    public static int resta(int a, int b){
        ans=a-b;
        return ans;
    }
    
    public static int multiplicar(int a, int b){
        ans=a*b;
        return ans;
    }
    
    public static int dividir(int a, int b){
        if (b==0){
            throw new ArithmeticException("no se puede dividir por cero");
        }
        ans=a/b;
        return ans;
    }
    
    public static int potencia(int a, int b){
        ans=1;
        for(int i=0;i<b;i++)
            ans=ans*a;
        return ans;
    }
    
    public static int adicionar(int n){
        ans=ans+n;
        return ans;
    }
    
    public static int sustraer(int n){
        ans=ans-n;
        return ans;
    }
}