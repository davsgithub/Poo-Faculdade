
package parte5_exercicio02;

import java.util.Scanner;

public class Carro {
    String marca;//ok
    String modelo;//ok
    int ano;//ok
    float cilindradas;//ok
    boolean automatico;//ok
    String automaticoStr;//ok
    String placa;//ok
    int portas;//ok
    String cor;

    public void setMarca(String marc){
        if(!marc.isEmpty()){
            marca = marc;
        }
    }
    public void setMarca(){
        marca = "";
    }
    
    public String getMarca(){
        return marca;
    }
    //modelo
    public void setModelo(String mod){
        if(!mod.isEmpty()){
            modelo = mod;
        }
    }
    public void setModelo(){
        modelo = "";
    }
    
    
    public String getModelo(){
        return modelo;
    }
    //ano
    public void setAno(int an){
        if(an>0){
           ano = an; 
        }
    }
    public void setAno(){
        ano = 0;
    }    
    public int getAno(){
        return ano;
    }
    //cilindradas
    public void setCilindradas(float cilindri){
        if(cilindradas>0){
            cilindradas = (float)cilindri/1000;
        }
    }
    public void setCilindradas(){
        cilindradas = 0;
    }    
    public float getCilindradas(){
        return cilindradas;
    }    
    //automático
    public void setAutomatico(int n){
        if(n==1){
            automatico = true;
            if(automatico==true){
                automaticoStr = "Sim";
            }
        }
        else{
            automatico = false;
            if(automatico==false){
                automaticoStr = "Não";
            }
        }
    }
    public void setAutomatico(){
        automaticoStr = "";
    }
    public String getAutomatico(){
        return automaticoStr;
    }
    //placa
    public void setPlaca(String plac){
        if(!plac.isEmpty()){
            placa = plac;
        }
    }
    public void setPlaca(){
        placa = "";
    }
    public String getPlaca(){
        return placa;
    }
    //portas
    public void setPortas(int port){
        if(port>0){
            portas = port;
        }
    }
    public void setPortas(){
        portas = 0;
    }
    public int getPortas(){
        return portas;
    }
     public void setCor(String c)
    {
        if(!c.isEmpty()){
            cor = c;
        }
    }  
    public String getCor(){
        return cor;
    }
    public void setCor(){
        cor = "";
    }
    
    
    
    
    
    
    
    
    public void imprimirCarro(){
        System.out.printf("%n-----------CARRO---------------%n");
        System.out.printf("%nMarca:       %s%n",getMarca());
        System.out.printf("%nModelo:      %s%n",getModelo());
        System.out.printf("%nAno:         %d%n",getAno());
        System.out.printf("%nCilindradas: %.2f %n",getCilindradas());
        System.out.printf("%nAutomático:  %s%n",getAutomatico());
        System.out.printf("%nPlaca:       %s%n",getPlaca());
        System.out.printf("%nPortas:      %d%n",getPortas());
        System.out.printf("%nCor:         %s%n",getCor());
    }
    public void entradaDadosCarro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a marca do carro: ");
        setMarca(sc.nextLine());
        System.out.println("Informe o modelo do carro: ");
        setModelo(sc.nextLine());
        System.out.println("Informe o ano do carro: ");
        setAno(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe quantas cilindradas o carro tem: ");
        setCilindradas(Float.parseFloat(sc.nextLine()));
        System.out.println("Informe se o carro é automático: ");
        setAutomatico(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a placa do carro: ");
        setPlaca(sc.nextLine());
        System.out.println("Informe quantas portas esse carro tem: ");
        setPortas(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a cor desse carro: ");
        setCor(sc.nextLine());
        
        
        
        
        
        
    }
    public void cadastrarCarro(String marca,String modelo,int ano,float cilindradas,int n,String placa,int portas){
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setCilindradas(cilindradas);
        setAutomatico(n);
        setPlaca(placa);
        setPortas(portas);
        
        
        
        
        
    }
    public void cadastrarCarro(String marca,String modelo,int ano,float cilindradas,int n,String placa,int portas,String cor){
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setCilindradas(cilindradas);
        setAutomatico(n);
        setPlaca(placa);
        setPortas(portas);
        setCor(cor);
    }
    
    //CONSTRUTORES
    
    //CONSTRUTOR 01
    public Carro(){
        
    }
    //CONSTRUTOR 02
    public Carro(String ma,String mod,String plac){
        marca = ma;
        modelo = mod;
        placa = plac;
        
    }
    //CONTRUTOR 03
    public Carro(String ma,String mod,int an,float cilind,String plac,int port,String co){
        marca = ma;
        modelo = mod;
        ano = an;
        placa = plac;
        portas = port;
        cor = co;
    }
    //CONSTRUTOR 04
    public Carro(String plac,String co,int an,String mod){
        placa = plac;
        cor = co;
        ano = an;
        modelo = mod;
    }
    //CONSTRUTOR 05
    public Carro(int an,String mod,String ma,float cilind,String plac,int port,String co){
        marca = ma;
        modelo = mod;
        ano = an;
        placa = plac;
        portas = port;
        cor = co;
    }
    public Carro(String mod,String marc,float cilind,String co){
        modelo = mod;
        marca = marc;
        cor = co;
        cilindradas = cilind;
    }
    public Carro(float cilind,String plac,int an){
        cilindradas = cilind;
        placa = plac;
        ano = an;
    }
    public Carro(String ma,int an,int port){
        marca = ma;
        ano = an;
        portas = port;
    }
    public Carro(String ma,String mod,int an,String plac,int port,float cilind){
        marca = ma;
        modelo = mod;
        ano = an;
        placa = plac;
        portas = port;
        cilindradas =cilind;
    }
    public Carro(String plac){
        placa  = plac;
        
    }






}
