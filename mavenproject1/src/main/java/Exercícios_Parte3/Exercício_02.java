
package Exercícios_Parte3;

import java.util.Scanner;
public class Exercício_02 {
    public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Jogador, informe sua idade: ");
		int idade = (Integer.parseInt(sc.nextLine()));
		
		if(idade<=10) {
				System.out.println("Você é um jogador mirim.");
		}
		
		else if(10<idade&&idade<=18) {
				System.out.println("Você é um jogador Juvenil.");
		}
		
		else if(18<idade&&idade<=40) {
				System.out.println("Você é um jogador adulto.");
		}
		
		else {
			 	System.out.println("Você é um jogador master.");
		}
	
		sc.close();
	}
}
