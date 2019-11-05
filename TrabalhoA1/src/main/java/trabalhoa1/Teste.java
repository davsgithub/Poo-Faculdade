
package trabalhoa1;

public class Teste {
    public static void main(String[]args){
        Lancha l0 = new Lancha();
        System.out.printf("%n%nInforme os dados da Lancha 1: %n%n");
        l0.entradaDados();
        System.out.println("%n%n DADOS DA LANCHA 1: %n%n");
        l0.imprimir();
        
        
        //CRIADA COM O CONSTRUTOR 1
        Lancha l1 = new Lancha(true,"Aeroboat","FZ212","Azul","SBI","Duplo",4,160,30000,3);
        System.out.printf("%n%n DADOS DA LANCHA 2: %n%n");
        l1.imprimir();
        
        //CRIADA COM O CONSTRUTOR 2
        Lancha l2 = new Lancha(6,false,100,"Arcadia","AC500","Branco","SBII","duplo",350000,5);
        System.out.printf("%n%n DADOS DA LANCHA 3: %n%n");
        l2.valorDesconto(35000);
        l2.imprimir();
        
        //CRIADA COM CONSTRUTOR 3
        Lancha l3 = new Lancha(260000, 2.65,false,4,125,"Axis","T22","Cinza e Vermelho","SBIII","duplo");
        System.out.printf("%n%n DADOS DA LANCHA 4: %n%n");
        l3.imprimir();
        
        //CRIADA COM CONSTRUTOR 4
        Lancha l4 = new Lancha(5,170,20000,false,5,"Contender","25T","Branco","SBIV","Duplo");
        System.out.printf("%n%n DADOS DA LANCHA 5: %n%n");
        l4.imprimir();
        
        //CRIADA COM CONSTRUTOR 5
        Lancha l5 = new Lancha(35000,4.65,"Contender","35ST",false,"Branco","SBV","Duplo",4,125);
        System.out.printf("%n%n DADOS DA LANCHA 6: %n%n");
        l5.imprimir();
        
        //CRIADA COM CONSTRUTOR 6
        Lancha l6 = new Lancha("Cobalt","CS23","Branco e Azul","SB VI","Duplo",false,40000,2.4,4, 70);
        System.out.printf("%n%n DADOS DA LANCHA 7: %n%n");
        l6.imprimir();
        
        //CRIADA COM CONSTRUTOR 7
        Lancha l7 = new Lancha("Chaparral", "310 Signature","Azul","SB VII","Duplo",7,true,100000,120,6);
        System.out.printf("%n%n DADOS DA LANCHA 8: %n%n");
        l7.imprimir();
        
        //CRIADA COM CONSTRUTOR 8
        Lancha l8 = new Lancha("Boston Whaler", "230 Outrage", "Verde e Branco", "SB VIII","Duplo",12000,2,1.5,50,false);
        System.out.printf("%n%n DADOS DA LANCHA 9: %n%n");
        l8.imprimir();
        
        //CRIADA COM CONSTRUTOR 9
        Lancha l9 = new Lancha(80000, 4, 1,50,"Hincley", "Dasher","Cinza-escuro","SB IX",false,"Duplo");
        System.out.printf("%n%n DADOS DA LANCHA 10: %n%n");
        l9.imprimir();
        
        Lancha l11 = new Lancha();
        l11.cadastrar("Boston Whaler","Fury","Vermelho", "SBX", 2, 50, 2, 200000,"Arrojado",false);
        
        
        
        //JET SKIS
        
        JetSki j1 = new JetSki();
        System.out.printf("%n%nInforme os dados do JetSki 1: %n%n");
        j1.entradaDados();
        System.out.printf("%n%nDADOS DO JETSKI 1: %n%n");
        
        j1.imprimir();
        
        //CRIADO COM CONSTRUTOR 01
        JetSki j2 = new JetSki(3,true,85,"SEA-DOO","FISH PRO","Cinza e verde","JS 2","Estável",100000,1.5);
        System.out.printf("%n%n DADOS DO JETSKI 2: %n%n");
        j2.valorDesconto(10000);
        j2.imprimir();
        //CRIADO COM CONSTRUTOR 02
        JetSki j3 = new JetSki(100000,5,false,3,90,"SEA-DOO","GTI 90/130","Verde-Água","JsII","Estável");
        System.out.printf("%n%n DADOS DO JETSKI 3: %n%n");
        j3.imprimir();
        //CRIADO COM CONSTRUTOR 03
        JetSki j4 = new JetSki(3, 90, 100000,false,1,"SEA-DOO","GTX 170 / 230","CInza e Azul","JSIII","Duplo");
        System.out.printf("%n%n DADOS DO JETSKI 4: %n%n");
        j4.imprimir();
        //CRIADO COM CONSTRUTOR 04
        JetSki j5 = new JetSki(3,95,150000,false, 1,"SEA-DOO","RXT-X 300","Verde e preto","JS IV","ST³");
        System.out.printf("%n%n DADOS DO JETSKI 5: %n%n");
        j5.imprimir();
        //CRIADO COM CONSTRUTOR 05
        JetSki j6 = new JetSki(97000,1,"Kawasaki","SX-R",false,"Preto e verde","JS VI","Duplo", 3,170);
        System.out.printf("%n%n DADOS DO JETSKI 6: %n%n");
        j6.imprimir();
        //CRIADO COM CONSTRUTOR 06
        JetSki j7 = new JetSki(3,60000, 90, 1,"Yamaha", "FX SVHO", "Preto", "JS VII","Arrajado",false);
        System.out.printf("%n%n DADOS DO JETSKI 7: %n%n");
        j7.imprimir();
        
        JetSki j8 = new JetSki();
        j8.cadastrar("SEA-DOO","GTX 230","Rosa","JS VIII",3,90,1,20000,"Estável",true);
        
        
        //IATES
        
        Iate i1 = new Iate();
        System.out.printf("%n%nInforme os dados do iate 1: %n%n");
        j1.entradaDados();
        System.out.printf("%n%nDADOS DO IATE 1: %n%n");
        j1.imprimir();
        
        //CRIADO COM O CONSTRUTOR 01
        Iate i2 = new Iate(false,"Heesen","Irisha","Preto","IT I",10,25,6,8,154000,4);
        
        i2.valorDesconto(154000);
        i2.imprimir();
        //CRIADO COM O CONSTRUTOR 02
        Iate i3 = new Iate(10,false,20,8, 5, "Heesen", "Elixir", "Cinza", "IT II", 1600000,6);
        i3.valorDesconto(160000);
        i3.imprimir();
        //CRIADO COM O CONSTRUTOR 03
        Iate i4 = new Iate(170000, 7, false, 10, 15,4,18,"Feaship","Aquarius","Branco", "IT III");
        i4.imprimir();
        //CRIADO COM O CONSTRUTOR 04
        Iate i5 = new Iate(8, 20,5,8,true,180000,4,"Feadship","Avatar","Branco","IT IV");
        i5.imprimir();
        //CRIADO COM O CONSTRUTOR 05
        Iate i6 = new Iate(180000,7, "Feadship", "Kamino",false, "Branco", "IT V",7, 20, 9, 5);
        i6.imprimir();
        Iate i7 = new Iate();
        i7.cadastrar("Feadship","Halo","Branco","IT VI",6,40,5,7,3,160000,false);
        i7.imprimir();
        
        
        
        
        
        
    }
}
