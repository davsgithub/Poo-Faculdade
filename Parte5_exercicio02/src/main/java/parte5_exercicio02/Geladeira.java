
package parte5_exercicio02;

import java.util.Scanner;

public class Geladeira {
    long capacidade;//ok
    double altura;//ok
    float profundidade;//ok
    int portas;
    byte voltagem;
    char efiEnergetica;//eficiência energética
    String marca;
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
    public void setCapacidade(int capac){
        if(capac>0){
            capacidade = (long)capac;
        }
    }
    public void setCapacidade(){
        capacidade = 0;
    }
    public long getCapacidade(){
        return capacidade;
    }
    public void setAltura(double alt){
        if(alt>0){
            altura = alt;
        }
    }
    public void setAltura(){
        altura = 0;
    }
    public double getAltura(){
        return altura;
    }
    public void setProfundidade(float profund){
        if(profund>0){
            profundidade = (float)profund;
        }
    }
    public void setProfundidade(){
        profundidade = 0;
    }
    public float getProfundidade(){
        return profundidade;
    }
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
    public void setVoltagem(int volts){
        if(volts>0){
            voltagem = (byte)volts;
        }
    }
    public void setVoltagem(){
        voltagem = 0;
    }
    public byte getVoltagem(){
        return voltagem;
    }
    public void setEfiEnergetica(String efi){
       efiEnergetica = efi.charAt(0);
    }
    public void setEfiEnergetica(){
        efiEnergetica = 0;
    }    
    public char getEfiEnergetica(){
        return efiEnergetica;
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
    
    public void imprimirGeladeira(){
        System.out.printf("%n%n------------GELADEIRA--------------%n%n");
        System.out.printf("%nMarca:               %s%n",getMarca());
        System.out.printf("%nCapacidade:          %s%n",getCapacidade());
        System.out.printf("%nAltura:              %.2fcm%n",getAltura());
        System.out.printf("%nProfundidade:        %.2fcm%n",getProfundidade());
        System.out.printf("%nPortas:              %d%n",getPortas());
        System.out.printf("%nVoltagem:            %d%n",getVoltagem());
        System.out.printf("%nEficiência energética: %c%n",getEfiEnergetica());
        System.out.printf("%nCor:                   %s",getCor());


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
    public void CadastrarGeladeira(int capacidade,double altura,float profundidade,int portas,byte voltagem,String efi,String marca,String cor){
        setCapacidade(capacidade);
        setAltura(altura);
        setProfundidade(profundidade);
        setPortas(portas);
        setVoltagem(voltagem);
        setEfiEnergetica(efi);
        setMarca(marca);
        setCor(cor);
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
        System.out.println("Informe a cor da geladeira: ");
        setCor(sc.nextLine());
    }

//CONSTRUTORES
    public Geladeira(){
        
    }
    //CONSTRUTOR 02
    public Geladeira(long capacidade,double altura,float profundidade,int portas,byte voltagem,char efiEnergetica,String marca,String cor){
        this.capacidade = capacidade;
        this.altura  = altura;
        this.profundidade = profundidade;
        this.portas = portas;
        this.voltagem = voltagem;
        this.efiEnergetica = efiEnergetica;
        this.marca = marca;
        this.cor = cor;
    }
    //CONSTRUTOR 03
    public Geladeira(double altura,float profundidade,int portas,byte voltagem,char efiEnergetica,String marca,String cor){
        this.altura  = altura;
        this.profundidade = profundidade;
        this.portas = portas;
        this.voltagem = voltagem;
        this.efiEnergetica = efiEnergetica;
        this.marca = marca;
        this.cor = cor;
    }
    //CONTRUTOR 04
    public Geladeira(float profundidade,int portas,byte voltagem,char efiEnergetica,String marca,String cor){
        this.profundidade = profundidade;
        this.portas = portas;
        this.voltagem = voltagem;
        this.efiEnergetica = efiEnergetica;
        this.marca = marca;
        this.cor = cor;
    }
    //CONTRUTOR 05
    public Geladeira(int portas,byte voltagem,char efiEnergetica,String marca,String cor){
        this.portas = portas;
        this.voltagem = voltagem;
        this.efiEnergetica = efiEnergetica;
        this.marca = marca;
        this.cor = cor; 
    }    
    //CONstrUTOR 06
    public Geladeira(byte voltagem,char efiEnergetica,String marca,String cor){
        this.voltagem = voltagem;
        this.efiEnergetica = efiEnergetica;
        this.marca = marca;
        this.cor = cor;
    }
    //CONTRUTOR 07
    public Geladeira(char efiEnergetica,String marca,String cor){
        this.efiEnergetica = efiEnergetica;
        this.marca = marca;
        this.cor = cor;
    }   
    //CONTRUTOR 08
    public Geladeira(String marca,String cor){
        this.marca = marca;
        this.cor = cor;
    }    
    //CONTRUTOR 09
    public Geladeira(String cor){
        this.cor = cor;
    }
    //CONTRUTOR 10
    public Geladeira(byte voltagem){
        this.voltagem = voltagem;
    }

















}
