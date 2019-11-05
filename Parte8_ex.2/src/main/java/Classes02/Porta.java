package Classes02;

import java.util.Scanner;

public class Porta {

    private double comprimento;
    private double largura;
    private boolean possuiVidro;

    public void setComprimento(double comprimento) {
        if (comprimento > 0) {
            this.comprimento = comprimento;
        }
    }

    public void setComprimento() {
        comprimento = 0;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        }

    }

    public void setLargura() {
        largura = 0;
    }

    public double getLargura() {
        return largura;
    }

    public void setPossuiVidro(boolean possuVidro) {
        if (possuVidro == true) {
            possuiVidro = true;
        } else {
            possuiVidro = false;
        }
    }

    public void setPossuiVidro() {
        possuiVidro = false;
    }

    public boolean getPossuiVidro() {
        return possuiVidro;
    }

    public void cadastrar(double comprimento, double largura, boolean possuiVidro) {
        setComprimento(comprimento);
        setLargura(largura);
        setPossuiVidro(possuiVidro);
    }

    public void imprimir() {
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Largura: " + getLargura());
        System.out.println("Possui vidro: " + getPossuiVidro());
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        //VARIÁVEIS LOCAIS
        String sim1 = "sim";
        String sim2 = "Sim";
        String sim3 = "SIm";
        String sim4 = "SIM";
        String sim5 = "sIM";
        String sim6 = "siM";
        String sim7 = "sIm";
        String sim8 = "S";

        System.out.println("Insira o comprimento: ");
        setComprimento(Double.parseDouble(sc.nextLine()));
        System.out.println("Largura: ");
        setLargura(Double.parseDouble(sc.nextLine()));
        System.out.println("Possui vidro: ");
        String resp = sc.nextLine();
        if (resp.equals(sim1)) {
            setPossuiVidro(true);

        } else if (resp.equals(sim2)) {
            setPossuiVidro(true);

        } else if (resp.equals(sim3)) {
            setPossuiVidro(true);

        } else if (resp.equals(sim4)) {
            setPossuiVidro(true);

        } else if (resp.equals(sim5)) {
            setPossuiVidro(true);

        } else if (resp.equals(sim6)) {
            setPossuiVidro(true);

        } else if (resp.equals(sim7)) {
            setPossuiVidro(true);

        } else if (resp.equals(sim8)) {
            setPossuiVidro(true);

        } else {
            setPossuiVidro(false);
        }

    }

    public Porta() {

    }
    public Porta(double comprimento, double largura, boolean possuiVidro){
        this.comprimento = comprimento;
        this.largura = largura;
        this.possuiVidro = possuiVidro;
    }
    public Porta(double comprimento,double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }
    public Porta(double comprimento, boolean possuiVidro){
        this.comprimento = comprimento;
        this.possuiVidro = possuiVidro;
    }
    public Porta(double comprimento){
        this.comprimento = comprimento;
    }
    public Porta(boolean possuiVidro){
        this.possuiVidro =  possuiVidro;
    }
    public Porta(boolean possuiVidro,double comprimento){
        this.possuiVidro = possuiVidro;
        this.comprimento = comprimento;
    }
    public Porta(boolean possuiVidro, double comprimento, double largura){
        this.possuiVidro = possuiVidro;
        this.comprimento = comprimento;
        this.largura = largura;
    }

}
