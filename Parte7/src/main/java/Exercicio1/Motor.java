
package Exercicio1;

import java.util.Scanner;

public class Motor {
    private int potenciaMaxima;
    private int potenciaAtual;
    private String tipoCombustivel;

    //MÉTODOS DE ACESSO
    //POTÊNCIA MÁXIMA 
    public void setPotenciaMaxima(int potMax) {
        if (potMax > 0) {
            potenciaMaxima = potMax;
        }
    }

    public void setPotenciaMaxima() {
        potenciaMaxima = 0;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    //POTENCIA ATUAL
    public void setPotenciaAtual(int potAtual) {
        if (potAtual > 0) {
            potenciaAtual = potAtual;
        }
    }

    public void setPotenciaAtual() {
        potenciaAtual = 0;
    }

    public int getPotenciaAtual() {
        return potenciaAtual;
    }

    //TIPO DE COMBUSTÍVEL
    public void setTipoCombustivel(String tipoComb) {
        if (!tipoComb.isEmpty()) {
            tipoCombustivel = tipoComb;
        }
    }

    public void setTipoCombustivel() {
        tipoCombustivel = "";
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    //CADASTRAR
    public void cadastrar(int potMax, int potAtual, String tipoComb) {
        setPotenciaMaxima(potMax);
        setPotenciaAtual(potAtual);
        setTipoCombustivel(tipoComb);
    }

    public void imprimir() {
        System.out.println("Potência máxima = " + getPotenciaMaxima());
        System.out.println("Potência atual = " + getPotenciaMaxima());
        System.out.println("Tipo de combustivel = " + getTipoCombustivel());
    }
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a potência máxima: ");
        setPotenciaMaxima(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a potência atual: ");
        setPotenciaAtual(Integer.parseInt(sc.nextLine()));
        System.out.println("Tipo de combustível: ");
        setTipoCombustivel(sc.nextLine());
        
    }    

    public void acelerar() {
        int potAtual = getPotenciaAtual();
        int potMaxima = getPotenciaMaxima();
        if(potAtual<potMaxima){
            setPotenciaAtual(potAtual+100);
        }
    }
    public void desacelerar() {
        int potAtual = getPotenciaAtual();
        if(potAtual>0){
            setPotenciaAtual(potAtual-100);
        }
    }

    //CONSTRUTORES
    
    //CONSTRUTOR 01
    
    public Motor (){
        
    }
    
    //CONSTRUTOR 02
    
    public Motor(String tipoComb){
        tipoCombustivel = tipoComb;
    }
    
    public Motor(int potMax){
        potenciaMaxima = potMax;
    }
    
    public Motor(String tipoComb, int potMax){
        tipoCombustivel = tipoComb;
        potenciaMaxima = potMax;
    }
    
    public Motor(int potMax,int potAtual){
        potenciaMaxima = potMax;
        potenciaAtual = potAtual;
    }
    public Motor(String tipoComb,int potMax, int potAtual){
        tipoCombustivel = tipoComb;
        potenciaMaxima = potMax;
        potenciaAtual = potAtual;
    }




}
