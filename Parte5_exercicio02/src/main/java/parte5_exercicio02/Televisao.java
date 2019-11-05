
package parte5_exercicio02;

import java.util.Scanner;

public class Televisao {
    short polegadas;//ok
    boolean smart;//ok
    String smartStr;//ok
    float peso;//ok
    String marca;
    double preco;
    int entradasHDMI;
    
    public void setPolegadas(short pol){
        if(pol>0){
            polegadas = (short)pol;
        }
    }
    public void setPolegadas(){
        polegadas = 0;
    }
    public short getPolegadas(){
        return polegadas;
    }
    public void setSmart(int n){
        if(n==1){
            smart = true;
            if(smart==true){
                smartStr = "Sim";
            }
        }
        else{
            smart = false;
            if(smart==false){
                smartStr = "Não";
            }
        }
    }
    public void setSmart(){
        smartStr = "";
    }
    public String getSmart(){
        return smartStr;
    }
    
    public void setPeso(float pes){
        if(pes>0){
            peso = pes;
        }
    }
    public void setPeso(){
        peso = 0;
    }
    public float getPeso(){
        return peso;
    }
    public void setMarca(String marc){
        if(!marc.isEmpty()){
            marca = marc;
        }
    }
    public void setMarca(){
        marca = "";
    }
    public String getMarca(){
        return marca;
    }
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
    
    public void setEntradasHDMI(int nument){
        if(nument>0){
            entradasHDMI = nument;
        }
    }
    public int getEntradasHDMI(){
        return entradasHDMI;
    }
    public void setEntradasHDMI(){
        entradasHDMI = 0;
    }    
    
    
    
    
    public void imprimirTV(){
        System.out.printf("%n------------TELEVISÃO--------------%n");
        System.out.printf("%nMarca:         %s%n",getMarca());
        System.out.printf("%nPolegadas:     %d%n",getPolegadas());
        System.out.printf("%nSmart:         %s%n",getSmart());
        System.out.printf("%nPeso:          %.2fKG%n",getPeso());
        System.out.printf("%nPreço:         %.2f%n",getPreco());
        System.out.printf("%nEntradas HDMI: %d",getEntradasHDMI());
        
    }
    public void cadastrarTV(short polegadas,int n,float peso,String marca,double preco){
        setPolegadas(polegadas);
        setSmart(n);
        setMarca(marca);
        setPreco(preco);
        setPeso(peso);
    }
    public void cadastrarTV(short polegadas,int n,float peso,String marca,double preco,int entradasHDMI){
        setPolegadas(polegadas);
        setSmart(n);
        setMarca(marca);
        setPreco(preco);
        setPeso(peso);
        setEntradasHDMI(entradasHDMI);
    }
    public void entradaDadosTV(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Informe a marca da TV: ");
        setMarca(sc.nextLine());
        System.out.println("Informe quantas polegadas tem a TV: ");
        setPolegadas(Short.parseShort(sc.nextLine()));
        System.out.println("Informe se a TV é Smart ou não: ");
        System.out.println("1-Sim       0-Não");
        setSmart(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe o peso da TV: ");
        setPeso(Float.parseFloat(sc.nextLine()));
        System.out.println("Informe o preço da TV: ");
        setPreco(Double.parseDouble(sc.nextLine()));
        System.out.println("Informe a quantidade de entradas HDMI: ");
        setEntradasHDMI(Integer.parseInt(sc.nextLine()));
        
    }

    public Televisao(short polegadas,String smartStr,float peso,String marca,double preco,int entradasHDMI){
        this.polegadas = polegadas;
        this.smartStr = smartStr;
        this.peso = peso;
        this.marca = marca;
        this.preco = preco;
        this.entradasHDMI = entradasHDMI;
    }
    public Televisao(short polegadas,String smartStr,float peso,String marca,double preco){
        this.polegadas = polegadas;
        this.smartStr = smartStr;
        this.peso = peso;
        this.marca = marca;
        this.preco = preco;
    }
    public Televisao(short polegadas,String smartStr,float peso,String marca){
        this.polegadas = polegadas;
        this.smartStr = smartStr;
        this.peso = peso;
        this.marca = marca;
    }
    public Televisao(short polegadas,String smartStr,float peso){
        this.polegadas = polegadas;
        this.smartStr = smartStr;
        this.peso = peso;
    }
    public Televisao(short polegadas,String smartStr){
        this.polegadas = polegadas;
        this.smartStr = smartStr;
    }
    public Televisao(short polegadas){
        this.polegadas = polegadas;
    }
    public Televisao(float peso){
        this.peso = peso;
    }
    public Televisao(String marca){
        this.marca = marca;
    }
    public Televisao(){
        
    }
    public Televisao(double preco){
        this.preco = preco;
    }
    
}

