/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploPratico;

/**
 *
 * @author Cakeb
 */
public class HumanoPrincipal {
    public static void main(String[]args){
        //se tentar instanciar Humano, não será possível, pois é uma classe abstrata e por isso não pode ser instanciada;
        Homem h1 = new Homem();
        h1.setSexo("Masculino");
        h1.setNome("João");
        h1.setIdade(23);
        h1.setPeso(65.4);
        h1.setAltura(1.76);
        h1.setBigode(true);
        h1.setBarba(false);
        h1.setPeitoral(.96);
        
        Mulher m1 = new Mulher();
        m1.setSexo("Feminino");
        m1.setNome("Maria");
        m1.setIdade(21);
        m1.setPeso(58.4);
        m1.setAltura(1.67);
        m1.setGravidez(false);
        m1.setBusto(.80);
        m1.setCintura(.70);
        
        
        System.out.println("Nome: "+h1.getNome());
        System.out.println("Sexo: "+h1.getSexo());
        System.out.println("Idade: "+h1.getIdade());
        System.out.println("Peso: "+h1.getPeso());
        System.out.println("Altura: "+h1.getAltura());
        System.out.println("Bigode: "+h1.getBigode());
        System.out.println("Barba: "+h1.getBarba());
        System.out.println("Peitoral: "+h1.getPeitoral());
        System.out.println("Amamentar: "+h1.amamentar());
        
        System.out.println("");
        
        System.out.println("Nome: "+m1.getNome());
        System.out.println("Sexo: "+m1.getSexo());
        System.out.println("Idade: "+m1.getIdade());
        System.out.println("Peso: "+m1.getPeso());
        System.out.println("Altura: "+m1.getAltura());
        System.out.println("Gravidez: "+m1.getGravidez());
        System.out.println("Busto: "+m1.getBusto());
        System.out.println("Cintura: "+m1.getCintura());
        System.out.println("Amamentar: "+m1.amamentar());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
