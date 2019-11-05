
package parte4_extra_exercicio2;

public class App {
    public static void main (String[]args){
        Cadeira cadeira = new Cadeira();
        Carro carro = new Carro();
        Geladeira geladeira = new Geladeira();
        Mesa mesa = new Mesa();
        Televisao tv = new Televisao();
        
        cadeira.entradaDadosCadeira();
        cadeira.imprimirCadeira();
        
        carro.entradaDadosCarro();
        carro.imprimirCarro();
        
        geladeira.entradaDadosGeladeira();
        geladeira.imprimirGeladeira();
        
        mesa.entradaDadosMesa();
        mesa.imprimirMesa();
        
        tv.entradaDadosTV();
        tv.imprimirTV();
        
        
        
        
        
        
        
    }
}
