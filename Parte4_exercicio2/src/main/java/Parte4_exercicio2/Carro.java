
package Parte4_exercicio2;

public class Carro {
    String marca;//ok
    String modelo;//ok
    int ano;//ok
    float cilindradas;//ok
    boolean automatico;//ok
    String automaticoStr;//ok
    String placa;//ok
    int portas;//ok

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







}
