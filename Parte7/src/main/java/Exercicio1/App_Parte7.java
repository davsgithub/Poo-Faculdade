
package Exercicio1;

public class App_Parte7 {
    public static void main(String[]args){
        
        Aviao aviao1 = new Aviao();
        Aviao aviao2 = new Aviao(1500000000,150,1000000000.00,"FTP40","19/10/2019");
        Aviao aviao3 = new Aviao(50,2500000000.0,"DTF90","19/10/2019");
        
        aviao1.entradaDados();
        aviao1.motor1.getPotenciaMaxima();
        aviao2.motor1.acelerar();
        aviao3.motor2.getPotenciaAtual();
        
        Motor motor1 = new Motor();
        Motor motor2 = new Motor("Diesel",17000000,1000000);
        Motor motor3 = new Motor(1800000,1000000);
        
        motor1.entradaDados();
        motor2.getPotenciaAtual();
        motor3.getPotenciaMaxima();
        
        Navio navio1 = new Navio(170,14500000,300,170000000.0);
        Navio navio2 = new Navio("King I","10/10/2010",200,100000000,400,1000000000);
        Navio navio3 = new Navio();
        
        navio1.motor2.getPotenciaAtual();
        navio2.motor2.getPotenciaAtual();
        navio3.motor1.acelerar();
        navio3.motor1.desacelerar();
        
        
        
        
        
        
        
        
        
        
    }
}
