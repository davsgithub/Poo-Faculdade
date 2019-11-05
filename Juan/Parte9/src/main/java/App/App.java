package App;

import exercicio02.Metodos;

public class App {

    public static void main(String args[]) {

        //CALCULA TOTAL
        System.out.println("CALCULA TOTAL");
        System.out.println("");
        System.out.println("");
        System.out.println("Preço para 16 dias: " + Metodos.calculaTotal(16));
        System.out.println("");
        System.out.println("Preço para 1 dia: " + Metodos.calculaTotal(1));
        System.out.println("");

        System.out.println("CALCULA INSS");
        System.out.println("");
        System.out.println("");
        System.out.println("Desconto para salário igual a R$600: " + Metodos.calculaINSS(600));
        System.out.println("");
        System.out.println("Desconto para salário igual a R$1200: " + Metodos.calculaINSS(1200));
        System.out.println("");
        System.out.println("Desconto para salário igual a R$2000:" + Metodos.calculaINSS(2000));
        System.out.println("");
        System.out.println("Desconto para salário igual a R$2500:" + Metodos.calculaINSS(2500));
        System.out.println("");

        //epar
        System.out.println("ePar");
        System.out.println("");
        System.out.println("");
        System.out.println("Número = 1"+Metodos.ePar(1));
        System.out.println("");
        System.out.println("Número = 2"+Metodos.ePar(2));
        System.out.println("");
        
        //eDivisivel
        System.out.println("eDivisivel");
        System.out.println("");
        System.out.println("");
        System.out.println("4/2 = "+Metodos.eDivisivel(4, 2));
        System.out.println("");
        
        //
        
        
        
        //FATORIAL
        System.out.println("TESTANDO FATORIAIS");
        System.out.println("");
        System.out.println("");
        System.out.println("Fatorial de 2: " + Metodos.fatorial(2));
        System.out.println("");
        System.out.println("Fatorial de 3: " + Metodos.fatorial(3));
        System.out.println("");
        System.out.println("Fatorial de 4: " + Metodos.fatorial(4));
        
        //PRECO TOTAL
        System.out.println("3 unidades do produto 3: "+Metodos.precoTotal(3, 3));
        
    }
}
