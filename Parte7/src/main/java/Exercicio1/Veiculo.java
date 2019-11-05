
package Exercicio1;

import java.util.Scanner;

public class Veiculo {
    protected int capacidadeTanque;
    protected int numeroPassageiros;
    protected double preco;
    Motor motor1 = new Motor();
    Motor motor2 = new Motor();

    //MÉTODOS DE ACESSO
    public void setCapacidadeTanque(int capaTanque){
        if(capaTanque>0){
            capacidadeTanque = capaTanque;
        }
    }
    public void setCapacidadeTanque(){
        capacidadeTanque = 0;
    }
    public int getCapacidadeTanque(){
        return capacidadeTanque;
    }
    
    //NÚMERO DE PASSAGEIROS
    
    public void setNumeroPassageiros(int capaPassageiros){
        if(capaPassageiros>0){
            capacidadeTanque = capaPassageiros;
        }
    }
    public void setNumeroPassageiros(){
        numeroPassageiros = 0;
    } 
    public int getNumeroPassageiros(){
        return numeroPassageiros;
    }
    
    //PRECO
    public void setPreco(double prec){
        if(prec>0){
            preco = prec;
        }
    }
    public void setPreco(){
        preco = 0;
    }
    public double getPreco(){
        return preco;
    }
    
    //CADASTRAR
    public void cadastrar(int capaTanque,int numPassageiros,double prec){
        setCapacidadeTanque(capaTanque);
        setNumeroPassageiros(numPassageiros);
        setPreco(prec);
    }

    //IMPRIMIR
    public void imprimir(){
        System.out.println("Capacidade do tanque: "+getCapacidadeTanque());
        System.out.println("Número de passageiros: "+getNumeroPassageiros());
        System.out.println("Preço: "+getPreco());
        System.out.println("Motor 1: ");
        System.out.println("");
        System.out.println("Tipo de combustível: "+motor1.getTipoCombustivel());
        System.out.println("Potencia máxima: "+motor1.getPotenciaMaxima());
        System.out.println("Potencia atual: "+motor1.getPotenciaAtual());
        System.out.println("");
        System.out.println("Motor 2: ");
        System.out.println("");
        System.out.println("Tipo de combustível: "+motor2.getTipoCombustivel());
        System.out.println("Potencia máxima: "+motor2.getPotenciaMaxima());
        System.out.println("Potencia atual: "+motor2.getPotenciaAtual());
        
    }
    
    //ENTRADA DADOS
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a capacidade do tanque: ");
        setCapacidadeTanque(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe o número de passageiros: ");
        setNumeroPassageiros(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe o preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));
        System.out.println("MOTORES");
        System.out.println("");
        System.out.println("Motor 01");
        System.out.println("Informe o tipo de combustível: ");
        motor1.setTipoCombustivel(sc.nextLine());
        System.out.println("Informe a potência máxima: ");
        motor1.setPotenciaMaxima(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a potência atual: ");
        motor1.setPotenciaAtual(Integer.parseInt(sc.nextLine()));
        System.out.println("");
        System.out.println("Motor 02");
        System.out.println("Informe o tipo de combustível: ");
        motor2.setTipoCombustivel(sc.nextLine());
        System.out.println("Informe a potência máxima: ");
        motor2.setPotenciaMaxima(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a potência atual: ");
        motor2.setPotenciaAtual(Integer.parseInt(sc.nextLine()));
        
    }
    
    
    
    //CONSTRUTORES 
    
    //CONSTRUTOR 01
    public Veiculo(){
        
    }
    
    //CONSTRUTOR 02
    public Veiculo(int capaTanque){
        capacidadeTanque = capaTanque;
    }    

    public Veiculo(int capaTanque,int numPassageiros){
        capacidadeTanque = capaTanque;
        numeroPassageiros = numPassageiros;
    }
    
    public Veiculo(double prec){
        preco = prec;
    }
    
    public Veiculo(int capaTanque, int numPassageiros, double prec){
        capacidadeTanque = capaTanque;
        numeroPassageiros = numPassageiros;
        preco = prec;
    }


}
