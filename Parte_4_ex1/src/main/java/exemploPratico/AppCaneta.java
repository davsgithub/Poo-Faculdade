
package exemploPratico;

import java.util.Scanner;

public class AppCaneta {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Caneta c1 = new Caneta();
        c1.cor = "Vermelha";
        c1.quantidade = 100;
        c1.preco = 5.15;
        Caneta c2 = new Caneta();
        c2.setCor("");
        c2.setQuantidade(-50);
        c2.setPreco(-3.85);
        Caneta c3 = new Caneta();
        c3.setCor("Verde");
        c3.setQuantidade(200);
        c3.setPreco(3.92);
        
        Caneta c4 = new Caneta();
        System.out.println("Digite a cor: ");
        c4.setCor(sc.nextLine());
        System.out.println("Digite a quantidade: ");
        c4.setQuantidade(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o preço: ");
        c4.setPreco(Double.parseDouble(sc.nextLine()));
        
        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
        c4.imprimir();
    
    
    
    
    
    
    }
}
