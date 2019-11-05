package Parte_8_01;

import java.util.Scanner;

public class Cd {

    private String titulo;
    private String banda;
    private int capacidade;
    private int numeroFaixas;
    private int codigoIdentificacao;
    private double duracaoTotal;
    private double preco;

    //MÉTODOS DE ACESSO
    //TITULO
    public void setTitulo(String titul) {
        if (!titul.isEmpty()) {
            titulo = titul;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    //BANDA
    public void setBanda(String band) {
        if (!band.isEmpty()) {
            banda = band;
        }
    }

    public String getBanda() {
        return banda;
    }

    //CAPACIDADE
    public void setCapacidade(int capac) {
        if (capac > 0) {
            capacidade = capac;
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    //NÚMERO FAIXAS
    public void setNumeroFaixas(int numFaixa) {
        if (numFaixa > 0) {
            numeroFaixas = numFaixa;
        }
    }

    public double getNumeroFaixas() {
        return numeroFaixas;
    }

    //DURAÇÃO TOTAL
    public void setDuracaoTotal(double durTot) {
        if (durTot > 0) {
            duracaoTotal = durTot;
        }
    }

    public double getDuracaoTotal() {
        return duracaoTotal;
    }

    //codigo Identificação
    public void setCodigoIdentificacao(int codigo) {
        if (codigo > 0) {
            codigoIdentificacao = codigo;
        }
    }

    public double getCodigoIdentificacao() {
        return codigoIdentificacao;
    }

    //PREÇO
    public void setPreco(double prec) {
        if (prec > 0) {
            preco = prec;
        }
    }

    public double getPreco() {
        return preco;

    }

    //CADASTRAR
    public void cadastrar(String titulo, String banda, int capacidade, int numeroFaixas, int codigoIdentificacao, double duracaoTotal, double preco) {
        setTitulo(titulo);
        setBanda(banda);
        setCapacidade(capacidade);
        setNumeroFaixas(numeroFaixas);
        setCodigoIdentificacao(codigoIdentificacao);
        setDuracaoTotal(duracaoTotal);
        setPreco(preco);

    }

    //IMPRIMIR
    public void imprimir() {
        System.out.printf("%nTítulo:                             %s", getTitulo());
        System.out.printf("%nBanda:                              %s", getBanda());
        System.out.printf("%nCapacidade:                         %d", getCapacidade());
        System.out.printf("%nNúmero de Faixas:                   %.2f", getNumeroFaixas());
        System.out.printf("%nCódigo de Identificação:            %.2f", getCodigoIdentificacao());
        System.out.printf("%nDuração Total:                      %.2f", getDuracaoTotal());
        System.out.printf("%nPreço:                              %.2f", getPreco());
    }

    //ENTRADA DADOS
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o Título: ");
        setTitulo(sc.nextLine());
        System.out.println("Insira a Banda: ");
        setBanda(sc.nextLine());
        System.out.println("Insira a Capacidade: ");
        setCapacidade(Integer.parseInt(sc.nextLine()));
        System.out.println("Insira o número de faixas: ");
        setNumeroFaixas(Integer.parseInt(sc.nextLine()));
        System.out.println("Insira o código de identificação: ");
        setCodigoIdentificacao(Integer.parseInt(sc.nextLine()));
        System.out.println("Insira a Duração Total: ");
        setDuracaoTotal(Double.parseDouble(sc.nextLine()));
        System.out.println("Insira o Preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));
    }

    public Cd() {

    }

    public Cd(String titulo, String banda, int numeroFaixas) {
        this.titulo = titulo;
        this.banda = banda;
        this.numeroFaixas = numeroFaixas;

    }

    public Cd(String titulo, String banda, int numeroFaixas, double preco) {
        this.titulo = titulo;
        this.banda = banda;
        this.numeroFaixas = numeroFaixas;
        this.preco = preco;
    }

    public Cd(int capacidade, int numeroFaixas) {
        this.capacidade = capacidade;
        this.numeroFaixas = numeroFaixas;

    }
    /*private String titulo;
    private String banda;
    private int capacidade;
    private int numeroFaixas;
    private int codigoIdentificacao;
    private double duracaoTotal;
    private double preco;
    
     */

}
