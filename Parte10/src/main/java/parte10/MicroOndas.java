/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte10;

import java.util.Scanner;

/**
 *
 * @author Cakeb
 */
public class MicroOndas extends Eletrodomestico {

    private int potenciaMaxima;
    private int potenciaMinima;

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public void setPotenciaMaxima() {
        potenciaMaxima = 0;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMinima(int potenciaMinima) {
        this.potenciaMinima = potenciaMinima;
    }

    public void setPotenciaMinima() {
        potenciaMinima = 0;
    }

    public int getPotenciaMinima() {
        return potenciaMinima;
    }

    public void cadastrar(String marca, String modelo, int volume, double preco, double comprimentop1, double largurap1, boolean possuiVidrop1, int potenciaMaxima, int potenciaMinima) {
        super.cadastrar(marca, modelo, volume, preco, comprimentop1, largurap1, possuiVidrop1);
        setPotenciaMaxima(potenciaMaxima);
        setPotenciaMinima(potenciaMinima);

    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("PotenciaMaxima: " + getPotenciaMaxima());
        System.out.println("Potencia Minima: " + getPotenciaMinima());

    }

    @Override
    public void entradaDados() {
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a potência máxima: ");
        setPotenciaMaxima(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a potência mínima: ");
        setPotenciaMinima(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public double desconto() {
        double prec;
        prec = getPreco();
        double desconto;
        desconto = prec - (12 / 100 * prec);
        return desconto;
    }
    
    
}
