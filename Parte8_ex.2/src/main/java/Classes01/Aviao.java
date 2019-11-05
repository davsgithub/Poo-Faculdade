
package Classes01;

import java.util.Scanner;

public class Aviao extends Veiculo {
    private String prefixo;
    private String dataRevisao;
    Motor motor1 = new Motor();
    Motor motor2 = new Motor();
    
    //MÉTODOS DE ACESSO
    
    public void setPrefixo(String prefixo){
        this.prefixo = prefixo;
    }
    public void setPrefixo(){
        prefixo = "";
    }
    public String getPrefixo(){
        return prefixo;
    }

    //data de revisão
    
    public void setDataRevisao(String dataRevisao){
        this.dataRevisao = dataRevisao;
    }
    public void setDataRevisao(){
        dataRevisao = "";
    }
    public String getDataRevisao(){
        return dataRevisao;
    }
    
    
    public void cadastrar(int numeroPassageiros, int capacidadeTanque, double preco, String prefixo, String dataRevisao, String tipoCombustivel01, int potenciaMaxima01, int potenciaAtual01, String tipoCombustivel02, int potenciaMaxima02, int potenciaAtual02){
        super.cadastrar(numeroPassageiros, capacidadeTanque, preco);
        setPrefixo(prefixo);
        setDataRevisao(dataRevisao);
        motor1.setTipoCombustivel(tipoCombustivel01);
        motor1.setPotenciaMaxima(potenciaMaxima01);
        motor1.setPotenciaAtual(potenciaAtual01);
        motor2.setTipoCombustivel(tipoCombustivel02);
        motor2.setPotenciaMaxima(potenciaMaxima02);
        motor2.setPotenciaAtual(potenciaAtual02);
        
        
    }
    
    @Override
    public void entradaDados(){
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o prefixo da aeronave: ");
        setPrefixo(sc.nextLine());
        System.out.println("Informe a data da revisão: ");
        setDataRevisao(sc.nextLine());
        System.out.println("");
        System.out.println("Motor 01: ");
        System.out.println("Tipo de combustivel: ");
        motor1.setTipoCombustivel(sc.nextLine());
        System.out.println("Potência máxima: ");
        motor1.setPotenciaMaxima(Integer.parseInt(sc.nextLine()));
        System.out.println("Potência Atual: ");
        motor1.setPotenciaAtual(Integer.parseInt(sc.nextLine()));
        System.out.println("");
        System.out.println("Motor 02: ");
        System.out.println("Tipo de combustivel: ");
        motor2.setTipoCombustivel(sc.nextLine());
        System.out.println("Potência máxima: ");
        motor2.setPotenciaMaxima(Integer.parseInt(sc.nextLine()));
        System.out.println("Potência Atual: ");
        motor2.setPotenciaAtual(Integer.parseInt(sc.nextLine()));
        
        
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Prefixo: "+getPrefixo());
        System.out.println("Data Revisão: "+getDataRevisao());
        System.out.println("");
        System.out.println("Motor 01: ");
        System.out.println("Tipo de combutivel: "+motor1.getTipoCombustivel());
        System.out.println("Potência máxima: "+motor1.getPotenciaMaxima());
        System.out.println("Potência atual: "+motor1.getPotenciaAtual());
        System.out.println("");
        System.out.println("Motor 02: ");
        System.out.println("Tipo de combutivel: "+motor2.getTipoCombustivel());
        System.out.println("Potência máxima: "+motor2.getPotenciaMaxima());
        System.out.println("Potência atual: "+motor2.getPotenciaAtual());
        
    }
    
    public double reajustarPreco(double percentual){
        double preco = getPreco();
        double reajuste;
        reajuste = preco - (preco*(percentual/100));
        
        
        
        return reajuste;
    }
    //MÉTODOS CONSTRUTORES
    
    public Aviao(){
        
    }
    
    //CONSTRUTOR 02
    
    public Aviao(String prefixo,String dataRevisao,int numeroPassageiros,int capacidadeTanque,double preco,String tipocombustivel01, int potenciaMaxima01, int potenciaAtual01,String tipocombustivel02, int potenciaMaxima02, int potenciaAtual02){
        
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.preco = preco;
        motor1.setTipoCombustivel(tipocombustivel01);
        motor1.setPotenciaMaxima(potenciaMaxima01);
        motor1.setPotenciaAtual(potenciaAtual01);
        motor2.setTipoCombustivel(tipocombustivel02);
        motor2.setPotenciaMaxima(potenciaMaxima02);
        motor2.setPotenciaAtual(potenciaAtual02);
    
    
    
    }
    
    //CONSTRUTOR 03
    
    public Aviao(int numeroPassageiros, int capacidadeTanque,String tipocombustivel01, int potenciaMaxima01, int potenciaAtual01,String tipocombustivel02, int potenciaMaxima02, int potenciaAtual02){
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeTanque = capacidadeTanque;
        motor1.setTipoCombustivel(tipocombustivel01);
        motor1.setPotenciaMaxima(potenciaMaxima01);
        motor1.setPotenciaAtual(potenciaAtual01);
        motor2.setTipoCombustivel(tipocombustivel02);
        motor2.setPotenciaMaxima(potenciaMaxima02);
        motor2.setPotenciaAtual(potenciaAtual02);
        
    }
    
    //CONSTRUTOR 04
    
    public Aviao(double preco,String tipocombustivel01, int potenciaMaxima01, int potenciaAtual01,String tipocombustivel02, int potenciaMaxima02, int potenciaAtual02){
        this.preco = preco;
        motor1.setTipoCombustivel(tipocombustivel01);
        motor1.setPotenciaMaxima(potenciaMaxima01);
        motor1.setPotenciaAtual(potenciaAtual01);
        motor2.setTipoCombustivel(tipocombustivel02);
        motor2.setPotenciaMaxima(potenciaMaxima02);
        motor2.setPotenciaAtual(potenciaAtual02);
        
    }
    
    //CONTRUTOR 05
    
    public Aviao(int numeroPassageiros, double preco,String tipocombustivel01, int potenciaMaxima01, int potenciaAtual01,String tipocombustivel02, int potenciaMaxima02, int potenciaAtual02){
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
        motor1.setTipoCombustivel(tipocombustivel01);
        motor1.setPotenciaMaxima(potenciaMaxima01);
        motor1.setPotenciaAtual(potenciaAtual01);
        motor2.setTipoCombustivel(tipocombustivel02);
        motor2.setPotenciaMaxima(potenciaMaxima02);
        motor2.setPotenciaAtual(potenciaAtual02);
    
    
    
    
    }
    
    
    















}
