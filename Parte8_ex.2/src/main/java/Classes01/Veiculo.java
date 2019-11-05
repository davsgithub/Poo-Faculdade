
package Classes01;

import java.util.Scanner;


public class Veiculo {
    protected int capacidadeTanque;
    protected int numeroPassageiros;
    protected double preco;
    
    //MÉTODOS DE ACESSO
    
    //CAPACIDADE TANQUE
    
    public void setCapacidadeTanque(int capacidade){
        if(capacidade>0){
            capacidadeTanque = capacidade;
        }
    }
    public int getCapacidadeTanque(){
        return capacidadeTanque;
    }
    
    //NUMERO DE PASSAGEIROS
    
    public void setNumeroPassageiros(int numero){
        if(numero>0){
            numeroPassageiros = numero;
        }
    }
    public int getNumeroPassageiros(){
        return numeroPassageiros;
    }
    
    //PRECO
    
    public void setPreco(double preco){
        if(preco>0){
            this.preco = preco;
        }
    }
    public double getPreco(){
        return preco;
    }
    
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número de passageiros: ");
        setNumeroPassageiros(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a capacidade do tanque: ");
        setCapacidadeTanque(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe o preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));
    }
    public void imprimir(){
        System.out.println("Numero de passageiros: "+getNumeroPassageiros());
        System.out.println("Capacidade do tanque: "+getCapacidadeTanque());
        System.out.println("Preco: "+getPreco());
        
    }
    public void cadastrar(int numeroPassageiros, int capacidadeTanque, double preco){
        setNumeroPassageiros(numeroPassageiros);
        setCapacidadeTanque(capacidadeTanque);
        setPreco(preco);
    }
    
    //MÉTODOS CONSTRUTORES
    
    public Veiculo(){
        
    }
    
    //CONSTRUTOR 02
    
    public Veiculo(int numeroPassageiros,int capacidadeTanque,double preco){
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.preco = preco;
    }
    
    //CONSTRUTOR 03
    
    public Veiculo(int numeroPassageiros, int capacidadeTanque){
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeTanque = capacidadeTanque;
    }
    
    //CONSTRUTOR 04
    
    public Veiculo(double preco){
        this.preco = preco;
    }
    
    //CONTRUTOR 05
    
    public Veiculo(int numeroPassageiros, double preco){
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }
    
    
    
    
    
    
    
    
    
}
