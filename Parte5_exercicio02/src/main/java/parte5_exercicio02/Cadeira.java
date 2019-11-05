
package parte5_exercicio02;

import java.util.Scanner;

public class Cadeira {
    byte quantidadePes;//ok
    boolean acolchoada;//ok
    String acolchoamento;//ok
    double peso;//ok
    String material;//ok
    String modelo;//ok
    String cor;
    //MÉTODOS DE ACESSO
    
    
    //material
    public void setMaterial(String mat){
        if(!mat.isEmpty()){
            material = mat;
        }    
    }
    public void setMaterial(){
        material = "";
    }
    public String getMaterial(){    
        return material;
    }    
    public void setModelo(String mod){
        if(!mod.isEmpty()){
            modelo = mod;
        }    
    }
    public void setModelo(){
        modelo = "";
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
    public void setPes(){
        quantidadePes = 0;
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
    public void setAcolchoamento(){
        acolchoamento = "";
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
    public void setPeso(){
        peso = 0;
    }
    public double getPeso(){
        return peso;
    }
    //COR
    public void setCor(String c){
        if(!c.isEmpty()){
            cor = c;
        }
    }
    public String getCor(){
        return cor;
    }
    //LIMPAR COR
    public void setCor(){
        cor = "";
    }
    public void imprimirCadeira(){
        System.out.printf("%n----------CADEIRA----------------%n");
        System.out.printf("%nMaterial:                     %s%n",getMaterial());
        System.out.printf("%nModelo:                       %s%n",getModelo());
        System.out.printf("%nAcolchoamento:                %s%n",getAcolchoamento());
        System.out.printf("%nPeso                          %.2f%n",getPeso());
        System.out.printf("%nQuantidade de pés:            %s%n",getPes());
        System.out.printf("%nCor:                          %s%n",getCor());
    }
    public void CadastrarCadeira(byte quantidadePes,int acolchoamento,double peso,String material,String modelo,String cor){
        setMaterial(material);
        setModelo(modelo);
        setPes(quantidadePes);
        setAcolchoamento(acolchoamento);
        setPeso(peso);
        setCor(cor);
    }
    public void CadastraCadeira(byte quantidadePes,int acolchoamento,double peso,String material,String modelo){
        setMaterial(material);
        setModelo(modelo);
        setPes(quantidadePes);
        setAcolchoamento(acolchoamento);
        setPeso(peso);
    }
    public void entradaDadosCadeira(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Informe o material da cadeira: ");
        setMaterial(sc.nextLine());
        System.out.println("Informe o modelo da cadeira: ");
        setModelo(sc.nextLine());
        System.out.println("Informe se a cadeira tem acolchoamento: ");
        System.out.println("1-Sim       0-Não");
        setAcolchoamento(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe o peso da cadeira: ");
        setPeso(Double.parseDouble(sc.nextLine()));
        System.out.println("Informe quantos pés a cadeira tem: ");
        setPes(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a cor da cadeira: ");
        setCor(sc.nextLine());
        
    }
    
    //CONSTRUTORES
    public Cadeira(){
        
    }
    //CONSTRUTOR 02
    public Cadeira(byte pes,String acolcho,String c){
        quantidadePes = pes;
        acolchoamento = acolcho;
        cor = c;
    }
    //CONSTRUTOR 03
    public Cadeira(byte pes,String acolcho,String c,String mat){
        quantidadePes = pes;
        acolchoamento = acolcho;
        cor = c;
        material = mat;
    }
    //CONSTRUTOR 04
    public Cadeira(byte pes,String acolcho,String c,String mat,String mod){
        quantidadePes = pes;
        acolchoamento = acolcho;
        cor = c;
        material = mat;
        modelo = mod;
    }
    //CONSTRUTOR 05
    public Cadeira(String acolcho,String mat,String mod){
        acolchoamento = acolcho;
        material = mat;
        modelo = mod;
    }
    //CONSTRUTOR 06
    public Cadeira(byte qtdpes, String acolcho,String mat, String mod,double pes,String c){
        quantidadePes = qtdpes;
        acolchoamento = acolcho;
        peso = pes;
        material = mat;
        modelo = mod;
        cor = c;
    }
    //CONSTRUTOR 07
    public Cadeira(String acolcho,String mod,double pes){
        acolchoamento = acolcho;
        modelo = mod;
        peso = pes;
    }
    //CONSTRUTOR 08
    public Cadeira(String mat,String c,String mod,double pes,String acolcho){
        acolchoamento = acolcho;
        peso = pes;
        material = mat;
        cor = c;
        modelo = mod;
        
    }
    //CONSTRUTOR 09
    public Cadeira(String mat,String mod,double pes,String acolcho,String c){
        acolchoamento = acolcho;
        peso = pes;
        material = mat;
        modelo = mod;
        cor = c;
    }
    //CONSTRUTOR 10
    public Cadeira(double pes,String acolcho,String mat, String mod,String c){
        peso = pes;
        acolchoamento = acolcho;
        material = mat;
        modelo = mod;
        cor = c;
    }

}