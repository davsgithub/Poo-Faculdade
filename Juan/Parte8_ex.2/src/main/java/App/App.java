
package App;
import Classes01.Aviao;
import Classes01.Motor;
import Classes01.Navio;
import Classes01.Veiculo;

import Classes02.Eletrodomestico;
import Classes02.Geladeira;
import Classes02.MicroOndas;
import Classes02.Porta;

public class App {
    public static void main(String[]args){
        System.out.println("TESTE CLASSES PARTE 01: ");
        System.out.println("");
        System.out.println("Aviões");
        System.out.println("");
        Aviao av1 = new Aviao();
        System.out.println("Aviao 01");
        av1.entradaDados();
        av1.imprimir();
        System.out.println("");
        System.out.println("Aviao 02: ");
        Aviao av2 = new Aviao("FTX","10/07/2000",150,15000000,200000000,"Diesel",10000,5000,"Diesel", 10000,5000);
        av2.imprimir();
        System.out.println("");
        Aviao av3 = new Aviao(100,3000000,"Diesel",100000,80000,"Disel",100000,80000);
        System.out.println("Avião 3: ");
        Aviao av4 = new Aviao(50,40000,"Gasolina",4000,2000,"Gasolina",4000,2000);
        System.out.println("");
        
    }
}
