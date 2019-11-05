
package PenDrive;
import java.util.Scanner;
public class PenDrive {
    String marca,modelo;
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
    
    //MODELO
    public void setModelo(String mod){
        if(!mod.isEmpty()){
            modelo = mod;
        }
    }
    public String getModelo(){
        return modelo;
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
    public void setPeso(double pes){
        if(pes>0){
            peso = pes;
        }
    }
    public double getPeso(){
        return peso;
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
    
    //CADASTRAR
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

    //IMPRIMIR
    public void imprimir(){
        System.out.printf("%nMarca:        %s",getMarca());
        System.out.printf("%nModelo:       %s",getModelo());
        System.out.printf("%nCapacidade:   %d",getCapacidade());
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
    }
    
    









}
