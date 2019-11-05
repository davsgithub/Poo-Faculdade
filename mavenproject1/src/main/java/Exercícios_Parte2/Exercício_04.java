
package Exercícios_Parte2;

import java.util.Scanner;
public class Exercício_04 {
    public static void main (String[]args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Informe o preço do produto: ");
		double preço = (Double.parseDouble(ent.nextLine()));
		System.out.println("Informe a taxa de conversão: ");
		double taxaUSD = (Double.parseDouble(ent.nextLine()));
		double conversão = preço*taxaUSD;
		System.out.println("O preço convertido é: "+conversão);
		
		
		
		
		
		ent.close();	
	}
}
