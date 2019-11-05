
package trabalhoa1;

import java.util.Scanner;

public class Veiculo {
    //ATRIBUTOS

    //TEXTOS
    String marca;//ok
    String modelo;//ok
    String cor;//ok
    String identificacao;//OK
    //INTEIROS
    int numeroPassageiros;//OK
    int velocidadeMaxima;
    //REAL
    double alturaCalado;
    double preco;
    
    //MÉTODOS DE ACESSO
    
    //MARCA
    public void setMarca(String ma){
        if(!ma.isEmpty()){
            marca = ma;
        }    
    }
    public void setMarca(){
        marca = "";
    }
    public String getMarca(){
        return marca;
    }
    
    
    //TEXTO
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
    
    //COR
    public void setCor(String co){
        if(!co.isEmpty()){
            cor = co;
        }    
    }
    public void setCor(){
        cor = "";
    }
    public String getCor(){
        return cor;
    }
    
    //IDENTIFIÇÃO
    public void setIdentificacao(String id){
        if(!id.isEmpty()){
            identificacao = id;
        }
    }
    public void setIdentificacao(){
        identificacao = "";
    }
    public String getIdentificacao(){
        return identificacao;
    }
    
    //NÚMERO DE PASSAGEIROS
    public void setNumeroPassageiros(int numPa){
        if(numPa>0){
            numeroPassageiros = numPa;
        }
    }    
    public void setNumeroPassageiros(){
        numeroPassageiros = 0;
    }
    public int getNumeroPassageiros(){
        return numeroPassageiros;
    }
    
    //VELOCIDADE MÁXIMA
    public void setVelocidadeMaxima(int velMax){
        if(velMax>0){
            velocidadeMaxima = velMax;
        }
    }
    public void setVelocidadeMaxima(){
        velocidadeMaxima = 0;
    }
    public int getVelocidadeMaxima(){
        return velocidadeMaxima;
    }
    
    //ALTURA CALADO
    public void setAlturaCalado(double altCalado){
        if(altCalado>0){
            alturaCalado = altCalado;
        }
    }
    public void setAlturaCalado(){
        alturaCalado = 0;
    }    
    public double getAlturaCalado(){
        return alturaCalado;
    }
    
    //PRECO
    public void setPreco(double prec){
        if(prec>0){
            preco = prec;
        }    
    }
    public void setPreco(){
        preco = 0;
    }    
    public double getPreco(){
        return preco;
    }
    
    //MÉTODOS
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a marca: ");
        setMarca(sc.nextLine());
        System.out.println("Informe o modelo: ");
        setModelo(sc.nextLine());
        System.out.println("Informe a cor: ");
        setCor(sc.nextLine());
        System.out.println("Informe a identificação: ");
        setIdentificacao(sc.nextLine());
        System.out.println("Informe a número de passageiros aceitos: ");
        setNumeroPassageiros(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a velocidade máxima: ");
        setVelocidadeMaxima(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe o preço do veículo: ");
        setPreco(Double.parseDouble(sc.nextLine()));
        System.out.println("Informe a altura do calado: ");
        setAlturaCalado(Double.parseDouble(sc.nextLine()));
    }
    
    public void cadastrar(String ma,String mod,String co,String id,int numPa,int velMax,double altCalado,double prec){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        alturaCalado = altCalado;
        preco = prec;
    }
    
    public void imprimir(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Cor: "+getCor());
        System.out.println("Identificação: "+getIdentificacao());
        System.out.println("Número de passageiros: "+getNumeroPassageiros());
        System.out.println("Velocidade Máxima: "+getVelocidadeMaxima());
        System.out.println("Preco: "+getPreco());
        System.out.println("Altura do calado: "+getAlturaCalado());
    }    
    
    //MÉTODOS CONSTRUTORES
    
    public Veiculo(){
        
    }
    
    //CONSTRUTOR 01
    public Veiculo(String ma,String mod,String co, String id,int numPa,int velMax, double prec, double altCalado){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        preco = prec;
        alturaCalado = altCalado;
    }
    
    //CONSTRUTOR 02
    public Veiculo(int numPa,int velMax, String ma, String mod, String co, String id, double prec, double altCalado){
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        preco = prec;
        alturaCalado = altCalado;
    }
    
    //CONSTRUTOR 03
    public Veiculo(double prec, double altCalado, int numPa, int velMax, String ma, String mod, String co, String id){
        preco = prec;
        alturaCalado = altCalado;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        marca = ma;
        modelo = mod;
        cor  = co;
        identificacao = id;
    }
    
    //CONSTRUTOR 04
    public Veiculo(int numPa, int velMax, double prec, double altCalado, String ma, String mod, String co, String id){
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
        preco = prec;
        alturaCalado = altCalado;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
    }
    
    //CONSTRUTOR 05
    public Veiculo(double prec, double altCalado, String ma, String mod, String co, String id,int numPa, int velMax){
        preco = prec;
        alturaCalado = altCalado;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
    }
    
    //CONSTRUTOR 06
    public Veiculo(String ma, String mod, String co, String id,double prec, double altCalado,int numPa, int velMax){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        preco = prec;
        alturaCalado = altCalado;
        numeroPassageiros = numPa;
        velocidadeMaxima = velMax;
    }
    
    //CONSTRUTOR 07
    public Veiculo(String ma, String mod, String co, String id,int numPa, double prec,int velMax,double altCalado){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        numeroPassageiros = numPa;
        preco = prec;
        velocidadeMaxima = velMax;
        alturaCalado = altCalado;
    }

    //CONSTRUTOR 08
    public Veiculo(String ma, String mod, String co, String id,double prec,int numPa,double altCalado,int velMax){
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        preco = prec;
        numeroPassageiros = numPa;
        alturaCalado = altCalado;
        velocidadeMaxima = velMax;
    }
    
    //CONSTRUTOR 09
    public Veiculo(double prec, int numPa, double altCalado, int velMax,String ma, String mod, String co, String id){
        preco = prec;
        numeroPassageiros = numPa;
        alturaCalado = altCalado;
        velocidadeMaxima = velMax;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
        
    } 
    
    //CONSTRUTOR 10
    public Veiculo(int numPa, double prec, int velMax, double altCalado,String ma, String mod, String co, String id){
        numeroPassageiros = numPa;
        preco = prec;
        velocidadeMaxima = velMax;
        alturaCalado = altCalado;
        marca = ma;
        modelo = mod;
        cor = co;
        identificacao = id;
    }
}

