/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenDrive;

/**
 *
 * @author Cakeb
 */
public class Pendrive {
    String marca;
    String modelo;
    int capacidade;
    double comprimento;
    double largura;
    double profundidade;
    double peso;
    double preco;
//MÃ‰TODOS DE ACESSO
    
    //MARCA
    public void setMarca(String marc){
        if(!marc.isEmpty()){
            marca = marc;
        }
    }
    public String getMarca(){
        return marca;
    }
    //MODELO
    public void setModelo(String model){
        if(!model.isEmpty()){
           modelo = model; 
        }
    }
    public String getModelo(){
        return modelo;
    }
    //CAPACIDADE
    public void setCapacidade(int capaci){
        if (capaci>0){
            capacidade = capaci;
        }
            
    }
    public int getCapacidade(){
        return capacidade;
    }
    //COMPRIMENTO
    public void setComprimento(double compri){
        if(compri>0){
            comprimento = compri;
        }
    }
    public double getComprimento(){
        return comprimento;
    }
    //LARGURA
    public void setLargura(double larg){
        if(larg>0){
            largura = larg;
        }
    }
    public double getLargura(){
        return largura;
    }
    //PROFUNDIDADE
    public void setProfundidade(double profundi){
        if(profundi>0){
            profundidade = profundi;
        }
    }
    public double getProfundidade(){
        return profundidade;
    }
    //PESO
    public void setPeso (double pes){
        if(pes>0){
            peso = pes;
        }
    }
    public double getPeso(){
        return peso;
    }  
    //PRECO
    public void setPreco(double prec){
        if(prec>0){
            preco = prec;
        }
    }
    public double getPreco(){
        return preco;
    }
    //MÃ‰TODO IMPRIMIR
    public void imprimir(){
        System.out.printf("%nMarca:        %s%n",getMarca());
        System.out.printf("%nModelo:       %s%n",getModelo());
        System.out.printf("%nCapacidade:   %s%n",getCapacidade());
        System.out.printf("%nComprimento:  %s%n",getComprimento());
        System.out.printf("%nLargura:      %s%n",getLargura());
        System.out.printf("%nProfundidade: %s%n",getProfundidade());
        System.out.printf("%nPeso:         %s%n", getPeso());
        System.out.printf("%nPreÃ§o:        %s%n", getPreco());
    }

}
