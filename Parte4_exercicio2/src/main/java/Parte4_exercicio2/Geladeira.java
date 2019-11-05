
package Parte4_exercicio2;


public class Geladeira {
    long capacidade;//ok
    double altura;//ok
    float profundidade;//ok
    int portas;
    byte voltagem;
    char efiEnergetica;//eficiência energética
    String marca;
    
    public void setMarca(String marc){
        if(!marc.isEmpty()){
            marca = marc;
        }
    }
    public String getMarca(){
        return marca;
    }
    public void setCapacidade(int capac){
        if(capac>0){
            capacidade = (long)capac;
        }
    }
    public long getCapacidade(){
        return capacidade;
    }
    public void setAltura(double alt){
        if(alt>0){
            altura = alt;
        }
    }
    public double getAltura(){
        return altura;
    }
    public void setProfundidade(float profund){
        if(profund>0){
            profundidade = (float)profund;
        }
    }
    public float getProfundidade(){
        return profundidade;
    }
    public void setPortas(int port){
        if(port>0){
            portas = port;
        }
    }
    public int getPortas(){
        return portas;
    }
    public void setVoltagem(int volts){
        if(volts>0){
            voltagem = (byte)volts;
        }
    }
    public byte getVoltagem(){
        return voltagem;
    }
    public void setEfiEnergetica(String efi){
       efiEnergetica = efi.charAt(0);
    }
    public char getEfiEnergetica(){
        return efiEnergetica;
    }
    
    
    public void imprimirGeladeira(){
        System.out.printf("%n%n------------GELADEIRA--------------%n%n");
        System.out.printf("%nMarca:               %s%n",getMarca());
        System.out.printf("%nCapacidade:          %s%n",getCapacidade());
        System.out.printf("%nAltura:              %.2fcm%n",getAltura());
        System.out.printf("%nProfundidade:        %.2fcm%n",getProfundidade());
        System.out.printf("%nPortas:              %d%n",getPortas());
        System.out.printf("%nVoltagem:            %d%n",getVoltagem());
        System.out.printf("%nEficiência energética: %c%n",getEfiEnergetica());



    }

   
}