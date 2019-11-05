
package exercicio02;

import java.util.Scanner;

public class Eletrodomestico {
    protected String marca;
    protected String modelo;
    protected int volume;
    protected double preco;
    Porta porta1 = new Porta();
    
    public void setMarca(String marca){
        if(!marca.isEmpty()){
            this.marca = marca;
        }
    }
    public void setMarca(){
        marca = "";
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setModelo(String modelo){
        if(!modelo.isEmpty()){
            this.modelo = modelo;
        }
    }
    public void setModelo(){
        modelo = "";
    }
    public String getModelo(){
        return modelo;
    }
    public void setVolume(int volume){
        if(volume>0){
            this.volume = volume;
        }
    }
    public void setVolume(){
        volume = 0;
    }
    public int getVolume(){
        return volume;
    }
    
    public void setPreco(double preco){
        if(preco>0){
            this.preco = preco;
        }
    }
    public void setPreco(){
        preco = 0;
    }
    public double getPreco(){
        return preco;
    }
    
    public void cadastrar(String marca, String modelo,int volume, double preco,double comprimentop1, double largurap1, boolean possuiVidrop1){
        setMarca(marca);
        setModelo(modelo);
        setVolume(volume);
        setPreco(preco);
        porta1.setComprimento(comprimentop1);
        porta1.setLargura(largurap1);
        porta1.setPossuiVidro(possuiVidrop1);
        
        
    }
    public void imprimir(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Volume: "+getVolume());
        System.out.println("Preco: "+getPreco());
        System.out.println("");
        System.out.println("Porta 01: ");
        System.out.println("Comprimento: "+porta1.getComprimento());
        System.out.println("Largura: "+porta1.getLargura());
        System.out.println("Possui Vidro: "+porta1.getPossuiVidro());
        
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        //VARIÁVEIS LOCAIS
        String sim1 = "sim";
        String sim2 = "Sim";
        String sim3 = "SIm";
        String sim4 = "SIM";
        String sim5 = "sIM";
        String sim6 = "siM";
        String sim7 = "sIm";
        String sim8 = "S";
        
        
        
        
        
        System.out.println("Informe a marca: ");
        setMarca(sc.nextLine());
        System.out.println("Informe o modelo: ");
        setModelo(sc.nextLine());
        System.out.println("Informe o volume: ");
        setVolume(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe o preco: ");
        setPreco(Double.parseDouble(sc.nextLine()));
        System.out.println("");
        System.out.println("Porta 01: ");
        System.out.println("Comprimento: ");
        porta1.setComprimento(Double.parseDouble(sc.nextLine()));
        System.out.println("Largura: ");
        porta1.setLargura(Double.parseDouble(sc.nextLine()));
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
        
        //CONSTRUTORES
        
    }
    
    public Eletrodomestico(){
    
    }
    public Eletrodomestico(String marca, String modelo, int volume, double preco){
        this.marca = marca;
        this.modelo = modelo;
        
    }    
    public Eletrodomestico(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    } 
    public Eletrodomestico(String modelo, int volume){
        this.modelo = modelo;
        this.volume = volume;
    }    
    public Eletrodomestico(int volume, double preco){
        this.volume = volume;
        this.preco = preco;
    
    
    }    
    public Eletrodomestico(String marca, String modelo, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }
    public Eletrodomestico(String marca, double preco, String modelo ){
        this.marca = marca;
        this.preco = preco;
        this.modelo = modelo;
    }
    public Eletrodomestico(double preco, String marca, String modelo){
        this.preco = preco;
        this.marca = marca;
        this.modelo = modelo;
    
    
    }
    

    
}
