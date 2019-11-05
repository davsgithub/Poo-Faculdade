
package trabalhoa1;

import java.util.Scanner;

public class Iate extends Veiculo {
    int numeroCabines;//ok
    boolean piscina;//ok
    int numeroTripulantes;//ok
    
    //MÉTODOS DE ACESSO
    
    //NÚMERO DE CABINES
    public void setNumeroCabines(int numCa){
        if(numCa>0){
            numeroCabines = numCa;
        }
    }
    public int getNumeroCabines(){
        return numeroCabines;
    }
    
    //PISCINA
    public void setPiscina(boolean pisc){
        if(pisc==true){
          piscina = pisc;
      }
      else{
          piscina = pisc;
      }
    }
    
    public boolean getPiscina(){
        return piscina;
    }
    
    //NUMERO DE TRIPULANTES
    public void setNumeroTripulantes(int numTri){
        numeroTripulantes = numTri;
    }
    public int getNumeroTripulantes(){
        return numeroTripulantes;
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
            setPiscina(true);
        }
        if(resp.equals(sim2)){
            setPiscina(true);
        }
        if(resp.equals(sim3)){
            setPiscina(true);
        }
        if(resp.equals(sim4)){
            setPiscina(true);
        }
        else if (resp.equals(nao1)){
            setPiscina(false);
        }
         else if (resp.equals(nao2)){
            setPiscina(false);
        }
        else if (resp.equals(nao3)){
            setPiscina(false);
        } 
        else if (resp.equals(nao4)){  
            setPiscina(false);
        }
        
        else{
            System.out.println("Resposta inválida!");
        }
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        String strPiscina;
        if(getPiscina()==true){
            strPiscina = "Sim";
        }
        else{
            strPiscina = "Não";
        }
        
        System.out.println("Número de cabines: "+getNumeroCabines());
        System.out.println("Número de tripulantes: "+getNumeroTripulantes());
        System.out.println("Piscina: "+strPiscina);   
        System.out.println("Preço com desconto: "+valorDesconto(preco));
        
    }
    
    public void cadastrar(String ma,String mod,String co,String id,int numPa,int velMax,int numCa, int numTri,double altCalado,double prec,boolean pisc){
        super.cadastrar(ma,mod,co,id,numPa,velMax,altCalado,prec);
        numeroCabines = numCa;
        numeroTripulantes = numTri;
        piscina = pisc;
        
    }
    
    public double valorDesconto(double pr){
        double desc = pr*0.15;
        desc = pr - desc;
        return desc;
    }
    
    
    //MÉTODOS CONSTRUTORES
    
    public Iate(){
        
    }
    
    //CONSTRUTOR 01
    public Iate(boolean pisc,String ma,String mod,String co, String id,int numPa,int velMax,int numCa, int numTri,double prec, double altCalado){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        preco = prec;
        alturaCalado = altCalado;
        numeroCabines = numCa;
        numeroTripulantes = numTri;
        piscina = pisc;
    }
    
    //CONSTRUTOR 02
    public Iate(int numPa,boolean pisc,int velMax,int numCa, int numTri, String ma, String mod, String co, String id, double prec, double altCalado){
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        numeroCabines = numCa;
        numeroTripulantes = numTri;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        preco = prec;
        alturaCalado = altCalado;
        piscina = pisc;
    }
    
    //CONSTRUTOR 03
    public Iate(double prec, double altCalado, boolean pisc, int numPa, int velMax,int numCa, int numTri, String ma, String mod, String co, String id){
        preco = prec;
        alturaCalado = altCalado;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        numeroCabines = numCa;
        numeroTripulantes = numTri;
        marca = ma;
        modelo = mod;
        cor  = co;
        identificacao = id;
        piscina = pisc;
    }
    
    //CONSTRUTOR 04
    public Iate (int numPa, int velMax,int numCa, int numTri,boolean pisc, double prec, double altCalado, String ma, String mod, String co, String id){
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        numeroCabines = numCa;
        numeroTripulantes = numTri;
        preco = prec;
        alturaCalado = altCalado;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        piscina = pisc;
        
    }
    
    //CONSTRUTOR 05
    public Iate (double prec, double altCalado, String ma, String mod,boolean pisc, String co, String id,int numPa, int velMax, int numCa, int numTri){
        preco = prec;
        alturaCalado = altCalado;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        piscina = pisc;
        
    }
    
    //CONSTRUTOR 06
    public Iate(String ma, String mod, String co, String id,double prec, double altCalado,int numPa, int velMax,int numCa, int numTri, boolean pisc){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        preco = prec;
        alturaCalado = altCalado;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        numeroCabines = numCa;
        numeroTripulantes = numTri;
        piscina = pisc;
        
        
    }
    
    //CONSTRUTOR 07
    public Iate(String ma, String mod, String co, String id,int numPa,int numCa, double prec,int velMax,int numTri,double altCalado,boolean pisc){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        numeroPassageiros = numPa;
        preco = prec;
        velocidadeMaxima = velMax;
        alturaCalado = altCalado;
        numeroCabines = numCa;
        numeroTripulantes = numTri;
        piscina = pisc;
        
    }

    //CONSTRUTOR 08
    public Iate(String ma, String mod, String co, String id,double prec,int numPa,double altCalado,int velMax, int numCa, int numTri, boolean pisc){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        preco = prec;
        numeroPassageiros = numPa;
        alturaCalado = altCalado;
        velocidadeMaxima = velMax;
        numeroCabines = numCa;
        numeroTripulantes = numTri;
        piscina = pisc;
    }
    
    //CONSTRUTOR 09
    public Iate(double prec, int numPa, double altCalado, int velMax,String ma, String mod, String co, String id,int numCa, int numTri, boolean pisc){
        preco = prec;
        numeroPassageiros = numPa;
        alturaCalado = altCalado;
        velocidadeMaxima = velMax;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        numeroCabines = numCa;
        numeroTripulantes = numTri;
        piscina = pisc;
        
    } 
    
    //CONSTRUTOR 10
    public Iate(int numPa, double prec, int velMax, double altCalado,String ma, String mod, String co, String id,int numCa, int numTri, boolean pisc){
        numeroPassageiros = numPa;
        preco = prec;
        velocidadeMaxima = velMax;
        alturaCalado = altCalado;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        numeroCabines = numCa;
        numeroTripulantes = numTri;
        piscina = pisc;
    }





















}
