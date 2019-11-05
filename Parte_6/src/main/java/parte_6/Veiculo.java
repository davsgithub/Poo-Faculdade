
package parte_6;
        
import java.util.Scanner;

public class Veiculo {
   //ATRIBUTOS
   int numeroPassageiros;
   double capacidadeTanque;
   double preco;
   
   //MÉTODOS DE ACESSO
   public void setNumeroPassageiros(int n){
       if(n>0){
           numeroPassageiros = n;
       }
   }
   public void setNumeroPassageiros(){
       numeroPassageiros = 0;
   }    
   public int getNumeroPassageiros(){
        return numeroPassageiros;
   }    
   public void setCapacidadeTanque(double cap){
       if(cap>0){
           capacidadeTanque = cap;
       }    
   }    
   public void setCapacidadeTanque(){
       capacidadeTanque = 0;
   }    
   public double getCapacidadeTanque(){
       return capacidadeTanque;
   }
   public void setPreco(double p){
       if(p>0){
           preco = p;
       }
   }    
   public void setPreco(){
       preco  = 0;
   }
   public double getPreco(){
       return preco;
   }
   
   //MÉTODOS
   public void imprimir(){
       System.out.println("Número de passageiros: "+getNumeroPassageiros());
       System.out.println("Capacidade de tanque: "+getCapacidadeTanque());
       System.out.println("Preço: "+getPreco());
   }
   //ENTRADA DADOS
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantos passageiros a aeronave comporta: ");
        setNumeroPassageiros(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a capacidade do tanque de combustível: ");
        setCapacidadeTanque(Double.parseDouble(sc.nextLine()));
        System.out.println("Informe o preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));
    }
    //CADASTRAR
    public void cadastrar(int numPassageiros,double capaTanque,double prec){
        setNumeroPassageiros(numPassageiros);
        setCapacidadeTanque(capaTanque);
        setPreco(prec);
        
    }   

}
