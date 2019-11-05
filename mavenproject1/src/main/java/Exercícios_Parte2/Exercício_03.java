
package Exercícios_Parte2;

import java.util.Scanner;
public class Exercício_03 {
    public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número inteiro: ");
		int n1 = (Integer.parseInt(sc.nextLine()));
		System.out.println("Insira outro número inteiro: ");
		int n2 = (Integer.parseInt(sc.nextLine()));
		int quadradoDiferença = (int)Math.pow((n1-n2),2);/*É necesspário fazer o casting porque o 
		resultado padrão da Math.pow() é double. Mas já que eu quero armazenar esse resultado em uma 
		variável int, sou obrigado a fazer o casting.
		*/
		int diferençaQuadrado = (int)(Math.pow(n1, 2)-Math.pow(n2, 2));
		System.out.printf("%nO quadrado da diferença do primeiro pelo segundo é: %.2f",quadradoDiferença);
		System.out.printf("%nA diferença entre os quadrados dos números é: %.2f",diferençaQuadrado);
		
		
		
		
		sc.close();
	}
}
