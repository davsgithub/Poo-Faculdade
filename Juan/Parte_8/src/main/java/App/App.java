
package App;
import Parte_8_01.Cd;

import Parte_8_02.Cadeira;

public class App {
    public static void main(String args[]){
        System.out.println("CLASSE CD!");
        //CD01
        Cd cd1 = new Cd();
        System.out.println("Entrada de dados do Cd 01");
        System.out.println("");
        cd1.entradaDados();
        System.out.println("Impressão Cd 01");
        System.out.println("");
        
        //CD02
        Cd cd2 = new Cd();
        cd2.cadastrar("Scream Aim Fire","Bullet For My Valentine",128,12,13,1,50);
        System.out.println("Impressão Cd 02");
        System.out.println("");
        cd2.imprimir();
        
        //CD03 
        Cd cd3 = new Cd("Master of Puppets","Metallica",8);
        cd3.imprimir();
        
        Cd cd4 = new Cd("Rust in Peace","Megadeth",10,50);
        cd4.imprimir();
        
        Cd cd5 = new Cd(128,12);
        cd5.imprimir();
                
        
        
        
        





    }
}
