/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte10;

import java.util.Scanner;

/**
 *
 * @author Cakeb
 */
public class Geladeira extends Eletrodomestico{
    private double temperaturaMaxima;
    private double temperaturaMinima;
    Porta porta2 = new Porta();
    
    public void setTemperaturaMaxima(double temperaturaMaxima){
        if(temperaturaMaxima>0){
            this.temperaturaMaxima = temperaturaMaxima;
        }
    }
    public void setTemperaturaMaxima(){
        temperaturaMaxima = 0;
    }
    public double getTemperaturaMaxima(){
        return temperaturaMaxima;
    }
    
    public void setTemperaturaMinima(double temperaturaMinima){
        if(temperaturaMinima>0){
            this.temperaturaMinima = temperaturaMinima; 
        }
    }
    public void setTemperaturaMinima(){
        temperaturaMinima = 0;
    }
    public double getTemperaturaMinima(){
        return temperaturaMinima;
    }
    
    public void cadastrar(String marca, String modelo,int volume, double preco,double temperaturaMaxima, double temperaturaMinima,double comprimentop1, double largurap1, boolean possuiVidrop1,double comprimentop2, double largurap2, boolean possuiVidrop2){
        super.cadastrar(marca,modelo,volume,preco,comprimentop1,largurap1,possuiVidrop1);
        porta2.setComprimento(comprimentop2);
        porta2.setLargura(largurap2);
        porta2.setPossuiVidro(possuiVidrop2);
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Temperatura máxima: "+getTemperaturaMaxima());
        System.out.println("Temperatura mínima: "+getTemperaturaMinima());
        System.out.println("");
        System.out.println("Porta 2:");
        System.out.println("Comprimento: "+porta2.getComprimento());
        System.out.println("Largura: "+porta2.getLargura());
        System.out.println("Possui Vidro: "+porta2.getPossuiVidro());
        
    }
    public void entradaDados(){
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        String sim1 = "sim";
        String sim2 = "Sim";
        String sim3 = "SIm";
        String sim4 = "SIM";
        String sim5 = "sIM";
        String sim6 = "siM";
        String sim7 = "sIm";
        String sim8 = "S";
        
        System.out.println("");
        System.out.println("Porta 2: ");
        System.out.println("Comprimento: ");
        porta2.setComprimento(Double.parseDouble(sc.nextLine()));
        System.out.println("Largura: ");
        porta2.setLargura(Double.parseDouble(sc.nextLine()));
        System.out.println("Possui Vidro: ");
        String resp = sc.nextLine();
        if(resp.equals(sim1)){
            porta1.setPossuiVidro(true);
            
        }
        else if(resp.equals(sim2)){
            porta1.setPossuiVidro(true);
            
        }
        else if(resp.equals(sim3)){
            porta1.setPossuiVidro(true);
            
        }
        else if(resp.equals(sim4)){
            porta1.setPossuiVidro(true);
            
        }
        else if(resp.equals(sim5)){
            porta1.setPossuiVidro(true);
            
        }
        else if(resp.equals(sim6)){
            porta1.setPossuiVidro(true);
            
        }
        else if(resp.equals(sim7)){
            porta1.setPossuiVidro(true);
            
        }
        else if(resp.equals(sim8)){
            porta1.setPossuiVidro(true);
            
        }
        else{
            porta1.setPossuiVidro(false);
        }
        System.out.println("Temperatura Maxima: ");
        setTemperaturaMaxima(Integer.parseInt(sc.nextLine()));
        System.out.println("Temperatura Minima: ");
        setTemperaturaMinima(Integer.parseInt(sc.nextLine()));
        
    }

public double desconto(){
    double preco = getPreco();
    double desconto;
    desconto = preco-(preco*(15/100));
    return desconto;
}


}
