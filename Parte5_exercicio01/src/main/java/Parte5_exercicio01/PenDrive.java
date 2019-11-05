
package Parte5_exercicio01;

import java.util.Scanner;

public class PenDrive {
    String marca,modelo,unidade;
    int capacidade;
    double comprimento, largura, profundidade, peso, preco;
    
    //MÉTODOS DE ACESSO
    
    //MARCA
    public void setMarca(String marc){
        if(!marc.isEmpty()){
            marca = marc;
        }
    }
    public String getMarca(){
        return marca;
    }
    //LIMPAR MARCA
    public void setMarca(){
        marca = "";
    }
    
    //MODELO
    public void setModelo(String mod){
        if(!mod.isEmpty()){
            modelo = mod;
        }
    }
    public String getModelo(){
        return modelo;
    }
    
    //LIMPAR MODELO
    public void setModelo(){
        modelo = "";
    }
    
    //CAPACIDADE
    public void setCapacidade(int capac){
        if(capac>0){
            capacidade = capac;
        }
    }
    public int getCapacidade(){
        return capacidade;
    }
    
    //LIMPAR CAPACIDADE
    public void setCapacidade(){
        capacidade = 0;
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
    
    //LIMPAR COMPRIMENTO
    public void setCompriemnto(){
        comprimento = 0;
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
    //LIMPAR LARGURA
    public void setLargura(){
        largura = 0;
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
    //LIMPAR PROFUNDIDADE
    public void setProfundidade(){
        profundidade = 0;
    }
    //PESO
    public void setPeso(double pes){
        if(pes>0){
            peso = pes;
        }
    }
    public double getPeso(){
        return peso;
    }
    //LIMPAR PESO
    public void setPeso(){
        peso = 0;
    }
    //PREÇO
    public void setPreco(double prec){
        if(prec>0){
            preco = prec;
        }
    }
    public double getPreco(){
        return preco;
        
    }
    //LIMPAR PREÇO
    public void setPreco(){
        preco = 0;
    }
    
    //UNIDADE
    public void setUnidade(String uni){
        if(!uni.isEmpty()){
            unidade = uni;
        }
    }
    public String getUnidade(){
        return unidade;
    }
    //LIMPAR UNIDADE
    public void setUnidade(){
        unidade = "";
    }

    //CADASTRAR SEM UNIDADE
    public void cadastrar(String marca, String modelo, int capacidade, double comprimento, double largura, double profundidade, double peso, double preco){
        setMarca(marca);
        setModelo(modelo);
        setCapacidade(capacidade);
        setComprimento(comprimento);
        setLargura(largura);
        setProfundidade(profundidade);
        setPeso(peso);
        setPreco(preco);
                
    }
    //CADASTRAR COM UNIDADE
    public void cadastrar(String marca, String modelo, int capacidade, double comprimento, double largura, double profundidade, double peso, double preco,String unidade){
        setMarca(marca);
        setModelo(modelo);
        setCapacidade(capacidade);
        setComprimento(comprimento);
        setLargura(largura);
        setProfundidade(profundidade);
        setPeso(peso);
        setPreco(preco);
        setUnidade(unidade);
                
    }

    //IMPRIMIR
    public void imprimir(){
        System.out.printf("%nMarca:        %s",getMarca());
        System.out.printf("%nModelo:       %s",getModelo());
        System.out.printf("%nCapacidade:   %d",getCapacidade());
        System.out.printf("%nUnidade:      %s",getUnidade());
        System.out.printf("%nComprimento:  %.2f",getComprimento());
        System.out.printf("%nLargura:      %.2f",getLargura());
        System.out.printf("%nProfundidade: %.2f",getProfundidade());
        System.out.printf("%nPeso:         %.2f",getPeso());
        System.out.printf("%nPreço:        %.2f",getPreco());
    }
    
    //ENTRADA DADOS
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a Marca: ");
        setMarca(sc.nextLine());
        System.out.println("Insira o Modelo: ");
        setModelo(sc.nextLine());
        System.out.println("Insira a Capacidade: ");
        setCapacidade(Integer.parseInt(sc.nextLine()));
        System.out.println("Insira o Comprimento: ");
        setComprimento(Double.parseDouble(sc.nextLine()));
        System.out.println("Insira a Largura: ");
        setLargura(Double.parseDouble(sc.nextLine()));
        System.out.println("Insira a Profundidade: ");
        setProfundidade(Double.parseDouble(sc.nextLine()));
        System.out.println("Insira o Peso: ");
        setPeso(Double.parseDouble(sc.nextLine()));
        System.out.println("Insira o Preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));
        System.out.println("Insira a unidade de armazenamento: ");
        setUnidade(sc.nextLine());
    }
    
    //MÉTODOS CONSTRUTORES
    
    //CONSTRUTOR 1
    public PenDrive(String marc,String mod, int capac){
        marca = marc;
        modelo = mod;
        capacidade = capac;
        
    }
    
    //CONSTRUTOR 02
    public PenDrive(String marc,String mod,int capac,double prec){
        marca = marc;
        modelo = mod;
        capacidade = capac;
        preco = prec;
    }
    
    //CONSTRUTOR 03
    public PenDrive(String marc,String mod,int capac,double prec,String uni){
        marca = marc;
        modelo = mod;
        capacidade = capac;
        preco = prec;
        unidade = uni;
    }
    
    //CONSTRUTOR 04
    public PenDrive(String marc, String mod,int capac,double prec,String uni,double compri){
        marca =marc;
        modelo = mod;
        capacidade = capac;
        preco = prec;
        unidade = uni;
    }
    
    //CONSTRUTOR 05
    public PenDrive(String marc,String mod,int capac,double prec,String uni,double compri,double larg){
        marca = marc;
        modelo = mod;
        capacidade = capac;
        preco = prec;
        unidade = uni;
        largura = larg;
    }
    
    //CONSTRUTOR 06
    public PenDrive(){
        
    }
    //CONSTRUTOR 07
    public PenDrive(String marc,String mod,int capac,double prec,String uni,double compri,double larg,double profundi){
        marca = marc;
        modelo = mod;
        capacidade = capac;
        preco = prec;
        unidade = uni;
        largura = larg;
        profundidade = profundi;
    }
    
    //CONSTRUTOR COMPETO
    public PenDrive(String marc,String mod,int capac,double prec,String uni,double compri,double larg,double profundi,double pes){
        marca = marc;
        modelo = mod;
        capacidade = capac;
        preco = prec;
        unidade = uni;
        largura = larg;
        profundidade = profundi;
        peso = pes;
    }
}
