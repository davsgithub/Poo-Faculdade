
package Parte_8_02;

import java.util.Scanner;

public class Carro {
    private String marca;//ok
    private String modelo;//ok
    private int ano;//ok
    private float cilindradas;//ok
    private boolean automatico;//ok
    private String automaticoStr;//ok
    private String placa;//ok
    private int portas;//ok

    public void setMarca(String marc){
        if(!marc.isEmpty()){
            marca = marc;
        }
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
    public String getModelo(){
        return modelo;
    }
    //ano
    public void setAno(int an){
        if(an>0){
           ano = an; 
        }
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
    public String getAutomatico(){
        return automaticoStr;
    }
    //placa
    public void setPlaca(String plac){
        if(!plac.isEmpty()){
            placa = plac;
        }
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
    public int getPortas(){
        return portas;
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
    

}

