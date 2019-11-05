
package trabalhoa1;

import java.util.Scanner;

public class JetSki extends Casco {
    boolean reboque;
    
    //MÉTODOS DE ACESSO
    
    public void setReboque(boolean reb){
        if(reb==true){
          reboque = reb;
      }
      else{
          reboque = reb;
      }
    }
    public boolean getReboque(){
        return reboque;
    }


    @Override
    public void entradaDados(){
       super.entradaDados();
       Scanner sc = new Scanner (System.in);
       System.out.println("Informe se tem reboque: ");
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
            setReboque(true);
        }
        if(resp.equals(sim2)){
            setReboque(true);
        }
        if(resp.equals(sim3)){
            setReboque(true);
        }
        if(resp.equals(sim4)){
            setReboque(true);
        }
        else if (resp.equals(nao1)){
            setReboque(false);
        }
         else if (resp.equals(nao2)){
            setReboque(false);
        }
        else if (resp.equals(nao3)){
            setReboque(false);
        } 
        else if (resp.equals(nao4)){  
            setReboque(false);
        }
        
        else{
            System.out.println("Resposta inválida!");
        }
    }

    @Override
    public void imprimir(){
        super.imprimir();
        String strReboque;
        if(getReboque()==true){
            strReboque = "Sim";
        }
        else{
            strReboque = "Não";
        }
        
        System.out.println("Banheiro: "+strReboque);   
        System.out.println("Preço com desconto: "+valorDesconto(preco));
        
    }
    
    public void cadastrar(String ma,String mod,String co,String id,int numPa,int velMax,double altCalado,double prec,String casc,boolean reb){
        super.cadastrar(ma,mod,co,id,numPa,velMax,altCalado,prec,casc);
        reboque = reb;
    }
    
    
    public double valorDesconto(double pr){
        double desc = pr*0.08;
        desc = pr - desc;
        return desc;
        
    }
    
    //MÉTODOS CONSTRUTORES
    
    
    public JetSki(){
        
    }
    
    //CONSTRUTOR 01
    public JetSki(boolean reb,String ma,String mod,String co, String id,String casc,int numPa,int velMax, double prec, double altCalado){
        marca = ma;
        modelo = mod;
        cor = co;
        tipoCasco = casc;
        identificacao = id;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        preco = prec;
        alturaCalado = altCalado;
        reboque = reb;
    }
    
    //CONSTRUTOR 02
    public JetSki(int numPa,boolean reb,int velMax, String ma, String mod, String co, String id, String casc, double prec, double altCalado){
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        preco = prec;
        alturaCalado = altCalado;
        reboque = reb;
    }
    
    //CONSTRUTOR 03
    public JetSki(double prec, double altCalado,boolean reb, int numPa, int velMax, String ma, String mod, String co, String id, String casc){
        preco = prec;
        alturaCalado = altCalado;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        marca = ma;
        modelo = mod;
        cor  = co;
        identificacao = id;
        tipoCasco = casc;
        reboque = reb;
    }
    
    //CONSTRUTOR 04
    public JetSki(int numPa, int velMax, double prec,boolean reb, double altCalado, String ma, String mod, String co, String id,String casc){
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        preco = prec;
        alturaCalado = altCalado;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        reboque = reb;
        
    }
    
    //CONSTRUTOR 05
    public JetSki(double prec, double altCalado, String ma, String mod,boolean reb, String co, String id,String casc, int numPa, int velMax){
        preco = prec;
        alturaCalado = altCalado;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        reboque = reb;
    }
    
    //CONSTRUTOR 06
    public JetSki(String ma, String mod, String co, String id,String casc, double prec,boolean reb, double altCalado,int numPa, int velMax){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        preco = prec;
        alturaCalado = altCalado;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        reboque = reb;
    }
    
    //CONSTRUTOR 07
    public JetSki(String ma, String mod, String co, String id,String casc,int numPa,boolean reb, double prec,int velMax,double altCalado){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        numeroPassageiros = numPa;
        preco = prec;
        velocidadeMaxima = velMax;
        alturaCalado = altCalado;
        reboque = reb;
    }
    
    //CONSTRUTOR 08
    public JetSki(String ma, String mod, String co, String id,String casc,double prec,int numPa,boolean reb,double altCalado,int velMax){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        preco = prec;
        numeroPassageiros = numPa;
        alturaCalado = altCalado;
        velocidadeMaxima = velMax;
        reboque = reb;
    }
    
    //CONSTRUTOR 09
    public JetSki(double prec, int numPa, double altCalado, int velMax,String ma, String mod, String co, String id,boolean reb,String casc){
        preco = prec;
        numeroPassageiros = numPa;
        alturaCalado = altCalado;
        velocidadeMaxima = velMax;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        reboque = reb;
    }
    
    //CONSTRUTOR 10
    public JetSki(int numPa, double prec, int velMax, double altCalado,String ma, String mod, String co, String id,String casc,boolean reb){
        numeroPassageiros = numPa;
        preco = prec;
        velocidadeMaxima = velMax;
        alturaCalado = altCalado;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        reboque = reb;
    }
}

