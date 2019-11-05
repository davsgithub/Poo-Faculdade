
package Parte4_exercicio2;

public class Cadeira {
    byte quantidadePes;//ok
    boolean acolchoada;//ok
    String acolchoamento;//ok
    double peso;//ok
    String material;//ok
    String modelo;//ok
    //MÉTODOS DE ACESSO
    
    
    //material
    public void setMaterial(String mat){
        if(!mat.isEmpty()){
            material = mat;
        }    
    }    
    public String getMaterial(){    
        return material;
    }    
    public void setModelo(String mod){
        if(!mod.isEmpty()){
            modelo = mod;
        }    
    }    
    public String getModelo(){    
        return modelo;
    }    


    //QUANTIDADE DE PÉS
    public void setPes(int pes){
        if(pes>0){
            quantidadePes = (byte)pes;
        }
    }
    public byte getPes(){
        return quantidadePes;
    }
    //ACOLCHOAMENTO
    public void setAcolchoamento(int n){
        if(n==1){
            acolchoada = true;
            if(acolchoada == true){
                acolchoamento = "Sim";
            }
        }
        else{
            acolchoada = false;
            if(acolchoada==false){
                acolchoamento = "Não";
            }
        }
    }
    public String getAcolchoamento(){
        return acolchoamento;
    }
    //peso
    public void setPeso(double pes){
        if(peso>0){
            peso = pes;
        }
            
    }
    public double getPeso(){
        return peso;
    }
    public void imprimirCadeira(){
        System.out.printf("%n----------CADEIRA----------------%n");
        System.out.printf("%nMaterial:                     %s%n",getMaterial());
        System.out.printf("%nModelo:                       %s%n",getModelo());
        System.out.printf("%nAcolchoamento:                %s%n",getAcolchoamento());
        System.out.printf("%nPeso                          %.2f%n",getPeso());
        System.out.printf("%nQuantidade de pés:            %s%n",getPes());
        
    }




}
