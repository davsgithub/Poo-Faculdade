
package Exercicio1;

import java.util.Scanner;

public class Navio extends Veiculo {
    private String dataLancamento;
    private String nome;
    private int numeroTripulantes;
    
    public void setDataLancamento(String dtLancamento){
        if(!dtLancamento.isEmpty()){
            dataLancamento = dtLancamento;
        }
    }
    public void setDataLancamento(){
        dataLancamento = "";
    }
    public String getDataLancamento(){
        return dataLancamento;
    }
    public void setNome(String nm){
        if(!nm.isEmpty()){
            nome = nm;
        }
    }
    public void setNome(){
        nome = "";
    }
    public String getNome(){
        return nome;
    }
    public void setNumeroTripulantes(int numTripulantes){
        if(numTripulantes>0){
           numeroTripulantes = numTripulantes; 
        }
    }
    public void setNumeroTripulantes(){
        numeroTripulantes = 0;
    }
    public int getNumeroTripulantes(){
        return numeroTripulantes;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Data de lançamento: "+getDataLancamento());
        System.out.println("Nome: "+getNome());
        System.out.println("Numero de tripulantes: "+getNumeroTripulantes());
        System.out.println("Proporção de passageiros por tripulantes: "+passageirosPorTripulantes());
        
    }
    public void cadastrar(int capaTanque,int numPassageiros,double prec,String dtLancamento,String nm,int numTripulantes){
        super.cadastrar(capacidadeTanque, numeroPassageiros, preco);
        dataLancamento = dtLancamento;
        nome = nm;
        numeroTripulantes = numTripulantes;
    }
    
    @Override
    public void entradaDados(){
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a data de Lancamento: ");
        setDataLancamento(sc.nextLine());
        System.out.println("Informe o nome: ");
        setNome(sc.nextLine());
        System.out.println("Informe o número de tripulantes: ");
        setNumeroTripulantes(Integer.parseInt(sc.nextLine()));
    }
    
    public int passageirosPorTripulantes(){
        int pass = getNumeroPassageiros();
        int trip = getNumeroTripulantes();
        int proporcao = (pass/trip);
        return proporcao;
    }
    
    
    
    
    
    
    
    
    public Navio (){
        
    }
    public Navio(String nm,String dtLancamento, int numTripulantes){
        nome = nm;
        dataLancamento = dtLancamento;
        numeroTripulantes = numTripulantes;
        
    }
    public Navio(String nm,String dtLancamento, int numTripulantes,int capaTanque, int numPassageiros, double prec){
        nome = nm;
        dataLancamento = dtLancamento;
        numeroTripulantes = numTripulantes;
        capacidadeTanque = capaTanque;
        numeroPassageiros = numPassageiros;
        preco = prec;
    }
    public Navio(int numTripulantes,int capaTanque, int numPassageiros, double prec){
        numeroTripulantes = numTripulantes;
        capacidadeTanque = capaTanque;
        numeroPassageiros = numPassageiros;
        preco = prec;
    }
    
    public Navio(String nm,String dtLancamento,double prec){
        nome = nm;
        dataLancamento = dtLancamento;
        preco = prec;
    }
    
    
    
}
