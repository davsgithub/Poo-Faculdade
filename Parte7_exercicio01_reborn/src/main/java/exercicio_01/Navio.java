
package exercicio_01;

import java.util.Scanner;

public class Navio extends Veiculo{
    
    private int numeroTripulantes;
    private String dataLancamento;
    private String nome;
    Motor motor1 = new Motor();
    Motor motor2 = new Motor();
    
    public void setNumeroTripulantes(int numeroTripulantes){
        if(numeroTripulantes> 0){
            this.numeroTripulantes = numeroTripulantes;
        }
    }
    public int getNumeroTripulantes(){
        return numeroTripulantes;
    }
    
    public void setDataLancamento(String dataLancamento){
        if(!dataLancamento.isEmpty()){
            this.dataLancamento = dataLancamento;
            
        }
    }
    public String getDataLancamento(){
        return dataLancamento;
    }
    
    public void setNome(String nome){
        if(!nome.isEmpty()){
            this.nome = nome;
        }
    }
    public String getNome(){
        return nome;
    }
    
    public void cadastrar(int numeroPassageiros, int capacidadeTanque, double preco, int numeroTripulantes, String dataLancamento, String nome, String tipoCombustivel01, int potenciaMaxima01, int potenciaAtual01, String tipoCombustivel02, int potenciaMaxima02, int potenciaAtual02){
        super.cadastrar(numeroPassageiros, capacidadeTanque, preco);
        setDataLancamento(dataLancamento);
        setNome(nome);
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
        System.out.println("Informe o número de tripulantes: ");
        setNumeroTripulantes(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a data de lançamento: ");
        setDataLancamento(sc.nextLine());
        System.out.println("Informe o nome: ");
        setNome(sc.nextLine());
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
        System.out.println("Número de tripulantes: "+getNumeroTripulantes());
        System.out.println("Data de lançamento: "+getDataLancamento());
        System.out.println("Nome: "+getNome());
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
    
    public int passageirosPorTripulantes(){
        int proporcao;
        proporcao = numeroPassageiros/numeroTripulantes;
        return proporcao;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
