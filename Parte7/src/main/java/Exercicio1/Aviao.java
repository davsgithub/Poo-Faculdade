
package Exercicio1;
import java.util.Scanner;
public class Aviao extends Veiculo {
    private String prefixo;
    private String dataRevisao;
    
    //MÉTODOS DE ACESSO
    
    //PREFIXO
    public void setPrefixo(String prefix){
        if(!prefix.isEmpty()){
            prefixo = prefix;   
        }
    }    
    public void setPrefixo(){
        prefixo = "";
    }
    public String getPrefixo(){
        return prefixo;
    }    
    
    //DATA REVISÃO
    
    public void setDataRevisao(String dataRev){
        if(!dataRev.isEmpty()){
            dataRevisao = dataRev;
        }
    }
    public void setDataRevisao(){
        dataRevisao = "";
    }
    public String getDataRevisao(){
        return dataRevisao;
    }
    
    public void cadastrar(int capaTanque,int numPassageiros,double prec,String prefix,String dtRevisao){
        super.cadastrar(capaTanque, numPassageiros, prec);
        prefixo = prefix;
        dataRevisao = dtRevisao;
    }

    @Override
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Informe o prefixo da aeronave: ");
        setPrefixo(sc.nextLine());
        System.out.println("Informe a data de revisão: ");
        setDataRevisao(sc.nextLine());
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Prefixo: "+getPrefixo());
        System.out.println("Data de revisão: "+getDataRevisao());
    }    
    
    //CONSTRUTORES
    public Aviao(){
        
    }
    public Aviao(String prefix){
        prefixo = prefix;
    }
    public Aviao(String prefix, String dtRevisao){
        prefixo = prefix;
        dataRevisao = dtRevisao;
    }
    public Aviao(int capaTanque, int numPassageiros, double prec,String prefix, String dtRevisao){
        capacidadeTanque = capaTanque;
        numeroPassageiros = numPassageiros;
        preco = prec;
        prefixo = prefix;
        dataRevisao = dtRevisao;
    }
    public Aviao(int numPassageiros, double prec,String prefix, String dtRevisao){
        numeroPassageiros = numPassageiros;
        preco = prec;
        prefixo = prefix;
        dataRevisao = dtRevisao;
    }
    



}
