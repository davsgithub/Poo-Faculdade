
package trabalhoa1;

import java.util.Scanner;

public class Lancha extends Casco {
    boolean banheiro;
    //MÉTODOS DE ACESSO
   public void setBanheiro(boolean ban){
      if(ban==true){
          banheiro = ban;
      }
      else{
          banheiro = ban;
      }    
   }
   public boolean getBanheiro(){
       return banheiro;
       
   }
   
   
   
    @Override
   public void entradaDados(){
       super.entradaDados();
       Scanner sc = new Scanner (System.in);
       System.out.println("Informe se tem banheiro: ");
       String resp = sc.nextLine();
        String sim1 = "sim";
        String sim2 = "Sim";
        String sim3 = "SIm";
        String sim4 = "SIM";
        String nao1 = "não";
        String nao2 = "Não";
        String nao3 = "NÃo";
        String nao4 = "NÃO";
        
        
        if(resp.equals(sim1)){
            setBanheiro(true);
        }
        if(resp.equals(sim2)){
            setBanheiro(true);
        }
        if(resp.equals(sim3)){
            setBanheiro(true);
        }
        if(resp.equals(sim4)){
            setBanheiro(true);
        }
        else if (resp.equals(nao1)){
            setBanheiro(false);
        }
         else if (resp.equals(nao2)){
            setBanheiro(false);
        }
        else if (resp.equals(nao3)){
            setBanheiro(false);
        } 
        else if (resp.equals(nao4)){  
            setBanheiro(false);
        }
        
        else{
            System.out.println("Resposta inválida!");
        }
    }
        
   //MÉTODOS
    @Override
    public void imprimir(){
        super.imprimir();
        String strBanheiro;
        if(getBanheiro()==true){
            strBanheiro = "Sim";
        }
        else{
            strBanheiro = "Não";
        }
        
        System.out.println("Banheiro: "+strBanheiro);   
        System.out.println("Preço com desconto: "+valorDesconto(preco));
        
    }
    
    public void cadastrar(String ma,String mod,String co,String id,int numPa,int velMax,double altCalado,double prec,String casc,boolean ban){
        super.cadastrar(ma,mod,co,id,numPa,velMax,altCalado,prec,casc);
        banheiro = ban;
    }
    
    public double valorDesconto(double pr){
        double desc = pr*0.1;
        desc = pr - desc;
        return desc;
        
    }
    
    //CONSTRUTORES
    
    public Lancha(){
        
    }
    
    //CONSTRUTOR 01
    public Lancha(boolean ban,String ma,String mod,String co, String id,String casc,int numPa,int velMax, double prec, double altCalado){
        marca = ma;
        modelo = mod;
        cor = co;
        tipoCasco = casc;
        identificacao = id;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        preco = prec;
        alturaCalado = altCalado;
        banheiro = ban;
    }
    
    //CONSTRUTOR 02
    public Lancha(int numPa,boolean ban,int velMax, String ma, String mod, String co, String id, String casc, double prec, double altCalado){
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        preco = prec;
        alturaCalado = altCalado;
        banheiro = ban;
    }
    
    //CONSTRUTOR 03
    public Lancha(double prec, double altCalado,boolean ban, int numPa, int velMax, String ma, String mod, String co, String id, String casc){
        preco = prec;
        alturaCalado = altCalado;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        marca = ma;
        modelo = mod;
        cor  = co;
        identificacao = id;
        tipoCasco = casc;
        banheiro = ban;
    }
    
    //CONSTRUTOR 04
    public Lancha(int numPa, int velMax, double prec,boolean ban, double altCalado, String ma, String mod, String co, String id,String casc){
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        preco = prec;
        alturaCalado = altCalado;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        banheiro = ban;
        
    }
    
    //CONSTRUTOR 05
    public Lancha(double prec, double altCalado, String ma, String mod,boolean ban, String co, String id,String casc, int numPa, int velMax){
        preco = prec;
        alturaCalado = altCalado;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        banheiro = ban;
    }
    
    //CONSTRUTOR 06
    public Lancha(String ma, String mod, String co, String id,String casc,boolean ban, double prec, double altCalado,int numPa, int velMax){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        preco = prec;
        alturaCalado = altCalado;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        banheiro = ban;
    }
    
    //CONSTRUTOR 07
    public Lancha(String ma, String mod, String co, String id,String casc,int numPa,boolean ban, double prec,int velMax,double altCalado){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        numeroPassageiros = numPa;
        preco = prec;
        velocidadeMaxima = velMax;
        alturaCalado = altCalado;
        banheiro = ban;
    }
    
    //CONSTRUTOR 08
    public Lancha(String ma, String mod, String co, String id,String casc,double prec,int numPa,double altCalado,int velMax,boolean ban){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        preco = prec;
        numeroPassageiros = numPa;
        alturaCalado = altCalado;
        velocidadeMaxima = velMax;
        banheiro = ban;
    }
    
    //CONSTRUTOR 09
    public Lancha(double prec, int numPa, double altCalado, int velMax,String ma, String mod, String co, String id,String casc,boolean ban){
        preco = prec;
        numeroPassageiros = numPa;
        alturaCalado = altCalado;
        velocidadeMaxima = velMax;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        banheiro = ban;
    }
    
    //CONSTRUTOR 10
    public Lancha(int numPa, double prec, int velMax, double altCalado,String ma, String mod, String co, String id,boolean ban,String casc){
        numeroPassageiros = numPa;
        preco = prec;
        velocidadeMaxima = velMax;
        alturaCalado = altCalado;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        banheiro = ban;
    }
}

