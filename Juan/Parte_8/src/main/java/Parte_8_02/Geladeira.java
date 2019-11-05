
package Parte_8_02;

import java.util.Scanner;

public class Geladeira {
    private long capacidade;//ok
    private double altura;//ok
    private float profundidade;//ok
    private int portas;
    private byte voltagem;
    private char efiEnergetica;//eficiência energética
    private String marca;
    
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
    public void CadastrarGeladeira(int capacidade,double altura,float profundidade,int portas,byte voltagem,String efi,String marca){
        setCapacidade(capacidade);
        setAltura(altura);
        setProfundidade(profundidade);
        setPortas(portas);
        setVoltagem(voltagem);
        setEfiEnergetica(efi);
        setMarca(marca);
        
    }
    public void entradaDadosGeladeira(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Informe a marca da geladeira: ");
        setMarca(sc.nextLine());
        System.out.println("Informe a capacidade da geladeira: ");
        setCapacidade(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a altura da geladeira: ");
        setAltura(Double.parseDouble(sc.nextLine()));
        System.out.println("Informe a profundidade da geladeira: ");
        setProfundidade(Float.parseFloat(sc.nextLine()));
        System.out.println("Informe o número de portas dessa geladeira: ");
        setPortas(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a Voltagem dessa geladeira: ");
        setVoltagem(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a eficiência energética dessa geladeira: ");
        setEfiEnergetica(sc.nextLine());
        
    }
}
