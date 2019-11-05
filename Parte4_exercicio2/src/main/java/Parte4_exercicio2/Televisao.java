
package Parte4_exercicio2;

import java.util.Scanner;

public class Televisao {
    short polegadas;//ok
    boolean smart;//ok
    String smartStr;//ok
    float peso;//ok
    String marca;
    double preco;
    public void setPolegadas(short pol){
        if(pol>0){
            polegadas = (short)pol;
        }
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
    public String getSmart(){
        return smartStr;
    }
    public void setPeso(float pes){
        if(pes>0){
            peso = pes;
        }
    }
    public float getPeso(){
        return peso;
    }
    public void setMarca(String marc){
        if(!marc.isEmpty()){
            marca = marc;
        }
    }
    public String getMarca(){
        return marca;
    }
    public void setPreco(double prec){
        if(prec>0){
            preco = prec;
        }
    }
    public double getPreco(){
        return preco;
    }
    public void imprimirTelevisao(){
        System.out.printf("%n------------TELEVISÃO--------------%n");
        System.out.printf("%nMarca:     %s%n",getMarca());
        System.out.printf("%nPolegadas: %d%n",getPolegadas());
        System.out.printf("%nSmart:     %s%n",getSmart());
        System.out.printf("%nPeso:      %.2fKG%n",getPeso());
        System.out.printf("%nPreço:     %f%n",getPreco());
        
    }

    public void cadastrarTV(short polegadas,int n,float peso,String marca,double preco){
        setPolegadas(polegadas);
        setSmart(n);
        setMarca(marca);
        setPreco(preco);
        setPeso(peso);
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
        
    }
}
    