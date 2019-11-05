
package parte5_exercicio02;

import java.util.Scanner;

public class Mesa {
    String material;//ok
    String formato;//ok
    float altura;//ok
    double largura;//ok
    double profundidade;//ok
    int gavetas;//ok
    String cor;
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
    public void setFormato(String form){
        if(!form.isEmpty()){
            formato = form;
        }
    }
    public void setFormato(){
        formato = "";
    }
    public String getFormato(){
        return formato;
    }
    public void setAltura(float alt){
        if(alt>0){
            altura = (float)alt;
        }
    }
    public void setAltura(){
        altura = 0;
    }
    public float getAltura(){
        return altura;
    }
    public void setLargura(double larg){
        if(larg>0){
            largura = larg;
        }
    }
    public void setLargura(){
        largura = 0;
    }
    public double getLargura(){
        return largura;
    }
    public void setProfundidade(double profund){
        if(profund>0){
            profundidade = profund;
        }
    }
    public void setProfundidade(){
        profundidade = 0;
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
    public void setGavetas(){
        gavetas = 0;
    }
    public int getGavetas(){
        return gavetas;
    }
    public void setCor(String c)
    {
        if(!c.isEmpty()){
            cor = c;
        }
    }  
    public String getCor(){
        return cor;
    }
    public void setCor(){
        cor = "";
    }
    public void imprimirMesa(){
        System.out.printf("%n%n------------MESA--------------%n%n");
        System.out.printf("%nMaterial:          %s%n",getMaterial());
        System.out.printf("%nFormato:           %s%n",getFormato());
        System.out.printf("%nAltura:            %.2fcm%n",getAltura());
        System.out.printf("%nLargura:           %.2fcm%n",getLargura());
        System.out.printf("%nProfundidade:      %.2fcm%n",getProfundidade());
        System.out.printf("%nNúmero de gavetas: %d",getGavetas());
        System.out.printf("%nCor da mesa:       %s%n",getCor());
    }
    public void CadastrarMesa(String material,String formato,float altura,double largura,double profundidade,int gavetas){
        setMaterial(material);
        setFormato(formato);
        setAltura(altura);
        setLargura(largura);
        setProfundidade(profundidade);
        setGavetas(gavetas);
    }
    public void CadastrarMesa(String material,String formato,float altura,double largura,double profundidade,int gavetas,String cor){
        setMaterial(material);
        setFormato(formato);
        setAltura(altura);
        setLargura(largura);
        setProfundidade(profundidade);
        setGavetas(gavetas);
        setCor(cor);
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
        setGavetas(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a cor da mesa: ");
        setCor(sc.nextLine());
        
    }
    //CONSTRUTORES
    
    //CONSTRUTOR 01
    public Mesa(){
    
    }    
    //CONSTRUTOR 02
    public Mesa(String material,String formato,float altura,double largura,double profundidade,int gavetas,String cor){
        this.material = material;
        this.formato = formato;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.gavetas = gavetas;
        this.cor = cor;
    }
    //CONSTRUTOR 03
    public Mesa(double largura,String material,String formato,float altura,double profundidade,int gavetas,String cor){
        this.largura = largura;
        this.material = material;
        this.formato = formato;
        this.altura = altura;
        this.profundidade = profundidade;
        this.gavetas = gavetas;
        this.cor = cor;
    }
    //CONSTRUTOR 04
    public Mesa(String cor, String formato,String material){
        this.cor = cor;
        this.formato = formato;
        this.material = material;
        
    }
    //CONTRUTOR 05
    public Mesa(double profundidade,float altura,int gavetas){
        this.profundidade = profundidade;
        this.altura = altura;
        this.gavetas = gavetas;
    }
    //CONSTRUTOR 06
    public Mesa(int gavetas,String cor,String formato,String material){
        this.gavetas = gavetas;
        this.cor = cor;
        this.formato = formato;
        this.material = material;
    }
    public Mesa(String material,String formato,float altura,double largura,double profundidade,int gavetas){
        this.material = material;
        this.formato = formato;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.gavetas = gavetas;
    }
    public Mesa(float altura){
        this.altura = altura;
    }
    public Mesa(String formato,float altura,double largura,double profundidade,int gavetas){
        this.formato = formato;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.gavetas = gavetas;
    }    
    public Mesa(String cor){
        this.cor = cor;
    }    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
