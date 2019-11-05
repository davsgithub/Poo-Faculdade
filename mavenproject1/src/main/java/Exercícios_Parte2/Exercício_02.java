
package Exercícios_Parte2;

import java.util.Scanner;
public class Exercício_02 {
    public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a altura da lata: ");
		double altura = (Double.parseDouble(sc.nextLine())); 
		System.out.println("Insira o raio da lata: ");
		double raio = (Double.parseDouble(sc.nextLine()));
		double pi = 3.14159;
		double raio_2 = (raio*raio);
		double volume = raio_2*altura*pi;
		System.out.printf("O volume da lata é: %.2f",volume);
		
		
		sc.close();
	}
}
