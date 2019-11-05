
package parte_6;

import java.util.Scanner;

public class Aviao extends Veiculo{
    String prefixo,dataRevisao;
    
    //MÉTODOS DE ACESSO
    public void setPrefixo(String pref){
        if(!pref.isEmpty()){
            prefixo = pref;
        }
    }
    
    public void setPrefixo(){
        prefixo = "";
    }
    public String getPrefixo(){
        return prefixo;
    }    
    public void setDataRevisao(String data){
        if(!data.isEmpty()){
            dataRevisao = data;
        }
    }
    public void setDataRevisao(){
        dataRevisao = "";
    }    
    public String getDataRevisao(){
        return dataRevisao;
    }
    
    //MÉTODOS
    
    //IMPRIMIR
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Prefixo: "+getPrefixo());
        System.out.println("Data da revisão: "+getDataRevisao());
        
    }    
    
    //CADASTRAR
    public void cadastrar(String pref,int numPassageiros,double capaTanque,double prec,String dRevisao){
        super.cadastrar(numPassageiros, capaTanque, prec);
        setPrefixo(pref);
        setDataRevisao(dRevisao);
    }    
    
    //ENTRADA DADOS
    @Override
    public void entradaDados(){
       super.entradaDados();
       Scanner sc = new Scanner(System.in); 
       System.out.println("Informe o prefixo da Aeronave: ");
       setPrefixo(sc.nextLine());
       System.out.println("Informe a data da revisão: ");
       setDataRevisao(sc.nextLine());
    }
    
    
}


