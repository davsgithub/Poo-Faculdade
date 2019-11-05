package Classes02;

import java.util.Scanner;

public class Geladeira extends Eletrodomestico {

    private double temperaturaMaxima;
    private double temperaturaMinima;
    Porta porta2 = new Porta();

    public void setTemperaturaMaxima(double temperaturaMaxima) {
        if (temperaturaMaxima > 0) {
            this.temperaturaMaxima = temperaturaMaxima;
        }
    }

    public void setTemperaturaMaxima() {
        temperaturaMaxima = 0;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        if (temperaturaMinima > 0) {
            this.temperaturaMinima = temperaturaMinima;
        }
    }

    public void setTemperaturaMinima() {
        temperaturaMinima = 0;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void cadastrar(String marca, String modelo, int volume, double preco, double temperaturaMaxima, double temperaturaMinima, double comprimentop1, double largurap1, boolean possuiVidrop1, double comprimentop2, double largurap2, boolean possuiVidrop2) {
        super.cadastrar(marca, modelo, volume, preco, comprimentop1, largurap1, possuiVidrop1);
        porta2.setComprimento(comprimentop2);
        porta2.setLargura(largurap2);
        porta2.setPossuiVidro(possuiVidrop2);
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Temperatura máxima: " + getTemperaturaMaxima());
        System.out.println("Temperatura mínima: " + getTemperaturaMinima());
        System.out.println("");
        System.out.println("Porta 2:");
        System.out.println("Comprimento: " + porta2.getComprimento());
        System.out.println("Largura: " + porta2.getLargura());
        System.out.println("Possui Vidro: " + porta2.getPossuiVidro());

    }

    public void entradaDados() {
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        String sim1 = "sim";
        String sim2 = "Sim";
        String sim3 = "SIm";
        String sim4 = "SIM";
        String sim5 = "sIM";
        String sim6 = "siM";
        String sim7 = "sIm";
        String sim8 = "S";

        System.out.println("");
        System.out.println("Porta 2: ");
        System.out.println("Comprimento: ");
        porta2.setComprimento(Double.parseDouble(sc.nextLine()));
        System.out.println("Largura: ");
        porta2.setLargura(Double.parseDouble(sc.nextLine()));
        System.out.println("Possui Vidro: ");
        String resp = sc.nextLine();
        if (resp.equals(sim1)) {
            porta1.setPossuiVidro(true);

        } else if (resp.equals(sim2)) {
            porta1.setPossuiVidro(true);

        } else if (resp.equals(sim3)) {
            porta1.setPossuiVidro(true);

        } else if (resp.equals(sim4)) {
            porta1.setPossuiVidro(true);

        } else if (resp.equals(sim5)) {
            porta1.setPossuiVidro(true);

        } else if (resp.equals(sim6)) {
            porta1.setPossuiVidro(true);

        } else if (resp.equals(sim7)) {
            porta1.setPossuiVidro(true);

        } else if (resp.equals(sim8)) {
            porta1.setPossuiVidro(true);

        } else {
            porta1.setPossuiVidro(false);
        }
        System.out.println("Temperatura Maxima: ");
        setTemperaturaMaxima(Integer.parseInt(sc.nextLine()));
        System.out.println("Temperatura Minima: ");
        setTemperaturaMinima(Integer.parseInt(sc.nextLine()));

    }

    public Geladeira() {
    }

    public Geladeira(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public Geladeira(double temperaturaMinima, double temperaturaMaxima) {
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public Geladeira(String marca, double temperaturaMinima) {
        this.marca = marca;
        this.temperaturaMinima = temperaturaMinima;
    }

    public Geladeira(int volume, double temperaturaMaxima) {
        this.volume = volume;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public Geladeira(double pre, double temperaturaMinima, double temperaturaMaxima) {
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public Geladeira(String marca, String modelo, double temperaturaMaxima, double temperaturaMinima) {
        this.marca = marca;
        this.modelo = modelo;
        this.temperaturaMaxima = temperaturaMaxima;

        this.temperaturaMinima = temperaturaMinima;

    }

    public Geladeira(String marca, int volume, double temperaturaMaxima, double temperaturaMinima) {
        this.marca = marca;
        this.volume = volume;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
    }

    public Geladeira(String marca, String modelo, int volume, double preco, double temperaturaMaxima, double temperaturaMinima) {
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
        this.preco = preco;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
    }

    public Geladeira(String marca, String modelo, double preco, double temperaturaMaxima, double temperaturaMinima) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
    }
}
