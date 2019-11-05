package parte_6;


public class Navio extends Veiculo {
        int numeroTripulantes;
        String dataLancamento;
        String nome;
//SETTERS & GETTERS
public void setNumeroTripulantes(int n){
    if(n>0){
        numeroTripulantes = 0;
    }    
}
public void setNumeroTripulantes(){
    numeroTripulantes = 0;
}
public int getNumeroTripulantes(){
    return numeroTripulantes;
}
public void setDataLancamento(String data){
    if(!data.isEmpty()){
        dataLancamento = data;
    }
}
public void setDatalancamento(){
    dataLancamento = "";
}
public String getDataLancamento(){
    return dataLancamento;
}

//NOME
public void setNome(String no){
    if(!no.isEmpty()){
        nome = no; 
    }
}
public void setNome(){
    nome = "";
}
public String getNome(){
    return nome;
}    
//MÉOTODOS

//CADASTRAR
public void cadastrar(int numPassageiros,double capaTanque,double prec,String no,String datalanc,int tripu){
    super.cadastrar(numPassageiros, capaTanque, prec);
    setNome(no);
    setDataLancamento(datalanc);
    setNumeroTripulantes(tripu);
}
//IMPRIMIR
        @Override
public void imprimir(){
    super.imprimir(); 
    System.out.println("Número de tirpulantes: "+getNumeroTripulantes());
    System.out.println("Data de lancamento: "+getDataLancamento());
    System.out.println("Nome: "+getNome());
}

}
