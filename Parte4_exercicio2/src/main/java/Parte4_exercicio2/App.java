
package Parte4_exercicio2;
import java.util.Scanner;
public class App {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Mesa mesa = new Mesa();
        Cadeira cadeira = new Cadeira();
        Carro carro = new Carro();
        Televisao tv  = new Televisao();
        Geladeira geladeira = new Geladeira();
        
        System.out.println("CADASTRO DA CADEIRA");
        System.out.println("Informe o material da cadeira: ");
        cadeira.setMaterial(sc.nextLine());
        System.out.println("Informe o modelo da cadeira: ");
        cadeira.setModelo(sc.nextLine());
        System.out.println("Informe se a cadeira tem acolchoamento: ");
        System.out.println("1-Sim   0-Não");
        cadeira.setAcolchoamento(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe o peso da cadeira: ");
        cadeira.setPeso(Double.parseDouble(sc.nextLine()));
        System.out.println("Informe a quantidade de pés dessa cadeira: ");
        cadeira.setPes(Integer.parseInt(sc.nextLine()));
        
        System.out.println("CADASTRO DA MESA");
        System.out.println("Informe o material da mesa: ");
        mesa.setMaterial(sc.nextLine());
        System.out.println("Informe o formato da mesa: ");
        mesa.setFormato(sc.nextLine());
        System.out.println("Informe a altura da mesa: ");
        mesa.setAltura(Float.parseFloat(sc.nextLine()));
        System.out.println("Informe a largura da mesa: ");
        mesa.setLargura(Double.parseDouble(sc.nextLine()));
        System.out.println("Informe a profundidade da mesa: ");
        mesa.setProfundidade(Double.parseDouble(sc.nextLine()));
        System.out.println("Informe o númerode gavetas que a mesa tem: ");
        mesa.setGavetas(Integer.parseInt(sc.nextLine()));
        
        System.out.println("CADASTRO DO CARRO");
        System.out.println("Informe a marca do carro: ");
        carro.setMarca(sc.nextLine());
        System.out.println("Informe o modelo do carro: ");
        carro.setModelo(sc.nextLine());
        System.out.println("Informe o ano do carro: ");
        carro.setAno(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe quantas cilindradas esse carro tem: ");
        carro.setCilindradas(Float.parseFloat(sc.nextLine()));
        System.out.println("Informe de o carro é automático: ");
        System.out.println("1-Sim   0-Não");
        carro.setAutomatico(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a placa do carro: ");
        carro.setPlaca(sc.nextLine());
        System.out.println("Informe a quantidade de portas desse carro: ");
        carro.setPortas(Integer.parseInt(sc.nextLine()));
        
        System.out.println("CADASTRO DA GELADEIRA");
        System.out.println("Informe a marca da geladeira: ");
        geladeira.setMarca(sc.nextLine());
        System.out.println("Informe a capacidade da geladeira: ");
        geladeira.setCapacidade(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a altura da geladeira: ");
        geladeira.setAltura(Double.parseDouble(sc.nextLine()));
        System.out.println("Informe a profundidade da geladeira: ");
        geladeira.setProfundidade(Float.parseFloat(sc.nextLine()));
        System.out.println("Informe a quantidade de portas da geladeira: ");
        geladeira.setPortas(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a voltagem da geladeira: ");
        geladeira.setVoltagem(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe a eficiência energética da geladeira: ");
        geladeira.setEfiEnergetica(sc.nextLine());
        
        System.out.println("TELEVISÃO");
        System.out.println("Informe a marca da Televisão: ");
        tv.setMarca(sc.nextLine());
        System.out.println("Informe quantas polegadas essa televisão tem: ");
        tv.setPolegadas(Short.parseShort(sc.nextLine()));
        System.out.println("Informe se essa televisão é inteligente:%n1-Sim%t0-Não ");
        System.out.println("1-Sim   0-Não");
        tv.setSmart(Integer.parseInt(sc.nextLine()));
        System.out.println("Informe o peso da televisão: ");
        tv.setPeso(Float.parseFloat(sc.nextLine()));
        System.out.println("Informe o preço da Televisão: ");
        tv.setPreco(Double.parseDouble(sc.nextLine()));
        
        cadeira.imprimirCadeira();
        mesa.imprimirMesa();
        carro.imprimirCarro();
        geladeira.imprimirGeladeira();
        tv.imprimirTelevisao();
        
        
        
        
        
        sc.close();
    }
}
