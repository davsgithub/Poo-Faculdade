
package trabalhoa1;

import java.util.Scanner;

public class Casco extends Veiculo {
    String tipoCasco;
    
    //MÉTODOS DE ACESSO
    public void setTipoCasco(String casc){
        if(!casc.isEmpty()){
            tipoCasco = casc;
        }
    }
    public void setTipoCasco(){
        tipoCasco = "";
    }
    public String getTipoCasco(){
        return tipoCasco;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo de casco: "+getTipoCasco());
    }    
    
    public void cadastrar(String ma,String mod,String co,String id,int numPa,int velMax,double altCalado,double prec,String casc){
        super.cadastrar(ma, mod, co, id, numPa, velMax, altCalado, prec);
        tipoCasco = casc;
    }
    
    @Override
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Informe o tipo de casco: ");
        setTipoCasco(sc.nextLine());
    
    }
    
    //MÉTODOS CONSTRUTORES
    public Casco(){
        
    }
    
    //CONSTRUTOR 01
    public Casco(String ma,String mod,String co, String id,String casc,int numPa,int velMax, double prec, double altCalado){
        marca = ma;
        modelo = mod;
        cor = co;
        tipoCasco = casc;
        identificacao = id;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        preco = prec;
        alturaCalado = altCalado;
    }
    
    //CONSTRUTOR 02
    public Casco(int numPa,int velMax, String ma, String mod, String co, String id, String casc, double prec, double altCalado){
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        preco = prec;
        alturaCalado = altCalado;
    }
    
    //CONSTRUTOR 03
    public Casco(double prec, double altCalado, int numPa, int velMax, String ma, String mod, String co, String id, String casc){
        preco = prec;
        alturaCalado = altCalado;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        marca = ma;
        modelo = mod;
        cor  = co;
        identificacao = id;
        tipoCasco = casc;
    }
    
    //CONSTRUTOR 04
    public Casco(int numPa, int velMax, double prec, double altCalado, String ma, String mod, String co, String id,String casc){
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        preco = prec;
        alturaCalado = altCalado;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        
    }
    
    //CONSTRUTOR 05
    public Casco(double prec, double altCalado, String ma, String mod, String co, String id,String casc, int numPa, int velMax){
        preco = prec;
        alturaCalado = altCalado;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        
    }
    
    //CONSTRUTOR 06
    public Casco(String ma, String mod, String co, String id,String casc, double prec, double altCalado,int numPa, int velMax){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        preco = prec;
        alturaCalado = altCalado;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
    }
    
    //CONSTRUTOR 07
    public Casco(String ma, String mod, String co, String id,String casc,int numPa, double prec,int velMax,double altCalado){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        numeroPassageiros = numPa;
        preco = prec;
        velocidadeMaxima = velMax;
        alturaCalado = altCalado;
    }
    
    //CONSTRUTOR 08
    public Casco(String ma, String mod, String co, String id,String casc,double prec,int numPa,double altCalado,int velMax){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
        preco = prec;
        numeroPassageiros = numPa;
        alturaCalado = altCalado;
        velocidadeMaxima = velMax;
    }
    
    //CONSTRUTOR 09
    public Casco(double prec, int numPa, double altCalado, int velMax,String ma, String mod, String co, String id,String casc){
        preco = prec;
        numeroPassageiros = numPa;
        alturaCalado = altCalado;
        velocidadeMaxima = velMax;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
    }
    
    //CONSTRUTOR 10
    public Casco(int numPa, double prec, int velMax, double altCalado,String ma, String mod, String co, String id,String casc){
        numeroPassageiros = numPa;
        preco = prec;
        velocidadeMaxima = velMax;
        alturaCalado = altCalado;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        tipoCasco = casc;
    }
}


