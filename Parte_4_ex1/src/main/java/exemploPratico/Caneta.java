/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploPratico;

/**
 *
 * @author Cakeb
 */
public class Caneta {
    //Atributos
    String cor;
    int quantidade;
    double preco;
    
    //Métodos de Acesso
    public void setCor(String c){
        if(!c.isEmpty()){
            cor = c;
        }
    }
    public String getCor(){
        return cor;
    }
    public void setQuantidade(int q){
        if(q>0){
            quantidade = q;
        }
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setPreco(double p){
        if(p>0){
            preco = p;
        }
    }
    public double getPreco(){
        return preco;
    }
    public void adicionar(int q){
        if(q>0){
            quantidade -= q;
        }
    }
    public void  retirar(int q){
        if(q>0 && q <= quantidade){
            quantidade -= q;
        }
    }
    public void imprimir(){
        System.out.println("Cor: "+getCor());
        System.out.println("Quantidade: "+getQuantidade());
        System.out.println("Preço: "+getPreco());
    }
}
