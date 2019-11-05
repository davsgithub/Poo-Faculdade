package exercicio_01;

import java.util.Scanner;
public class Motor {
    private int potenciaMaxima;
    private String tipoCombustivel;
    private int potenciaAtual;
    
    //MÉTODOS DE ACESSO
    
    //POTÊNCIA MÁXIMA
    
    public void setPotenciaMaxima(int potenciaMaxima){
        if(potenciaMaxima>0){
            this.potenciaMaxima = potenciaMaxima;
        }
    }
    public int getPotenciaMaxima(){
        return potenciaMaxima;
    }
    
    //TIPO DE COMBUTÍVEL
    
    public void setTipoCombustivel(String tipoCombustivel){
        if(!tipoCombustivel.isEmpty()){
            this.tipoCombustivel = tipoCombustivel;
        }
    }
    public String getTipoCombustivel(){
        return tipoCombustivel;
    }
    
    //POTENCIA ATUAL
    
    public void setPotenciaAtual(int potenciaAtual){
        if(potenciaAtual>0){
            if(potenciaAtual<=potenciaMaxima){
                this.potenciaAtual = potenciaAtual;
            }
        }
    }
    public int getPotenciaAtual(){
        return potenciaAtual;
    }
    
    //MÉTODOS
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tipo de combustível: ");
        setTipoCombustivel(sc.nextLine());
        System.out.println("Informe a potência máxima: ");
        setPotenciaMaxima(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a potência atual: ");
        setPotenciaAtual(Integer.parseInt(sc.nextLine()));
    }
    
    public void imprimir(){
        System.out.println("Tipo de combustível: "+getTipoCombustivel());
        System.out.println("Potência máxima: "+getPotenciaMaxima());
        System.out.println("Potência atual: "+getPotenciaAtual());
        
    }
    
    public void cadastrar(String tipoCombustivel, int potenciaMaxima, int potenciaAtual){
        setTipoCombustivel(tipoCombustivel);
        setPotenciaMaxima(potenciaMaxima);
        setPotenciaAtual(potenciaAtual);
        
    }
    
    public void acelerar(){
        if(potenciaAtual<potenciaMaxima){
            int potAtual = getPotenciaAtual();
            setPotenciaAtual(potAtual + 100);
        }
    }
    
    public void desacelerar(){
        if(potenciaAtual>0){
            int potAtual = getPotenciaAtual();
            setPotenciaAtual(potAtual-100);
        }
    }
    
    //CONSTRUTORES
    
    public Motor(){
        
    }
    public Motor(int potenciaMaxima, int potenciaAtual){
        this.potenciaMaxima = potenciaMaxima;
        this.potenciaAtual = potenciaAtual;
    }
    public Motor(String tipoCombustivel,int potenciaMaxima){
        this.tipoCombustivel = tipoCombustivel;
        this.potenciaMaxima = potenciaMaxima;
        
    }
    
    public Motor(String tipoCombustivel, int potenciaMaxima, int potenciaAtual){
        this.tipoCombustivel = tipoCombustivel;
        this.potenciaMaxima = potenciaMaxima;
        this.potenciaAtual = potenciaAtual;
    }
    public Motor(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }
    





















}
