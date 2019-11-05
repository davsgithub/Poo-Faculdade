
package Classes02;

import java.util.Scanner;

public class MicroOndas extends Eletrodomestico {
    private int potenciaMaxima;
    private int potenciaMinima;
    
    
    public void setPotenciaMaxima(int potenciaMaxima){
        this.potenciaMaxima = potenciaMaxima;
    }
    public void setPotenciaMaxima(){
        potenciaMaxima = 0;
    }
    public int getPotenciaMaxima(){
        return potenciaMaxima;
    }
    public void setPotenciaMinima(int potenciaMinima){
        this.potenciaMinima = potenciaMinima;
    }
    public void setPotenciaMinima(){
        potenciaMinima = 0;
    }
    public int getPotenciaMinima(){
        return potenciaMinima;
    }

    public void cadastrar(String marca, String modelo,int volume, double preco,double comprimentop1, double largurap1, boolean possuiVidrop1,int potenciaMaxima, int potenciaMinima){
        super.cadastrar(marca,modelo,volume,preco,comprimentop1,largurap1,possuiVidrop1);
        setPotenciaMaxima(potenciaMaxima);
        setPotenciaMinima(potenciaMinima);
        
        
    
    
    }
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("PotenciaMaxima: "+getPotenciaMaxima());
        System.out.println("Potencia Minima: "+getPotenciaMinima());
        
        
    }
    @Override
    public void entradaDados(){
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a potência máxima: ");
        setPotenciaMaxima(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a potência mínima: ");
        setPotenciaMinima(Integer.parseInt(sc.nextLine())); 
    }
    
    //CONSTRUTORES
    
    public MicroOndas(){
        
    }
    public MicroOndas(String marca, String modelo, int volume, double preco, double comprimento, double largura, boolean possuiVidro, int potenciaMaxima, int potenciaMinima){
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
        this.preco = preco;
        porta1.setComprimento(comprimento);
        porta1.setLargura(largura);
        porta1.setPossuiVidro(possuiVidro);
        this.potenciaMaxima = potenciaMaxima;
        this.potenciaMinima = potenciaMinima;
    }
    public MicroOndas(String marca, String modelo,double comprimento, double largura, boolean possuiVidro){
        this.marca = marca;
        this.modelo = modelo;
        porta1.setComprimento(comprimento);
        porta1.setLargura(largura);
        porta1.setPossuiVidro(possuiVidro);
    }
    
    /*private int potenciaMaxima;
    private int potenciaMinima;
    protected String marca;
    protected String modelo;
    protected int volume;
    protected double preco;
    private double comprimento;
    private double largura;
    private boolean possuiVidro;
    */
public MicroOndas(int potenciaMinima,int potenciaMaxima){
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
    }
    public MicroOndas(String marca,int potenciaMinima){        
        this.marca = marca;
        this.potenciaMinima = potenciaMinima;
    }
    public MicroOndas(int volume,int potenciaMinima, int potenciaMaxima){
        this.volume = volume;
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
    }
    public MicroOndas(String marca,String modelo,int potenciaMinima,int potenciaMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
    }
    public MicroOndas(double preco,int potenciaMinima,int potenciaMaxima){
        this.preco = preco;
        this.potenciaMaxima = potenciaMaxima;
        this.potenciaMinima = potenciaMinima;
    }
    public MicroOndas(String marca,int volume,int potenciaMinima,int potenciaMaxima){
        this.marca = marca;
        this.volume = volume;
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
    }
    public MicroOndas(String marca,String modelo,int volume, double preco,int potenciaMinima,int potenciaMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
        this.preco = preco;
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
    }
    public MicroOndas(String marca,String modelo, double preco, int potenciaMinima,int potenciaMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
    }







}
