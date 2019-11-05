
package exercicio02;

public class App_ex02 {
    public static void main(String[]args){
        Geladeira g1 = new Geladeira();
        g1.porta1.setComprimento(12);
        
        System.out.println("Teste comprimento porta 1 herdada: ");
        System.out.println("Comprimento: "+g1.porta1.getComprimento());
        
    }
}
