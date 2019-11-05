
package Parte5_exercicio01;

public class AppPenDrive {
    public static void main(String[]args){
        PenDrive pd1 = new PenDrive();
        pd1.entradaDados();
        pd1.imprimir();
        
        PenDrive pd2 = new PenDrive();
        pd2.entradaDados();
        pd2.imprimir();
        
        PenDrive pd3 = new PenDrive();
        pd3.entradaDados();
        pd3.imprimir();
        
        PenDrive pd4 = new PenDrive();
        pd4.entradaDados();
        pd4.imprimir();
        
        PenDrive pd5 = new PenDrive();
        pd5.entradaDados();
        pd5.imprimir();
        
        System.out.println("TESTANDO O PEN DRIVE DO CONTRUTOR 08");
        PenDrive pd6 = new PenDrive("Kingston","Black",64,25.00,"GB",1.5,0.2,7.2,0.11);
        pd6.imprimir();
        
        System.out.println("TESTANDO O PEN DRIVE DO CONTRUTOR 02");
        PenDrive pd7 = new PenDrive("Kingston","Blue",125,70.99,"GB");
        pd7.imprimir();
    }
}
