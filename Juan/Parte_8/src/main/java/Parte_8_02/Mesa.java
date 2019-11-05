
package Parte_8_02;

import java.util.Scanner;

public class Mesa {
    private String material;//ok
    private String formato;//ok
    private float altura;//ok
    private double largura;//ok
    private double profundidade;//ok
    private int gavetas;//ok
    public void setMaterial(String mat){
        if(!mat.isEmpty()){
            material = mat;
        }
    }    
    public String getMaterial(){
        return material;
    }    
    public void setFormato(String form){
        if(!form.isEmpty()){
            formato = form;
        }
    }
    public String getFormato(){
        return formato;
    }
    public void setAltura(float alt){
        if(alt>0){
            altura = (float)alt;
        }
    }
    public float getAltura(){
        return altura;
    }
    public void setLargura(double larg){
        if(larg>0){
            largura = larg;
        }
    }
    public double getLargura(){
        return largura;
    }
    public void setProfundidade(double profund){
        if(profund>0){
            profundidade = profund;
        }
    }
    public double getProfundidade(){
        return profundidade;
    }
    public void setGavetas(int gav){
        if(gav>0){
            gavetas = gav;
        }
        else{
            gavetas = 0;
        }
    }
    public int getGavetas(){
        return gavetas;
    }
    public void imprimirMesa(){
        System.out.printf("%n%n------------MESA--------------%n%n");
        System.out.printf("%nMaterial:          %s%n",getMaterial());
        System.out.printf("%nFormato:           %s%n",getFormato());
        System.out.printf("%nAltura:            %.2fcm%n",getAltura());
        System.out.printf("%nLargura:           %.2fcm%n",getLargura());
        System.out.printf("%nProfundidade:      %.2fcm%n",getProfundidade());
        System.out.printf("%nNúmero de gavetas: %d",getGavetas());
    }
    public void CadastrarMesa(String material,String formato,float altura,double largura,double profundidade,int gavetas){
        setMaterial(material);
        setFormato(formato);
        setAltura(altura);
        setLargura(largura);
        setProfundidade(profundidade);
        setGavetas(gavetas);
    }
    public void entradaDadosMesa(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Informe o material da mesa: ");
        setMaterial(sc.nextLine());
        System.out.println("Informe o formato da mesa: ");
        setFormato(sc.nextLine());
        System.out.println("Informe a altura da mesa: ");
        setAltura(Float.parseFloat(sc.nextLine()));
        System.out.println("Informe a largura da mesa: ");
        setLargura(Double.parseDouble(sc.nextLine()));
        System.out.println("Informe a profundidade da mesa: ");
        setProfundidade(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe o número de gavetas dessa mesa: ");
        
    }

}
